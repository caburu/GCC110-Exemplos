
public enum Direcao
{
	NORTE(1, "Va para o norte!"), 
	SUL(2, "Va para o sul!"), 
	LESTE(3, "Va para o leste!"), 
	OESTE(4, "Va para o oeste!");
	
	private int codigo;
	private String texto;	
	
	private Direcao(int codigo, String texto)
	{
		this.codigo = codigo;
		this.texto = texto;
	}

	public String getTexto()
	{
		return texto;
	}
	
	public int getCodigo()
	{
		return codigo;
	}
}

