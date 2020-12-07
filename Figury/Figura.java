package com.FREDDEV.Figury;

import com.FREDDEV.Plansze.Pole;

import java.util.Map;

public class Figura {
    public String name;
    public String skrot = "|";
    public int team = 0;

    public Figura(String name, String skrot, int team) {
        this.name = name;
        this.skrot = skrot;
        this.team = team;
    }

    public boolean mozliwyRuch(int startX, int startY, int newX, int newY, Pole stare, Pole nowe) {
        return false;
    }
}
