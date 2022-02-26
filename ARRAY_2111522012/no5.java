import java.util.ArrayList;

public class no5 {
    public static void main(String[] args) {
        //membuat objek array list
        ArrayList<String> nama = new ArrayList<String>();
        //mengisi 4 huruf dalam nama
        nama.add("C");
        nama.add("A");
        nama.add("N");
        nama.add("K");
        System.out.println("Nama sebelum dihapus:");
            for(String nama0: nama)
            System.out.println(nama0);
        //carilah hasil dari perintah remove()
        nama.remove(0);
        System.out.println("Nama setelah dihapus index ke-0:" +nama);    
        nama.remove(3);
        System.out.println("Nama setelah dihapus index ke-3:" +nama);       
        nama.remove(2);
        System.out.println("Nama setelah dihapus index ke-2:" +nama);   
        //perintah remove() berguna untuk menghapus nilai dari indeks tertentu
    }
}
