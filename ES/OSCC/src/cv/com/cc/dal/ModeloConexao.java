/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv.com.cc.dal;

import java.sql.*;

/**
 *
 * @author Wilson
 */
public class ModeloConexao {

    //Metodo de conxecao com a base de dados
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // Chamar driver de coneccao com mysql
        String driver = "com.mysql.jdbc.Driver";
        // Armazenar informaçao da base de dados
        String url = "jdbc:mysql://localhost:3306/bdinfox";
        String user = "root";
        String password = "";
        // faz a conexao com a Base de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            // linha de apoio para esclareciemtno de errado de erro
            //System.out.println(e);
            return null;
        }
    }
}
