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
public class Ave extends Animal {
    private boolean voaBem;
    
    public Ave(String nome, String especie, int nroPatas, 
                String som, boolean voaBem) {
        super(nome, especie, nroPatas, som);
        this.voaBem = voaBem;
    }
    
    public boolean getVoaBem() {
        return voaBem;
    } 
    
    @Override
    public String getDescricaoLonga() {
        String descricao = super.getDescricaoLonga() + " e ";
        if (voaBem) {
            descricao += "voa bem";
        }
        else {
            descricao += "voa mal";
        }
        return descricao;
    }   
}
