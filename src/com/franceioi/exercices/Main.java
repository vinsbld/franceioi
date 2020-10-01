package com.franceioi.exercices;

class Main {

    public static void main(String[] args) {


        for (int i =1;i<=20;i++) {
            ramasser();
            for (int loop = 1; loop <= 15; loop++) {
                droite();
            }deposer();

            for (int loop2 = 1; loop2 <= 15; loop2++) {
                gauche();
            }
        }
    }
}

