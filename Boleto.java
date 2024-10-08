/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapagamento;

/**
 *
 * @author tony
 */
public class Boleto implements Pagamentos {
    private String codigoBarra;
    private double saldoBoleto;
    private double valorBoleto;
    public Boleto(String codigoBarra, double saldoBoleto, double valorBoleto){
        this.codigoBarra = codigoBarra;
        this.saldoBoleto = saldoBoleto;
        this.valorBoleto = valorBoleto;
    }

    
    @Override
    public void realizarPagamento() {
          if(this.saldoBoleto >= this.valorBoleto){
              this.saldoBoleto -= this.valorBoleto;
            System.out.println("Valor do boleto : " + valorBoleto + "\n valor pago: " + saldoBoleto);
            }else{
            System.out.println("Valor de pagamento insuficente: " + saldoBoleto + "\n valor do boleto: " + valorBoleto);
        }
    }

    @Override
    public void emitirRecibo() {
        if(this.saldoBoleto >= this.valorBoleto){
        System.out.println("A compra foi paga com um boleto");
        }else{}
    }
    
}
