import java.util.Scanner;

/**
 * Classe principal que faz a interface com usuario do simulador.
 * Permite cadastrar carros, caminhoes e onibus e lista-los.
 * 
 * @author Julio Cesar Alves
 * @version 2016-09-16
 */
public class Programa {
    private static Simulador simulador;
    
    /**
     * Metodo principal que inicial a execucao do programa
	 *
	 * @param args Parametros do programa (o programa nao espera nenhum)
     */
    public static void main(String[] args) {
        simulador = new Simulador();
        
        int opcaoMenu;
        do {
            opcaoMenu = exibirMenu();
            
            switch (opcaoMenu) {
                case 1:
                    adicionarVeiculo();
                    break;
                case 2:
                    alterarVelocidadeVeiculo();
                    break;
                case 3:
                    exibirVeiculos();
                    break;
                case 4: // nao faz nada, apenas vai sair do programa
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcaoMenu != 4);
    }
    
    /**
     * Exibe o menu para o usuario e retorna a opcao escolhida por ele
     * 
     * @return Opcao de menu escolhida pelo usuario
     */
    private static int exibirMenu() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\n1) Adicionar Veiculo");
        System.out.println("2) Alterar velocidade");
        System.out.println("3) Listar Veiculos");
        System.out.println("4) Sair");
        System.out.print("\tDigite sua opcao: ");
        
        return entrada.nextInt();
    }
    
    /**
     * Permite ao usuario adicionar um veiculo ao simulador.
     * O usuario passa os dados de acordo com o tipo de veiculo.
     */
    private static void adicionarVeiculo() {        
        String modelo, marca, placa;
        int tipo;
        boolean adicionado = false;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o modelo: ");
        modelo = entrada.next();
        System.out.print("Digite a marca: ");
        marca = entrada.next();
        System.out.print("Digite a placa: ");
        placa = entrada.next();
        
        System.out.print("Qual o tipo de veiculo (1-carro, 2-caminhao, 3-onibus)? ");
        tipo = entrada.nextInt();
        
        switch(tipo) {
            case 1: // carro
                System.out.print("Digite se eh flex (1-sim, 2-nao): ");
                int flex = entrada.nextInt();
                boolean ehFlex = (flex == 1);				
                simulador.adicionarCarro(modelo, marca, placa, ehFlex);
                adicionado = true;
                break;
            case 2: // caminhao
                System.out.print("Digite a capacidade de carga (ton): ");
                double capacidadeCarga = entrada.nextDouble();
                simulador.adicionarCaminhao(modelo, marca, placa, capacidadeCarga);
                adicionado = true;
                break;
            case 3: // onibus
                System.out.print("Digite a capacidade de passageiros: ");
                int capacidadePas = entrada.nextInt();
                simulador.adicionarOnibus(modelo, marca, placa, capacidadePas);
                adicionado = true;
                break;
            default:
                System.out.println("Tipo de veiculo invalido!");
        }
        
        if (adicionado) {
            System.out.print("Veiculo adicionado!");
        }
		// espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
    
    /**
     * Permite ao usuario alterar a velocidade de um veiculo do simulador.
     * O usuario informa o tipo de veiculo e o modelo.
     */
    private static void alterarVelocidadeVeiculo() {
        int tipo, velocidade;
        String modelo;
        boolean alterou = false;
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Qual o tipo de veiculo (1-carro, 2-caminhao, 3-onibus)? ");        
        tipo = entrada.nextInt();
        System.out.print("Digite o modelo: ");
        modelo = entrada.next();
        System.out.print("Digite a velocidade: ");
        velocidade = entrada.nextInt();
        
        switch(tipo) {
            case 1: // carro
                alterou = simulador.alterarVelocidadeCarro(modelo, velocidade);
                break;
            case 2: // caminhao
                alterou = simulador.alterarVelocidadeCaminhao(modelo, velocidade);            
                break;
            case 3: // onibus
                alterou = simulador.alterarVelocidadeOnibus(modelo, velocidade);            
                break;
            default:
                System.out.println("Tipo de veiculo invalido!");
        }
        
        if (alterou) {
            System.out.println("Velocidade alterada!");
        }
        else {
            System.out.println("Veiculo nao encontrado ou velocidade invalida!");
        }
		// espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
    
    /**
     * Exibe na tela os veiculos retornados pelo simulador
     */
    private static void exibirVeiculos() {
        System.out.println(simulador.getDescricaoFrota());
        
		// espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
	
	/**
	 * Exibe na tela o texto "ENTER para continuar" e aguarda um ENTER
	 */
	private static void esperarTecla() {
		try {
			System.out.print("\n\nENTER para continuar...");
			Scanner entrada = new Scanner(System.in);
			entrada.nextLine();
		} catch(Exception e) {}
	}
}
