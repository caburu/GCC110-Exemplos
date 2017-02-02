
public class Circulo extends FormaGeometrica
{
	private int diametro;
	
	public Circulo()
	{
		diametro = 30;
	}
	
	public int getDiametro()
	{
		return diametro;
	}
	
	public void mudarDiametro(int diametro)
	{
		this.diametro = diametro;
	}
	
	@Override
	public void exibir()
	{
		System.out.println(
			"Circulo de diametro " + diametro);
	}
	
	@Override
	public void mudarDimensao(Dimensao d)
	{
		if (d instanceof DimensaoSimples)
		{
			DimensaoSimples ds = (DimensaoSimples)d;
			diametro = ds.getValor();
		}
	}
}