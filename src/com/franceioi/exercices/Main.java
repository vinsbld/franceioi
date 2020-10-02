package com.franceioi.exercices;


class Main {
    public static void main(String[] args) {
        int nbCubes = 0;
        int largeurArete = 1;

        for (int i = 1; i<=9; i++){
            nbCubes = nbCubes + largeurArete * largeurArete * largeurArete;
            largeurArete = largeurArete + 2;

        }System.out.println(nbCubes);
    }
}