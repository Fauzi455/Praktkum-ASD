public class StackTugasMahasiswa16 {

    Mahasiswa16[] stack;
    int size;
    int top;

public StackTugasMahasiswa16(int size){
    this.size = size;
    stack = new Mahasiswa16[size];
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

public void push(Mahasiswa16 mhs) {
        if (!isFull()) {
            
            for (int i = top + 1; i > 0; i--) {
                stack[i] = stack[i - 1];
            }
            stack[0] = mhs;
            top++;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }


public Mahasiswa16 pop() {
    if (!isEmpty()) {
        Mahasiswa16 m = stack[top];
        top--;
        return m;
    } else{
        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
        return null;
    }
}

public Mahasiswa16 peek() {
    if (!isEmpty()) {
        return stack[top];
    } else{
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
        return null;
    }
}

public void print() {
    for (int i = 0; i <= top; i++){
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println("");
}

public Mahasiswa16 lihatTugasTerbawah() {
    if (!isEmpty()) {
        return stack[top];
    } else{
        return null;
    }
}   

public int jmlTugas() {
        return top + 1;
    }

public String konversiDesimalKeBiner(int nilai){
    StackKonversi16 stack = new StackKonversi16();
    while (nilai != 0){
        int sisa = nilai % 2;
        stack.push(sisa);
        nilai = nilai/2;
    }
    String biner = new String();
    while (!stack.isEmpty()) {
        biner += stack.pop();        
    }
    return biner;
    }
}
