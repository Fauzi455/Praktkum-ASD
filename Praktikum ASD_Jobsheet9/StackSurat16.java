public class StackSurat16 {
    Surat16[] stack;
    int size;
    int top;

public StackSurat16(int size){
    this.size = size;
    stack = new Surat16[size];
    top = -1;
}

public boolean isFull(){
    if (top == size - 1) {
        return true;
    } else{
        return false;
    }
}

public boolean isEmpty(){
    if (top == -1) {
        return true;
    } else{
        return false;
    }
}

public void push(Surat16 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }


public Surat16 pop() {
    if (!isEmpty()) {
        Surat16 s = stack[top];
        top--;
        return s;
    } else{
        System.out.println("Stack kosong! Tidak ada surat yang dapat diproses.");
        return null;
    }
}

public Surat16 peek() {
    if (!isEmpty()) {
        return stack[top];
    } else{
        System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
        return null;
    }
}

public void print() {
    for (int i = 0; i <= top; i++){
        System.out.println(stack[i].idSurat + "\t\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t\s\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
    }
    System.out.println("");
}

public boolean cari(String nama) {
        for (int i = 0; i <= top; i++){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}

