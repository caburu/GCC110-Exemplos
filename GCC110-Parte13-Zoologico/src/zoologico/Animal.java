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
public class Animal {
    private String nome;
    private String especie;
    private int nroPatas;
    private String som;
    
    public Animal(String nome, String especie, int nroPatas, String som) {
        this.nome = nome;
        this.especie = especie;
        this.nroPatas = nroPatas;
        this.som = som;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public int getNroPatas() {
        return nroPatas;
    }
    
    public String getSom() {
        return som;
    }
    
    public String getDescricaoSimples() {
        return nome + " eh um " + especie;
    }
    
    public String getDescricaoLonga() {
        return getDescricaoSimples() + " que faz " + som;
    }
}
