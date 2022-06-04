import java.util.Scanner;

public class DLLMain_5 {
    
    public static void menu(){
        System.out.println("===============QUIZ 2 PRAKTIKUM ASD T1 - 1F ===============");
        System.out.println("dibuat oleh : Andhito Gaalih Nur Cahyo ");
        System.out.println("Nim : 2141720138");
        System.out.println("Absen : 05");
        System.out.println("==============================");
        System.out.println("Sistem Antrian Resto Royal Delish ");
        System.out.println("==============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan Pesanan by nama");
        System.out.println("5. Hitung Total Pendapatan");
        System.out.println("6. Keluar");
        System.out.println("==============================");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int menu, index;
        String namaPembeli, Nohp, cari;
        double rating;
        DoubleLL_5 dll = new DoubleLL_5();

     
            do{
                menu();
                menu = sc.nextInt();

                try {
                    switch (menu) {
                        case 1:
                            System.out.println("Masukkan Data Pelanggan");
                            System.out.println("Nama Pembeli: ");
                            namaPembeli = input.nextLine();
                            System.out.println("No Hp: ");
                            Nohp = input.nextLine();
                            dll.addFirst(namaPembeli, Nohp);
                            break;

                        case 2:
                            System.out.println("Cetak Data");
                            dll.print();
                            System.out.println("Size : " + dll.size());
                            break;  

                        case 6:
                            System.out.println("TERIMA KASIH.....");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Inputan yang Anda masukkan salah");
                            break;
                        }
                } catch (Exception e){
                }
            }while (menu > 0 && menu < 11);
        }
}

