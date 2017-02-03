public class Conta
{
	// atributos da minha classe
	private float saldo;
	private int numero;
	
	// construtores
	
	Conta(int numero)
	{
		saldo = 0;
		this.numero = numero;
	}
	
	Conta(int numero, float saldoInicial)
	{
		this.numero = numero;
		saldo = saldoInicial;
	}
	
	// métodos
	public float getSaldo()
	{
		return saldo;
	}
	
	public int getNumero()
	{
		return numero;
	}
	
	public void depositar(float valor)
	{
		saldo += valor;
	}
	
	public boolean sacar(float valor)
	{
		if (saldo >= valor)
		{
			saldo -= valor;
			return true;
		}
		else
			return false;		
	}
	
	public boolean transferir(Conta contaDestino,
		float valor)
	{
		if (sacar(valor))
		{
			contaDestino.depositar(valor);
			return true;
		}
		else
			return false;
	}		
}