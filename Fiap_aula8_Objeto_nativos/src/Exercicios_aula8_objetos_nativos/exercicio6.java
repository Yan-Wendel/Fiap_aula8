package Exercicios_aula8_objetos_nativos;
import java.util.Random;
public class exercicio6 {
/*▪ Faça um programa que sorteio 100 números inteiros entre 0 e 100 (incluindo 100).
▪ Ao final, exiba as seguintes informações:
▪ Foram sorteados XX números pares.
▪ Foram sorteados XX números ímpares.
▪ Foram sorteados XX números primos.*/
	public static void main(String[] args) {
		// Número de sorteios
        final int QUANTIDADE_NUMEROS = 100;
        // Intervalo dos números aleatórios
        final int MIN = 0;
        final int MAX = 100;

        // Criação do gerador de números aleatórios
        Random random = new Random();

        // Contadores
        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorPrimos = 0;

        // Sorteio dos números e contagem das estatísticas
        for (int i = 0; i < QUANTIDADE_NUMEROS; i++) {
            // Gera um número aleatório entre MIN e MAX (inclusivo)
            int numero = random.nextInt(MAX - MIN + 1) + MIN;

            // Verifica se o número é par ou ímpar
            if (isPar(numero)) {
                contadorPares++;
            } else {
                contadorImpares++;
            }

            // Verifica se o número é primo
            if (isPrimo(numero)) {
                contadorPrimos++;
            }
        }

        // Exibe os resultados
        System.out.println("Foram sorteados " + contadorPares + " números pares.");
        System.out.println("Foram sorteados " + contadorImpares + " números ímpares.");
        System.out.println("Foram sorteados " + contadorPrimos + " números primos.");
    }

    // Método para verificar se o número é par
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    // Método para verificar se o número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        if (numero == 2) {
            return true; // O número 2 é primo
        }
        if (numero % 2 == 0) {
            return false; // Números pares maiores que 2 não são primos
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false; // O número é divisível por i, não é primo
            }
        }
        return true; // O número é primo
	}
}
