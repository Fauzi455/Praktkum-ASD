public class Queue {
Mahasiswa [] data;
Node head;
Node tail;
int size;

public Queue(){
    this.head = null;
    this.tail = null;
    this.size = 0;
}

public boolean isEmpty(){
    return (head == null);
}

public boolean isFull(){
    return false;
}

public void clear(){
    head = null;
    tail = null;
    size = 0;
    System.out.println("Antrian sudah dikosongkan");
}

public void tambah(String nim, String nama, String prodi) {
Mahasiswa mahasiswa = new Mahasiswa(nim, nama, prodi);
Node nd = new Node(mahasiswa, null);
    if (isEmpty()) {
            head = tail = nd;
        } else {
            tail.next = nd;
            tail = nd;
        }
        size++;
        System.out.println(nama + " berhasil mendaftar ke antrian.");
    }

public void panggilAntrian(){
    if (isEmpty()) {
        System.out.println("Antrian masih kosong, tidak dapat dipanggil");
        return;
    } 
    System.out.println("Mahasiswa " + head.data.nama + " dipanggil");
    head = head.next;
    size--;
}

public void terdepan(){
    if (isEmpty()) {
        System.out.println("Antrian masih kosong");
    } else{
        System.out.println("Antrian Terdepan: ");
        System.out.println("NAMA\tNIM\tPRODI");
        head.data.tampil();
    }
}

public void terakhir(){
    if (isEmpty()) {
        System.out.println("Antrian masih kosong");
    } else{
        System.out.println("Antrian Terakhir: ");
        System.out.println("NAMA\tNIM\tPRODI");
        tail.data.tampil();

    }
}

public void jumlahAntrian() {
        System.out.println("Jumlah Mahasiswa dalam Antrian: " + size);
    }
}
