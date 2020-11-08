/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadorasimples2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCalculadora {

    public TesteCalculadora() {
    }

    @Test
    public void test_calculadora() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int soma = calc.soma(5, 7);
        assertEquals(12, soma);
    }

    @Test
    public void testa_mult() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int mult = calc.mult(5, 7);
        assertEquals(35, mult);
    }

    @Test
    public void testa_media() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double[] v = {6, 8, 10};
        double media = calc.media(v);
        assertEquals(8, media);
    }

    @Test
    public void testa_maximo() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double[] v = {6, 8, 10};
        double maximo = calc.maximo(v);
        assertEquals(10, maximo);
    }

    @Test
    public void testa_soma_de_sequencia() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double soma = calc.soma_seq(4);
        assertEquals(1 + 2 + 3 + 4, soma);
    }

    @Test
    public void testa_media2() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double media = calc.media2(3.0,5.0);
        assertEquals(4, media);
    }

    @Test
    public void testa_potencia() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double pot = calc.potencia(2.0 ,3);
        assertEquals(8.0, pot);
    }

    @Test
    public void testa_soma_quadrados() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int soma = calc.soma_quadrados(4);
        assertEquals(1*1 + 2*2 + 3*3 + 4*4, soma);
    }
    
    @Test
    public void testa_soma_quadrados() {
        CalculadoraSimples calc = new CalculadoraSimples();
        v = {3, 2, 4, 5}
        int soma = calc.soma_quadrados_vetor(v);
        assertEquals(3*3 + 2*2 + 4*4 + 5*5, soma);
    }
    
}
