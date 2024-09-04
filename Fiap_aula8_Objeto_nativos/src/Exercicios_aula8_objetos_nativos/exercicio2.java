package Exercicios_aula8_objetos_nativos;

import java.util.Calendar;

public class exercicio2 {
/*▪ Faça um programa que verifica o dia da semana.
▪ Se for terça-feira, exiba ao usuário que terá feira de rua.*/
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		if(c.get(Calendar.DAY_OF_WEEK)==3) {
			System.out.println("Hoje tem feira!");
		} else {
			System.out.println("Tem nada hoje.");
		}
	}
}
