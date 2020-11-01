package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
          int[] d = new int[12];
          int n = 0;

          for (int i = 5; i < 17; i++) {
                d[n] = i;
                //System.out.println(d[n]);
                n++;
          }

          Random r = new Random();

          double[] x = new double[18];
          for (int i = 0; i < 18; i++) {
                x[i] = r.nextDouble() * 20 - 11;
                //System.out.println(x[i]);
          }


          double[][] xx = new double[12][18];
          for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 18; j++) {
                      if (d[i] == 9) {
                            xx[i][j] = Math.cbrt(Math.pow(((2d/3)/(Math.cbrt(x[j])+4)), 3));
                      } else if (d[i] == 5 || d[i] == 6 || d[i] == 8 || d[i] == 12 || d[i] == 13 || d[i] == 15) {
                            xx[i][j] = Math.pow(2*Math.exp(Math.pow((x[j]-0.5), 2)), Math.log(Math.pow(Math.tan(x[j]), 2)));
                      } else {
                            xx[i][j] = Math.log(Math.pow(Math.cos(Math.sin(Math.exp(Math.tan(x[j])))), 2));
                      }
                }
          }

          for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 18; j++) {
                      String s = String.format("%.3f  ", xx[i][j]);
                      System.out.print(s);
                }
                System.out.println();
          }

    }
}

