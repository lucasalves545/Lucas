/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.java.conexao;

/**
 *
 * @author Junior
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemabiblioteca.Administrador;

/**
 *
 * @author Junior
 */
public class conexao{

    private Connection connect;
    private Statement statement;
    private PreparedStatement pSAdicionarCliente;
    private PreparedStatement pSSelecionarCliente;
    private PreparedStatement pSAtualizar;
    private ResultSet resultSet;
    
    public conexao(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            connect = DriverManager.getConnection("jdbc:mysql://localhost/SistemOteca","root","root");
            
            statement = connect.createStatement();
            
        }catch (ClassNotFoundException ex){
                       System.out.println("Problema com SQL");

        }catch (SQLException ex){
           System.out.println("Problema com SQL");
        }        
    }
    
    // //Adiciona um administrador
    public int adicionarCliente(Administrador c) throws SQLException{
       pSAdicionarCliente = connect.prepareStatement("insert into cliente values(?,?,?,?)");
       
       pSAdicionarCliente.setInt(1, c.getLogin());
       pSAdicionarCliente.setString(2, c.getNomeAdministrador());
       pSAdicionarCliente.setString(3, c.getSenha());
               
       return pSAdicionarCliente.executeUpdate();
    }
   
    
    
    //Atualiza Administrador
    public int atualizarCliente(Administrador cli) throws SQLException{
        pSAtualizar = connect.prepareStatement("update cliente set nome=?, endereco=?, fone=? where codAdm = ? ");
        pSAtualizar.setInt(4, cli.getLogin());
        pSAtualizar.setString(1, cli.getNomeAdministrador());
        pSAtualizar.setString(2, cli.getSenha());  
        return pSAtualizar.executeUpdate();
        
    }
}
