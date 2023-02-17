package amlet.jsonserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

public class Serializer {

    public void serialize() {
        TestDto testDto = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            testDto = objectMapper
                    .readValue("{\"value1\":\"1\", \"value2\":\"2\", \"value3\":\"3\"}",
                            TestDto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (Objects.nonNull(testDto)) {
            System.out.println(testDto);
        }
    }
}
