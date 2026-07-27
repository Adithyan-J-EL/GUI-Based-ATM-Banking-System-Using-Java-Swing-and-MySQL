package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","root12345*678ABC");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
