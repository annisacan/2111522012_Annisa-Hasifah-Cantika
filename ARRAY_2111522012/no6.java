import java.util.ArrayList;

public class no6 {
    public static void main(String[] args) {
        //membuat objek array list
        ArrayList<String> nama = new ArrayList<String>();
        //mengisi 4 huruf dalam nama
        nama.add("C");
        nama.add("A");
        nama.add("N");
        nama.add("K");
        //carilah hasil dari perintah indexof()
        
        System.out.println("Nama sebelum ditambah:");
            for(String nama2: nama)
            System.out.println(nama2);

        nama.add(0,"e");
        System.out.println("Nama setelah ditambah e:" +nama);
        nama.add(2,"f");
        System.out.println("Nama setelah ditambah f:" +nama);
        nama.add(3,"g");
        System.out.println("Nama setelah ditambah g:" +nama);
        nama.add(4,"h");
        System.out.println("Nama setelah ditambah h:" +nama);
        nama.add(6,"h");
        System.out.println("Nama setelah ditambah h:" +nama);
        nama.add(-3,"j");
        System.out.println("Nama setelah ditambah j:" +nama);

    }
}
