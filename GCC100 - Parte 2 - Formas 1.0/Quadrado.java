import java.awt.*;

/**
 * Um quadrado que pode ser manipulado e se desenha na tela
 * 
 * Traduzido por Júlio César Alves - 2015-09-15
 * Atualizado por Júlio César Alves - 2016-04-07
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016-04-07
 */

class Quadrado
{
    int tamanho;
    int posX;
    int posY;
    String cor;
    boolean estaVisivel;

    /**
     * Cria um novo quadrado na posição padrão e com cor padrão
     */
    Quadrado()
    {
        tamanho = 60;
        posX = 310;
        posY = 120;
        cor = "vermelha";
        estaVisivel = false;
    }

    /**
     * Deixa o quadrado visível. Se já está visível, não faz nada.
     */
    void exibir()
    {
        estaVisivel = true;
        desenhar();
    }
    
    /**
     * Deixa o quadrado invisível. Se já está invisível, não faz nada.
     */
    void esconder()
    {
        apagar();
        estaVisivel = false;
    }
    
    /**
     * Diz se o quadrado está desenhado na tela ou não
     */
    boolean estaDesenhado()
    {
        return estaVisivel;
    }
    
    /**
     * Move o quadrado alguns pixels para a direita
     */
    void moverDireita()
    {
        moverHorizontal(20);
    }

    /**
     * Move o quadrado alguns pixels para a esquerda
     */
    void moverEsquerda()
    {
        moverHorizontal(-20);
    }

    /**
     * Move o quadrado alguns pixels para cima
     */
    void moverCima()
    {
        moverVertical(-20);
    }

    /**
     * Move o quadrado alguns pixels para baixo
     */
    void moverBaixo()
    {
        moverVertical(20);
    }

    /**
     * Move o quadrado na horizontal pela distância (número de pixels) passada
     */
    void moverHorizontal(int distancia)
    {
        apagar();
        posX += distancia;
        desenhar();
    }

    /**
     * Move o quadrado na vertical pela distância (número de pixels) passada
     */
    void moverVertical(int distancia)
    {
        apagar();
        posY += distancia;
        desenhar();
    }

    /**
     * Move o quadrado lentamente na horizontal pela distância (número de pixels) passada
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
     * Move o quadrado lentamente na vertical pela distância (número de pixels) passada
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
     * Muda o tamanho do quadrado para o novo tamanho (em pixels). Deve ser maior que zero.
     */
    void mudarTamanho(int novoTamanho)
    {
        apagar();
        tamanho = novoTamanho;
        desenhar();
    }

    /**
     * Muda a cor do quadrado.
     * Cores válidas: "vermelha", "amarela", "azul", "verde", "magenta" e "preta"
     */
    void mudarCor(String novaCor)
    {
        cor = novaCor;
        desenhar();
    }

    /**
     * Desenha o quadrado com as características atuais na tela
     */
    void desenhar()
    {
        if(estaVisivel) 
        {
            Tela tela = Tela.getTela();
            tela.desenhar(this, cor, new Rectangle(posX, posY, tamanho, tamanho));
            tela.esperar(10);
        }
    }

    /**
     * Apaga o quadrado da tela
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
