package com.mycompany.clase_miercoless.character;

public class Mario extends character {

    public Mario(String name, int height, String power) {
        super(name, height, power);
    }

    public void eatMushroom() {
        System.out.println("comiendo hongos el socio anda trabado");
    }

    public void jump() {
        System.out.println("salto");
    }

    public void takeCoin() {
        System.out.println("suma d epuntos por moneda");
    }
}
