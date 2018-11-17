package me.ronggenliu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PermutationsTest {

    @Test
    public void permutate() {
        List<List<Integer>> result = Permutations.permutate(new int[]{1, 2, 3});
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(Arrays.asList(new Integer[]{1, 2, 3}));
        list.add(Arrays.asList(new Integer[]{1, 3, 2}));
        list.add(Arrays.asList(new Integer[]{2, 1, 3}));
        list.add(Arrays.asList(new Integer[]{2, 3, 1}));
        list.add(Arrays.asList(new Integer[]{3, 1, 2}));
        list.add(Arrays.asList(new Integer[]{3, 2, 1}));
        assertTrue(list.equals(result));
    }
}