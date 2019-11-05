/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without_thread;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author patrick
 */
public class Without_Thread {

    public static void main(String[] args) {
        long dateInicio = new Date().getTime();
        double v[] = new double[60000000];
        leVetorAleatorio(v);
        long dataMeio = new Date().getTime();
        muiltiplicaVetor(v);
        System.out.println("Apos População: " + (new Date().getTime() - dataMeio) + " milisegundos");
        System.out.println("Total: " + (new Date().getTime() - dateInicio) + " milisegundos");
    }

    public static void leVetorAleatorio(double[] v) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextDouble();
        }
    }

    public static void muiltiplicaVetor(double[] v) {
        for (int i = 0; i < v.length; i++) {
//            System.out.println(Math.PI);
            v[i] = v[i] * Math.PI;
        }
    }
}
