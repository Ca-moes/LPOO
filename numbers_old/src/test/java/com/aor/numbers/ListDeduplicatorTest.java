package com.aor.numbers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListDeduplicatorTest {

    public List<Integer> setup(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);
        return list;
    }

    @Test
    public void deduplicate() {
        List<Integer> list = setup();

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        class Stub implements IListSorter {
            @Override
            public List<Integer> sort() {
                List<Integer> stubl = new ArrayList<>();
                stubl.add(1);
                stubl.add(2);
                stubl.add(2);
                stubl.add(4);
                stubl.add(5);
                return stubl;
            }
        }
        Stub stub = new Stub();

        ListDeduplicator deduplicator = new ListDeduplicator(list);
        List<Integer> distinct = deduplicator.deduplicate(stub);

        assertEquals(expected, distinct);
    }

    @Test
    public void deduplicate_bug8726() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        class Stub implements IListSorter {
            @Override
            public List<Integer> sort() {
                List<Integer> stubl = new ArrayList<>();
                stubl.add(1);
                stubl.add(2);
                stubl.add(2);
                stubl.add(4);
                return stubl;
            }
        }
        Stub stub = new Stub();

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);

        ListDeduplicator deduplicator = new ListDeduplicator(list);

        List<Integer> distinct = deduplicator.deduplicate(stub);

        assertEquals(expected, distinct);
    }
}