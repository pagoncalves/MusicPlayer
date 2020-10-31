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
}
