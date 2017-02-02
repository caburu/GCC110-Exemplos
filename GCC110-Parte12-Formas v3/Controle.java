import java.util.*;

public class Controle
{
	private ArrayList<FormaGeometrica> formas;
	
	public Controle()
	{
		formas = new ArrayList<FormaGeometrica>();
	}
	
	public int inserirForma(FormaGeometrica forma)
	{
		formas.add(forma);
		return formas.size()-1;
	}
	
	public void exibirFormas()
	{		
		System.out.println("\n");
		for (int i = 0; i < formas.size(); i++)
		{
			formas.get(i).exibir();
		}
	}
	
	public void mudarDimensao(int posForma, 
		Dimensao d)
	{
		formas.get(posForma).mudarDimensao(d);
	}
}