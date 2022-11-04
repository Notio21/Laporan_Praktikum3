public class Mahasiswa extends Manusia{
    String Nim;
    String Jurusan;

    public void setNim(String Nim){
        this.Nim = Nim;
    }
    public String getNim(){
        return this.Nim;
    }
    public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }
    public String getJurusan(){
        return this.Jurusan;
    }
    public void CetakInfo() {
        super.CetakInfo();
    }
    public void CetakNIm(){
        System.out.println("Nim           : " + this.Nim);
        System.out.println("Jurusan       : " + this.Jurusan);
    }
}
