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
		// usando variavel para deixar mais claro o codigo
		int proxNroConta = contasAtivas+1;
		
		contas[contasAtivas] = new Conta(proxNroConta);
		contasAtivas++;
		
		return proxNroConta;
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
		
		System.out.println("cheguei aqui");
	}
	
	public boolean sacar(int nroConta, float valor)
	{
		Conta conta = getConta(nroConta);
		// tratando o caso de nao existir uma conta com o numero passado
		if (conta != null)
		{
			return conta.sacar(valor);
		}
		else
			return false;		
	}
	
	public boolean transferir(int nroContaOrigem, int nroContaDestino, float valor)
	{
		Conta contaOrigem = getConta(nroContaOrigem);
		Conta contaDestino = getConta(nroContaDestino);
		
		// tratando se as contas existem
		if ((contaOrigem != null) && (contaDestino != null))
		{
			return contaOrigem.transferir(contaDestino, valor);
		}
		else
			return false;		
	}
	
	public void exibirRelatorio()
	{
		// usando variavel contas ativas para percorrer apenas as que precisam
		for (int i = 0; i < contasAtivas; i++)
		{
			System.out.println("Conta " + contas[i].getNumero());
			System.out.println("	Saldo: " + contas[i].getSaldo());
		}
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
}