/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle_veiculo;

/**
 *
 * @author tony
 */
public abstract class VeiculoMotorizado implements Veiculo {
   public void combustivel(){
       System.out.println(" O combustivel: ");
       
   }
   
   public abstract double combcalc(double distancia);
}

