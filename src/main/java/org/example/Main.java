package org.example;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    package - vai compilar e cria o diretório target
//    clean - deleta o target (ás vezes dentro do target tem arquivos alterados e dá problema)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = s.nextLine();
        // Se for usar o JOptionPane, verificar se está atrás da IDE o dialog
//        nome = JOptionPane.showInputDialog("Qual o seu nome?");
//        JOptionPane.showMessageDialog(null, "Olá"+nome);

        System.out.println("Qual a sua idade?");
        int idade = Integer.parseInt(s.nextLine());
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        System.out.println("Cálculo do IMC:");
        System.out.println("Qual a sua altura(metro)?");
        double altura = Double.parseDouble(s.nextLine());
        System.out.println("Qual o seu peso(kg)?");
        double peso = Double.parseDouble(s.nextLine());
        double imc = peso/(altura*altura);
        System.out.println("Seu IMC é " +imc);
    }
}
