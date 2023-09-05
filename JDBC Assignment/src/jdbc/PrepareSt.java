package jdbc;

import java.sql.*;

public class PrepareSt {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","2002");

        // Insert
        String query = "insert into student values (?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,1001);
        ps.setString(2,"Nagul");
        ps.executeUpdate();

        // Read
        query = "select * from student";
        ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        //Delete
        query = "delete from student where id=?";
        ps = con.prepareStatement(query);
        ps.setInt(1,1001);
        int x = ps.executeUpdate();

        //Modify
        query = "update student set name = 'Nagul' where id = 1001;";
        ps = con.prepareStatement(query);
        x = ps.executeUpdate();


    }
}
