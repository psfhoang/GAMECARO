/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamexo3x3;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class GameXO3x3 {

    /**
     * @param args the command line arguments
     */
    static char[][] MAP = new char[3][3];
    static char PLAYER = 'X';
    static Scanner sc = new Scanner(System.in);
    static int a, b;

    public static void main(String[] args) {
        // TODO code application logic here
        taoMap();
        showMap();
        while (true) {

            nhapToado();
            showMap();
            
            if (checkCot() == MAP.length || checkHang() == MAP.length
                    ||checkCheochinh()==MAP.length||checkCheophu()==MAP.length) {

                System.out.println("player" + PLAYER + "win");
                break;

            }

            swap();
        }
    }

    static void showMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP[i].length; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void taoMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP[i].length; j++) {
                MAP[i][j] = '-';
            }

        }
    }

    static void nhapToado() {

        do {
            System.out.print("nhap vao toa do cua nguoi choi \t" + PLAYER);
            String s = sc.next();
            a = (int) s.charAt(0) - 48;
            b = (int) s.charAt(1) - 48;
        } while (MAP[a][b] == 'X' || MAP[a][b] == 'O');
        MAP[a][b] = PLAYER;
    }

    static void swap() {
        if (PLAYER == 'X') {
            PLAYER = 'O';
        } else {
            PLAYER = 'X';
        }
    }

    static int checkCot() {
        int dem = 0;
        for (int i = 0; i < MAP.length; i++) {

            if (MAP[(a + i) % MAP.length][b] == PLAYER) {
                dem++;

            }
        }

        return dem;
    }

    static int checkHang() {
        int dem = 0;
        for (int i = 0; i < MAP.length; i++) {

            if (MAP[a][(b + i) % MAP.length] == PLAYER) {
                dem++;
            }

        }
        return dem;
    }


    static int checkCheochinh() {
        int dem = 0;
        for (int i = 0; i < MAP.length; i++) {
            
            if (MAP[i][i] == PLAYER) {
                dem++;
            }

        }

        return dem;
    }
    static int checkCheophu()
    {
         int dem = 0;
        for (int i = 0; i < MAP.length; i++) {
            
            if (MAP[abs(MAP.length-1-i) % MAP.length][i%MAP.length] == PLAYER) {
                dem++;
            }

        }
        return dem++;   
        
    }
            
    
            
    
            

}
