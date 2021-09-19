package com.company.controller;

import com.company.model.Veiculo;
import com.company.model.dao.VeiculoDao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gaabsgarcia
 */

public class VeiculoController {
    private final ArrayList<Veiculo> getAll;

    public VeiculoController() {
        getAll = new ArrayList<>();
    }

    public boolean cadastro(String marca, String modelo, String placa, String cor, String ano) throws SQLException {
        Veiculo veiculo = new Veiculo(marca, modelo, placa, cor, ano);
        VeiculoDao veiculoDao = new VeiculoDao();
        boolean inseriu = veiculoDao.
                inserir(veiculo);
        return inseriu;
    }

    public boolean excluir(String placa) throws SQLException{
        Veiculo veiculo = new Veiculo(placa);
        VeiculoDao veiculoDao = new VeiculoDao();
        boolean excluiu = veiculoDao.exclui(veiculo);
        return excluiu;
    }

    public ArrayList<Veiculo> buscar() throws SQLException {
        VeiculoDao veiculoDao = new VeiculoDao();
        return veiculoDao.busca();
    }

    public ArrayList<Veiculo> buscaModelo(String modelo) throws SQLException{
        Veiculo veiculo = new Veiculo(modelo);
        VeiculoDao veiculoDao = new VeiculoDao();
        return veiculoDao.buscaModelo(veiculo);
    }

    public ArrayList<Veiculo> buscaAno(String ano) throws SQLException{
        Veiculo veiculo = new Veiculo(ano);
        VeiculoDao veiculoDao = new VeiculoDao();
        return veiculoDao.buscaAno(veiculo);
    }

    public ArrayList<Veiculo> buscaMarca(String marca) throws SQLException{
        Veiculo veiculo = new Veiculo(marca);
        VeiculoDao veiculoDao = new VeiculoDao();
        return veiculoDao.buscaMarca(veiculo);
    }
}
