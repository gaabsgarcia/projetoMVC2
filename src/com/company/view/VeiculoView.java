package com.company.view;
/**
 *
 * @author gaabsgarcia
 */
import com.company.controller.VeiculoController;
import com.company.model.Veiculo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeiculoView {
    private JButton btnRegistra;
    private JButton btnExclui;
    private JTextField txt_marca;
    private JTextField txt_placa;
    private JTextField txt_ano;
    private JTextField txt_modelo;
    private JTextField txt_cor;
    private JLabel lbl_exclui;
    private JTextField txt_exclui;
    private JLabel lbl_busca;
    private JTextField txt_busca_modelo;
    private JButton btnBuscaModelo;
    private JButton btnBuscaAno;
    private JButton btnBuscaMarca;
    private JButton btnBuscaTodos;
    private JTextField txt_busca_ano;
    private JTextField txt_busca_marca;

    VeiculoController veiculoController;

    private void btnRegistra(java.awt.event.ActionEvent evt) {
        boolean inseriu = false;
        try {
            inseriu = veiculoController.cadastro(this.txt_marca.getText(),
                    this.txt_modelo.getText(),
                    this.txt_placa.getText(),
                    this.txt_cor.getText(),
                    this.txt_ano.getText());
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(inseriu == true){
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            limpar();
        }
    }

    public void btnExclui(java.awt.event.ActionEvent evt) {
        boolean excluiu = false;
        try {
            excluiu = veiculoController.excluir(this.txt_exclui.getText());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if(excluiu == true) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
            limpar();
        }
    }

    private void limpar() {
        this.txt_marca.setText("");
        this.txt_modelo.setText("");
        this.txt_placa.setText("");
        this.txt_cor.setText("");
        this.txt_ano.setText("");
    }

    private void btnBuscaTodos(java.awt.event.ActionEvent evt) {
        boolean buscou = false;
        try {
            DefaultTableModel dados = null;
            dados.setNumRows(0);
            ArrayList<Veiculo> lista = veiculoController.buscar();
            Iterator iterator = lista.iterator();
            while (iterator.hasNext()) {
                Veiculo veiculoP = (Veiculo) iterator.next();
                dados.addRow(new Object[]{veiculoP.getMarca(),veiculoP.getModelo(),veiculoP.getPlaca(),veiculoP.getCor(),veiculoP.getAno()});
            }
        }catch (SQLException ex) {
            Logger.getLogger(VeiculoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnBuscaModelo(java.awt.event.ActionEvent evt) {
        try {
            DefaultTableModel dados = null;
            dados.setNumRows(0);
            ArrayList<Veiculo> lista = veiculoController.buscaModelo(this.txt_busca_modelo.getText());
            Iterator iterator = lista.iterator();
            while (iterator.hasNext()) {
                Veiculo veiculoP = (Veiculo) iterator.next();
                dados.addRow(new Object[]{veiculoP.getMarca(),veiculoP.getModelo(),veiculoP.getPlaca(),veiculoP.getCor(),veiculoP.getAno()});
            }
        }catch (SQLException ex) {
            Logger.getLogger(VeiculoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnBuscaMarca(java.awt.event.ActionEvent evt) {
        try {
            DefaultTableModel dados = null;
            dados.setNumRows(0);
            ArrayList<Veiculo> lista = veiculoController.buscaMarca(this.txt_busca_marca.getText());
            Iterator iterator = lista.iterator();
            while (iterator.hasNext()) {
                Veiculo veiculoP = (Veiculo) iterator.next();
                dados.addRow(new Object[]{veiculoP.getMarca(),veiculoP.getModelo(),veiculoP.getPlaca(),veiculoP.getCor(),veiculoP.getAno()});
            }
        }catch (SQLException ex) {
            Logger.getLogger(VeiculoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnBuscaAno(java.awt.event.ActionEvent evt) {
        try {
            DefaultTableModel dados = null;
            dados.setNumRows(0);
            ArrayList<Veiculo> lista = veiculoController.buscaAno(this.txt_busca_ano.getText());
            Iterator iterator = lista.iterator();
            while (iterator.hasNext()) {
                Veiculo veiculoP = (Veiculo) iterator.next();
                dados.addRow(new Object[]{veiculoP.getMarca(),veiculoP.getModelo(),veiculoP.getPlaca(),veiculoP.getCor(),veiculoP.getAno()});
            }
        }catch (SQLException ex) {
            Logger.getLogger(VeiculoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
