public class DimensaoDupla implements Dimensao
{
	private int base;
	private int altura;
	
	public DimensaoDupla(int base, int altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase()
	{
		return base;
	}
	
	public int getAltura()
	{
		return altura;
	}
}