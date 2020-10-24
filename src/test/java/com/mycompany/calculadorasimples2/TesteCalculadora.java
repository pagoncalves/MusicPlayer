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
        int soma = calc.mult(5, 7);
        assertEquals(35, soma);
    }

}
