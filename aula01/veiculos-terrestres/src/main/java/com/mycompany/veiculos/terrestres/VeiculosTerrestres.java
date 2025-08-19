/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.veiculos.terrestres;
// INFO: Leitura do teclado
import java.util.Scanner;

// INFO: Importar valores de data
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// INFO: Tratamento de exceções TRY/CATCH
//import java.util.InputMismatchException;
/**
 *
 * @author lab9
 */
public class VeiculosTerrestres {

    public static void main(String[] args) {
        LocalDateTime agora = new LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataExecucao;
        
        Scanner in = new Scanner (System.in);
        Carros c1 = new Carros();
        
        double peso,acrescimo;
        
        System.out.print("Quantidade: " + Carros.numCarros);
        
        System.out.print("Digite o peso desse modelo: ");
        peso = in.nextDouble();
        c1.setPeso(peso);
        Carros c2 = new Carros(2500.00);
        System.out.print("Quantidade: " + Carros.numCarros);
        System.out.print("Digite o acrescimo desse modelo: ");
        acrescimo = in.nextDouble();
        dataExecucao = agora.format(formato);
        
        c1.setPeso(c1.getPeso()+acrescimo);
        c2.setPeso(c2.getPeso()+acrescimo+90);
        agora = LocalDateTime.now();
        dataExecucao = agora.format(formato);
        
        leiaPeso(c1, dataExecucao);
        leiaPeso(c2, dataExecucao);
        c1 = c2;
        leiaPeso(c1, dataExecucao);        
        
//        Scanner input = calculaRaiz();
//        double numero;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Digite número: ");
//        numero = input.nextDouble();
//        System.out.print(String.format("\n %.4f", calculaRaiz(numero)));
//        System.out.print(String.format("\n %.4f", calculaRaiz(350)));
//        input.close();
    }

//    INFO: APRENDENDO A PARTE DE PROGRAMAÇÃO ESTRUTURADA JAVA / RAIZ QUADRADA
//    private static double calculaRaiz(double n) {
//        double raiz;
//
//        raiz = Math.sqrt(n);
//        System.out.print("\n A raiz de " + n + " = ");
//        System.out.print("\n" + String.format("%.4f", raiz));
//
//        return raiz;
//    }
//
//    public static void calculaRaiz(Scanner input) {
//        try {
//            double numero;
//            double raiz;
//            if (numero >= 0) {
//                raiz(input);
//            } else {
//                System.out.print(numero + " <0");
//            }
//        } catch (InputMismatchException e) {
//            System.out.print(e.getMessage());
//        };
//    
//
//    public static void raiz(Scanner input) {
//        double numero;
//        double raiz;
//        numero = input.nextDouble();
//        raiz = Math.sqrt(numero);
//        System.out.print("\n A raiz de " + numero + " = ");
//        System.out.print("\n" + String.format("%.4f", raiz));
//    }

    private static void leiaPeso(Carros c1, String dataExecucao) {
        System.out.print("\nData de Execução: " + dataExecucao);
        System.out.print("\nNovo peso de c1: " + c1.getPeso());
    }
}
