public class BinaryTree16 {
    Node16 root;

public BinaryTree16(){
    root = null;
}

public boolean isEmpty(){
    return root == null;
}

public void add(Mahasiswa16 mahasiswa){
    Node16 newNode = new Node16(mahasiswa);
    if (isEmpty()) {
        root = newNode;
    } else{
        Node16 current = root;
        Node16 parent = null;
        while (true) {
            parent = current;
            if (mahasiswa.ipk < current.mahasiswa.ipk) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else{
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
}

boolean find (double ipk){
    boolean result = false;
    Node16 current = root;
    while (current != null) {
        if (current.mahasiswa.ipk == ipk) {
            result = true;
            break;
        } else if (ipk > current.mahasiswa.ipk) {
            current = current.right;
        } else{
            current = current.left;
        }
    }
    return result;
}

void traversePreOrder(Node16 node){
    if (node != null) {
        node.mahasiswa.tampilInformasi();
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}

void traverseInOrder(Node16 node){
    if (node != null) {
        traverseInOrder(node.left);
        node.mahasiswa.tampilInformasi();
        traverseInOrder(node.right);
    }
}

void traversePostOrder(Node16 node){
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        node.mahasiswa.tampilInformasi();
    }
}

Node16 getSuccessor(Node16 del){
    Node16 successor = del.right;
    Node16 successorParent = del;
    while (successor.left != null) {
        successorParent = successor;
        successor = successor.left;
    }
    if (successor != del.right) {
        successorParent.left = successor.right;
        successor.right = del.right;
    }
    return successor;
}

void delete(double ipk){
    if (isEmpty()) {
        System.out.println("Binary tree kosong");
        return;
    }
    // cari node (current) yang akan dihapus
    Node16 parent = root;
    Node16 current = root;
    boolean isLeftChild = false;
    while (current != null) {
        if (current.mahasiswa.ipk == ipk) {
            break;
        } else if (ipk < current.mahasiswa.ipk) {
            parent = current;
            current = current.left;
            isLeftChild = true;
        } else if (ipk > current.mahasiswa.ipk) {
            parent = current;
            current = current.right;
            isLeftChild = false;
        }
    }
    //penghapusan
    if (current == null) {
        System.out.println("Data tidak ditemukan");
        return;
    } else{
        //jika tidak ada anak (leaf), maka node dihapus
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else{
                if (isLeftChild) {
                    parent.left = null;
                } else{
                    parent.right = null;
                }
            }
        } else if (current.left == null) { //jika hanya punya 1 anak(kanan)
            if (current == root) {
                root = current.right;
            } else{
                if (isLeftChild) {
                    parent.left = current.right;
                } else{
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) { //jika hanya punya 1 anak(kiri)
            if (current == root) {
                root = current.left;
            } else{
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else{ //jika punya 2 anak
            Node16 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else{
                if (isLeftChild) {
                    parent.left = successor;
                } else{
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }
}
}