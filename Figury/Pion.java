package com.FREDDEV.Figury;

import com.FREDDEV.Plansze.Pole;

import java.util.Map;

public class Pion extends Figura {
    public Pion(String name, String skrot, int team) {
        super(name, skrot, team);
    }

    public boolean mozliwyRuch(int startX, int startY, int newX, int newY, Pole stare, Pole nowe) {

        if(stare.Get().team == 2) {

            if(startY == 6 && newY == (startY - 2) && nowe.Get().name.equals("")) {
                return true;
            }
            if (newY == startY - 1 && startX == newX && nowe.Get().name.equals("")) {
                return true;
            }
            if(startX == newX - 1 && startY == newY - 1 && !nowe.Get().name.equals("")) {
                return true;
            }

            if(startX == newX + 1 && startY == newY - 1 && !nowe.Get().name.equals("")) {
                return true;
            }

        } else {

            if(startY == 1 && newY == (startY + 2) && nowe.Get().name.equals("")) {
                return true;
            }
            if (newY == startY + 1 && startX == newX && nowe.Get().name.equals("")) {
                return true;
            }
            if(startX == newX - 1 && startY == newY + 1 && !nowe.Get().name.equals("")) {
                return true;
            }

            if(startX == newX + 1 && startY == newY + 1 && !nowe.Get().name.equals("")) {
                return true;
            }
        }
        return false;
    }
}
