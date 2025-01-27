package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the HashTable class.
 */
public class HashTableTest {

    private HashTable hashTable; // Se declara la variable hashTable de tipo HashTable

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        hashTable = new HashTable();
    }

    /**
     * Tests the put and get methods of the HashTable.
     * Ensures that values can be added and retrieved correctly.
     */
    @Test
    public void testPutAndGet() {
        hashTable.put("John Smith", 5211234);
        hashTable.put("Lisa Smith", 5218976);
        hashTable.put("Sam Doe", 5215030);
        hashTable.put("Sandra Dee", 5219655);
        hashTable.put("Ted Baker", 4184165);

        Assert.assertEquals(Integer.valueOf(5211234), hashTable.get("John Smith"));
        Assert.assertEquals(Integer.valueOf(5218976), hashTable.get("Lisa Smith"));
        Assert.assertEquals(Integer.valueOf(5215030), hashTable.get("Sam Doe"));
        Assert.assertEquals(Integer.valueOf(5219655), hashTable.get("Sandra Dee"));
        Assert.assertEquals(Integer.valueOf(4184165), hashTable.get("Ted Baker"));
    }

    /**
     * Tests the get method of the HashTable with a non-existent key.
     * Ensures that null is returned when the key is not found.
     */
    @Test
    public void testGetNonExistentKey() {
        Assert.assertNull(hashTable.get("Non Existent"));
    }
}
