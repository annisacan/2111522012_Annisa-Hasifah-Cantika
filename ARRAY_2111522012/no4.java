import java.util.ArrayList;

public class no4 {
    public static void main(String[] args) {
        //membuat objek array list
        ArrayList<String> nama = new ArrayList<String>();
        //mengisi 4 huruf dalam nama
        nama.add("A");
        nama.add("N");
        nama.add("K");
        //carilah hasil dari perintah indexof()
        System.out.println("Indeks dari a c q:");
        System.out.println(nama.indexOf("a"));   
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));
        //perintah indexof() berguna untuk mengetahui indeks dari suatu nilai
    }
}
