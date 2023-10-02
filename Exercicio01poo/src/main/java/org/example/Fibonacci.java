package org.example;

public class Fibonacci {

    // Método recursivo para calcular o número de Fibonacci
    public static long fib1(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib1(n - 1) + fib1(n - 2);
    }

    // Método usando um loop "for" para calcular o número de Fibonacci
    public static long fib2(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long fibAnterior = 0;
        long fibAtual = 1;

        for (int i = 2; i <= n; i++) {
            long fibNext = fibAnterior + fibAtual;
            fibAnterior = fibAtual;
            fibAtual = fibNext;
        }

        return fibAtual;
    }

    // Método usando um loop "while" para calcular o número de Fibonacci
    public static long fib3(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long fibAnterior = 0;
        long fibAtual = 1;
        int i = 2;

        while (i <= n) {
            long fibNext = fibAnterior + fibAtual;
            fibAnterior = fibAtual;
            fibAtual = fibNext;
            i++;
        }

        return fibAtual;
    }
    public static void main(String[] args) {
        int n = 20;

        System.out.println("Calculando os primeiros " + n + " números da série de Fibonacci:");

        for (int i = 0; i < n; i++) {
            long fibValor1 = fib1(i);
            long fibValor2 = fib2(i);
            long fibValor3 = fib3(i);

            System.out.println("fib1(" + i + ") = " + fibValor1);
            System.out.println("fib2(" + i + ") = " + fibValor2);
            System.out.println("fib3(" + i + ") = " + fibValor3);
            System.out.println();
        }
    }
}