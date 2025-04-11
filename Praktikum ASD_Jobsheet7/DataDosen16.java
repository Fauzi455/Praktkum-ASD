public class DataDosen16 {
    Dosen16 [] dataDosen = new Dosen16[10];
    int idx;
    
    void tambah (Dosen16 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil(){
        for (int i = 0; i < idx; i++){
            dataDosen[i].tampil();
            System.out.println("----------------------------");
        }
    }
    
    void sortingASC(){
        for (int i = 0; i < idx-1; i++){
            for (int j = 0; j < idx-1-i; j++ ){
                if (dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen16 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j+1];
                    dataDosen[j+1] = temp;
                }
            }
        }
    }
    
    void SortingDSC(){
        for (int i = 0; i < idx-1; i++){
            int idxMax = i;
            for (int j = i+1; j < idx; j++){
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                  idxMax = j;  
                }
            }
            Dosen16 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }  

    int PencarianDataSequential16(String cari){
        int posisi = -1;
        for (int j = 0; j < idx; j++){
            if (dataDosen[j].nama.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(String x, int pos){
        if (pos != -1) {
            System.out.println("Data Dosen dengan nama " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Nama " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos){
        if (pos != -1) {
            System.out.println("kode          : " + dataDosen[pos].kode);
            System.out.println("nama          : " + dataDosen[pos].nama);
            System.out.println("jenis kelamin : " + (dataDosen[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("usia          : " + dataDosen[pos].usia);
        } else {
            System.out.println("Data dosen dengan nama " + x + " tidak ditemukan");
        }
    }

    int PencarianDataBinary16(int cariUsia, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left+right)/2;
            if (cariUsia == dataDosen[mid].usia) {
               return (mid); 
            } 
            else if (dataDosen[mid].usia > cariUsia) {
                return PencarianDataBinary16(cariUsia, left, mid-1);
            }
            else {
                return PencarianDataBinary16(cariUsia, mid+1, right);
            }
        }
        return -1;
    }

    void posisiUsia(int cariUsia, int posisi2) {
        if (posisi2 != -1) {
            System.out.println("Usia ditemukan pada indeks " + posisi2);
        } else {
            System.out.println("Data dengan usia " + cariUsia + " tidak ditemukan.");
        }
    }

    void tampilUsia(int cariUsia, int posisi2) {
        if (posisi2 != -1) {
            System.out.println("kode          : " + dataDosen[posisi2].kode);
            System.out.println("nama          : " + dataDosen[posisi2].nama);
            System.out.println("jenis kelamin : " + (dataDosen[posisi2].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("usia          : " + dataDosen[posisi2].usia);
        } else {
            System.out.println("Data dosen dengan usia " + cariUsia + " tidak ditemukan");
        }
    }
}
