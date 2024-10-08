 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapagamento;

/**
 *
 * @author tony
 */
public class PayPal implements Pagamentos {
    private String email;
    private double emailValor;
    private double emailSaldo;
    
    public PayPal(String email){
        this.email = email;
        this.emailSaldo = emailSaldo;
        this.emailValor = emailValor;
        
    }


    @Override
    public void emitirRecibo() {
         System.out.println("Pagamento não foi realizado atráves do email." + email);
    }

    @Override
    public void realizarPagamento() {
        if(this.emailSaldo >= this.emailValor){
            System.out.println("O pagamento foi feito atráves desse email: " + email);
            System.out.println("O valor da compra: " + emailValor);
            this.emailSaldo -= this.emailValor;
            System.out.println("Saldo que sobrou no email: " + emailSaldo);
            emitirRecibo();
        }else{
            System.out.println("Valor insuficiente: " + emailSaldo);
        }
    }
    
}
