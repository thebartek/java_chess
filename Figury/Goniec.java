package com.FREDDEV.Figury;

import com.FREDDEV.Plansze.Plansza;
import com.FREDDEV.Plansze.Pole;

public class Goniec extends Figura {
    public Goniec(String name, String skrot, int team) {
        super(name, skrot, team);
    }

    public boolean mozliwyRuch(int startX, int startY, int newX, int newY, Pole stare, Pole nowe) {

        // <^ - >dół
        if(Math.abs(newY - startY) == Math.abs(newX - startX)) {
            if(newX - startX > 0) {
                for (int i = startY - 1, j = startX + 1; i != newY && j != newX; i--, j++) {
                    Pole pole = Pole.class.cast(Plansza.pola.get(j).get(i));
                    if (pole.Get().team == 0) {
                        continue;
                    }
                    return false;
                }
            }  else {
                for(int i = startY - 1, j = startX - 1; i != newY && j != newX; i--, j--) {
                    Pole pole = Pole.class.cast(Plansza.pola.get(j).get(i));
                    if (pole.Get().team == 0) {
                        continue;
                    }
                    return false;
                }
            }
            return true;
        }

        // <^ - >dół

        if(Math.abs(startY - newY) == Math.abs(startX - newX)) {
            if(newX - startX > 0) {
                for(int i = startY - 1, j = startX + 1; i != newY && j != newX; i--, j++) {
                    Pole pole = Pole.class.cast(Plansza.pola.get(j).get(i));
                    if (pole.Get().team == 0) {
                        continue;
                    }
                    return false;
                }
            } else {
                for(int i = startY + 1, j = startX + 1; i != newY && j != newX; i++, j++) {
                    Pole pole = Pole.class.cast(Plansza.pola.get(j).get(i));
                    if (pole.Get().team == 0) {
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
