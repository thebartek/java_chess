package com.FREDDEV.Figury;

import com.FREDDEV.Plansze.Pole;

import java.util.Map;

public class Skoczek extends Figura {
    public Skoczek(String name, String skrot, int team) {
        super(name, skrot, team);
    }

    public boolean mozliwyRuch(int startX, int startY, int newX, int newY, Pole stare, Pole nowe) {
        if(newY == startY - 2) {
            if(newX == startX + 1) {
                return true;
            }
            else if(newX == startX - 1) {
                return true;
            }
            return false;
        }

        if(newY == startY + 2) {
            if(newX == startX + 1) {
                return true;
            }
            else if(newX == startX - 1) {
                return true;
            }
            return false;
        }

        if(newX == startX + 2) {
            if(newY == startY + 1) {
                return true;
            }
            else if(newY == startY - 1) {
                return true;
            }
            return false;
        }

        if(newX == startX - 2) {
            if(newY == startY + 1) {
                return true;
            }
            else if(newY == startY - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
