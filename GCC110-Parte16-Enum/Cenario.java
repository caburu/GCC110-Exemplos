
/* 
 * Bla bla bla 
 */
public class Cenario
{
    private Quadrado chao;
    private Quadrado ceu;
    private Circulo sol;
    private Pessoa joao;
    
    public Cenario()
    {
        chao = new Quadrado();
        ceu = new Quadrado();
        sol = new Circulo();
        joao = new Pessoa();
        
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
    
    public void mostrar()
    {
        ceu.exibir();
        chao.exibir();        
        joao.exibir();
        sol.exibir();
    }
    
    public void porDoSol()
    {
        sol.moverVerticalLento(100);
        sol.esconder();
    }
}





