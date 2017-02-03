import java.util.*;

public class Programa
{
	private static Agencia agencia;	
	private static ArrayList<Integer> nrosDasContas;
	
	public static void main(String[] args)
	{		
		// cria uma agência de nome "Centro" capaz de ter 10 contas
		agencia = new Agencia("AA UFLA", 10);		
		nrosDasContas = new ArrayList<Integer>();
		
		OpcoesMenu opcao = OpcoesMenu.INVALIDA;
		Scanner entrada = new Scanner(System.in);
		do
		{
			try
			{
				exibirMenu();
				opcao = OpcoesMenu.getOpcaoPeloValor(entrada.nextInt());
				tratarOpcaoMenu(opcao);
			}
			catch(SaldoInsuficienteException e)
			{
				// coloque aqui algum tratamento especifico
			}
			catch(Exception e)
			{
				System.out.println("Opcao invalida!!!");
				aguardarEnter();
			}
			finally
			{
				// algo que precisa ser feito independentemente de uma excecao
				// ter ocorrido e sido tratada ou nao no bloco acima
			}
			
			// Um codigo aqui pode nao ser executado se o catch relancar excecao
			// ou a excecao nao for de um tipo tratado pelo catch
			
		} while (opcao != OpcoesMenu.SAIR);
	}
	
	private static void exibirMenu()
	{
		System.out.println("Bem-vindo a agencia " + agencia + "!\n");
		for (OpcoesMenu op : OpcoesMenu.values())
		{
			if (op != OpcoesMenu.INVALIDA)
				System.out.println(op.getTextoMenu());
		}
		System.out.print("Digite sua opcao: ");
	}
	
	private static void tratarOpcaoMenu(OpcoesMenu opcao)
	{
		System.out.println();
		switch (opcao)
		{
			case CRIAR_CONTA:
				criarConta();
				break;
			case RELATORIO:
				exibirRelatorio();				
				break;
			case DEPOSITO:
				fazerDeposito();
				break;
			case SAQUE:
				fazerSaque();
				break;
			case TRANSFERENCIA:
				fazerTransferencia();
				break;
			case SAIR:
				System.out.println("\nObrigado por usar os servicos da Agencia " + agencia + "!\n");
				break;
			default:
				System.out.println("\nOpcao invalida!\n");
				break;
		}
	}
	
	private static void criarConta()
	{
		try
		{
			nrosDasContas.add(agencia.criarConta());
			System.out.println("Conta " + nrosDasContas.get(nrosDasContas.size()-1) + " criada!");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		aguardarEnter();
	}
	
	private static void exibirRelatorio()
	{
		agencia.exibirRelatorio();
		
		aguardarEnter();
	}
	
	private static int pedirConta()
	{
		Scanner entrada = new Scanner(System.in);		
		System.out.print("Digite o numero da conta: ");
		return entrada.nextInt();
	}
	
	private static void aguardarEnter()
	{
		System.out.print("\n... pressione ENTER para continuar...");
	
		try {
			System.in.read();
		} 
		catch (Exception e){			
		}
		
		System.out.println("\n");
	}
	
	private static float pedirValor()
	{
		Scanner entrada = new Scanner(System.in);		
		System.out.print("Digite o valor: ");
		return entrada.nextFloat();
	}
		
	private static void fazerDeposito()
	{		
		try
		{
			agencia.depositar(pedirConta(), pedirValor());
			System.out.println("Deposito realizado com sucesso!");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		aguardarEnter();
	}
		
	private static void fazerSaque()
	{	
		try
		{
			agencia.sacar(pedirConta(), pedirValor());		
			System.out.println("Saque realizado com sucesso!");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		aguardarEnter();
	}
		
	private static void fazerTransferencia()
	{	
		try
		{	
			agencia.transferir(pedirConta(), pedirConta(), pedirValor());		
			System.out.println("Transferencia realizada com sucesso!");		
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		aguardarEnter();
	}
	
	private enum OpcoesMenu
	{
		INVALIDA(0, "Opcao invalida"),
		CRIAR_CONTA(1, "1 - Criar conta"),
		RELATORIO(2, "2 - Exibir relatorio"),
		DEPOSITO(3, "3 - Fazer deposito"),
		SAQUE(4, "4 - Fazer saque"),
		TRANSFERENCIA(5, "5 - Fazer transferencia"),
		SAIR(6, "6 - Sair");
		
		private String textoMenu;
		private int valor;
		private static Map<Integer, OpcoesMenu> map = new HashMap<Integer, OpcoesMenu>();

		static 
		{
			for (OpcoesMenu op : OpcoesMenu.values()) {
				map.put(op.getValor(), op);
			}
		}
		
		private OpcoesMenu(int valor, String textoMenu)
		{
			this.valor = valor;
			this.textoMenu = textoMenu;
		}
		
		public int getValor()
		{
			return valor;
		}
		
		public String getTextoMenu()
		{
			return textoMenu;
		}
		
		public static OpcoesMenu getOpcaoPeloValor(int valor) {
			return map.get(valor);
		}
	}
}