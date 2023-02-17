package amlet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logger {

    private static final int zero = 0;

    public static void logIt() {
        try {
            int i = 1 / zero;
        } catch (Exception e) {
            log.error("что-то пошло не по плану {}", e.getMessage() );
        }
    }
}
