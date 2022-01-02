/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStoreManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author honkaiwaifu
 */
public class NewConnection {
   
    public static Connection getConnection() {
        Connection con =null;
        Properties props = new Properties();
        FileInputStream in;
       
        
         try {     
            in = new FileInputStream("database/app.config");           
            props.load(in);
            in.close();
            
            String url = props.getProperty("jdbc.url");
            String port = props.getProperty("jdbc.port");
            String data = props.getProperty("jdbc.database");
            String username = props.getProperty("jdbc.username");
            String password = props.getProperty("jdbc.password");
            String dburl = url + ":" + port + ";databaseName=" + data 
                    + ";username=" + username 
                    + ";password=" + password;
    con = DriverManager.getConnection(dburl);
   } catch (SQLException | FileNotFoundException ex) {
       JOptionPane.showMessageDialog(null, "Kết nối SQL thất bại\nLiên hệ quản trị hệ thống để hỗ trợ!","Thông báo", JOptionPane.ERROR_MESSAGE);       
   } catch (IOException ex) {
        Logger.getLogger(NewConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
         return con;
  }
    
}
