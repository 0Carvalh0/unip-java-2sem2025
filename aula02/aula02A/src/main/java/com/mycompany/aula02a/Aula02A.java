/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02a;
import java.util.Scanner;

/**
 *
 * @author lab9
 */
public class Aula02A {

    public static void main(String[] args) {        
        try (Scanner scanner = new Scanner (System.in)) {
            calculadoraFinanceira calc = new calculadoraFinanceiraIMPL();
            
            // ENTRADA DO USUARIO
            System.out.print("Informe o capital inicial: R$");
            double capital = scanner.nextDouble();
            
            System.out.print("Informe o numero de meses: ");
            int meses = scanner.nextInt();
            
            // LISTA DE TAXAS
            double[] taxas = {0.01, 0.015, 0.02};
            
            System.out.print("\nEscolha uma das taxas: \n");
            
            for (int i = 0; i < taxas.length; i++) {
                System.out.printf("%d = %.2f%% ao mes\n", i + 1, taxas[i] * 100);
            }
            
            System.out.print("Digite o numero da taxa desejada: ");
            int escolha = scanner.nextInt();
            
            if (escolha < 1 || escolha > taxas.length) {
                System.out.print("[ERRO] Opcao invalida.");
                return;
            }
            
            // CALCULOS FINANCEIROS
            double taxaEscolhida = taxas[escolha - 1];
            double montante = calc.calcularMontante(capital, taxaEscolhida, meses);
            double juros = calc.calcularJuros(capital, montante);
            
            System.out.printf("\nResultado para taxa de %.2f%%\n", taxaEscolhida * 100);
            System.out.printf("Montante: R$ %.2f\n", montante);
            System.out.printf("Juros: R$ %.2f\n", juros);
            
            // COMPARATIVO COM TODAS AS TAXAS
            System.out.print("\nComparativo com todas as taxas: ");
            
            for (double taxa : taxas) {
                double m = calc.calcularMontante(capital, taxa, meses);
                double j = calc.calcularJuros(capital, m);
                
                System.out.printf("\nResultado para taxa de %.2f%%\n", taxa * 100);
                System.out.printf("Montante: R$ %.2f\n", m);
                System.out.printf("Juros: R$ %.2f\n", j);
            }
        }
    }
}
