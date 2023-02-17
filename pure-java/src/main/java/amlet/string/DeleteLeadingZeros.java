package amlet.string;

public class DeleteLeadingZeros {

    public void doIt(String tbank) {
        String result = tbank.replaceFirst("^0+(?!$)", "");
        System.out.println(result);
    }
}
