/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package with_thread_v2;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author patrick
 */
public class With_Thread_v2 {

    static double v[] = new double[60000000];
    static double cont;

    public static void main(String[] args) {
        long dateInicio = new Date().getTime();
        new Thread(leVetorAleatorio1).start();
        new Thread(leVetorAleatorio2).start();
        new Thread(leVetorAleatorio3).start();

        System.out.println("Total: " + (new Date().getTime() - dateInicio) + " milisegundos");
    }

    private static Runnable leVetorAleatorio1 = new Runnable() {
        @Override
        public void run() {
            Random r = new Random();
            for (int i = 0; i < 20000000; i++) {
                v[i] = r.nextDouble();
            }
            new Thread(multiVetor1).start();
        }
    };

    private static Runnable leVetorAleatorio2 = new Runnable() {
        @Override
        public void run() {
            Random r = new Random();
            for (int i = 20000000; i < 40000000; i++) {
                v[i] = r.nextDouble();
            }
            new Thread(multiVetor2).start();
        }

    };

    private static Runnable leVetorAleatorio3 = new Runnable() {
        @Override
        public void run() {
            Random r = new Random();
            for (int i = 40000000; i < 60000000; i++) {
                v[i] = r.nextDouble();
            }
            new Thread(multiVetor3).start();
        }

    };

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
            for (int i = 40000000; i < 60000000; i++) {
                v[i] = v[i] * Math.PI;
            }
            System.out.println("final");
        }

    };

}
