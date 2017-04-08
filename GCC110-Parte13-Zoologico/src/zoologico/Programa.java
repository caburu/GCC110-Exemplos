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
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Zoologico zoo = new Zoologico();
        
        zoo.adicionarMamifero("Fantasma", "Lobo", "branco");
        zoo.adicionarMamifero("Scooby-doo", "Cachorro", "marrom");
        zoo.adicionarMamifero("GatoDeBotas", "Gato", "laranja");
        zoo.adicionarMamifero("Verão", "Lobo", "Cinza");
        zoo.adicionarAve("Pintadinha", "Galinha", false);
        
        System.out.println(zoo.listarAnimais());
        System.out.println();
        System.out.println(zoo.buscarSom("Fantasma"));
        System.out.println(zoo.buscarSom("GatoDeBotas"));
        System.out.println();
        System.out.println(zoo.buscarDadosAnimal("Scooby-doo"));
        System.out.println();
        System.out.println(zoo.buscarDadosAnimal("Verão"));
        System.out.println();
        System.out.println(zoo.buscarDadosAnimal("Pintadinha"));
    }
    
}

