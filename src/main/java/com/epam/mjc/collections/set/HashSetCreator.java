package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for(Integer i : sourceList) {
            if (i % 2 == 0) {
                result.add(i);
                while(i % 2 == 0) {
                    i = i / 2;
                    result.add(i);
                }
                continue;
            }
            if (i % 2 == 1) {
                result.add(i);
                result.add(i*2);
            }
        }
        return result;
    }
}
