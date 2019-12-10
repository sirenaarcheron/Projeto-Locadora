/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import Modelo.Cliente;

/**
 *
 * @author yarae
 */
public class ClienteDAO extends ExecuteSQL {
    
    public ClienteDAO (Connection con) {
        super(con);
    }

    
    public String Inserir_Cliente(Cliente a) {
                String sql = "insert into cliente values (0,?,?,?,?,?,?,?,?,?,?)";
                try {

                    PreparedStatement ps = getCon().prepareStatement(sql);

                    ps.setString(1, a.getNome());
                    ps.setString(2, a.getNascimento());
                    ps.setString(3, a.getRG());
                    ps.setString(4, a.getCPF());
                    ps.setString(5, a.getEmail());
                    ps.setString(6, a.getTelefone());
                    ps.setString(7, a.getBairro());
                    ps.setString(8, a.getRua());
                    ps.setInt(9, a.getNumero());
                    ps.setString(10, a.getCEP());
                    
                        if (ps.executeUpdate() > 0) {
                            return "Inserido com Sucesso.";
                        } 
                        else {
                            return "Erro ao inserir.";
                        }
                    } catch (SQLException e){
                            return e.getMessage();
                        }

                }
        
    
        }

