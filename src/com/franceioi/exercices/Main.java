package com.franceioi.exercices;


class Main {

    public static void main(String[] args) {
        for (int i =1;i<=9;i++){
            haut();
        }
        for (int i =1;i<=9;i++){
            droite();
        }bas();

        for (int j=1;j<=4;j++) {

            for (int i = 1; i <= 8; i++) {
                gauche();
            }
            bas();
            for (int i = 1; i <= 8; i++) {
                droite();
            }bas();
        }
        for (int i = 1; i <= 9; i++) {
            gauche();
        }
    }
}

