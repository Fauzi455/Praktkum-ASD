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
}
