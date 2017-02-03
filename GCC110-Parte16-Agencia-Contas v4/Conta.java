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
	
	public void sacar(float valor) throws SaldoInsuficienteException
	{
		if (saldo >= valor)
		{
			saldo -= valor;
		}
		else
			throw new SaldoInsuficienteException(numero, saldo);
	}
	
	public void transferir(Conta contaDestino, float valor)
		throws SaldoInsuficienteException
	{
		float saldoAnterior = saldo;
		try
		{
			sacar(valor);
			contaDestino.depositar(valor);
		}
		catch (Exception e)
		{
			if (saldo == saldoAnterior-valor)
			{
				depositar(valor);
			}
			
			throw e;
		}
	}		
}