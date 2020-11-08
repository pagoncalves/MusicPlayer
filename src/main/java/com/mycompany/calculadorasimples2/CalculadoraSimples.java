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

    public int mult(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public double media(double[] v) {
        double somam = 0;
        for (int i = 0; i < v.length; i++) {
            somam += v[i];
        }
        return somam / v.length;
    }

    public double maximo(double[] v) {
        double max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (max < v[i]) {
                max = v[i];
            }
        }
        return max;
    }

    public double soma_seq(int n) {
        int acum = 0;
        for (int i = 1; i <= n; i++) {
            acum += i;
        }
        return acum;

    }

    public double media2(double n1, double n2) {
        double med = 0;
        med = (n1 + n2) / 2.0;
        return med;
    }

    public double potencia(double n1, int n2) {
        double acum = 1;
        for (int i = 0; i < n2; i++) {
            acum *= n1;
        }
        return acum;

    }

    public int soma_quadrados(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            int quad = i * i;
            soma += quad;
        }
        return soma;
    }

}//fim da classe
