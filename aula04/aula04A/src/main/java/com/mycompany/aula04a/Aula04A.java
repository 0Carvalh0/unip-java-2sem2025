/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04a;

import geometricObjects.Circle;
import static java.io.IO.print;
import java.util.Scanner;

/**
 *
 * @author lab9
 */
public class Aula04A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circulos[] = {
            new Circle(1),
            new Circle(2),
            new Circle(3, "vermelho", false)
        };
        
        print("Escolha o circulo de 1 a 3: ");
        int index;
        try {
            index = input.nextInt();        
            relatorio(circulos, index);
        } catch (Exception ex) {
            print(ex.getMessage());
        }
        
        
    }

    private static void relatorio(Circle[] circulos, int index) {
        print("\nO circulo da colecao tem area: " + String.format("%.5f", circulos[index-1].getArea()) + " m^2");
        
        print("\nO circulo da colecao tem perimetro: " + String.format("%.5f", circulos[index-1].getPerimeter()) + " m");
    }
    
    private static void print(String s) {
        System.out.print(s);
    }
}
