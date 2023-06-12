/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canoa_123.Controllers;

import canoa_123.Controllers.DAO.ExceptionDAO;
import canoa_123.Models.Barcos;

/**
 *
 * @author erico
 */
public class BarcosController {
    
    public boolean cadastrarBarco (String nome, int capacidade) throws ExceptionDAO{
        if (nome !=null && nome.length()>0 && capacidade != 0 && capacidade>0){
                 Barcos barco = new Barcos(nome, capacidade);
                 barco.cadastrarBarco(barco);
                 return true;
        } else{
           return false;
        }           
    
}
    
}
