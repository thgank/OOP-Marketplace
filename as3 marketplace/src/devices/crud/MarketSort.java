package devices.crud;
import java.sql.*;

public class MarketSort extends MarketDelete {
    public void sortDevicesByPriceAscending(String tableName) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\" ORDER BY price ASC");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Model: " + rs.getString("model"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Brand: " + rs.getString("brand"));
                System.out.println("----------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void sortDevicesBySetPrice(String tableName, double startPrice, double endPrice) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\" WHERE price >= " + startPrice + " AND price <= " + endPrice + " ORDER BY price ASC");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Model: " + rs.getString("model"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Brand: " + rs.getString("brand"));
                System.out.println("----------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void sortDevicesByPriceDescending(String tableName) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\" ORDER BY price DESC");
            while (rs.next()) {
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Model: "+rs.getString("model"));
                System.out.println("Price: "+rs.getDouble("price"));
                System.out.println("Brand: "+rs.getString("brand"));
                System.out.println("----------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
}
