/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.ArrayList;

/**
 *
 * @author Julio
 */
public class Zoologico {
    private ArrayList<Animal> animais;
    
    public Zoologico() {
        animais = new ArrayList<>();
    }
    
    public void adicionarMamifero(String nome, String especie, String corPelo) {
        Mamifero mamifero = null;
        if (especie.equals("Gato")) {
            mamifero = new Gato(nome, corPelo);
        }
        else if (especie.equals("Cachorro")) {
            mamifero = new Cachorro(nome, corPelo);
        }
        else if (especie.equals("Lobo")) {
            mamifero = new Lobo(nome, corPelo);
        }
        animais.add(mamifero);
    }
    
    public void adicionarAve(String nome, String especie, boolean voaBem) {
        Ave ave = null;
        if (especie.equals("Galinha")) {
            ave = new Galinha(nome, voaBem);
        }
        else if (especie.equals("Aguia")) {
            ave = new Aguia(nome, voaBem);
        }
        animais.add(ave);
    }
    
    public String listarAnimais() {
        String texto = "Animais do Zoologico";
        for (Animal animal : animais) {
            texto += "\n" + animal.getDescricaoSimples();
        }
        return texto;
    }
    
    public String buscarSom(String nome) {
        Animal animal = buscarAnimalPeloNome(nome);
        if (animal != null) {
            return animal.getSom();
        }
        else {
            return "animal inexistente";
        }
    }
    
    public String buscarDadosAnimal(String nome) {
        Animal animal = buscarAnimalPeloNome(nome);
        if (animal != null) {
            return animal.getDescricaoLonga();
        }
        else {
            return "animal inexistente";
        }
    }
    
    private Animal buscarAnimalPeloNome(String nome) {
        for (Animal animal : animais) {
            if (nome.equals(animal.getNome())) {
                return animal;
            }
        }
        return null;
    }
}
