package com.company;

public class Main {

    private static final int SIZE1 = 12;
    private static final int SIZE2 = 18;

    public static void fillMatrix(double[][] xx, int[] d, double[] x) {
        for (int i = 0; i < xx.length; i++) {
            for (int j = 0; j < xx[i].length; j++) {
                if (d[i] == 9) {
                    xx[i][j] = Math.cbrt(Math.pow(((2d / 3) / (Math.cbrt(x[j]) + 4)), 3));
                } else if (d[i] == 5 || d[i] == 6 || d[i] == 8 || d[i] == 12 || d[i] == 13 || d[i] == 15) {
                    xx[i][j] = Math.pow(2 * Math.exp(Math.pow((x[j] - 0.5), 2)), Math.log(Math.pow(Math.tan(x[j]), 2)));
                } else {
                    xx[i][j] = Math.log(Math.pow(Math.cos(Math.sin(Math.exp(Math.tan(x[j])))), 2));
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] d = new int[SIZE1];
        int n = 0;

        for (int i = 5; i < 17; i++) {
            d[n] = i;

            n++;
        }




        double[] x = new double[SIZE2];
        float min = -11.0f;
        float max = 9.0f;

        for (int i = 0; i < 18; i++) {
            x[i] = (double) (Math.random() * (max - min) - min);

        }


        double[][] xx = new double[SIZE1][SIZE2];
        fillMatrix(xx, d, x);


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 18; j++) {

                if (xx[i][j] > 10000000) {
                    System.out.printf("%.3e  ", xx[i][j]);
                } else System.out.printf("%.3f  ", xx[i][j]);
            }
            System.out.println();
        }

    }

}

