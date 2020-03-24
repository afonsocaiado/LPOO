package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListAggregatorTest {

    private List<Integer> list;

    @Before
    public void setup(){
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);
    }

    @Test
    public void sum() {

        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void max() {

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(5, max);
    }

    @Test
    public void min() {

        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        assertEquals(1, min);
    }

    @Test
    public void distinct() {

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct();

        assertEquals(4, distinct);
    }

    @Test
    public void bug1(){
        List<Integer> bug1list = new ArrayList<>();
        bug1list.add(-1);
        bug1list.add(-4);
        bug1list.add(-5);

        ListAggregator aggregator = new ListAggregator(bug1list);

        int bug1 = aggregator.max();

        assertEquals(-1, bug1);

    }

    @Test
    public void bug2(){

        class Stub implements IListDeduplicator
        {
            @Override
            public List<Integer> deduplicate() {
                List<Integer> nums = new ArrayList<>();

                nums.add(1);
                nums.add(2);
                nums.add(4);
                return nums;
            }
        }

        List<Integer> bug2list = new ArrayList<>();
        bug2list.add(1);
        bug2list.add(2);
        bug2list.add(4);
        bug2list.add(2);

        ListDeduplicator deduplicator = new ListDeduplicator(bug2list);
        ListAggregator aggregator = new ListAggregator(bug2list);

        int bug2 = aggregator.distinct(deduplicator);

        assertEquals(2, bug2);

    }
}