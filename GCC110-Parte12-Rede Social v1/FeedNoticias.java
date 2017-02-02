import java.util.*;

public class FeedNoticias {
	
	private ArrayList<Mensagem> mensagens;
	
	public FeedNoticias() {
		mensagens = new ArrayList<Mensagem>();
	}
	
	public void postarMensagemTexto(String autor,
		String texto) {
		mensagens.add(new MensagemTexto(autor, texto));
	}
	
	public void postarMensagemFoto(String autor,
		String arquivoFoto, String legenda) {
		mensagens.add(new MensagemFoto(autor, arquivoFoto, legenda));
	}
	
	public void exibir() {
		for (int i = 0; i < mensagens.size(); i++) {
			mensagens.get(i).exibir();
		}
	}
}