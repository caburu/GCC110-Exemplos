import java.awt.*;

/**
 * Um triângulo que pode ser manipulado e se desenha na tela
 * 
 * Traduzido por Júlio César Alves - 2015-09-15
 * Atualizado por Júlio César Alves - 2016-04-07
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

class Triangulo
{
    int altura;
    int largura;
    int posX;
    int posY;
    String cor;
    boolean estaVisivel;

    /**
     * Cria um novo triângulo na posição padrão e com uma cor padrão
     */
    Triangulo()
    {
        altura = 60;
        largura = 70;
        posX = 210;
        posY = 140;
        cor = "verde";
        estaVisivel = false;
    }

    /**
     * Deixa o triângulo visível. Se já estiver visível não faz nada
     */
    void exibir()
    {
        estaVisivel = true;
        desenhar();
    }
    
    /**
     * Deixa o triângulo invisível. Se já estiver invisível não faz nada
     */
    void esconder()
    {
        apagar();
        estaVisivel = false;
    }
    
    /**
     * Diz se o triângulo está desenhado na tela ou não
     */
    boolean estaDesenhado()
    {
        return estaVisivel;
    }
    
    /**
     * Move o triângulo alguns pixels para a direita
     */
    void moverDireita()
    {
        moverHorizontal(20);
    }

    /**
     * Move o triângulo alguns pixels para a esquerda
     */
    void moverEsquerda()
    {
        moverHorizontal(-20);
    }

    /**
     * Move o triângulo alguns pixels para cima
     */
    void moverCima()
    {
        moverVertical(-20);
    }

    /**
     * Move o triângulo alguns pixels para baixo
     */
    void moverBaixo()
    {
        moverVertical(20);
    }

    /**
     * Move o triângulo na horizontal pela distância (número de pixels) passada
     */
    void moverHorizontal(int distancia)
    {
        apagar();
        posX += distancia;
        desenhar();
    }

    /**
     * Move o triângulo na vertical pela distância (número de pixels) passada
     */
    void moverVertical(int distancia)
    {
        apagar();
        posY += distancia;
        desenhar();
    }

    /**
     * Move o triângulo lentamente na horizontal pela distância (número de pixels) passada
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
     * Move o triângulo lentamente na vertical pela distância (número de pixels) passada
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
     * Muda o tamanho do triângulo para as novas altura e largura (em pixels). Deve ser maior que zero.
     */
    void mudarTamanho(int novaAltura, int novaLargura)
    {
        apagar();
        altura = novaAltura;
        largura = novaLargura;
        desenhar();
    }

    /**
     * Muda a cor do triângulo.
     * Cores válidas: "vermelha", "amarela", "azul", "verde", "magenta" e "preta"
     */
    void mudarCor(String novaCor)
    {
        cor = novaCor;
        desenhar();
    }

    /**
     * Desenha o triângulo com as características atuais na tela
     */
    void desenhar()
    {
        if(estaVisivel) 
        {
            Tela tela = Tela.getTela();
            
            int[] pontosX = { posX, posX + (largura/2), posX - (largura/2) };
            int[] pontosY = { posY, posY + altura, posY + altura };
            tela.desenhar(this, cor, new Polygon(pontosX, pontosY, 3));
            
            tela.esperar(10);
        }
    }

    /**
     * Apaga o triângulo da tela
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
