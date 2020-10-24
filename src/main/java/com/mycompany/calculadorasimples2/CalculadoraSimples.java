package com.mycompany.calculadorasimples2;

public class CalculadoraSimples {

    public static void main(String[] args) {
        System.out.printf("Olá, sou a calculadora simples %n Escolha qual"
                + " operação deseja saber o resultado %n");
        System.out.println("OBS: Apenas valores inteiros.");

        int operacao = 4;
        String nome;
        int n1 = 2;
        int n2 = 7;
        int resul;

        switch (operacao) {
            case 1:
                nome = "soma";
                resul = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resul);
                break;
            case 2:
                nome = "subtracao";
                resul = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resul);
                break;
            case 3:
                nome = "multiplicacao";
                resul = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resul);
                break;
            case 4:
                nome = "divisao";
                resul = n1 / n2;
                if (n1 < n2) {
                    System.out.println("ERRO:Divisor maior que dividendo");
                } else {
                    System.out.println(n1 + " / " + n2 + " = " + resul);
                }

        }
    }//fim do main

    public int soma(int a, int b) {
        return a + b;

    }
}//fim da classe
