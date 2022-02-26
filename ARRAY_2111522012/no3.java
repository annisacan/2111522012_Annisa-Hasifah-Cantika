import java.util.ArrayList;

public class no3 {
    public static void main(String[] args) {
        //membuat objek array list
        ArrayList<String> nama = new ArrayList<String>();
        //mengisi 4 huruf dalam nama
        nama.add("C");
        nama.add("A");
        nama.add("N");
        nama.add("K");
        //carilah hasil dari perintah get()
        System.out.println("Elemen yang diambil yaitu:");
        System.out.println(nama.get(0));   
        System.out.println(nama.get(2));   
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));
        //perintah get() berguna untuk mengambil elemen pada indeks tertentu
    }
}
