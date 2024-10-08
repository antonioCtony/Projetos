/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle_veiculo;

/**
 *
 * @author tony
 */
public class PontoQuestoes {
    /* 

    Interface vs Classe Abstrata: Quando usar cada uma e por que?
    
    Resposta: A diferença entre classe abstrata é que a classe abstrata ela não pode ser instanciada somente herdada
    imagina que queremos uma metodo andar porém não queremos criar uma objeto para "Andar" dentro da classe
    abstrata, então criamos uma classe chamada animal onde essa classe pode herdar o metodo andar da classe abstrata
    assim a classe animal pode andar herdando o metado do classe abstrata.
    
    Agora  a interface digamos que ela cria metados, acredito que dizer um conjunto de regreas seria melhor
    pois se você implementar ela em uma classe você deve seguir um passo a passo obrigatorio vamos dizer assim, sendo assim
    se você precissa de um conjunto de metodos usar a interface, se precisar de um metodo base seria a classe abstrata.
    
    Polimorfismo: Como o polimorfismo se manifesta ao utilizar interfaces e classes abstratas?
    
    Resposta: O exemplo esta no exercicio onde temos uma classe moto e uma carro o polimorfismo surge quando eu consigo
    tratar tanto o carro quanto a moto de maneira iguias pois tem um metado que seria acelerar e frear em comum
    
    Como o código pode ser facilmente expandido para incluir novos tipos de veículos?
    
    Resposta: Podemos criar uma classe caminhão que vai extender VeiculoMotorizado assim, como carro e moto e fazer
    as tratativa em comum entre eles, assim podemos reutilizar acelerar e frear e caso necessite de algo especifico de caminhão
    podemos criar na propria classe. */
    
}
