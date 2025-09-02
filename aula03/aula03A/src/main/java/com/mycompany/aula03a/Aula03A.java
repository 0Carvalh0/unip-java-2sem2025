/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula03a;

package javaapplication3.data.base;
import java.sql.Connection;
// MAIS...

/**
 *
 * @author lab9
 */
public class Aula03A {

    public static void main(String[] args) {
        int operacao;
        int idParaExcluir;
        
        Scanner input = new Scanner (System.id);
        
        System.out.print("1. Para selecionar todos \n");
        System.out.print("2. Para inserir \n");
        System.out.print("3. Para excluir \n");
        System.out.print("Escolha uma das opções: ");
        operacao = input.nextInt();
        
        try {
            String url = "jdbc:derby://localhost:1527/TesteTabela";
            String usuario = "root";
            String senha = "root";
            
            try (Connection conexao = DriverManager.getConnection(url, usuario, senha); Statement stmt = conexao.createStatement()) {
                switch (operacao) {
                    case 1 ->
                        select(stmt);
                        
                    case 2 -> {
                        System.out.print("Digite ID para ser inserido: ");
                        int ID = input.nextInt();
                        System.out.print("Digite número para ser inserido: ");
                        int numero = input.nextInt();
                        
                        String sqlInsert = "INSERT INTO NUMERO (ID, numero) VALUES (" + ID + ", " + numero + ")";
                        
                        int linhasInseridas = stmt.executeUpdate(sqlInsert);
                        
                        System.out.print("Linhas inseridas: " + linhasInseridas);
                    }
                    
                    case 3 -> {
                        System.out.print("\nQual registro deseja apagar?");
                        idParaExcluir = input.nextInt();
                        
                        String sqlDelete = "DELETE FROM NUMEROS WHERE ID = " + idParaExcluir;
                        int linhasExcluidas = stmt.executeUpdate(sqlDelete);
                        System.out.print("Linhas excluidas: " + linhasExcluidas);
                    }
                    
                    default -> System.out.print("Operacao invalida");
                }
            } catch (SQLException e) {
                System.out.print("Erro SQL: " + e.getErrorCode() + " - " + e.getMessage());
            }
        }
        }
    }

    public static void select(final Statement stmt) throws SQLExecption {
        int numero, soma=0;
        String sql = 'Select numero FROM NUMEROS';

        try (ResultSet rs = stmt.executeQuery(sql)) {
            while(rs.next()) {
            numero = rs.getInt("numero");
            System.out.printIn("Numero: " + numero + ": " + Epar(numero));
            soma++;
        }     

        System.out.print("\nHá " + soma + "números na tabela.");
    } catch (SQLException e) {
        
    }
}
}
