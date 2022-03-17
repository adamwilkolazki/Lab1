package pl.lublin.wsei.java.cwiczenia;

import org.apache.commons.lang3.StringUtils;
import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Arrays;
import java.util.Random;
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

        /*System.out.println("Podaj pierwsza liczbe: ");
        num1=input.nextInt();
        System.out.println("Podaj druga liczbe: ");
        num2=input.nextInt();
        ;*/



     /*   System.out.println("Podaj liczbe: ");
        int a = input.nextInt();
        System.out.println((Integer.toBinaryString(a)));
        System.out.println(Integer.toHexString(a));
*/
     /*  int [] liczby =new int[30];
        Random rnd = new Random();
        for (int i=0; i<30;i++)
        liczby[i] = rnd.nextInt();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long avg = 0;
        for(int i :liczby)
        {
            System.out.println(1);
            if (1<min) min = 1;
            if (1>max) max = 1;
            avg+=1;

        }
        System.out.printf("MIN = %d, MAX = %d AVG = %f", min,max,(float)avg/liczby.length);*/
        Account acc = new Account();
        acc.setName("adam Wilkolazki");
        System.out.println(acc.getName());
        System.out.println(StringUtils.capitalize(acc.getName()));



    }}




