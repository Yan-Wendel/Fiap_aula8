package Exercicios_aula8_objetos_nativos;
import java.util.Random;
public class exercicio5 {
/*▪ Faça um programa que sorteie 10 números aleatórios entre 5 e 50.
▪ Some todos esses números e exiba o resultado final.*/
	public static void main(String[] args) {
		 // Número de sorteios
        final int quant = 10;
        // Intervalo dos números aleatórios
        final int MIN = 5;
        final int MAX = 50;
     // Criação do gerador de números aleatórios
        Random random = new Random();

        // Variável para armazenar a soma dos números
        int soma = 0;
        System.out.println("Números sorteados:");
        for (int i = 0; i < quant; i++) {
            // Gera um número aleatório entre MIN e MAX (inclusivo)
            int numero = random.nextInt(MAX - MIN + 1) + MIN;
            // Exibe o número sorteado
            System.out.print(numero + " ");
            // Soma o número ao total
            soma += numero;
            System.out.println("\nSoma total dos números sorteados: " + soma);
        }

	}

}
