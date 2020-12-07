package com.FREDDEV.Figury;

import com.FREDDEV.Figury.*;
import com.FREDDEV.Plansze.Pole;

public class Hetman extends Figura {
    public Hetman(String name, String skrot, int team) {
        super(name, skrot, team);
    }

    public boolean mozliwyRuch(int startX, int startY, int newX, int newY, Pole stare, Pole nowe) {

        if(startY == newY || startX == newX) {
            return new Wieza("tak o", "s", 1).mozliwyRuch(startX, startY, newX, newY, stare, nowe);
        } else {
            return new Goniec("tak o", "s", 1).mozliwyRuch(startX, startY, newX, newY, stare, nowe);
        }
    }
}
