package com.tkaczyk.phoneBook.utils;

import java.util.Set;

public class IdGenerator {
	public static int generateId(Set<Integer> existingIds) {
        if(existingIds.isEmpty()) {
            return 0;
        }
        else {
            Integer integer = existingIds.stream().max((o1, o2) -> o1.compareTo(o2)).get();
            return integer+1;
        }
    }
}
