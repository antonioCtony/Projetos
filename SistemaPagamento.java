/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemapagamento;

/**
 *00
 * @author tony
 */
public class SistemaPagamento {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CartaoCredito cartao = new CartaoCredito("132132132132",123,200);
        Boleto boleto = new Boleto("32132132123",123.00,20);
        PayPal paypal = new PayPal("Antonioces@outlook.com");
        
        cartao.realizarPagamento();
        cartao.emitirRecibo();
        
        System.out.println();
        
        boleto.realizarPagamento();
        boleto.emitirRecibo();
        
        System.out.println();
        
        paypal.realizarPagamento();
        paypal.emitirRecibo();
        
    }
}
