package pl.lublin.wsei.java.cwiczenia;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
     /*   System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10 )
            System.out.printf("%d\t%f\t\n",i, Math.sin(i/360.0*2*Math.PI));


        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
        double sumaPoteg=0;
        double a=2;

        for (int i = 0; i < 10; i += 1 ) {
            sumaPoteg+=Math.pow(a,i);


            System.out.printf("%d\t%f\t%.0f\n",i,Math.log(i),sumaPoteg);*/
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Podaj pierwsza liczbe: ");
        num1=input.nextInt();
        System.out.println("Podaj druga liczbe: ");
        num2=input.nextInt();
        System.out.printf("wynik dodawania %d + %d = %d\n", num1, num2, num1 + num2 );

        }






    }

