/*
 * Copyright By @2dgirlismywaifu (2023)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.notelysia.bookstoremaven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewConnection {
    //log4j
    private final static Logger logger = LogManager.getLogger(NewConnection.class);
    
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
                    + ";password=" + password
                    + ";encrypt=false"
                    
                    + ";loginTimeout=20;";
    con = DriverManager.getConnection(dburl);
   } catch (SQLException | FileNotFoundException ex) {
       logger.error("Exceptions happen: " + ex, ex);
       JOptionPane.showMessageDialog(null, "Kết nối SQL thất bại\nLiên hệ quản trị hệ thống để hỗ trợ!\n" + ex,"Thông báo", JOptionPane.ERROR_MESSAGE);       
   } catch (IOException ex) {
        logger.error("Exceptions happen: " + ex, ex);
    }
         return con;
  }
    
}
