/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lab9
 */
public class Aula02B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List<Carros> listaDeCarros = new ArrayList<>();
        
        double pesoInicial = 300.0;
        
        for (int i = 0; i < 10; i++) {
            Carros carro = new Carros(pesoInicial + i * 100);
            listaDeCarros.add(carro);
        }
        
        // EXIBINDO DE CARROS
        for (var carro : listaDeCarros) {
            System.out.print(carro);
        }
        
        lerElementoLista(input, listaDeCarros);
    }
    
    private static void lerElementoLista(Scanner input, List<Carros> listaDeCarros) {
        int index;
        
        System.out.print("\nQual e o indice que voce deseja ler: ");
        index = input.nextInt();
        
        lerPesoCarroLista(listaDeCarros, index);
    }
    
    private static void lerPesoCarroLista(List<Carros> listaDeCarros, int index) {
        try {
            System.out.print("Carro de indice: " + index + " tem peso: " + listaDeCarros.get(index - 1).getPeso() + "Kg");
        } catch (IndexOutOfBoundsException e) {
            System.out.print(e.getMessage());
        }
    }
}
