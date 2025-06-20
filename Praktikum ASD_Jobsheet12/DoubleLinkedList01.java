import java.util.Scanner;
public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;
    int size;

public DoubleLinkedList01(){
    head = null;
    tail = null;
    size = 0;
}

public boolean isEmpty(){
    return head == null;
}

public void addFirst(Mahasiswa01 data){
    Node01 newNode = new Node01(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else{
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    size++;
}

public void addLast(Mahasiswa01 data){
    Node01 newNode = new Node01(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    size++;
}

public void insertAfter(String keyNim, Mahasiswa01 data){
    Node01 current = head;
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node01 newNode = new Node01(data);
    if (current == tail) {
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    } else{
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }
    size++;
    System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
}

public void print(){
    if (isEmpty()) {
        System.out.println("Linked List masih kosong!");
    } else{
    Node01 current = head;
    while (current != null) {
        current.data.tampil();
        current = current.next;
    }
}
}

public void removeFirst(){
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus!");
        return;
    }
    if(head == tail){
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + head.data.nama);  
        head = tail = null;
    } else{
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + head.data.nama);  
        head = head.next;
        head.prev = null;
    }
    size--;
}

public void removeLast(){
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus!");
        return;
    }
    if (head == tail) {
        head = tail = null;
    } else{
       tail = tail.prev;
       tail.next = null;
    }
    size--;
}

public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

public static Mahasiswa01 inputMahasiswa(Scanner scan){
    System.out.print("Masukkan NIM: ");
    String nim = scan.nextLine();
    System.out.print("Masukkan Nama: ");
    String nama = scan.nextLine();
    System.out.print("Masukkan Kelas: ");
    String kelas = scan.nextLine();
    System.out.print("Masukkan IPK: ");
    double ipk = scan.nextDouble();
    scan.nextLine();
    return new Mahasiswa01(nim, nama, kelas, ipk);
    }

public void add(int index, Mahasiswa01 data){
    if (index == 0) {
        addFirst(data);
    } else if (index == size) {
        addLast(data);
    } else {
        Node01 newNode = new Node01(data);
        Node01 current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
        }
    }

public void removeAfter(String keyNim){
    Node01 current = head;
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node01 remove = current.next;
    if (remove == tail) {
        tail = current;
        current.next = null;
    } else{
        current.next = remove.next;
        remove.next.prev = current;
    }
    size--;
}

public void remove(int index){
    if (index == 0) {
        removeFirst();
    } else if (index == size - 1) {
        removeLast();
    } else {
    Node01 current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }
}

public Mahasiswa01 getFirst(){
    if (isEmpty()) {
        System.out.println("Linked list masih kosong");
        return null;
    }
    return head.data; 
}

public Mahasiswa01 getLast(){
    if (isEmpty()) {
        System.out.println("Linked list masih kosong");
        return null;
    }
    return tail.data; 
}
public Mahasiswa01 getIndex(int index){
    Node01 current = head;
    for(int i = 0; i < index; i++){
        current = current.next;
    }
    return current.data;
}

public int getSize(){
    return size;
}
}
