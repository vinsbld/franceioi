package com.franceioi.exercices;

class Main {

    public static void main(String[] args) {

        for (int i =1;i<=108;i++) {

            for (int loop = 1; loop <= 13; loop++) {
                haut();
            }
            for (int loop = 1; loop <= 13; loop++) {
                droite();
            }
            for (int loop = 1; loop <= 13; loop++) {
                bas();
            }
            for (int loop = 1; loop <= 13; loop++) {
                gauche();
            }
        }
    }
}
