package employee.managment.system;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class conn {
Connection connection;
Statement statement;

public conn(){
    try{
Class.forName("com.mysql.cj.jdbc.Driver");
    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagment","root","penguine");
    statement=(Statement) connection.createStatement();

    }catch(Exception e){
        e.printStackTrace();
    }
}
}
