package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problemDomain.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {

    private MyArrayList list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList<Double>();
    }

    @AfterEach
    void tearDown() {
        list = null;
    }

    @Test
    void hasNextEmpty() {
        assertEquals(false, list.hasNext());
    }

    @Test
    void hasNext() {
        list.add(123.3);
        list.add(12.3);
        assertEquals(true, list.hasNext(), "The values do not match");
    }

    @Test
    void next() {
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.next());
        assertEquals(2, list.next());
        assertEquals(3, list.next());
    }

    @Test
    void size() {
        for(int i = 0; i < 100; i++){
            this.list.add(i);
        }
        assertEquals(100, this.list.size());
    }

    @Test
    void clear() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void add() {
        list.add(12.3);
        list.add(12.3);
        boolean actual = list.add(123.3);
        assertEquals(true, actual);
    }

    @Test
    void testAdd() {
        assertEquals(true, false);
    }

    @Test
    void addAll() {
        assertEquals(true, false);
    }

    @Test
    void get() {
        assertEquals(true, false);
    }

    @Test
    void remove() {
        assertEquals(true, false);
    }

    @Test
    void testRemove() {
        assertEquals(true, false);
    }

    @Test
    void set() {
        assertEquals(true, false);
    }

    @Test
    void isEmpty() {
        assertEquals(true, false);
    }

    @Test
    void contains() {
        assertEquals(true, false);
    }

    @Test
    void toArray() {
        assertEquals(true, false);
    }

    @Test
    void testToArray() {
        assertEquals(true, false);
    }

    @Test
    void iterator() {
        assertEquals(true, false);
    }
}