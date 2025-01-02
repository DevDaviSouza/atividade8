package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        contaPalavras();
    }



    //ex1
    static void calculadora() {
        double resultado = 0;

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }

    //ex2
    static void palindromo() {
        System.out.print("Digite palavra: ");
        String palindromo = scanner.next();

        String palavraFormatada = palindromo.replaceAll("\\s+", "").toLowerCase();


        boolean ePalindromo = true;
        int tamanho = palavraFormatada.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavraFormatada.charAt(i) != palavraFormatada.charAt(tamanho - 1 - i)) {
                ePalindromo = false;
                break;
            }
        }

        if (ePalindromo) {
            System.out.println("A palavra \"" + palindromo + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palindromo + "\" não é um palíndromo.");
        }
    }


    //ex3
    static void fibonacci() {
        System.out.print("Digite a quantidade de números da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que 0.");
        } else {
            System.out.println("Sequência de Fibonacci:");
            long primeiro = 0, segundo = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(primeiro + " ");
                long proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
        }

    }


    //ex4

    static void inverteNumeros() {
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("Número invertido: " + numeroInvertido);
    }


    //ex5

    static void anagramas() {
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        String palavraFormatada1 = palavra1.replaceAll("\\s+", "").toLowerCase();
        String palavraFormatada2 = palavra2.replaceAll("\\s+", "").toLowerCase();

        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean comparaPalavras = Arrays.equals(array1, array2);

        if (comparaPalavras == true) {
            System.out.println("as palavras sao anagramas");
        }else {
            System.out.println("as palavras digitadas nao sao anagramas");
        }
    }

    //ex6

    static void sorteioNumeros() {
        int numeroAleatorio = random.nextInt(50) + 1;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 50).");

        int palpite = 0;

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número.");
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }
    }

    //ex7
    
    static void contaPalavras() {
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.trim().split("\\s+");

        int numeroDePalavras = palavras.length;

        System.out.println("A frase contém " + numeroDePalavras + " palavra(s).");
    }
}
