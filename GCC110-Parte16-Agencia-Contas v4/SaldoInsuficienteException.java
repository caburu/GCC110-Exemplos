

public class SaldoInsuficienteException extends Exception
{
	private int nroConta;
	private float saldo;
	public SaldoInsuficienteException(int nroConta, float saldo)
	{
		super("Saldo insuficiente  na conta " + nroConta);
		
		this.nroConta = nroConta;
		this.saldo = saldo;
	}
	
	public int getNroConta()
	{
		return nroConta;
	}
	
}