package Program;
import java.util.*;
/**
 *
 * @author Acer
 */
public class program_antrian {
    public static void main(String[] args) {

        // tahap inialisasi program queue menggunakan objek linked list
        Queue<String> AntrianPendaftaran = new LinkedList<>();

        // menambahkan data atau nilai baru ke dalam list queue (OPERASI ENQUEUE)
        AntrianPendaftaran.add("Dave");
        AntrianPendaftaran.add("Hamdy");
        AntrianPendaftaran.add("Hanif");
        AntrianPendaftaran.add("Bagus");
        AntrianPendaftaran.add("Sendy");
        AntrianPendaftaran.add("Yoga");

        // digunakan untuk menampilkan output hasil dari list queue
        System.out.println("Antrian Pendaftaran Tiket Nonton : " + AntrianPendaftaran);

        // digunakan untuk menghapus sebuah elemen dari queue menggunakan method remove() (OPERASI DEQUEUE)
        // method remove() akan melempar NoSuchElementException apabila list queue kosong
        String nama = AntrianPendaftaran.remove();
        System.out.println("Menghapus dari Antrian Tiket Nonton : " + nama + "|Daftar Antrian Baru : " + AntrianPendaftaran);

        // digunakan untuk menghapus sebuah elemen dari queu menggunakan method poll()
        // method remove() akan mengembalikan null apabila list queue kosong
        nama = AntrianPendaftaran.poll();
        System.out.println("Menghapus dari Antrian Pendaftaran : " + nama + " | Daftar Antrian Baru : " + AntrianPendaftaran);
    }

}


