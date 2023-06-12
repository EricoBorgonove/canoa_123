/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canoa_123.Models;

import canoa_123.Controllers.DAO.BarcoDAO;
import canoa_123.Controllers.DAO.ExceptionDAO;

/**
 *
 * @author erico
 */
public class Barcos {
    private int id;
    private String nome;
    private int capacidade;
            
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Barcos( String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }
    
    public void cadastrarBarco(Barcos barco) throws ExceptionDAO{
        new BarcoDAO().cadastrarBarco(barco);
    }
  
    
    
}
