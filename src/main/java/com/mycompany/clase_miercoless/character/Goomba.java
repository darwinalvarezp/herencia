package com.mycompany.clase_miercoless.character;

public class Goomba extends character {
    private String color;
    private boolean wings;

    public Goomba(String name, int height, String power) {
        super(name, height, power);
    }
    
    @Override
    public void walk(){
        System.out.println("camina mas despacio que un koopa");
    }
    

    public void setColor(String color) {
        this.color = color;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }
}