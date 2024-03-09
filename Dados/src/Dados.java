import java.util.Random;
import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Bem-vindo ao Jogo de Dados!");
		
		int pontosJogador = 0;
		int pontosAdver = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Pressione enter para rolar o Dado");
			sc.nextLine();
			
			int valorDado = random.nextInt(6) + 1;
			System.out.println("Você rolou " + valorDado + "!");
			System.out.println("...");
			
			int adverDado = random.nextInt(6)+ 1;
			System.out.println("Adversário rolou " + adverDado + "!");
			System.out.println();
			
			if(valorDado > adverDado) {
				pontosJogador++;
				System.out.println("Você venceu essa rodada!");
			} else if (valorDado < adverDado) {
				pontosAdver++;
				System.out.println("O adversário venceu essa rodada!");
			} else {
				System.out.println("Empate!");
			}
			System.out.println();
			System.out.println("A pontuação atual é - Você: " + pontosJogador + ". Adversário: " + pontosAdver + ".");
			System.out.println();
		}
		if(pontosJogador > pontosAdver) {
			System.out.println("Você ganhou!");
		} else if(pontosJogador < pontosAdver) {
			System.out.println("Você perdeu!");
		} else {
			System.out.println("Empate!");
		}
		
		sc.close();
	}

}
