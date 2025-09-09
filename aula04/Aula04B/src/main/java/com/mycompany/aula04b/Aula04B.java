/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04b;

/**
 *
 * @author lab9
 */
public class Aula04B {

    public static void main(String[] args) {
        Object[] objetos = {new Tiger(), new Chicken(), new Apple()};
        
        for (Object objeto: objetos) {
            if (item instanceof Edible) {
                print(((Edible) item).howToEat());
            }
            
            if (item instanceof Animal) {
                print(((Animal) item).sound());
            } 
       }
    }
    
    private void print(String s) {
        System.out.print(s);
    }
}
