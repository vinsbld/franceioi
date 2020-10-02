package com.franceioi.exercices;


class Main {

    public static void main(String[] args) {
        int nbBonbons = 1;
        System.out.println(nbBonbons);
        nbBonbons = 3;
        System.out.println(nbBonbons);
        for (int i = nbBonbons; i<=50; i++){
            nbBonbons = nbBonbons + i;
            System.out.println(nbBonbons);
        }
    }
}


