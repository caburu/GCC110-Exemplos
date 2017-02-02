/**
 * Classe que representa um Onibus.
 * Onibus herda da classe Veiculo (e, portanto, tem modelo, marca, placa e velocidade atual)
 * E acrescenta a quantidade passageiros que o onibus pode levar.
 * 
 * @author Julio Cesar Alves 
 * @version 2016-09-16
 */
public class Onibus extends Veiculo {
    // quantidade de passageiros que o onibus pode levar
    private int capacidadePassageiros;

    /**
     * Controi objeto da classe Onibus a partir dos parametros passados
     * Obs: a velocidade inicial do onibus eh definida na classe Veiculo
     * 
     * @param modelo Modelo do onibus a ser criado.
     * @param marca Marca do onibus a ser criado.
     * @param placa Placa do onibus a ser criado.
     * @param capacidadePassageiros Quantidade de passageiros que o onibus pode carregar.
     */
    public Onibus(String modelo, String marca, String placa, int capacidadePassageiros) {
        super(modelo, marca, placa);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    /**
     * Retorna a quantidade de passageiros que o onibus pode levar
	 *
	 * @return A quantidade de passageiros que o onibus pode levar
     */
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    
    /**
     * Retorna a descricao do onibus no formato:
     *  Placa   Modelo  Marca   Velocidade km/h     Capacidade
	 * 
	 * @return A descricao do onibus (a descricao do veiculo mais seus campos separados por tabulacoes)
     */
    public String getDescricaoOnibus() {
        return getDescricaoVeiculo() + "\t" + capacidadePassageiros;
    }
}