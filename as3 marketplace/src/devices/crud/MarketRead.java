package devices.crud;

import java.sql.*;
import java.util.*;

public class MarketRead extends MarketCreate{
    public boolean checkPassword(String login, String password) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            PreparedStatement st = con.prepareStatement("SELECT * FROM public.sellers WHERE login=?");
            st.setString(1, login);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                if (rs.getString("password").equals(password)) {
                    con.close();
                    return true;
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
        return false;
    }
    public void showSellers() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.sellers");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("login"));
                System.out.println("----------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void readDevices(String tableName) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\"");
            while (rs.next()) {
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Model: "+rs.getString("model"));
                System.out.println("----------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void readDevicesByID(String tableName, int ID) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\" WHERE id = "+ID);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    if (metaData.getColumnType(i) == Types.BOOLEAN) {
                        boolean columnValue = rs.getBoolean(i);
                        System.out.println(columnValue ? "true" : "false");
                    } else {
                        System.out.println(metaData.getColumnName(i) + ": " +rs.getObject(i));
                    }
                }
                System.out.println();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void readDevicesByLogin(String tableName, String login) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\" WHERE seller = '" + login + "'");
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    if (metaData.getColumnType(i) == Types.BOOLEAN) {
                        boolean columnValue = rs.getBoolean(i);
                        System.out.println(columnValue ? "true" : "false");
                    } else {
                        System.out.println(metaData.getColumnName(i) + ": " +rs.getObject(i));
                    }
                }
                System.out.println();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void readBrands(String tableName) {
        Set<String> uniqueBrands = new HashSet<>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT \"brand\" FROM public.\"" + tableName + "\"");
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String brand = rs.getString(i);
                    if (!uniqueBrands.contains(brand)) {
                        System.out.println(brand);
                        uniqueBrands.add(brand);
                    }
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void readDevicesByBrand(String tableName, String brand) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\" WHERE brand = '" + brand + "'");
            while (rs.next()) {
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Model: "+rs.getString("model"));
                System.out.println("----------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
}
