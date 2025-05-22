public class AntrianKRS {
Mahasiswa [] data;
int front;
int rear;
int size;
int max;
int totalProses;

public AntrianKRS(int max){
    this.max = max;
    this.data = new Mahasiswa[max];
    this.front = 0;
    this.rear = -1;
    size = 0;
}

public boolean IsEmpty(){
    if (size == 0) {
        return true;
    } else{
        return false;
    }
}

public boolean IsFull(){
    if (size == max) {
        return true;
    } else{
        return false;
    }
}
public void tambahAntrian(Mahasiswa mhs){
    if (IsFull()) {
        System.out.println("Antrian penuh, tidak dapat menambah mahasiswa lagi");
        return;
    }
    rear = (rear + 1) % max;
    data[rear] = mhs;
    size++;
    System.out.println(mhs.nama + " berhasil masuk ke antrian.");
}

public void layaniKRS(){
    if (size < 2) {
        System.out.println("Antrian kurang dari 2, tidak bisa diproses");
        return;
    }
    System.out.println("Memproses KRS untuk 2 Mahasiswa: ");
    for (int i = 0; i < 2; i++){
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        data[front].tampilkanData();
        totalProses++;
    }
}

public void lihatTerdepan(){
    if (size < 2) {
        System.out.println("Antrian kurang dari 2, tidak bisa diproses");
        return;
    }
    System.out.println("Daftar Antrian 2 Mahasiswa Terdepan: ");
    System.out.println("NIM - NAMA - PRODI - KELAS");
    for (int i = 0; i < 2; i++){
        int index = (front + i) % max;
        data[index].tampilkanData();
    }
}

public void tampilkanSemua(){
    if (IsEmpty()) {
        System.out.println("Antrian kosong");
        return;
    }
    System.out.println("Daftar Mahasiswa dalam Antrian:");
    System.out.println("NIM - NAMA - PRODI - KELAS");
    for (int i = 0; i < size; i++){
        int index = (front + i) % max;
        System.out.print((i + 1) + ". ");
        data[index].tampilkanData();
    }
}

public Mahasiswa LihatAkhir(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong, tidak ada data di posisi belakang.");
        } else{
            System.out.println("Mahasiswa paling belakang di antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
        return data[rear];
}

public void clear(){
    if (!IsEmpty()) {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    } else{
        System.out.println("Antrian masih kosong");
    }
}

public int getJumlahAntrian(){
    return size;
}

public int getJmlProses(){
    return totalProses;
}
}
