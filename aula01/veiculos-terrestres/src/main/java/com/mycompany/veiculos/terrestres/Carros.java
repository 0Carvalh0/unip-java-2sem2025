/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos.terrestres;

/**
 *
 * @author lab9
 */
public class Carros {

    private int placa;
    private double peso;
    static int numCarros = 0;

    /**
     * @return the placa
     */
    public int getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(int placa) {
        this.placa = placa;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double novoPeso) {
        if (novoPeso > 0) {
            this.peso = novoPeso;
        } else {
            this.peso = 0;
        }
    }

    public Carros() {
        numCarros++;
    }

    public Carros(double novoPeso) {
        this.peso = novoPeso;
        numCarros++;
    }
}
