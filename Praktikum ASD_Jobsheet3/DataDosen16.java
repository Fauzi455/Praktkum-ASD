public class DataDosen16 {
    
        public void dataSemuaDosen(Dosen16[] arrayOfDosen) {
            System.out.println("======== Data Semua Dosen ========");
            for (Dosen16 dosen : arrayOfDosen) {
                dosen.tampilkanInfo();
            }
        }
    
        public void jumlahDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
            int jumlahPria = 0;
            int jumlahWanita = 0;
    
            for (Dosen16 dosen : arrayOfDosen) {
                if (dosen.jenisKelamin()) {
                    jumlahPria++;
                } else {
                    jumlahWanita++;
                }
            }
    
            System.out.println("Jumlah Dosen Pria: " + jumlahPria);
            System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
            System.out.println("--------------------------------");

        }
    
        public void rerataUsiaDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
            int totalUsiaPria = 0;
            int totalUsiaWanita = 0;
            int jumlahPria = 0;
            int jumlahWanita = 0;
    
            for (Dosen16 dosen : arrayOfDosen) {
                if (dosen.jenisKelamin()) {
                    totalUsiaPria += dosen.usia();
                    jumlahPria++;
                } else {
                    totalUsiaWanita += dosen.usia();
                    jumlahWanita++;
                }
            }
    
            double rerataPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
            double rerataWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;
    
            System.out.println("Rata-rata Usia Dosen Pria: " + rerataPria + " tahun");
            System.out.println("Rata-rata Usia Dosen Wanita: " + rerataWanita + " tahun");
            System.out.println("--------------------------------");

        }
    
        public void infoDosenPalingTua(Dosen16[] arrayOfDosen) {
            Dosen16 dosenTua = arrayOfDosen[0];
    
            for (Dosen16 dosen : arrayOfDosen) {
                if (dosen.usia() > dosenTua.usia()) {
                    dosenTua = dosen;
                }
            }
    
            System.out.println("Dosen Paling Tua:");
            dosenTua.tampilkanInfo();
        }
    
        public void infoDosenPalingMuda(Dosen16[] arrayOfDosen) {
            Dosen16 dosenMuda = arrayOfDosen[0];
    
            for (Dosen16 dosen : arrayOfDosen) {
                if (dosen.usia() < dosenMuda.usia()) {
                    dosenMuda = dosen;
                }
            }
    
            System.out.println("Dosen Paling Muda:");
            dosenMuda.tampilkanInfo();
        }
    }

