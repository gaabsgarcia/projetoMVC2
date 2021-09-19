package com.company.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    public java.sql.Connection getConnection() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:postgres://localhost:5432/cl200462_veiculo_mvc";
        String usuario = "postgres";
        String senha = "postgres";

        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de conexão", ex);
        }
    }
}
