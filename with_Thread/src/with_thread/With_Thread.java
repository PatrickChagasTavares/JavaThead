/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package with_thread;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author patrick
 */
public class With_Thread {

    static double v[] = new double[60000000];
    static double cont;

    public static void main(String[] args) {
        long dateInicio = new Date().getTime();
        leVetorAleatorio(v);
        long dataMeio = new Date().getTime();
        new Thread(multiVetor1).start();
        new Thread(multiVetor2).start();
        new Thread(multiVetor3).start();
//        new Thread(multiVetor4).start();
//        new Thread(multiVetor5).start();
//        new Thread(multiVetor6).start();
        System.out.println("Apos População: " + (new Date().getTime() - dataMeio) + " milisegundos");
        System.out.println("Total: " + (new Date().getTime() - dateInicio) + " milisegundos");
    }

    public static void leVetorAleatorio(double[] v) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextDouble();
        }
    }

    private static Runnable multiVetor1 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 20000000; i++) {
                v[i] = v[i] * Math.PI;
            }
        }

    };

    private static Runnable multiVetor2 = new Runnable() {
        @Override
        public void run() {
            for (int i = 20000000; i < 40000000; i++) {
                v[i] = v[i] * Math.PI;
            }
        }

    };

    private static Runnable multiVetor3 = new Runnable() {
        @Override
        public void run() {
            for (int i = 40000000; i < 0000000; i++) {
                v[i] = v[i] * Math.PI;
            }
        }

    };

//    private static Runnable multiVetor4 = new Runnable() {
//        @Override
//        public void run() {
//            for (int i = 30000000; i < 40000000; i++) {
//                v[i] = v[i] * Math.PI;
//            }
//        }
//
//    };
//
//    private static Runnable multiVetor5 = new Runnable() {
//        @Override
//        public void run() {
//            for (int i = 40000000; i < 50000000; i++) {
//                v[i] = v[i] * Math.PI;
//            }
//        }
//
//    };
//
//    private static Runnable multiVetor6 = new Runnable() {
//        @Override
//        public void run() {
//            for (int i = 50000000; i < 60000000; i++) {
//                v[i] = v[i] * Math.PI;
//            }
//        }
//
//    };
}
