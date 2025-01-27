package datastructures;

// A continuación se presenta una versión aún más simplificada de HashTable.
// Paso 1: Definir la clase HashEntry como estructura interna para almacenar pares clave-valor.
class HashEntry {
    String key;
    int value;

    // Constructor para inicializar el HashEntry
    HashEntry(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

// Paso 2: Implementar la clase HashMap con operaciones básicas (put, get) para ilustrar su funcionamiento.
public class HashMap {
    private final int SIZE = 16; // Tamaño fijo del array de buckets
    private HashEntry[] data; // Array de buckets

    // Constructor: inicialmente todos los buckets están vacíos
    public HashMap() {
        data = new HashEntry[SIZE]; // Inicializa el array con el tamaño fijo
    }

    // Método hash: calcula el índice del bucket para una clave dada
    private int getBucketIndex(String key) {
        return key.hashCode() % SIZE;
    }

    // Método put: inserta un nuevo par clave-valor en la tabla hash
    public void put(String key, int value) {
        int index = getBucketIndex(key);
        data[index] = new HashEntry(key, value); // Sobrescribe cualquier entrada existente
    }

    // Método get: obtiene el valor asociado a una clave dada
    public Integer get(String key) {
        int index = getBucketIndex(key);
        HashEntry entry = data[index];

        if (entry != null && entry.key.equals(key)) {
            return entry.value;
        }
        return null; // Devuelve null si la clave no se encuentra
    }

    @Override
    public String toString() {
        StringBuilder hashMapStr = new StringBuilder();
        for (int bucket = 0; bucket < SIZE; bucket++) {
            HashEntry entry = data[bucket];
            if (entry != null) {
                hashMapStr.append("\n bucket[")
                        .append(bucket)
                        .append("] = ")
                        .append(entry.key)
                        .append(" = ")
                        .append(entry.value);
            }
        }
        return hashTableStr.toString();
    }
}
