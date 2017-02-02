
public class Triangulo extends FormaGeometrica
{
	private int base;
	private int altura;
	
	public Triangulo()
	{
		base = 20;
		altura = 15;
	}
	
	public int getBase()
	{
		return base;
	}
	
	public int getAltura()
	{
		return altura;
	}
	
	public void mudarTamanho(int base, int altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void exibir()
	{
		System.out.println(
			"Triangulo de tamanho " + base + " - " + altura);
	}	
	
	@Override
	public void mudarDimensao(Dimensao d)
	{
		if (d instanceof DimensaoDupla)
		{
			DimensaoDupla dd = (DimensaoDupla)d;						
			base = dd.getBase();
			altura = dd.getAltura();
		}
	}
}