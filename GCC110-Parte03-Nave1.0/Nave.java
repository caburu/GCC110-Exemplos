import java.util.Random;

/**
 * Classe que representa uma nave do jogador no jogo
 * 
 * @author Julio Cesar Alves
 * @version 2016-04-08
 */
class Nave
{
    // posição da nave na tela
    int posX;
    int posY;
    
    // velocidade da nave ao mover (em pixels)
    final int velocidade;
    
    // dimensões da nave
    int largura;
    int altura;
    
    // indica se a nave do jogador esta viva
    boolean estaViva;

    /**
     * Controi uma nave com as caracteristicas iniciais padrao
     */
    Nave()
    {              
        // tamanho padrao da nave
        largura = 50;
        altura = 50; 
        
        // velocidade da nave
        velocidade = 15;                
        
        inicializar();
        
    }
    
    /**
     * Reinicia as característivas da nave (quando recomeca o jogo, por exemplo)
     */
    void inicializar()
    {                       
        // posição inicial da nave na tela
        posX = 10;
        posY = 200;
        
        estaViva = true;
    }
    
    /**
     * Retorna a posição X da nave na tela
     */
    int getPosX()
    {
        return posX;
    }
    
    /**
     * Retorna a posição Y da nave na tela
     */
    int getPosY()
    {
        return posY;
    }
    
    /**
     * Retorna a largura da nave
     */
    int getLargura()
    {
        return largura;
    }
    
    /**
     * Retorna a altura da nave
     */
    int getAltura()
    {
        return altura;
    }
    
    /**
     * Retorna se a nave esta viva
     */
    boolean estaViva()
    {
        return estaViva;
    }
    
    /**
     * Altera as dimensoes da nave (para que ela fique do tamanho da figura que a representa)
     * 
     * @param largura nova largura da nave
     * @param altura nova altura da nave
     */
    void alterarTamanho(int largura, int altura)
    {
        this.largura = largura;
        this.altura = altura;
    }
    
    /**
     * Retorna o texto a ser exibido próximo à nave
     */
    String getTextoExibicao()
    {
        // atualmente nao retorna nada
        return "";
    }
    
    /**
     * Move a nave pra direita, se ela estiver viva
     */
    void moverDireita()
    {
        if (estaViva)
        {
            posX += velocidade;
        }
    }
    
    /**
     * Move a nave pra esquerda, se ela estiver viva
     */
    void moverEsquerda()
    {
        if (estaViva)
        {
            posX -= velocidade;
        }
    }

    /**
     * Move a nave pra cima, se ela estiver viva
     */
    void moverCima()
    {
        if (estaViva)
        {
            posY -= velocidade;
        }
    }

    /**
     * Move a nave pra baixo, se ela estiver viva
     */
    void moverBaixo()
    {
        if (estaViva)
        {
            posY += velocidade;
        }
    }
        
    /**
     * Realiza um tiro se a nave estiver viva
     * 
     * @return Retorna o tiro criado, ou null se a nave não atirou
     */
    Tiro atirar()
    {  
        if (estaViva)
        {            
            return new Tiro(posX+largura, posY + (int)(altura/2), false);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Trata quando a nave do jogador toma um tiro, se ela estiver viva
     */
    void tomarTiro()
    {
        if (estaViva)
        {
            // morre
            estaViva = false;
        }
    }
}
