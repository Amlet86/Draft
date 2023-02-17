package amlet.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SomethingToString {

    public void writeMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, null);
        map.put(4, "four");

        System.out.println(map.keySet().stream()
                .map(key -> key + " = " + map.get(key))
                .collect(Collectors.joining(", ", "{", "}")));
    }

    public void writeSet() {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        System.out.println(set);
    }
}
