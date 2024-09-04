package Exercicios_aula8_objetos_nativos;

import java.util.Calendar;

public class Teste_de_calendario {

	public static void main(String[] args) {
			Calendar c = Calendar.getInstance();
			System.out.println("Data e Hora atual: " + c.getTime());
			// Ano, mês e dia do mês e da semana
			System.out.println("Ano: " + c.get(Calendar.YEAR));
			System.out.println("Mês: " + c.get(Calendar.MONTH));
			System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
			System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));

	}

}
