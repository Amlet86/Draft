package amlet.benchmark;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class FormatOrConcatenate {

    public List<String> formatIt() {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            list.add(format("string=%s;", i));
        }
        return list;
    }

    public List<String> concatenateIt() {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            list.add("string=" + i + ";");
        }
        return list;
    }
}
