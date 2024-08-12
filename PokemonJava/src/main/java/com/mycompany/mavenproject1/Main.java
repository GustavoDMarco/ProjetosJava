package com.mycompany.mavenproject1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Pokemon Charmander = new Pokemon("Charmander", "Fogo", "Água", 250, 35, 200, 70);
        System.out.println(Charmander.getNome());
        System.out.println(Charmander.toString());
        
        
        Pokemon Vaporeon = new Pokemon("Vaporeon", "Água", "Planta", 450, 50, 250, 65);
        System.out.println(Vaporeon.getNome());
        System.out.println(Vaporeon.toString());
        
        Vaporeon.atacar(Vaporeon, Charmander);
        Vaporeon.atacar(Vaporeon, Charmander);
        
        System.out.println(Vaporeon.toString());
        
        
    }
    
}
