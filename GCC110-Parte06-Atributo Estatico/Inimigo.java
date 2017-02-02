
/**
 * Classe inimigo para demonstrar uso e atributo estatico
 * 
 * @author Julio Cesar Alves
 * @version Out-2016
 */
public class Inimigo
{
	// exemplo de atributo estatico
	// Existe apenas uma cópia dele (um único valor) para
	// todos os objetos da classe.
    private static int qtdeInimigos;
    
    // exemplo de atributo constante
    // Repare que se o atributo eh um objeto ele nao pode
    // apontar para outro objeto, mas nada impede que seja
    // alterado o estado do objeto.
    private final Armadura armadura;
    
    public Inimigo(String nomeArmadura) {
        armadura = new Armadura(nomeArmadura);
		// o atributo estatico pode ser usado normalmente
		// dentro de métodos comuns e do construtor
        qtdeInimigos++;
        
        // Se a linha abaixo for descomentada, ela funciona
        // normalmente, porque um atributo constante não impede
        // que seu estado seja alterado
        // armadura.setNome("teste");
    }
    
	// Ja metodos estaticos acessam apenas atributos estaticos
    public static int getQtdeInimigos() {
        return qtdeInimigos;
    }
    
	// Esse metodo fere o encapsulamento
	// Como ele retorna um objeto (e não um tipo primitivo)
	// ele acaba retornando o endereço do atributo.
	// Com isso o atributo pode ser alterado de fora da classe.
	// (Veja uso na classe Jogo)
    public Armadura getArmadura() {
        return armadura;
    }
    
    public void metodoQualquer() {
        // Como armadura eh um atributo constante ela nao pode receber
        // outro objeto.
        // Obs: Comente a linha abaixo para compilar.
        armadura = new Armadura("teste2");
    }
        
}
