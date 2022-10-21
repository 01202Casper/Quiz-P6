public class inputgaji {
    String nama, jenis, alamat, telp, jb;

    public inputgaji(String nama, String jenis, String alamat, String telp, String jb) {
        this.nama = nama;
        this.jenis = jenis;
        this.alamat = alamat;
        this.telp = telp;
        this.jb = jb;
    }

    public String getnama() {
        return nama;
    }

    public String getjenis() {
        return jenis;
    }

    public String getalamat() {
        return alamat;
    }

    public String gettelp() {
        return telp;
    }

    public String getjb() {
        return jb;
    }
}