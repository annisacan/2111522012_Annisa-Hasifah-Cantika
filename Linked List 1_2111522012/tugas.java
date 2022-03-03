import java.util.LinkedList;


public class tugas {
public static void main(String[] args) {
 
    LinkedList<String> saya = new LinkedList<>();
    
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------------Tugas 2------------------------");
    System.out.println("--------------------------------------------------------\n");

    //add nama panjang besrta spasi kedalam linkedlist
    saya.add("A");
    saya.add("N");
    saya.add("N");
    saya.add("I");
    saya.add("S");
    saya.add("A");
    saya.add(" ");
    saya.add("H");
    saya.add("A");
    saya.add("S");
    saya.add("I");
    saya.add("F");
    saya.add("A");
    saya.add("H");
    saya.add(" ");
    saya.add("C");
    saya.add("A");
    saya.add("N");
    saya.add("T");
    saya.add("I");
    saya.add("K");
    saya.add("A");
 
    System.out.println("Nama Saya: " +saya);

    System.out.println("\n--------------------------------------------------------");

    //add karakter lain yang diinginkan dengan addfirst dan addlast 

    saya.addFirst("2111522012");
    saya.addLast("UNAND");

    System.out.println("NIM Nama dan Asal Universitas:");
    System.out.println("Nama Mahasiswa: " +saya);

    System.out.println("\n--------------------------------------------------------");

    //selipkan karakter yang diinginkan
    saya.set(22,"S");

    System.out.println("Nama Setelah ditambah:");
    System.out.println("Nama Mahasiswa: " +saya);
   
    System.out.println("\n--------------------------------------------------------");
    
    //remove karakter yang tidak diinginkan
    saya.removeFirst();
    saya.removeLast();

    saya.add("BANGET");

    System.out.println("Nama Setelah diremove:");
    System.out.println("Nama Mahasiswa: " +saya);

    System.out.println("\n--------------------------------------------------------");

    saya.push("NGULINYA");
    saya.push("SEMANGAT");
    saya.push("UY");

    System.out.println("Nama Setelah dimasukan:");
    System.out.println("Nama Mahasiswa: " +saya);

    System.out.println("\n--------------------------------------------------------");

    saya.pop();
    saya.pop();
    saya.pop();

    System.out.println("Nama Setelah dikeluarkan:");
    System.out.println("Nama Mahasiswa: " +saya);

    System.out.println("\n--------------------------------------------------------");


    //tes

    

}
}