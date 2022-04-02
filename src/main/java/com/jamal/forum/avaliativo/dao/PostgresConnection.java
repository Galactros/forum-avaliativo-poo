package com.jamal.forum.avaliativo.dao;

import com.jamal.forum.avaliativo.model.Cliente;
import com.jamal.forum.avaliativo.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresConnection {

    private final String url = "jdbc:postgresql://localhost:5432/Pedidos";
    private final String user = "postgres";
    private final String password = "admin";

    public Connection dbcon() {
        Connection dbcon = null;

        try {
            dbcon = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return dbcon;
    }

    public void insertCliente(Cliente cliente) {
        String SQLinsert = "INSERT INTO cliente(CPF,Nome,Fone,Endereco) "
                + "VALUES(?,?,?,?)";

        try ( Connection dbcon = dbcon();) {

            PreparedStatement prepareStatement = dbcon.prepareStatement(SQLinsert);
            prepareStatement.setString(1, cliente.getCPF());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setString(3, cliente.getFone());
            prepareStatement.setString(4, cliente.getEndereco());

            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void updateCliente(Cliente cliente) {
        String SQLupdate = "UPDATE cliente "
                + "set CPF = ?, nome = ?, fone = ?, endereco = ? where CPF = ?";

        try ( Connection dbcon = dbcon();) {

            PreparedStatement prepareStatement = dbcon.prepareStatement(SQLupdate);
            prepareStatement.setString(1, cliente.getCPF());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setString(3, cliente.getFone());
            prepareStatement.setString(4, cliente.getEndereco());
            prepareStatement.setString(5, cliente.getCPF());

            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteCliente(Cliente cliente) {
        String SQLdelete = " DELETE FROM cliente where cpf = ?";

        try ( Connection dbcon = dbcon();) {

            PreparedStatement prepareStatement = dbcon.prepareStatement(SQLdelete);
            prepareStatement.setString(1, cliente.getCPF());

            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void selectFullCliente() {
        String SQLselect = " SELECT * FROM cliente";

        try ( Connection dbcon = dbcon();) {

            Statement stmt = dbcon.createStatement();
            ResultSet rs = stmt.executeQuery(SQLselect);
            {
                while (rs.next()) {
                    System.out.println(rs.getString("cpf") + "\t"
                            + rs.getString("nome") + "\t"
                            + rs.getString("fone") + "\t"
                            + rs.getString("endereco"));

                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void selectCliente(Cliente cliente) {
        String SQLselect = " SELECT * FROM cliente where cpf = ?";

        try ( Connection dbcon = dbcon();) {

            PreparedStatement prepareStatement = dbcon.prepareStatement(SQLselect);

            prepareStatement.setString(1, cliente.getCPF());
            ResultSet rs = prepareStatement.executeQuery();
            {
                while (rs.next()) {
                    System.out.println(rs.getString("cpf") + "\t"
                            + rs.getString("nome") + "\t"
                            + rs.getString("fone") + "\t"
                            + rs.getString("endereco"));

                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void insertProduto(Produto produto) {
        String SQLinsert = "INSERT INTO produto(codigo,nome,preco) "
                + "VALUES(?,?,?)";

        try ( Connection dbcon = dbcon();) {

            PreparedStatement prepareStatement = dbcon.prepareStatement(SQLinsert);
            prepareStatement.setInt(1, produto.getCodigo());
            prepareStatement.setString(2, produto.getNome());
            prepareStatement.setDouble(3, produto.getPreco());

            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void updateProduto(Produto produto) {
        String SQLupdate = "UPDATE produto "
                + "set codigo = ?, nome = ?, preco = ? where codigo = ?";

        try ( Connection dbcon = dbcon();) {

            PreparedStatement prepareStatement = dbcon.prepareStatement(SQLupdate);
            prepareStatement.setInt(1, produto.getCodigo());
            prepareStatement.setString(2, produto.getNome());
            prepareStatement.setDouble(3, produto.getPreco());
            prepareStatement.setInt(4, produto.getCodigo());

            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteProduto(Produto produto) {
        String SQLdelete = " DELETE FROM produto where codigo = ?";

        try ( Connection dbcon = dbcon();) {

            PreparedStatement prepareStatement = dbcon.prepareStatement(SQLdelete);
            prepareStatement.setInt(1, produto.getCodigo());

            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void selectFullProduto() {
        String SQLselect = " SELECT * FROM produto";

        try ( Connection dbcon = dbcon();) {

            Statement stmt = dbcon.createStatement();
            ResultSet rs = stmt.executeQuery(SQLselect);
            {
                while (rs.next()) {
                    System.out.println(rs.getString("codigo") + "\t"
                            + rs.getString("nome") + "\t"
                            + rs.getString("preco"));

                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void selectProduto(Produto produto) {
        String SQLselect = " SELECT * FROM produto where codigo = ?";

        try ( Connection dbcon = dbcon();) {

            PreparedStatement prepareStatement = dbcon.prepareStatement(SQLselect);

            prepareStatement.setInt(1, produto.getCodigo());
            ResultSet rs = prepareStatement.executeQuery();
            {
                while (rs.next()) {
                    System.out.println(rs.getString("codigo") + "\t"
                            + rs.getString("nome") + "\t"
                            + rs.getString("preco"));

                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
