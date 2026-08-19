    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class ConexionJDBC {

    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/user?useSSL=false&useTimezone=true&allowPublicKeyRetrieval=true&serverTimezone=UTC";
  
        try{
            Connection conexion = DriverManager.getConnection(url, "juan", "juan123");
            Statement instrucion = conexion.createStatement();
            String sql = "SELECT * FROM person";
            ResultSet resultado = instrucion.executeQuery(sql);
            
            while(resultado.next()){
                System.out.println(" name: "+resultado.getString("name"));
            }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
    }
}
