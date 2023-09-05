package jdbc;

import java.sql.*;

public class SimpleSt {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","2002");

        // Insert
        String query = "insert into student values(1003,'Kevin')";
        Statement st = con.createStatement();
        st.executeUpdate(query);

        // Read
        query = "select * from student";
        ResultSet rs = st.executeQuery(query);

        //Delete
        query = "delete from student where id=201";
        int x = st.executeUpdate(query);

        //Modify
        query = "update student set name = 'Hello' where id = 1002;";
        x = st.executeUpdate(query);


    }
}
