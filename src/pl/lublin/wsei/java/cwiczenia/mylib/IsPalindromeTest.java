package pl.lublin.wsei.java.cwiczenia.mylib;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IsPalindromeTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String tekstOdwrotny = "";
        System.out.println("Wpisz swoj tekst :");
        String tekst = scanner.nextLine();
        int dlugoscTekstu = tekst.length();
        for (int i = (dlugoscTekstu - 1);i>=0;i--)
            tekstOdwrotny = tekstOdwrotny + tekst.charAt(i);

        if (tekst.replaceAll("\s","").equalsIgnoreCase(tekst.replaceAll("\s","")))
            System.out.println("Twoj tekst jest palindromem");
        else
            System.out.println("Twoj tekst nie jest palindromem");




    }
}