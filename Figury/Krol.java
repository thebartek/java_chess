package com.FREDDEV.Figury;

import com.FREDDEV.Plansze.Pole;

public class Krol extends Figura{
    public Krol(String name, String skrot, int team) {
        super(name, skrot, team);
    }

    public boolean mozliwyRuch(int startX, int startY, int newX, int newY, Pole stare, Pole nowe) {

        //Boki
        if(startY == newY && startX == newX  - 1) {
            return true;
        }

        if(startY == newY && startX == newX + 1) {
            return true;
        }

        if(startX == newX && startY == newY - 1) {
            return true;
        }

        if(startX == newX && startY == newY + 1) {
            return true;
        }

        //skos
        if(newX == startX + 1 && newY == startY - 1) {
            return true;
        }

        if(newX == startX - 1 && newY == startY + 1) {
            return true;
        }

        if(newX == startX + 1 && newY == startY + 1) {
            return true;
        }

        if(newX == startX - 1 && newY == startY - 1) {
            return true;
        }
        return false;
    }

}
