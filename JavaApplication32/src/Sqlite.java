import java.sql.*;
public class Sqlite {
Connection conn=null;
public static Connection ConnectDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:database1.sqlite");
        System.out.println("Connected");
        return conn;
    }
    catch(Exception e){
        System.out.println("Not connected");
    }
    return null;
    
}
}
