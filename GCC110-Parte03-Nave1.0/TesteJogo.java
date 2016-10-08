
/**
 * Classe criada para facilitar a execucao do Jogo
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
class TesteJogo
{    
    Nave nave;
    Inimigo inimigo;
    Placar placar;
    Cenario cenario;
    
    TesteJogo()
    {
        nave = new Nave();
        inimigo = new Inimigo();
        placar = new Placar();                
        cenario = new Cenario(nave, inimigo, placar);
        
        cenario.executarLoopDeJogo();
    }
}
