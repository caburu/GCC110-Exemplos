class Agencia
{
	private String nome;
	private Conta[] contas;
	private int contasAtivas;
	
	public Agencia(String nome, int nroContas)
	{
		this.nome = nome;
		contas = new Conta[nroContas];
		contasAtivas = 0;
	}
	
	public int criarConta()
	{
		if (contasAtivas >= contas.length)
		{
			throw new RuntimeException("Agencia nao permite mais contas!");
		}
		else
		{
			// usando variavel para deixar mais claro o codigo
			int proxNroConta = contasAtivas+1;
			
			contas[contasAtivas] = new Conta(proxNroConta);
			contasAtivas++;
			
			return proxNroConta;
		}
	}
	
	public void depositar(int nroConta, float valor)
	{
		Conta conta = getConta(nroConta);
		// tratando o caso de nao existir uma conta com o numero passado
		if (conta != null)
		{
			conta.depositar(valor);
		}
		else
			throw new RuntimeException("Conta invalida!!!");
	}
	
	public void sacar(int nroConta, float valor) throws SaldoInsuficienteException
	{
		Conta conta = getConta(nroConta);
		// tratando o caso de nao existir uma conta com o numero passado
		if (conta != null)
		{
			conta.sacar(valor);
		}
		else
			throw new RuntimeException("Conta invalida!!!");
	}
	
	public void transferir(int nroContaOrigem, int nroContaDestino, float valor) 
		throws SaldoInsuficienteException
	{
		Conta contaOrigem = getConta(nroContaOrigem);
		Conta contaDestino = getConta(nroContaDestino);
		
		// tratando se as contas existem
		//if ((contaOrigem != null) && (contaDestino != null))
		//{
			contaOrigem.transferir(contaDestino, valor);
		//}
		//else
		//	throw new RuntimeException("Conta invalida!!!");
	}
	
	public void exibirRelatorio()
	{
		if (contasAtivas > 0)
		{
			// usando variavel contas ativas para percorrer apenas as que precisam
			for (int i = 0; i < contasAtivas; i++)
			{
				System.out.println("Conta " + contas[i].getNumero());
				System.out.println("	Saldo: " + contas[i].getSaldo());
			}
		}
		else
			System.out.println("Nao ha contas nessa agencia!");
	}
	
	private Conta getConta(int nroConta)
	{
		// usando variavel contas ativas para percorrer apenas as que precisam
		for (int i = 0; i < contasAtivas; i++)
		{
			if (contas[i].getNumero() == nroConta)
				return contas[i];
		}
		
		return null;
	}
	
	@Override
	public String toString()
	{
		return nome;
	}
}