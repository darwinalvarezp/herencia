package com.mycompany.clase_miercoless.character;

public class character {

    private String name;
    private int height;
    private String power;

    public character(String name, int height, String power) {
        this.name = name;
        this.height = height;
        this.power = power;
    }

    public void walk() {
        System.out.println("personaje caminando");
    }

    public void atack() {
        System.out.println("atacando");
    }

    final private void die() {
        System.out.println("has muerto");
    }
}
