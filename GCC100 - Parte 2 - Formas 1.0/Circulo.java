import java.awt.*;
import java.awt.geom.*;

/**
 * Um círculo que pode ser manipulado e se desenha em um Canvas
 * 
 * Traduzido por Júlio César Alves - 2015-09-15
 * Atualizado por Júlio César Alves - 2016-04-07
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.04.07
 */

class Circulo
{
    int diametro;
    int posX;
    int posY;
    String cor;
    boolean estaVisivel;
    
    /**
     * Cria um novo círculo na posição padrão e com uma cor padrão
     */
    Circulo()
    {        
        diametro = 68;
        posX = 230;
        posY = 90;
        cor = "azul";
    }

    /**
     * Deixa o círculo visível. Se já estiver visível não faz nada
     */
    void exibir()
    {
        estaVisivel = true;
        desenhar();
    }
    
    /**
     * Deixa o círculo invisível. Se já estiver invisível não faz nada
     */
    void esconder()
    {
        apagar();
        estaVisivel = false;
    }
    
    /**
     * Diz se o círculo está desenhado na tela ou não
     */
    boolean estaDesenhado()
    {
        return estaVisivel;
    }
    
    /**
     * Move o círculo alguns pixels para a direita
     */
    void moverDireita()
    {
        moverHorizontal(20);
    }

    /**
     * Move o círculo alguns pixels para a esquerda
     */
    void moverEsquerda()
    {
        moverHorizontal(-150);
    }

    /**
     * Move o círculo alguns pixels para cima
     */
    void moverCima()
    {
        moverVertical(-20);
    }

    /**
     * Move o círculo alguns pixels para baixo
     */
    void moverBaixo()
    {
        moverVertical(20);
    }

    /**
     * Move o círculo na horizontal pela distância (número de pixels) passada
     */
    void moverHorizontal(int distancia)
    {
        apagar();
        posX += distancia;
        desenhar();
    }

    /**
     * Move o círculo na vertical pela distância (número de pixels) passada
     */
    void moverVertical(int distancia)
    {
        apagar();
        posY += distancia;
        desenhar();
    }

    /**
     * Move o círculo lentamente na horizontal pela distância (número de pixels) passada
     */
    void moverHorizontalLento(int distancia)
    {
        int passo;

        if(distancia < 0) 
        {
            passo = -1;
            distancia = -distancia;
        }
        else 
        {
            passo = 1;
        }
                
        for(int i = 0; i < distancia; i++)
        {
            posX += passo;                        
            desenhar();
        }
    }

    /**
     * Move o círculo lentamente na vertical pela distância (número de pixels) passada
     */
    void moverVerticalLento(int distancia)
    {
        int passo;

        if(distancia < 0) 
        {
            passo = -1;
            distancia = -distancia;
        }
        else 
        {
            passo = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            posY += passo;
            desenhar();
        }
    }

    /**
     * Muda o tamanho do círculo para o novo diâmetro (em pixels). Deve ser maior que zero.
     */
    void mudarTamanho(int novoDiametro)
    {
        apagar();
        diametro = novoDiametro;        
        desenhar();
    }

    /**
     * Muda a cor do círculo.
     * Cores válidas: "vermelha", "amarela", "azul", "verde", "magenta" e "preta"
     */
    void mudarCor(String novaCor)
    {
        cor = novaCor;
        desenhar();
    }

    /**
     * Desenha o círculo com as características atuais na tela
     */
    void desenhar()
    {
        if(estaVisivel) 
        {
            Tela tela = Tela.getTela();
            tela.desenhar(this, cor, new Ellipse2D.Double(posX, posY, diametro, diametro));
            tela.esperar(10);
        }
    }

    /**
     * Apaga o círculo da tela
     */
    void apagar()
    {
        if(estaVisivel) 
        {
            Tela tela = Tela.getTela();
            tela.apagar(this);
        }
    }
}
