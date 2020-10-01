package com.franceioi.exercices;

class Main {

    public static void main(String[] args) {

        for (int grandeLooop = 1; grandeLooop<=20; grandeLooop++) {

            for (int loop = 1; loop <= 20; loop++) {
                System.out.print("OX");
            }
            System.out.println();
            for (int loop = 1; loop <= 20; loop++) {
                System.out.print("XO");
            }
            System.out.println();
        }

    }
}
