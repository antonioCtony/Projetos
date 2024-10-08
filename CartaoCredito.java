/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapagamento;

/**
 *
 * @author tony
 */
public class CartaoCredito implements Pagamentos{
    private String numeroCartao;
    private double valorCartao;
    private double saldoCartao;
    
    public CartaoCredito(String numeroCartao, double valorCartao,double saldoCartao){
    this.numeroCartao = numeroCartao;
    this.valorCartao = valorCartao;
    this.saldoCartao = saldoCartao;
    }

    @Override
    public void emitirRecibo() {
        if(this.saldoCartao >= this.valorCartao){
            System.out.println("O pagamento foi pagado atráves do cartão de credito de: "+ saldoCartao + " número do cartão:  " + numeroCartao);
            this.saldoCartao -= valorCartao;
            System.out.println("Saldo atual do cartão de credito: " + this.saldoCartao);
        }
    }

    @Override
    public void realizarPagamento() {
         if(this.saldoCartao >= this.valorCartao){
            System.out.println("O pagamento de " + this.valorCartao + "foi realizado com o número de cartão de credito" + this.numeroCartao + "Com o saldo de: " + this.saldoCartao );
            this.saldoCartao -= this.valorCartao;
            System.out.println("Saldo atual do cartão: " + this.saldoCartao);
        }else{
             System.out.println("Valor insuficiente: " + this.saldoCartao);
             System.out.println("Valor da compra: " + this.valorCartao);
         }
    }


  
}
