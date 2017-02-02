
public class MensagemFoto extends Mensagem {
	
	private String arquivoFoto;
	private String legenda;
	
	public MensagemFoto(String autor, String arquivoFoto,
		String legenda) {
		super(autor);
		this.arquivoFoto = arquivoFoto;
		this.legenda = legenda;
	}
}