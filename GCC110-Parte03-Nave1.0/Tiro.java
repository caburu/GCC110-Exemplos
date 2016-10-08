import java.util.Random;
/**
 * Classe que representa um tiro dado pela nave do jogador ou pelo inimigo
 * 
 * @author Júlio César Alves
 * @version 2016-08-04
 */
class Tiro
{
    // posicao atual do tiro na tela
    int posX;
    int posY;
    
    // velocidade do tiro (pixels por atualizacao)
    int velocidade;
    
    // dimensoes do tiro
    int largura;
    int altura;
    
    // indica se o tiro foi dado pelo inimigo ou, caso contrario, pela nave do jogador
    boolean ehDoInimigo;

    /**
     * Constroi um tiro na posicao passada e com velocidade padrao
     * 
     * @param posX posicao X inicial do tiro
     * @param posY posicao Y inicial do tiro
     * @param ehDoInimigo indica se eh um tiro dado pelo inimigo, caso contrario sera do jogador
     */
    Tiro(int x, int y, boolean tiroDoInimigo)
    {
        // inicializa os atributos referentes aos parametros passados
        posX = x;
        posY = y;
        ehDoInimigo = tiroDoInimigo;
        
        // inicializa velocidade padrao
        velocidade = 20;        
    }
    
    /**
     * Retorna a posicao X atual do tiro
     */
    int getPosX()
    {
        return posX;
    }
    
    /**
     * Retorna a posicao Y atual do tiro
     */
    int getPosY()
    {
        return posY;
    }
    
    /**
     * Retorna a largura do tiro
     */
    int getLargura()
    {
        return largura;
    }
    
    /**
     * Retorna a altura do tiro
     */
    int getAltura()
    {
        return altura;
    } 
    
    /**
     * Altera as dimensoes do tiro (para que ele fique do tamanho da figura que o representa)
     * 
     * @param largura nova largura do tiro
     * @param altura nova altura do tiro
     */
    void alterarTamanho(int largura, int altura)
    {
        this.largura = largura;
        this.altura = altura;
    }       
    
    /**
     * Retorna se o tiro eh do inimigo ou, caso contrário, da nave do jogador
     */
    boolean getEhDoInimigo()
    {
       return ehDoInimigo;
    }
    
    /**
     * Realiza a movimentacao do tiro (ele se movimenta apenas na horizontal)
     * Se for tiro do inimigo se move pra esquerda, se for da nave do jogador pra direita
     */
    void mover()
    {
        if (ehDoInimigo)
        {
            posX -= velocidade;
        }
        else
        {
            posX += velocidade;
        }
    }
}
