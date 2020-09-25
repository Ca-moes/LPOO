package com.aor.numbers;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListAggregatorTest {

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
    public void sum() {
        List<Integer> list = setup();

        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void max() {
        List<Integer> list = setup();

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(5, max);
    }

    @Test
    public void min_bug7263() {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-4);
        list.add(-5);

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(-1, max);
    }

    @Test
    public void min() {
        List<Integer> list = setup();

        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        assertEquals(1, min);
    }

    @Test
    public void distinct() {
        List<Integer> stublist = new ArrayList<>(
                Arrays.asList(1, 2, 4, 5));

        IListDeduplicator deduplicator = Mockito.mock(IListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(null)).thenReturn(stublist);

        List<Integer> list = setup();

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(deduplicator, null);

        assertEquals(4, distinct);
    }

    @Test
    public void distinct_bug8726(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        class Stub implements IListDeduplicator {
            @Override
            public List<Integer> deduplicate(IListSorter sorter) {
                List<Integer> stublist = new ArrayList<>();
                stublist.add(1);
                stublist.add(2);
                stublist.add(4);
                return stublist;
            }
        }

        Stub stub = new Stub();


        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(stub, null);

        assertEquals(3, distinct);
    }
}