package org.example;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
//        Calcular quanto um fumante gasta ao longo da vida com cigarro:
//        Perguntar a quantidade de anos como fumante;
//        Perguntar a quantidade de cigarros por dia;
//        Perguntar o valor da carteira de cigarro;
//        Considerar 20 cigarros por carteira;
//        Informar o total de dinheiro gasto.

        Scanner s = new Scanner(System.in);
        System.out.println("Fazem quantos anos que você é fumante (anos)?");
        int tempoFumante = Integer.parseInt(s.nextLine());

        System.out.println("Quantos cigarros você fuma por dia?");
        int qtdCigarrosDia = Integer.parseInt(s.nextLine());

        System.out.println("Qual o valor de cada carteira de cigarro?");
        int valorCarteira = Integer.parseInt(s.nextLine());

        int quantidadeCigarros = qtdCigarrosDia*(tempoFumante*365);
        int quantidadeCarteiras = quantidadeCigarros / 20;
        int valorGasto = quantidadeCarteiras * valorCarteira;

        System.out.println("Valor gasto: R$ " +valorGasto);

    }
}
