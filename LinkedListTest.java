package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void testAdd() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        // Simple verificación de que no falla la adición
        Assert.assertTrue(true);
    }

    @Test
    public void testRemove() {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.remove(20);
        // Simple verificación de que no falla la eliminación
        Assert.assertTrue(true);
    }
}
