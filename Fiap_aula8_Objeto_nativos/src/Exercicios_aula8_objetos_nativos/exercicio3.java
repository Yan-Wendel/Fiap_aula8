package Exercicios_aula8_objetos_nativos;
import java.util.Scanner;
public class exercicio3 {
/*▪ Faça um programa que recebe um texto qualquer do usuário.
▪ A seguir, exiba:
▪ A quantidade de caracteres alfabéticos maiúsculos
▪ A quantidade de caracteres alfabéticos minúsculos
▪ A quantidade de caracteres numéricos
▪ A quantidade de espaço em branco*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        // Solicita ao usuário que insira um texto
        System.out.println("Digite um texto qualquer:");
        String texto = ler.nextLine();
     // Inicializa os contadores
        int maiusculas = 0;
        int minusculas = 0;
        int numericos = 0;
        int espacos = 0;
        
     // Itera sobre cada caractere do texto
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isUpperCase(caractere)) {
                maiusculas++;
            } else if (Character.isLowerCase(caractere)) {
                minusculas++;
            } else if (Character.isDigit(caractere)) {
                numericos++;
            } else if (Character.isWhitespace(caractere)) {
                espacos++;
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de caracteres alfabéticos maiúsculos: " + maiusculas);
        System.out.println("Quantidade de caracteres alfabéticos minúsculos: " + minusculas);
        System.out.println("Quantidade de caracteres numéricos: " + numericos);
        System.out.println("Quantidade de espaços em branco: " + espacos);
	}

}
