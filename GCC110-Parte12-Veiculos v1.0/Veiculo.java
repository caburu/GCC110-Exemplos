/**
 * Classe que define um veiculo. A ideia eh que seja usada como superclasse para
 * os demais tipos de veiculos.
 * 
 * Um veiculo tem modelo, marca, placa e velocidade atual.
 * 
 * @author Julio Cesar Alves
 * @version 2016-0-19
 */
public class Veiculo {
    private String modelo;
    private String marca;
    private String placa;
    private int velocidadeAtual;
    
    /*
     * Constroi o objeto a partir do modelo, marca e placa passados.
     * A velocidade inicial do veiculo sera zero km/h.
     * 
     * @param modelo Modelo do veículo a ser criado.
     * @param marca Marca do veiculo a ser criado.
     * @param placa Placa do veiculo a ser criado.
     */
    public Veiculo(String modelo, String marca, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        velocidadeAtual = 0;
    }
    
    /**
     * Retorna o modelo do veiculo
	 *
	 * @return O modelo do veiculo
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * Retorna a marca do veiculo
	 *
	 * @return A marca do veiculo
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Retorna a placa do veiculo
	 *
	 * @return A placa do veiculo
     */
    public String getPlaca() {
        return placa;
    }
    
    /**
     * Retorna a velocidade atual do veiculo (em km/h)
	 *
	 * @return A velocidade atual do veiculo (em km/h)
     */
    public String getVelocidadeAtual() {
        return modelo;
    }
    
    /**
     * Altera a velocidade atual do veiculo.
     * So altera a velocidade se for passado valor maior ou igual a zero.
     * 
     * @param velocidade Nova velocidade do veiculo (em km/h).
     * @return Retorna se a velocidade foi realmente alterada ou nao.
     */
    public boolean setVelocidadeAtual(int velocidade) {
        if (velocidade >= 0) {
            velocidadeAtual = velocidade;
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Retorna a descricao do veiculo no formato:
     *  Placa   Modelo  Marca   Velocidade km/h
	 * 
	 * @return A descricao do veiculo (seus campos separados por tabulacoes)
     */
    public String getDescricaoVeiculo() {
        return placa + "\t" + modelo + "\t" + marca + "\t" + velocidadeAtual + " Km/h";
    }
}
