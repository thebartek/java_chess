package com.FREDDEV.Plansze;

import com.FREDDEV.Figury.*;
import java.lang.reflect.Array;
import java.util.*;

public class Pole {

    private boolean occupied;
    private String figura;
    private Figura Object;
    private static Map<String, String> names = new HashMap<>();

    static {
        names.put("pion", "q");
        names.put("skoczek", "t");
        names.put("goniec", "l");
        names.put("hetman", "y");
        names.put("krol", "x");
        names.put("wieza", "m");
    }

    public Pole(boolean occupied, String figura, int druzyna) {

        if(figura.equals("")) {
            Object = new Figura("", " ", druzyna);
        } else {
            if(druzyna == 1) {
                switch(figura) {
                    case "pion": {Object = new Pion(figura, names.get(figura), druzyna); break;}
                    case "skoczek": {Object = new Skoczek(figura, names.get(figura), druzyna); break;}
                    case "goniec": {Object = new Goniec(figura, names.get(figura), druzyna); break;}
                    case "hetman": {Object = new Hetman(figura, names.get(figura), druzyna); break;}
                    case "krol": {Object = new Krol(figura, names.get(figura), druzyna); break;}
                    case "wieza": {Object = new Wieza(figura, names.get(figura), druzyna); break;}
                }
            } else {
                switch(figura) {
                    case "pion": {Object = new Pion(figura, String.valueOf(figura.charAt(0)), druzyna); break;}
                    case "skoczek": {Object = new Skoczek(figura, String.valueOf(figura.charAt(0)), druzyna); break;}
                    case "goniec": {Object = new Goniec(figura, String.valueOf(figura.charAt(0)), druzyna); break;}
                    case "hetman": {Object = new Hetman(figura, String.valueOf(figura.charAt(0)), druzyna); break;}
                    case "krol": {Object = new Krol(figura, String.valueOf(figura.charAt(0)), druzyna); break;}
                    case "wieza": {Object = new Wieza(figura, String.valueOf(figura.charAt(0)), druzyna); break;}
                }
            }
        }

        this.occupied = occupied;
        this.figura = figura;
    }

    public void clear() {
        occupied = false;
        figura = "";
        Object = new Figura("", " ", 0);
    }

    public void change(Figura object) {
        occupied = true;
        figura = object.name;
        Object = object;
    }

    public Figura Get() {
        return Object;
    }
}
