package pl.lublin.wsei.java.cwiczenia;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10 )
            System.out.printf("%d\t%f\t\n",i, Math.sin(i/360.0*2*Math.PI));


        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
        double sumaPoteg=0;
        double a=2;

        for (int i = 1; i < 10; i += 1 ) {
            sumaPoteg+=Math.pow(a,i);


            System.out.printf("%d\t%f\t%.0f\n",i,Math.log(i),sumaPoteg);
        }






    }
}
