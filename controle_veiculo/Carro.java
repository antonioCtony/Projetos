/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle_veiculo;

/**
 *
 * @author tony
 */
public class Carro extends VeiculoMotorizado {
    private double consumo;
    
    public Carro(double consumo){
        this.consumo = consumo;
    }
    
     public double combcalc(double distancia){
         return distancia * consumo;
}

    @Override
    public void acelerar() {
        System.out.println("Carro Acelerando: Vrunmmmmmmmm!!");
    }

    @Override
    public void frear() {
        System.out.println("Carro Freando: IHHHHHHHHHHH");
    }

}

