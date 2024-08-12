package com.mycompany.mavenproject1;

import java.util.Scanner;
import java.util.Random;

public class Pokemon {

    private String nome;
    private String tipo;
    private String fraqueza;
    private int PC;
    private int ataque;
    private int vida;
    private int difCatch;
    private boolean evoluiu = false;

    Scanner teclado = new Scanner(System.in);
    private static String resposta;
    private int contador=1;
    
    
    public Pokemon(String nome, String tipo, String fraqueza, int PC, int ataque, int vida, int difCatch) {
        this.nome = nome;
        this.tipo = tipo;
        this.fraqueza = fraqueza;
        this.PC = PC;
        this.ataque = ataque;
        this.vida = vida;
        this.difCatch = difCatch;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public int getPC() {
        return PC;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public int getDifCatch() {
        return difCatch;
    }

    public boolean isEvoluiu() {
        return evoluiu;
    }

    private void evoluir(Pokemon atacante) {
        atacante.PC = atacante.PC + 400;
        atacante.ataque = atacante.ataque + 15;
        atacante.vida = atacante.vida + 30;
        atacante.difCatch = atacante.difCatch + 5;
        atacante.evoluiu = true;
        System.out.println("Pokemon evoluiu!!");
    }

    private void capturar(Pokemon defensor, int contador) {
        boolean capturar = false;
        
        while (capturar == false) {
            Random prob = new Random();
            int aleatorio = prob.nextInt(100);

            if (aleatorio < defensor.difCatch) {
                System.out.println("Pokemon escapou! Tentar novamente? [S/N]");
                resposta = teclado.nextLine();
                if ("S".equalsIgnoreCase(resposta)) {
                    this.contador = contador +1;
                    capturar(defensor, contador);
                    if(contador == 4){
                        System.out.println("Pokemon Fugiu!");
                        return;
                    }
                }else{
                    System.out.println("Pokemon Fugiu!");
                    return;
                }
            } else {
                System.out.println("Pokémon " + defensor.nome + " capturado");
                return;
            }
                capturar = true;
        }
    }

    public void atacar(Pokemon atacante, Pokemon defensor) {

        if (defensor.fraqueza.equals(atacante.tipo)) {
            System.out.println("Ataque super efetivo!");
            defensor.vida -= (atacante.ataque * 2);
            System.out.println(defensor.vida);
        } else {
            defensor.vida -= atacante.ataque;
            System.out.println(defensor.vida);
        }

        if (defensor.vida <= 0) {
            atacante.PC += 100;
            System.out.println("Pokemon atordoado, deseja capturar? Digite: [S/N] ");
            resposta = teclado.nextLine();
            if ("S".equalsIgnoreCase(resposta)) {
                capturar(defensor,contador);
            }
        }

        if (atacante.PC >= 500 && atacante.evoluiu == false) {
            evoluir(atacante);
        }

    }

    @Override
    public String toString() {
        return "[\n\tNome: " + nome + "\n" + "\tTipo: " + tipo + "\n" + "\tFraqueza: " + fraqueza + "\n" + "\tPC: " + PC + "\n"
                + "\tAtaque: " + ataque + "\n" + "\tVida: " + vida + "\n" + "\tEvoluiu?: " + evoluiu + "\n]";
    }

}
