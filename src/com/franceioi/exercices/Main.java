package com.franceioi.exercices;


class Main {
    public static void main(String[] args) {
    int nbAmultiplier = 1;
    for (int i = 1; i<=20; i++){
        System.out.print(i);
        for (int j = 2;j<=20;j++){
            System.out.print(" "+i*j);
        }System.out.println();
    }

    }
}