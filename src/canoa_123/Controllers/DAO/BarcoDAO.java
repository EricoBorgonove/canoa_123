/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canoa_123.Controllers.DAO;

/**
 *
 * @author erico
 */

import canoa_123.Controllers.DAO.ExceptionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import canoa_123.Models.Barcos;
        
    
public class BarcoDAO {
    public void cadastrarBarco (Barcos barco) throws ExceptionDAO{
        String sql = "insert into barco (nome, capacidade) value (?,?)";
        PreparedStatement psta = null;
        Connection conn = null;
        try{
            conn = new  ConnectionMVC().getConnection();
            psta = conn.prepareStatement(sql);
            psta.setString(1, barco.getNome());
            psta.setInt(2, barco.getCapacidade());
            psta.execute();
        }catch(SQLException e){
            throw new ExceptionDAO ("erro " + e);
        }finally{
            try{
              if (psta != null){psta.close();}   
              
            }catch (SQLException e){
                throw new ExceptionDAO ("erro ao fechar psta " + e);
        } try {
            if (conn != null){ conn.close();}
        } catch (SQLException e){
            throw new ExceptionDAO ("erro ao fechar conn " + e);
        }
        }
        }
           
    }

