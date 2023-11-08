package Exercicio_01;

import java.util.Scanner;

public class VerificarNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota entre 0 a 10: ");
        double nota  = scanner.nextDouble();

        if (nota>8) {
            System.out.print(" Aluno Aprovado ");
        }else if (nota >=6){
            System.out.print(" Aluno em Recuperação");
        }else {
            System.out.print(" Aluno Reprovado");
        }
        scanner.close();
    }
}