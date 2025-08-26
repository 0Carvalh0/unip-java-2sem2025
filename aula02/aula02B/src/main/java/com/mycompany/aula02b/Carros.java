/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02b;

/**
 *
 * @author lab9
 */
public class Carros {
    private double peso;
    
    public Carros (double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }
    
    @Override
    public String toString() {
        return "Carro com peso: " + peso + "Kg\n";
    }
}
