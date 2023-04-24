package devices.crud;

import java.sql.*;

public class MarketDelete extends MarketUpdate{
    public void deleteDevice(String category, int id) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
            con.setAutoCommit(false);
            PreparedStatement st = con.prepareStatement("DELETE FROM public.\""+category+"\" WHERE id = ?");
            st.setInt(1, id);
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                con.commit();
            } else {
                con.rollback();
                System.out.println("No record was deleted. Check if the ID and category are correct.");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the device: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
