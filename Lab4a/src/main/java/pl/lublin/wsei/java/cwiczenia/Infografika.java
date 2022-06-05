package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Infografika {
    public String tytul;
    public String adresStrony;
    public int szerokosc;
    public String miniaturka;
    public String adresGrafiki;
    public int wysokosc;


    public Infografika(String tekst) {

        Pattern pattern = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher matcher = pattern.matcher(tekst);
        if (matcher.find())
            tytul = matcher.group(1);


        else
            tytul = "";
        pattern = Pattern.compile("<link>(.*)</link>");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            adresStrony = matcher.group(1);
        else
            adresStrony = "";

        pattern = Pattern.compile("thumbnail url=\"(.*)png");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            miniaturka = matcher.group(1);
        else
            miniaturka = "";

        pattern = Pattern.compile("img src=\"(.*)png");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            adresGrafiki = matcher.group(1);
        else
            adresGrafiki = "";

        pattern = Pattern.compile("width=\"(.*)\" h");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            szerokosc = Integer.parseInt(matcher.group(1));
        else
            szerokosc = 0;

        pattern = Pattern.compile("height=\"(.*)\"");
        matcher = pattern.matcher(tekst);
        if (matcher.find())
            wysokosc = Integer.parseInt(matcher.group(1));
        else
            wysokosc = 0;

    }
    public void print(){
        System.out.println ("Tytuł: " + tytul + "\nAdres strony : " + adresStrony + "\nAdres grafiki : " +
                adresGrafiki + "\nMiniaturka:  " + miniaturka +"\nSzerokość: " + szerokosc + "\nWysokość: " + wysokosc);
    }
}

