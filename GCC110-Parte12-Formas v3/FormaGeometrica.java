import java.util.*;

public abstract class FormaGeometrica
{
	private int posX;
	private int posY;
	private String cor;
	private boolean estaVisivel;

	public FormaGeometrica()
	{
		posX = 100;
		posY = 100;
		cor = "verde";
		estaVisivel = false;
	}
	
	public abstract void exibir();
	
	public abstract void mudarDimensao(Dimensao d);
}