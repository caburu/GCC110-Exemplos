import java.util.ArrayList;

/**
 * Classe que sera responsavel pela Simulacao do Transito.
 * Por enquanto, ela apenas trata as colecoes de veiculos (carros, caminhoes e onibus).
 * 
 * @author Julio Cesar Alves
 * @version 2016-06-19
 */
public class Simulador
{
    // colecao de carros do simulador
    private ArrayList<Carro> carros;
    // colecao de caminhoes do simulador    
    private ArrayList<Caminhao> caminhoes;
    // colecao de onibus do simulador    
    private ArrayList<Onibus> colOnibus;
    
    /**
     * Constroi um simulador e apenas inicializa as colecoes vazias de veiculos.
     */
    public Simulador() {
        carros = new ArrayList<Carro>();
        caminhoes = new ArrayList<Caminhao>();
        colOnibus = new ArrayList<Onibus>();        
    }
    
    /**
     * Adiciona um carro ao simulador
     * 
     * @param modelo Modelo do carro a ser criado.
     * @param marca Marca do carro a ser criado.
     * @param placa Placa do carro a ser criado.
     * @param ehFlex Indica se o carro eh flex ou nao (em relacao ao combustivel)
     */
    public void adicionarCarro(String modelo, String marca, String placa, boolean ehFlex) {
        Carro carro = new Carro(modelo, marca, placa, ehFlex);
        
        carros.add(carro);
    }
    
    /**
     * Adiciona um caminhao ao simulador
     * 
     * @param modelo Modelo do caminhao a ser criado.
     * @param marca Marca do caminhao a ser criado.
     * @param placa Placa do caminhao a ser criado.
     * @param capacidadeCarga Capacidade de carga do caminhao (em toneladas).
     */
    public void adicionarCaminhao(String modelo, String marca, String placa, double capacidadeCarga) {
        Caminhao caminhao = new Caminhao(modelo, marca, placa, capacidadeCarga);
        
        caminhoes.add(caminhao);
    }
    
    /**
     * Adiciona um onibus ao simulador
     * 
     * @param modelo Modelo do onibus a ser criado.
     * @param marca Marca do onibus a ser criado.
     * @param placa Placa do onibus a ser criado.
     * @param capacidadePassageiros Quantidade de passageiros que o onibus pode carregar.
     */
    public void adicionarOnibus(String modelo, String marca, String placa, int capacidadePassageiros) {
        Onibus onibus = new Onibus(modelo, marca, placa, capacidadePassageiros);
        
        colOnibus.add(onibus);
    }
    
    /**
     * Retorna uma String com a descricao de toda a frota do simulador.
     * Cada veiculo aparece em uma linha.
     * Cada veiculo eh represetado como definido pela sua classe.
	 *
	 * @return Descricao completa da frota com um veiculo por linha
     */
    public String getDescricaoFrota() {
        String descricao = "FROTA DO SIMULADOR";
        
        for (Carro c: carros) {
            descricao += "\n" + c.getDescricaoCarro();
        }
        for (Caminhao c: caminhoes) {
            descricao += "\n" + c.getDescricaoCaminhao();
        }
        for (Onibus o: colOnibus) {
            descricao += "\n" + o.getDescricaoOnibus();
        }
        return descricao;
    }
    
    /**
     * Altera a velocidade atual do carro cujo modelo foi passado.
     * Se houver dois carros com o mesmo modelo, altera apenas o primeiro encontrado.
     * A velocidade eh alterada se o carro for encontrado e a velocidade for valida
     * 
     * @param modelo Modelo do carro que tera sua velocidade alterada
     * @param velocidade Velocidade que o carro passara a ter
     * @return Retorna se a velocidade foi realmente alterada
     */
    public boolean alterarVelocidadeCarro(String modelo, int velocidade) {
        Carro carro = buscarCarro(modelo);
        
        if (carro != null) {
            return carro.setVelocidadeAtual(velocidade);
        }
        else {
            return false;
        }
    }
    
    /**
     * Retorna um carro a partir do modelo passado.
     * Se houver dois carros com o mesmo modelo retorna o primeiro encontrado.
     * 
     * @param modelo Modelo do carro a ser buscado
     * @return Retorna o carro encontrado ou null se ele nao existir.
     */
    private Carro buscarCarro(String modelo) {
        for (Carro c : carros) {
            if (c.getModelo().equals(modelo)) {
                return c;
            }
        }
        return null;
    }
    
    /**
     * Altera a velocidade atual do caminhao cujo modelo foi passado.
     * Se houver dois caminhoes com o mesmo modelo, altera apenas o primeiro encontrado.
     * A velocidade eh alterada se o caminhao for encontrado e a velocidade for valida
     * 
     * @param modelo Modelo do caminhao que tera sua velocidade alterada
     * @param velocidade Velocidade que o caminhao passara a ter
     * @return Retorna se a velocidade foi realmente alterada
     */
    public boolean alterarVelocidadeCaminhao(String modelo, int velocidade) {
        Caminhao caminhao = buscarCaminhao(modelo);
        
        if (caminhao != null) {
            return caminhao.setVelocidadeAtual(velocidade);
        }
        else {
            return false;
        }
    }
    
    /**
     * Retorna um caminhao a partir do modelo passado.
     * Se houver dois caminhoes com o mesmo modelo retorna o primeiro encontrado.
     * 
     * @param modelo Modelo do caminhao a ser buscado
     * @return Retorna o caminhao encontrado ou null se ele nao existir.
     */
    private Caminhao buscarCaminhao(String modelo) {
        for (Caminhao c : caminhoes) {
            if (c.getModelo().equals(modelo)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Altera a velocidade atual do onibus cujo modelo foi passado.
     * Se houver dois onibus com o mesmo modelo, altera apenas o primeiro encontrado.
     * A velocidade eh alterada se o onibus for encontrado e a velocidade for valida
     * 
     * @param modelo Modelo do onibus que tera sua velocidade alterada
     * @param velocidade Velocidade que o onibus passara a ter
     * @return Retorna se a velocidade foi realmente alterada
     */
    public boolean alterarVelocidadeOnibus(String modelo, int velocidade) {
        Onibus onibus = buscarOnibus(modelo);
        
        if (onibus != null) {
            return onibus.setVelocidadeAtual(velocidade);
        }
        else {
            return false;
        }
    }
    
    /**
     * Retorna um onibus a partir do modelo passado.
     * Se houver dois onibus com o mesmo modelo retorna o primeiro encontrado.
     * 
     * @param modelo Modelo do onibus a ser buscado
     * @return Retorna o onibus encontrado ou null se ele nao existir.
     */
    private Onibus buscarOnibus(String modelo) {
        for (Onibus o : colOnibus) {
            if (o.getModelo().equals(modelo)) {
                return o;
            }
        }
        return null;
    }    
}

