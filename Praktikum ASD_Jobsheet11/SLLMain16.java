public class SLLMain16 {
    public static void main(String[] args) {

SingleLinkedList16 sll = new SingleLinkedList16();

Mahasiswa16 mhs1 = new Mahasiswa16("24212200", "Alvaro", "1A", 4.0);
Mahasiswa16 mhs2 = new Mahasiswa16("23212201", "Bimon", "2B", 3.8);
Mahasiswa16 mhs3 = new Mahasiswa16("22212202", "Cintia", "3C", 3.5);
Mahasiswa16 mhs4 = new Mahasiswa16("21212203", "Dirga", "4D", 3.6);

sll.print();
sll.addFirst(mhs4);
sll.print();
sll.addLast(mhs1);
sll.print();
sll.insertAfter("Dirga", mhs3);
sll.insertAt(2, mhs2);
sll.print();

//Percobaan 2
System.out.println("Data index 1:");
sll.getData(1);

System.out.println("Data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
System.out.println();

sll.removeFirst();
sll.removeLast();
sll.print();
sll.RemoveAt(0);
sll.print();
}    
}
