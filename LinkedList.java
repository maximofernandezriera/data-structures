package datastructures; // Paquete donde se encuentra la clase

// A continuación se presenta una versión simplificada de LinkedList.
// Paso 1: Definir la clase Node como estructura interna para almacenar datos y el enlace al siguiente nodo.
class Node {
    // El atributo data es el valor que guardaremos en este nodo (por ejemplo, un int)
    int data;
    // next apunta al siguiente nodo
    Node next;

    // Constructor para inicializar el nodo
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Paso 2: Implementar la clase LinkedList con operaciones básicas (add, remove, print) para ilustrar su funcionamiento.
public class LinkedList {
    private Node head; // Apunta al primer nodo de la lista

    // Constructor: inicialmente la lista está vacía
    public LinkedList() {
        this.head = null;
    }

    // Método add: inserta un nuevo nodo al final de la lista
    public void add(int value) {
        // Si la lista está vacía, el nuevo nodo será la cabeza
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            // Recorremos la lista hasta llegar al último nodo
            while (current.next != null) {
                current = current.next;
            }
            // Creamos un nuevo nodo y lo enlazamos
            current.next = new Node(value);
        }
    }

    // Método remove: elimina el primer nodo que coincida con value
    public void remove(int value) {
        // Si la lista está vacía, no hacemos nada
        if (head == null) return;

        // Caso en que el nodo a eliminar sea la cabeza
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        // Recorremos la lista buscando el nodo previo al que queremos eliminar
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        // Si llegamos a un nodo cuyo siguiente tiene el valor buscado, se enlaza al siguiente de ese nodo
        if (current.next != null && current.next.data == value) {
            current.next = current.next.next;
        }
    }

    // Método printList: muestra el contenido de la lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
