package com.mycompany.clase_miercoless.character;

public class Koopa extends character {

    private String shellType;

    public Koopa(String shellType, int height, String name, String power) {
        super(name, height, power);
        this.shellType = shellType;
    }
    @Override
    public void atack(){
        super.atack();
        System.out.println("ataca lanzando martillos");
    }
}
