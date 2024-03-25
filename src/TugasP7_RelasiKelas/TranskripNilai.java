package TugasP7_RelasiKelas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
	private Date tanggalCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;
    
    TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tanggalCetak = new Date();
    }
    //Rumus hitung IPK
    public void hitungIPK() {
        double totalBobot = 0.0;
        double totalSKS = 0.0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            totalBobot += khs.getIps() * khs.getTotalSKS();
            totalSKS += khs.getTotalSKS();
        }
        if (totalSKS > 0) {
            ipk = totalBobot / totalSKS;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tanggalCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    // Setter dan Getter

    public Date gettanggalCetak() {
        return tanggalCetak;
    }

    public void setTglCetak(Date tanggalCetak) {
        this.tanggalCetak = tanggalCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}

