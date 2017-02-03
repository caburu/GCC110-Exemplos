public class ContaPoupanca extends Conta
{
	int diaRendimento;
	float taxaJuros;
	
	public ContaPoupanca(int numero, int diaRendimento)
	{
		super(numero);
		this.diaRendimento = diaRendimento;		
		taxaJuros = (float)0.005;
	}
	
	public void render()
	{
		depositar(getSaldo()*taxaJuros);
	}
	
	public int getDiaRendimento()
	{
		return diaRendimento;
	}
	
	
}