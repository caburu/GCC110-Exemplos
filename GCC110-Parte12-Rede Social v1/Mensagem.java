import java.util.*;

public class Mensagem {
	private String autor;
	private int nroCurtidas;
	private long horaPostagem;
	private ArrayList<String> comentarios;
	
	public Mensagem(String autor) {
		this.autor = autor;
		nroCurtidas = 0;
		horaPostagem = System.currentTimeMillis();
		comentarios = new ArrayList<String>();		
	}
	
	public void curtir() {
		nroCurtidas++;
	}
	
	public void comentar(String comentario) {
		comentarios.add(comentario);
	}
	
	public void exibir() {
		System.out.println(autor);
		System.out.println("\t" + exibirTempo() + " - "
			+ nroCurtidas + " pessoas curtiram isso!");
		exibirComentarios();
	}
	
	private String exibirTempo() {
		long tempoAtual = System.currentTimeMillis();
		long diferenca = (tempoAtual - horaPostagem);
		
		long diferencaSeg = diferenca/1000;
		long diferencaMin = diferencaSeg/60;

		if (diferencaMin < 1) {
			return "\tHa " + diferencaSeg + " segundos atras";
		}
		else {
			return "\tHa " + diferencaMin + " minutos atras";
		}
	}
	
	private void exibirComentarios() {
		if (comentarios.size() == 0) {
			System.out.println("\tNao ha comentarios...");
		}
		else {
			for (int i = 0; i < comentarios.size(); i++) {	
				System.out.println("\t" + comentarios.get(i));
			}
		}
	}
}