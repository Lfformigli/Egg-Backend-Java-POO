package Servicios;

import java.util.Arrays;

public class servicioArray {

    public double[] inicializarA(double a[]) {

        for (int i = 0; i < a.length; i++) {

            a[i] = (int) (Math.random() * 10 + 1);
        }

        return a;

    }

    public void mostrarArray(double a[]) {

        System.out.println(Arrays.toString(a));

    }

    public double[] ordenarArray(double a[]) {

        double aux;
        int last = a.length - 1;

        Arrays.sort(a);

        for (int i = 0; i < a.length / 2; i++) {
            aux = a[i];
            a[i] = a[last - i];
            a[last - i] = aux;
        }

        return a;

    }

    public double[] inicializarB(double b[], double a[]) {

        System.arraycopy(a, 0, b, 0, 10);

        for (int i = 0; i < 10; i++) {
            b[i + 10] = 0.5;
        }
        
        Arrays.fill(b, 11, b.length, .5);

        return b;
    }

}
