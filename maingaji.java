import java.util.ArrayList;
import java.util.Scanner;

public class maingaji {

    public static void main(String[] args) {
        ArrayList<inputgaji> g = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Integer pilih = 0;

        System.out.println("------------oOo------------");
        System.out.println("Informasi Penghasilan Anda");
        System.out.println("------------oOo------------");
        System.out.println("1. Ambil Informasi Gaji Anda");
        System.out.println("2. Keluar");
        System.out.println("------------oOo------------");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();

        if (pilih == 1) {
            g = gaji(g);
        } else if (pilih != 2) {
            ;
        }
    }

    private static ArrayList<inputgaji> gaji(ArrayList<inputgaji> g) {
        Scanner sc = new Scanner(System.in);
        String nama, jenis, alamat, telp;
        Integer jb;

        System.out.println("--------------oOo--------------");
        System.out.print("Nama : ");
        nama = sc.nextLine();

        System.out.print("Jenis Kelamin : ");
        jenis = sc.nextLine();

        System.out.print("Alamat : ");
        alamat = sc.nextLine();

        System.out.print("No. Telp : ");
        telp = sc.nextLine();

        System.out.println("Jabatan Yang Tersedia : ");
        System.out.println("1. Manager");
        System.out.println("2. HRD");
        System.out.println("3. Supervisor");
        System.out.println("4. IT");
        System.out.println("5. Karyawan");
        System.out.println("6. Office Boy");
        System.out.println("7. Security");
        System.out.println("--------------oOo--------------");
        
        System.out.print("Jabatan Anda : ");
        jb = sc.nextInt();

        System.out.println("--------------oOo--------------");
        System.out.println("     Penghasilan Anda      ");
        System.out.println("--------------oOo--------------");

        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenis);
        System.out.println("Alamat : " + alamat);
        System.out.println("No. Telp : " + telp);
        System.out.print("Jabatan Anda : ");
        if (jb == 1) {
            System.out.println("Manager");
            System.out.println("Penghasilan Anda : Rp. 50.000.000,00,-");
        } else if (jb == 2) {
            System.out.println("HRD");
            System.out.println("Penghasilan Anda :Rp. 35.000.000,00,-");
        } else if (jb == 3) {
            System.out.println("Supervisor");
            System.out.println("Penghasilan Anda :Rp. 25.000.000,00,-");
        } else if (jb == 4) {
            System.out.println("IT");
            System.out.println("Penghasilan Anda :Rp. 75.000.000,00,-");
        } else if (jb == 5) {
            System.out.println("Karyawan");
            System.out.println("Penghasilan Anda :Rp. 15.000.000,00,-");
        } else if (jb == 6) {
            System.out.println("Office Boy");
            System.out.println("Penghasilan Anda :Rp. 5.500.000,00,-");
        } else if (jb == 7) {
            System.out.println("Security");
            System.out.println("Penghasilan Anda :Rp. 7.000.000,00,-");
        }
        System.out.println("--------------oOo--------------");

        return g;
    }
}