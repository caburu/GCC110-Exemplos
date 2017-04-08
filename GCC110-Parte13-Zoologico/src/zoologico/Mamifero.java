/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author Julio
 */
public class Mamifero extends Animal {
    private String corPelo;
    
    public Mamifero(String nome, String especie, int nroPatas, 
                    String som, String corPelo) {
        super(nome, especie, nroPatas, som);
        this.corPelo = corPelo;
    }
    
    public String getCorPelo() {
        return corPelo;
    }
    
    @Override
    public String getDescricaoLonga() {
        return super.getDescricaoLonga() + " e tem pelo " + corPelo;
    }
}
