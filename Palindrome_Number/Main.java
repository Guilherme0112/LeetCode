package Palindrome_Number;

import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int input = sc.nextInt();
        int numero = input;
        int reverso = 0;

        while(numero > 0){
            int ultimo = numero % 10;
            reverso = reverso * 10 + ultimo;
            numero /= 10;
        }

        System.out.println("Entrada: " + input);
        System.out.println("Saída: " + reverso);

        if(reverso == input){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}

// Feito em:
// 08/07/2025