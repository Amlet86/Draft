package amlet.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {

    public void doIt() {
        Set<String> set = new HashSet<>();
//        set.add("one");
//        set.add("two");
//        set.add("three");

        System.out.println(set.stream()
                .map(s -> String.valueOf(s))
                .collect(Collectors.toSet()));
    }
}
