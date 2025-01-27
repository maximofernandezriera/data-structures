package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the HashTable class.
 */
public class HashMapTest {

    private HashMap hashMap; // Se declara la variable hash de tipo HashMap

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        hashTable = new HashMap();
    }

    /**
     * Tests the put and get methods of the HashMap.
     * Ensures that values can be added and retrieved correctly.
     */
    @Test
    public void testPutAndGet() {
        hashMap.put("John Smith", 5211234);
        hashMap.put("Lisa Smith", 5218976);
        hashMap.put("Sam Doe", 5215030);
        hashMap.put("Sandra Dee", 5219655);
        hashMap.put("Ted Baker", 4184165);

        Assert.assertEquals(Integer.valueOf(5211234), hashMap.get("John Smith"));
        Assert.assertEquals(Integer.valueOf(5218976), hashMap.get("Lisa Smith"));
        Assert.assertEquals(Integer.valueOf(5215030), hashMap.get("Sam Doe"));
        Assert.assertEquals(Integer.valueOf(5219655), hashMap.get("Sandra Dee"));
        Assert.assertEquals(Integer.valueOf(4184165), hashMap.get("Ted Baker"));
    }

    /**
     * Tests the get method of the HashMap with a non-existent key.
     * Ensures that null is returned when the key is not found.
     */
    @Test
    public void testGetNonExistentKey() {
        Assert.assertNull(hashMap.get("Non Existent"));
    }
}
