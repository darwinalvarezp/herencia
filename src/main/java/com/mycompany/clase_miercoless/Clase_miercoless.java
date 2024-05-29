package com.mycompany.clase_miercoless;

import com.mycompany.clase_miercoless.character.Goomba;
import com.mycompany.clase_miercoless.character.Koopa;
import com.mycompany.clase_miercoless.character.Peach;

public class Clase_miercoless {

    public static void main(String[] args) {
        
        Peach peach = new Peach("pincesa",140,"conjelar");
        peach.longJump();
        
        Goomba goomba = new Goomba("goomba",50,"ninguno");
        goomba.walk();
        
        Koopa koopa = new Koopa("espinas",120,"koopa","escudo");
        koopa.walk();
        koopa.atack();
    }
}