/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.dao;

import static br.com.fatec.dao.Banco.conexao;
import br.com.fatec.model.Servicos;
import br.com.fatec.model.UtilizarReservar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

/**
 *
 * @author s4ms3pi0l
 */
public class UtilizarReservarDAO implements DAO<UtilizarReservar> {
    //Variaveis auxiliares
    private UtilizarReservar ur;
    //para conexao
    private Connection conexao;
    //para comandos DML não preparados
    private Statement st;
    //para comandos DML preparados
    private PreparedStatement pst;
    //Repsenta os dados da tabela
    private ResultSet rs;
    //referencia para o banco de dados

    @Override
    public boolean inserir(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UtilizarReservar buscar(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<UtilizarReservar> listar(String criterio) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean utilizarServico(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO HOSPEDESERVICO (CPF, IDSERVICO, VALORSERVICO) VALUES (?,?,?)";
        Banco.abreConexao();
        //busca a conexao do banco
        conexao = Banco.conexao;
        //cria o comando preparado
        pst = conexao.prepareStatement(sql);
        //atribui os dados para o comando
        pst.setString(1, dado.getCpf());
        pst.setFloat(2, dado.getIdServico());
        pst.setFloat(3, dado.getValorServico());
        if(pst.executeUpdate() > 0) {
            //fecha a conexao
            Banco.fecharConexao();
            //retorna o resultado
            return true;
        }
        else {
            Banco.fecharConexao();
            return false;
        }
    }
    
    public boolean inserirReserva(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO HOSPEDERESERVA (CPF, NUMQUARTO, VALORTOTAL, DATAENTRADA, DATASAIDA) VALUES (?,?,?,?,?)";
        Banco.abreConexao();
        //busca a conexao do banco
        conexao = Banco.conexao;
        //cria o comando preparado
        pst = conexao.prepareStatement(sql);
        //atribui os dados para o comando
        pst.setString(1, dado.getCpf());
        pst.setString(2, dado.getNumQuarto());
        pst.setFloat(3, dado.getValorTotal());
        pst.setString(4, dado.getEntrada());
        pst.setString(5, dado.getSaida());
        if(pst.executeUpdate() > 0) {
            //fecha a conexao
            Banco.fecharConexao();
            //retorna o resultado
            return true;
        }
        else {
            Banco.fecharConexao();
            return false;
        }
    }
    
    public UtilizarReservar consultarDisponibilidade(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM HOSPEDERESERVA "
                + "WHERE NUMQUARTO=?";
        //abre a conexao com o banco
        Banco.abreConexao();
        //busca a conexao do banco
        conexao = Banco.conexao;
        //cria o comando preparado
        pst = conexao.prepareStatement(sql);
        //atribui os dados para o comando
        pst.setString(1, dado.getNumQuarto());
        //executar o comando
        rs = pst.executeQuery();
        ur = null;
        //Verifica se achou alguem
        if(rs.next()) { //achou
            //transfere todas as informações da tabela para 
            // o Objeto filme
            ur = new UtilizarReservar();
            ur.setCpf(rs.getString("CPF"));
            ur.setNumQuarto(rs.getString("NUMQUARTO"));
            ur.setValorTotal(rs.getFloat("VALORTOTAL"));
            ur.setEntrada(rs.getString("DATAENTRADA"));
            ur.setSaida(rs.getString("DATASAIDA"));
        }
        //fecha o resultado
        rs.close();
        //fecha o banco
        Banco.fecharConexao();
        //retorna o que foi encontrado, NULL se nada foi achado
        return ur;
    }
    
    public UtilizarReservar consultarServico(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM HOSPEDESERVICO "
                + "WHERE CPF=?";
        //abre a conexao com o banco
        Banco.abreConexao();
        //busca a conexao do banco
        conexao = Banco.conexao;
        //cria o comando preparado
        pst = conexao.prepareStatement(sql);
        //atribui os dados para o comando
        pst.setString(1, dado.getCpf());
        //executar o comando
        rs = pst.executeQuery();
        ur = null;
        //Verifica se achou alguem
        if(rs.next()) { //achou
            //transfere todas as informações da tabela para 
            // o Objeto filme
            ur = new UtilizarReservar();
            ur.setCpf(rs.getString("CPF"));
            ur.setIdServico(rs.getInt("IDSERVICO"));
            ur.setValorServico(rs.getFloat("VALORSERVICO"));
        }
        //fecha o resultado
        rs.close();
        //fecha o banco
        Banco.fecharConexao();
        //retorna o que foi encontrado, NULL se nada foi achado
        return ur;
    }
    
    public UtilizarReservar buscarReserva(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM HOSPEDERESERVA "
                + "WHERE CPF=?";
        //abre a conexao com o banco
        Banco.abreConexao();
        //busca a conexao do banco
        conexao = Banco.conexao;
        //cria o comando preparado
        pst = conexao.prepareStatement(sql);
        //atribui os dados para o comando
        pst.setString(1, dado.getCpf());
        //executar o comando
        rs = pst.executeQuery();
        ur = null;
        //Verifica se achou alguem
        if(rs.next()) { //achou
            //transfere todas as informações da tabela para 
            // o Objeto filme
            ur = new UtilizarReservar();
            ur.setCpf(rs.getString("CPF"));
            ur.setNumQuarto(rs.getString("NUMQUARTO"));
            ur.setValorTotal(rs.getFloat("VALORTOTAL"));
            ur.setEntrada(rs.getString("DATAENTRADA"));
            ur.setSaida(rs.getString("DATASAIDA"));
        }
        //fecha o resultado
        rs.close();
        //fecha o banco
        Banco.fecharConexao();
        //retorna o que foi encontrado, NULL se nada foi achado
        return ur;
    }
    
    public boolean excluirServico(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM HOSPEDESERVICO WHERE CPF=?";
        Banco.abreConexao();
        //busca a conexao do banco
        conexao = Banco.conexao;
        //cria o comando preparado
        pst = conexao.prepareStatement(sql);
        //atribui os dados para o comando
        pst.setString(1, dado.getCpf());
        if(pst.executeUpdate() > 0) {
            //fecha a conexao
            Banco.fecharConexao();
            //retorna o resultado
            return true;
        }
        else {
            Banco.fecharConexao();
            return false;
        }
    }
    
    public boolean excluirEstadia(UtilizarReservar dado) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM HOSPEDERESERVA WHERE CPF=?";
        Banco.abreConexao();
        //busca a conexao do banco
        conexao = Banco.conexao;
        //cria o comando preparado
        pst = conexao.prepareStatement(sql);
        //atribui os dados para o comando
        pst.setString(1, dado.getCpf());
        if(pst.executeUpdate() > 0) {
            //fecha a conexao
            Banco.fecharConexao();
            //retorna o resultado
            return true;
        }
        else {
            Banco.fecharConexao();
            return false;
        }
    }
    
}
