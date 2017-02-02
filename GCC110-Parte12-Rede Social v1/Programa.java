import java.util.*;

/**
 * Parte do material das disciplinas de Orientação a Objetos
 * do Departamento de Ciência da Computação
 * da Universidade Federal de Lavras (DCC/UFLA)
 *
 * Codigo inicial incompleto usado nas aulas de Polimorfismo.
 *
 * Implementação baseada no exemplo de Barnes e Kolling
 * Prof. Julio Cesar Alves
 */
public class Programa {
	private static FeedNoticias feed;
	
	public static void main(String[] args) {
		feed = new FeedNoticias();
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		do
		{
			exibirMenu();
			opcao = entrada.nextInt();
			tratarOpcaoMenu(opcao);			
		} while (opcao != 4);		
	}
	
	private static void exibirMenu() {
		System.out.println("\nREDE SOCIAL ");
		System.out.println("1 - Exibir o Feed de Noticias");
		System.out.println("2 - Postar mensagem de texto");
		System.out.println("3 - Postar mensagem com foto");
		System.out.println("4 - Sair\n");
		System.out.print("Digite sua opcao: ");
	}
	
	private static void tratarOpcaoMenu(int opcao) {
		switch (opcao) {
			case 1:
				feed.exibir();
				break;
			case 2:
				postarTexto();				
				break;
			case 3:
				postarFoto();
				break;
			case 4:
				System.out.println("\nObrigado!\n");
				break;
			default:
				System.out.println("\nOpcao Invalida!\n");
				break;
		}
	}
	
	private static void postarTexto() {
		String autor, mensagem;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o autor:");
		autor = entrada.nextLine();
		
		System.out.println("Digite a mensagem de texto:");
		mensagem = entrada.nextLine();
		
		feed.postarMensagemTexto(autor, mensagem);
	}
	
	private static void postarFoto() {
		String autor, foto, legenda;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o autor:");
		autor = entrada.nextLine();
		
		System.out.println("Digite o arquivo da foto:");
		foto = entrada.nextLine();
		
		System.out.println("Digite a legenda da foto:");
		legenda = entrada.nextLine();
		
		feed.postarMensagemFoto(autor, foto, legenda);
	}
}
