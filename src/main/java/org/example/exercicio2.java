package org.example;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
//        Sabendo que latão é constituído de 70% cobre e 30% zinco:
//        Solicitar o peso de latão que o usuário deseja;
//        Informar o peso de cobre necessário;
//        Informar o peso de zinco necessário.

        Scanner s = new Scanner(System.in);
        System.out.println("Peso do latão desejado(kg): ");
        int pesoLatao = Integer.parseInt(s.nextLine());

        int quantidadeCobre = ((pesoLatao / 100) * 70);
        int quantidadeZinco = ((pesoLatao / 100) * 30);

        System.out.println("Quantidade de cobre: " +quantidadeCobre);
        System.out.println("Quantidade de zinco: " +quantidadeZinco);

    }
}
