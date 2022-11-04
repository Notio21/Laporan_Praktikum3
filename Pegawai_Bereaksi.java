public class Pegawai_Bereaksi {
    public static void main(String[] args) {
        //Membuat Objek
        Manager manager = new Manager();
        manager.Nama = "Yono";
        manager.GajiPokok = 6000000;
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("============================");
        Programmer programer = new Programmer();
        programer.Nama = "Ari";
        programer.GajiPokok = 5000000;
        programer.cetakinfo();
        programer.cetakBonus();
    }
}
