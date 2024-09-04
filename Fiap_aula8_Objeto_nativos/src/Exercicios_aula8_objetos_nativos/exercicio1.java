package Exercicios_aula8_objetos_nativos;
import java.util.Calendar;
public class exercicio1 {
/*▪ Faça um programa que verifica a hora do dia e exiba a mensagem ao usuário com o
nome dele:
▪ “Bom dia, FULANO!” se for maior ou igual que 6h da manhã
▪ “Boa tarde, FULANO!” se for maior ou igual que 12h
▪ “Boa noite, FULANO!” se for maior ou igual que 18h*/
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		if(hora >= 18) {
			System.out.println("Hora: " + hora + " Bom noite Fulano");
		} else if(hora >= 12) {
			System.out.println("Hora: " + hora + " Boa tarde Fulano");
		} else if(hora >= 6) {
			System.out.println("Hora: " + hora + " Boa dia Fulano");
		}
		

	}

}
