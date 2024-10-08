/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle_veiculo;

/**
 *
 * @author tony
 */
    public class Bicicleta implements Veiculo {

        @Override
        public void acelerar() {
            System.out.println("Bike Acelerando: Pedala, Pedala!");
        }

        @Override
        public void frear() {
            System.out.println("Bike Freando: Freio");
        }

    }
