package LAB9.zad2;

import java.io.File;

public class Slownik <K,V> {
    private K[] klucze;
    private V[] wartosci;

    public Slownik(int size) {
        klucze = (K[])new Object[size];
        wartosci = (V[]) new Object[size];
    }

    public boolean dodaj(K klucz, V wartosc){
        for(int i = 0; i < klucze.length; i++){
            if(klucze[i] == null || klucze[i] == klucz){
                klucze[i] = klucz; wartosci[i] = wartosc; return true;
            }
        }
        return false;
    }

    public boolean czyZawiera(K klucz){
        for(K k : klucze){ if(k == klucz){ return true; } }
        return false;
    }

    public int wielkosc(){
        int count = 0;
        for (K k : klucze) { if(k != null) count++; }
        return count;
    }

    private int pierwszyWolnyIndeks(){
        if (klucze[0]==null){
            return 0;
        }
        int wolnyIndeks=1;
        for (int i=1;i<klucze.length; i++){
            if (klucze[i]==null){
                return i;
            }
            wolnyIndeks++;
        }
        return wolnyIndeks>klucze.length? -1:wolnyIndeks;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (int i=0;i<pierwszyWolnyIndeks();i++){
            buffer.append(String.format("%s->%s,", klucze[i], wartosci[i]));
        }
        if (buffer.length()>1){
            buffer.deleteCharAt(buffer.length()-1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Slownik<String, String> wczytajSlownik(File file){
        //TODO: zaimplementować! (Zadanie 3)
        return null;
    }
}
