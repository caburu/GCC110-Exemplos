public class Programa
{
	public static void main(String[] args)
	{		
		// cria uma agência de nome "Centro" capaz de ter 10 contas
		Agencia agCentro = new Agencia("Centro", 10);
		
		// cria duas contas na agencia guardando o numero das contas
		int nroConta1 = agCentro.criarConta();
		int nroConta2 = agCentro.criarConta();
		
		// faz depósitos nas contas e exibe um relatório
		
		System.out.println();
		System.out.println("Depositando 100 na conta " + nroConta1 + 
						   " e 200 na conta " + nroConta2);
		agCentro.depositar(nroConta1, 100);
		agCentro.depositar(nroConta2, 200);
		
		agCentro.exibirRelatorio();
		/*
		// faz saque na conta 1
		
		System.out.println();
		System.out.println("Sacando 50 da conta " + nroConta1);
		if (agCentro.sacar(nroConta1, 50))
		{
			System.out.println("    Saque realizado com sucesso!");
		}
		else
		{
			System.out.println("    Saldo insuficiente ou conta inexistente!");
		}					
		
		agCentro.exibirRelatorio();
		
		/*
		// faz saque na conta 2
		
		System.out.println();
		System.out.println("Sacando 300 da conta " + nroConta1);
		if (agCentro.sacar(nroConta2, 300))
		{
			System.out.println("    Saque realizado com sucesso!");
		}
		else
		{
			System.out.println("    Saldo insuficiente ou conta inexistente!!");
		}					
		
		agCentro.exibirRelatorio();
		
		// faz transferência entre as contas
		
		System.out.println();
		System.out.println("Transferindo 120 da conta " + nroConta2 + 
						   " para a conta " + nroConta1);
		if (agCentro.transferir(nroConta2, nroConta1, 120))
		{
			System.out.println("    Transferencia realizada com sucesso!");
		}
		else
		{
			System.out.println("    Saldo insuficiente ou conta inexistente!!");
		}					
		
		agCentro.exibirRelatorio();
		*/
	}
}