package devices;;

import devices.crud.*;
import java.sql.*;
public class Market extends MarketSort {
    private static Market instance = null;

    private Market() {}

    public static Market getInstance() {
        if (instance == null) {
            instance = new Market();
        }
        return instance;
    }
    public double returnPrice(String tableName, int ID) {
        int price = 0;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT price FROM public.\"" + tableName + "\" WHERE id = "+ID);
            while (rs.next()) {
                price = rs.getInt("price");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
        return price;
    }
    public String returnModel(String tableName, int ID) {
        String model = "";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT model FROM public.\"" + tableName + "\" WHERE id = "+ID);
            while (rs.next()) {
                model = rs.getString("model");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
        return model;
    }

}

