
/**
 * // PASSO 5
 * Escreva a descrição da classe Cenario aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cena
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Quadrado chao;
    private Quadrado ceu;
    private Circulo sol;
    private Pessoa pessoa;

    /**
     * COnstrutor para objetos da classe Cenario
     */
    public Cena()
    {
        chao = new Quadrado();
        ceu = new Quadrado();
        sol = new Circulo();
        pessoa = new Pessoa();
        
        chao.mudarCor("verde");
        chao.mudarTamanho(500);
        chao.moverHorizontal(-300);
        chao.moverVertical(50);
        
        ceu.mudarCor("azul");
        ceu.mudarTamanho(500);
        ceu.moverHorizontal(-300);
        ceu.moverVertical(-200);
        
        sol.mudarCor("amarela");
        sol.mudarTamanho(50);
        sol.moverHorizontal(100);
        sol.moverVertical(-50);
    }
    
    public void exibir()
    {        
        ceu.exibir();
        sol.exibir();
        chao.exibir();        
        pessoa.exibir();
    }
    
    // PASSO 5
    public void porDoSol()
    {
        sol.moverVerticalLento(100);
        sol.esconder();
    }
}
