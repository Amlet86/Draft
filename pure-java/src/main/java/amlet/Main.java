package amlet;

import amlet.string.DeleteLeadingZeros;

public class Main {

    public static void main(String[] args) {
        DeleteLeadingZeros stream = new DeleteLeadingZeros();
        stream.doIt("038");
    }
}
