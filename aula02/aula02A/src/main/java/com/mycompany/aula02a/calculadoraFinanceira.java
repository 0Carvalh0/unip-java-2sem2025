/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aula02a;

/**
 *
 * @author lab9
 */
public interface calculadoraFinanceira {
    double calcularMontante(double capital, double taxaMensal, int meses);
    
    double calcularJuros(double capital, double montante);
}
