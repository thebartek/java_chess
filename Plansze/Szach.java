package com.FREDDEV.Plansze;

import java.util.Arrays;
import java.util.Map;

public class Szach {

    public int krolX;
    public int krolY;

    public int[] Y = new int[0];
    public int[] X = new int[0];

     public boolean szach(int krolX, int krolY) {
         //zamienia obliekt na klase
         Pole krol = Pole.class.cast(Plansza.pola.get(krolX).get(krolY));


         for(Integer j = 0; j<8; j++) {
             for (Integer d = 0; d < 8; d++) {
                 Pole l = Pole.class.cast(Plansza.pola.get(d).get(j));
                 if(l.Get().team != krol.Get().team) {
                     if(l.Get().mozliwyRuch(d, j, krolX, krolY, l, krol)) {
                         return true;
                     }
                 }
             }
         }

        return false;
     }

    public boolean mat(int krolX, int krolY) {
        Pole krol = Pole.class.cast(Plansza.pola.get(krolX).get(krolY));

        for(Integer j = 0; j<8; j++) {
            for (Integer d = 0; d < 8; d++) {
                Pole l = Pole.class.cast(Plansza.pola.get(d).get(j));
                if(l.Get().team != krol.Get().team) {
                    if(l.Get().mozliwyRuch(d, j, krolX, krolY, l, krol)) {
                        Y = Arrays.copyOf(Y, Y.length + 1);
                         Y[Y.length - 1] = d;

                         X = Arrays.copyOf(Y, X.length + 1);
                         X[X.length - 1] = j;
                    }
                }
            }
        }

        int i = 0;

        try {
            if(szach(krolX, krolY)) {
                i++;
            }
        } catch(Exception err) { }

        try {
            if(szach(krolX + 1, krolY)) {
                i++;
            }
        } catch(Exception err) { }

        try {
            if(szach(krolX - 1, krolY)) {
                i++;
            }
        } catch(Exception err) { }

        try {
            if(szach(krolX, krolY + 1)) {
                i++;
            }
        } catch(Exception err) { }

        try {
            if(szach(krolX, krolY - 1)) {
                i++;
            }
        } catch(Exception err) { }

        try {
            if(szach(krolX - 1, krolY + 1)) {
                i++;
            }
        } catch(Exception err) { }

        try {
            if(szach(krolX + 1, krolY - 1)) {
                i++;
            }
        } catch(Exception err) { }
        try {
            if(szach(krolX + 1, krolY + 1)) {
                i++;
            }
        } catch(Exception err) { }
        try {
            if(szach(krolX - 1, krolY - 1)) {
                i++;
            }
        } catch(Exception err) { }


        if(i == 9) {

            for(i = 0; Y.length > i; i++) {
                if(!szach(X[i], Y[i])) {
                    return true;
                }
            }
            return false;
        }

        return false;
    }
}
