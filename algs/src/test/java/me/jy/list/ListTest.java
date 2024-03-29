package me.jy.list;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author jy
 */
class ListTest {

    @Test
    void testArrayList() {
        testList(new ArrayList<>());
    }

    @Test
    void testLinkedList() {
        testList(new LinkedList<>());
    }

    private void testList(List<Integer> list) {
        assertEquals(0, list.size());

        list.add(1);
        list.add(2);
        assertEquals(2, list.size());

        assertEquals(2, list.get(1));

        assertThrows(RuntimeException.class, () -> list.get(2));
        assertThrows(RuntimeException.class, () -> list.remove(2));

        for (int i = 0; i < 10; i++) {
            list.add(10);
        }
        assertEquals(12, list.size());

        list.remove(0);
        assertEquals(2, list.get(0));
    }

    @Test
    void testConcurrency() {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        IntStream.range(1, 10000)
            .parallel()
            .forEach(list::add);
        System.out.println(list.size());
        System.out.println(list.parallelStream().filter(Objects::isNull).count());
    }
}
