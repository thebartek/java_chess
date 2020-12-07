package com.FREDDEV.Plansze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import com.FREDDEV.Plansze.Pole;

public class Plansza {
    //ośX
    public static Map<Integer, Map> pola = new HashMap<>();

    public int blakcKingX;
    public int blakcKingY;

    public int whiteKingX;
    public int whiteKingY;

    static {
        //ośY
        Map<Integer, Pole> temp = new HashMap<>();
        Map<Integer, Pole> temp2 = new HashMap<>();
        Map<Integer, Pole> temp3 = new HashMap<>();
        Map<Integer, Pole> temp4 = new HashMap<>();
        Map<Integer, Pole> temp5 = new HashMap<>();
        Map<Integer, Pole> temp6 = new HashMap<>();
        Map<Integer, Pole> temp7 = new HashMap<>();
        Map<Integer, Pole> temp8 = new HashMap<>();

        temp.put(0, new Pole(true, "wieza", 1));
        temp.put(1, new Pole(true, "pion", 1));
        temp.put(2, new Pole(false, "",0));
        temp.put(3, new Pole(false, "",0));
        temp.put(4, new Pole(false, "",0));
        temp.put(5, new Pole(false, "",0));
        temp.put(6, new Pole(true, "pion", 2));
        temp.put(7, new Pole(true, "wieza", 2));

        pola.put(0, temp);
        temp2.put(0, new Pole(true, "skoczek", 1));
        temp2.put(1, new Pole(true, "pion", 1));
        temp2.put(2, new Pole(false, "",0));
        temp2.put(3, new Pole(false, "",0));
        temp2.put(4, new Pole(false, "",0));
        temp2.put(5, new Pole(false, "",0));
        temp2.put(6, new Pole(true, "pion", 2));
        temp2.put(7, new Pole(true, "skoczek", 2));

        pola.put(1, temp2);

        temp3.put(0, new Pole(true, "goniec", 1));
        temp3.put(1, new Pole(true, "pion", 1));
        temp3.put(2, new Pole(false, "",0));
        temp3.put(3, new Pole(false, "",0));
        temp3.put(4, new Pole(false, "",0));
        temp3.put(5, new Pole(false, "",0));
        temp3.put(6, new Pole(true, "pion", 2));
        temp3.put(7, new Pole(true, "goniec", 2));

        pola.put(2, temp3);

        temp4.put(0, new Pole(true, "hetman", 1));
        temp4.put(1, new Pole(true, "pion", 1));
        temp4.put(2, new Pole(false, "",0));
        temp4.put(3, new Pole(false, "",0));
        temp4.put(4, new Pole(false, "",0));
        temp4.put(5, new Pole(false, "",0));
        temp4.put(6, new Pole(true, "pion", 2));
        temp4.put(7, new Pole(true, "hetman", 2));

        pola.put(3, temp4);

        temp5.put(0, new Pole(true, "krol", 1));
        temp5.put(1, new Pole(true, "pion", 1));
        temp5.put(2, new Pole(false, "",0));
        temp5.put(3, new Pole(false, "",0));
        temp5.put(4, new Pole(false, "",0));
        temp5.put(5, new Pole(false, "",0));
        temp5.put(6, new Pole(true, "pion", 2));
        temp5.put(7, new Pole(true, "krol", 2));

        pola.put(4, temp5);

        temp6.put(0, new Pole(true, "goniec", 1));
        temp6.put(1, new Pole(true, "pion", 1));
        temp6.put(2, new Pole(false, "",0));
        temp6.put(3, new Pole(false, "",0));
        temp6.put(4, new Pole(false, "",0));
        temp6.put(5, new Pole(false, "",0));
        temp6.put(6, new Pole(true, "pion", 2));
        temp6.put(7, new Pole(true, "goniec", 2));

        pola.put(5, temp6);

        temp7.put(0, new Pole(true, "skoczek", 1));
        temp7.put(1, new Pole(true, "pion", 1));
        temp7.put(2, new Pole(false, "",0));
        temp7.put(3, new Pole(false, "",0));
        temp7.put(4, new Pole(false, "",0));
        temp7.put(5, new Pole(false, "",0));
        temp7.put(6, new Pole(true, "pion", 2));
        temp7.put(7, new Pole(true, "skoczek", 2));

        pola.put(6, temp7);

        temp8.put(0, new Pole(true, "wieza", 1));
        temp8.put(1, new Pole(true, "pion", 1));
        temp8.put(2, new Pole(false, "",0));
        temp8.put(3, new Pole(false, "",0));
        temp8.put(4, new Pole(false, "",0));
        temp8.put(5, new Pole(false, "",0));
        temp8.put(6, new Pole(true, "pion", 2));
        temp8.put(7, new Pole(true, "wieza", 2));

        pola.put(7, temp8);
    }

    //druzyna 2 = biały, 1 = czarny, 0 wolne
    public void Szachy() throws IOException {
        int team = 2;
        while(true) {
            Szach check = new Szach();

            if(team == 2) {
               if(check.mat(whiteKingX, whiteKingY)) {
                    System.out.println();
                    System.out.println("Biali wygrywają!!!");
                    break;
                }
            } else {
                if(check.mat(blakcKingX, blakcKingY)) {
                    System.out.println();
                    System.out.println("Czarni wygrywają!!!");
                    break;
                }
            }

            Narysuj();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println();
            System.out.println("Prosze wprowadzić oś x pionka");
            Integer X =Integer.parseInt(reader.readLine());

            System.out.println();
            System.out.println("Prosze wprowadzić oś y pionka");
            Integer Y =Integer.parseInt(reader.readLine());

            System.out.println();
            System.out.println("Prosze wprowadzić nowa oś x pionka");
            Integer newX =Integer.parseInt(reader.readLine());

            System.out.println();
            System.out.println("Prosze wprowadzić nowa oś y pionka");
            Integer newY =Integer.parseInt(reader.readLine());

            Pole pole;
            Pole nowePole;

            try {
                pole = Pole.class.cast(pola.get(X).get(Y));
                nowePole = Pole.class.cast(pola.get(newX).get(newY));
            } catch (Exception e) {
                System.out.println();
                System.out.println("Plansza nie posiada takiej osi!");
                continue;
            }
            if(pole.Get().name.equals("")) {
                System.out.println();
                System.out.println("Na tym polu nie ma pionka!");
                continue;
            }

            if(!pole.Get().mozliwyRuch(X, Y, newX, newY, pole, nowePole)) {
                System.out.println("Ruch niepoprawny z zasadami gry!");
                continue;
            }

            if(team == 1) {
                //czarny
                if(pole.Get().team != 1 || nowePole.Get().team == 1) {
                    System.out.println();
                    System.out.println("Nie mozesz ruszyc pionkiem przeciwnika lub zbic wlasnego pionka!");
                    continue;
                }

                if(check.szach(blakcKingX, blakcKingY)) {
                    System.out.println();
                    System.out.println("Nie możesz dopóścić do sytuacji w której twój król może zostać zbity!");
                    continue;
                }

                team++;
            } else {
                //biały
                if(pole.Get().team != 2 || nowePole.Get().team == 2) {
                    System.out.println();
                    System.out.println("Nie mozesz ruszyc pionkiem przeciwnika lub zbic wlasnego pionka!");
                    continue;
                }

                if(check.szach(whiteKingX, whiteKingY)) {
                    System.out.println();
                    System.out.println("Nie możesz dopóścić do sytuacji w której twój król może zostać zbity!");
                    System.out.println(whiteKingX);
                    continue;
                }
                team--;
            }

            nowePole.change(pole.Get());
            pole.clear();

        }
    }

    public void Narysuj() {
        for(Integer j = 0; j<8; j++) {
            for(int i = 0; i<17; i++) {
                System.out.print("-");
            }

            System.out.println();
            for(Integer d = 0; d<8; d++) {
                System.out.print("|");

                Pole l = Pole.class.cast(pola.get(d).get(j));
                System.out.print(d);
                System.out.print(j);
                System.out.print(l.Get().skrot);

                if(l.Get().name.equals("krol")) {
                    if(l.Get().team == 1) {
                        blakcKingX = d;
                        blakcKingY = j;
                    } else {
                        whiteKingX = d;
                        whiteKingY = j;
                    }
                }
            }
            System.out.print("|");

            System.out.println();
        }
        for(int i = 0; i<17; i++) {
            System.out.print("-");
        }
    }

//    public void Narysuj() {
//        for(int j = 0; j<9; j++) {
//            for(int i = 0; i<17; i++) {
//                System.out.print("-");
//            }
//
//            System.out.println();
//            for(int d = 0; d<8; d++) {
//                System.out.print("|");
//                System.out.print("w");
//            }
//            System.out.print("|");
//
//            System.out.println();
//        }
//        for(int i = 0; i<17; i++) {
//            System.out.print("-");
//        }
//    }
}
