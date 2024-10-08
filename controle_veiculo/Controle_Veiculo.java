/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controle_veiculo;

/**
 *
 * @author tony
 */
public class Controle_Veiculo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Carro carro = new Carro(0.15);
        carro.acelerar();
        carro.frear();
        carro.combustivel();
        
        double combcarro = carro.combcalc(100);
        System.out.println("Coonsumo de carro para 100 km: " + combcarro + "Litros");
        
        System.out.println();
        
        Moto moto = new Moto (0.10);
        moto.acelerar();
        moto.frear();
        moto.combustivel();
        
        double combmot = moto.combcalc(100);
        System.out.println("Coonsumo de carro para 100 km: " + combmot + "Litros");
        
        System.out.println();
        
        Bicicleta bicleta = new Bicicleta();
        bicleta.acelerar();
        bicleta.frear();
        
        
        
        
        
    }
}
