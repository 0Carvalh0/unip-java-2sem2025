/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02a;

/**
 *
 * @author lab9
 */
public class calculadoraFinanceiraIMPL implements calculadoraFinanceira {
    @Override
    public double calcularMontante(double capital, double taxaMensal, int meses) {
        return capital * Math.pow(1 + taxaMensal, meses);
    }
    
    @Override
    public double calcularJuros(double capital, double montante) {
        return montante - capital;
    }
}
