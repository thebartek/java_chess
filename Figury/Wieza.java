package com.FREDDEV.Figury;

import com.FREDDEV.Plansze.Plansza;
import com.FREDDEV.Plansze.Pole;

import java.util.HashMap;
import java.util.Map;

public class Wieza extends Figura {
    public Wieza(String name, String skrot, int team) {
        super(name, skrot, team);
    }

    public boolean mozliwyRuch(int startX, int startY, int newX, int newY, Pole stare, Pole nowe) {

//        System.out.println(newX);
//        System.out.println(startX);
//        System.out.println(newY);
//        System.out.println(startY);

        if(newY != startY && newX == startX) {
            if((newY - startY) < 0) {
                for(int i = startY - 1; i > newY; i--) {
                    Pole pole = Pole.class.cast(Plansza.pola.get(newX).get(i));
                    if(pole.Get().team == 0) {
                        continue;
                    }
                    return false;
                }
            } else {
                for(int i = startY + 1; i > newY; i++) {
                    Pole pole = Pole.class.cast(Plansza.pola.get(newX).get(i));
                    if(pole.Get().team == 0) {
                        continue;
                    }
                    return false;
                }
            }
            return true;
        }

        if(newX != startX && newY == startY) {
            if((newX - startX) < 0) {
                for(int i = startX - 1; i > newX; i--) {
                    Pole pole = Pole.class.cast(Plansza.pola.get(i).get(newY));
                    if(pole.Get().team == 0) {
                        continue;
                    }
                    return false;
                }
            } else {
                for(int i = startX + 1; i < newX; i++) {
                    Pole pole = Pole.class.cast(Plansza.pola.get(i).get(newY));

                    if(pole.Get().team == 0) {
                        continue;
                    }
                    return false;
                }
            }
            return true;
        }

        return false;
    }

}
