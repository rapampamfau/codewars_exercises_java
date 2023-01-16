package org.example.excercises;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilteringOne {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(o -> o.getClass().equals(Integer.class))
                .collect(Collectors.toList());
    }
}
