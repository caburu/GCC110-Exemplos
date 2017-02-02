
/**
 * Classe para testar objeto Inimigo
 * 
 * @author Julio Cesar Alves
 * @version Out-2016
 */
public class Jogo
{
    public static void main(String[] args) {
        Inimigo inimigo1 = new Inimigo("Cota de malha");
        Inimigo inimigo2 = new Inimigo("Placa de calouro");
        
        System.out.println(Inimigo.getQtdeInimigos());
        System.out.println(inimigo1.getArmadura().getNome());
        System.out.println(inimigo2.getArmadura().getNome());
        
		// Repare que com as duas linhas abaixo conseguimos
		// alterar a armadura do inimigo. Mas a armadura é 
		// um atributo do inimigo, portanto deveria ser 
		// alterada apenas dentro da própria classe Inimigo
        Armadura armadura = inimigo1.getArmadura();
        armadura.setNome("PowerRanger Verde");
		
        System.out.println(armadura.getNome());        
        System.out.println(inimigo1.getArmadura().getNome());        
    }
}
