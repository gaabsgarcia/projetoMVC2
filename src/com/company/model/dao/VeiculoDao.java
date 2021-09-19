package com.company.model.dao;

import com.company.model.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author gaabsgarcia
 */
public class VeiculoDao {

    Connection con = null;

    public boolean inserir(Veiculo veiculo) throws SQLException {
        boolean inseriu = false;
        try {
            con = new com.company.connection.Connection().getConnection();
            String sql = "INSERT INTO veiculo(marca, modelo, placa, cor, ano) values (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, veiculo.getMarca());
            stmt.setString(2, String.valueOf(veiculo.getModelo()));
            stmt.setString(3, veiculo.getPlaca());
            stmt.setString(4, veiculo.getCor());
            stmt.setString(5, veiculo.getAno());
            stmt.execute();
            stmt.close();
            inseriu = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            con.close();
        }
        return inseriu;
    }

    public boolean exclui(Veiculo veiculo) throws SQLException {
        boolean excluiu = false;
        try {
            con = new com.company.connection.Connection().getConnection();
            String sql = "DELETE FROM veiculo WHERE PLACA = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, veiculo.getId());
            stmt.execute();
            stmt.close();
            excluiu = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return excluiu;
    }

    public ArrayList<Veiculo> busca() throws SQLException {
        ResultSet resultSet = null;
        ArrayList<Veiculo> veiculoArrayList = new ArrayList<Veiculo>();
        try {
            con = new com.company.connection.Connection().getConnection();
            String sql = "SELECT * FROM veiculo";
            PreparedStatement stmt = con.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setMarca(resultSet.getString("MARCA"));
                veiculo.setModelo(resultSet.getString("MODELO"));
                veiculo.setPlaca(resultSet.getString("PLACA"));
                veiculo.setCor(resultSet.getString("COR"));
                veiculo.setAno(resultSet.getString("ANO"));
            }
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return veiculoArrayList;
    }

    public ArrayList<Veiculo> buscaModelo() throws SQLException {
        ResultSet resultSet = null;
        ArrayList<Veiculo> veiculoArrayList = new ArrayList<Veiculo>();
        try {
            con = new com.company.connection.Connection().getConnection();
            String sql = "SELECT * FROM veiculo WHERE MODELO = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setMarca(resultSet.getString("MARCA"));
                veiculo.setModelo(resultSet.getString("MODELO"));
                veiculo.setPlaca(resultSet.getString("PLACA"));
                veiculo.setCor(resultSet.getString("COR"));
                veiculo.setAno(resultSet.getString("ANO"));
            }
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return veiculoArrayList;
    }

    public ArrayList<Veiculo> buscaAno(Veiculo veiculo) throws SQLException {
        ResultSet resultSet = null;
        ArrayList<Veiculo> veiculoArrayList = new ArrayList<Veiculo>();
        try {
            con = new com.company.connection.Connection().getConnection();
            String sql = "SELECT * FROM veiculo WHERE ANO = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Veiculo veiculoP = new Veiculo();
                veiculo.setMarca(resultSet.getString("MARCA"));
                veiculo.setModelo(resultSet.getString("MODELO"));
                veiculo.setPlaca(resultSet.getString("PLACA"));
                veiculo.setCor(resultSet.getString("COR"));
                veiculo.setAno(resultSet.getString("ANO"));
            }
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return veiculoArrayList;
    }

    public ArrayList<Veiculo> buscaModelo(Veiculo veiculo) throws SQLException {
        ResultSet resultSet = null;
        ArrayList<Veiculo> veiculoArrayList = new ArrayList<Veiculo>();
        try {
            con = new com.company.connection.Connection().getConnection();
            String sql = "SELECT * FROM veiculo WHERE MODELO = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Veiculo veiculoP = new Veiculo();
                veiculo.setMarca(resultSet.getString("MARCA"));
                veiculo.setModelo(resultSet.getString("MODELO"));
                veiculo.setPlaca(resultSet.getString("PLACA"));
                veiculo.setCor(resultSet.getString("COR"));
                veiculo.setAno(resultSet.getString("ANO"));
            }
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return veiculoArrayList;
    }

    public ArrayList<Veiculo> buscaMarca(Veiculo veiculo) throws SQLException {
        ResultSet resultSet = null;
        ArrayList<Veiculo> veiculoArrayList = new ArrayList<Veiculo>();
        try {
            con = new com.company.connection.Connection().getConnection();
            String sql = "SELECT * FROM veiculo WHERE MARCA = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Veiculo veiculoP = new Veiculo();
                veiculo.setMarca(resultSet.getString("MARCA"));
                veiculo.setModelo(resultSet.getString("MODELO"));
                veiculo.setPlaca(resultSet.getString("PLACA"));
                veiculo.setCor(resultSet.getString("COR"));
                veiculo.setAno(resultSet.getString("ANO"));
            }
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        return veiculoArrayList;
    }
}
