/**
 * Classe que representa um Caminhao.
 * Caminhao herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta a capacidade de carga do caminhao em toneladas.
 * 
 * @author Julio Cesar Alves 
 * @version 2016-09-16
 */
public class Caminhao extends Veiculo
{
    // capacidade de carga do caminhao
    private double capacidadeCarga;

    /**
     * Controi objeto da classe Caminhao a partir dos parametros passados
     * Obs: a velocidade inicial do caminhao eh definida na classe Veiculo
     * 
     * @param modelo Modelo do caminhao a ser criado.
     * @param marca Marca do caminhao a ser criado.
     * @param placa Placa do caminhao a ser criado.
     * @param capacidadeCarga Capacidade de carga do caminhao (em toneladas).
     */
    public Caminhao(String modelo, String marca, String placa, double capacidadeCarga) {
        super(modelo, marca, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Retorna a capacidade de carga do caminhao (em toneladas)
	 * 
	 * @return A capacidade de carga do caminhao (em toneladas)
     */
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    /**
     * Retorna a descricao do caminhao no formato:
     *  Placa   Modelo  Marca   Velocidade km/h     Capacidade
	 * 
	 * @return A descricao do caminhao (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    public String getDescricaoCaminhao() {
        return getDescricaoVeiculo() + "\t" + capacidadeCarga;
    }
}
