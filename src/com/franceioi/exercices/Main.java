package com.franceioi.exercices;


class Main {

    public static void main(String[] args) {
      int anneau = 1;
      for (int i =1;i<=10;i++){
          for (int j =1; j<=anneau;j++){
              droite();
          }ramasser();
          for (int k =1; k<=anneau;k++){
              gauche();
          }deposer();
          anneau = anneau+i;
      }
    }
}


