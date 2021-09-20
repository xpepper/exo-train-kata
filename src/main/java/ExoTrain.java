import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class ExoTrain {
    private static final Map<String, String> CAR_ASCII_MAP = new HashMap<>() {{
        put("H", "<HHHH");
        put("P", "|OOOO|");
        put("R", "|hThT|");
    }};
    
    private final String trainAsString;

    public ExoTrain(String trainAsString) {
        this.trainAsString = trainAsString;
    }

    public String toASCIIArt() {
        String asciiArt = trainAsString.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(c -> toASCIICar(c))
                .collect(joining("::"));
        
        return asciiArt.replaceAll("::<HHHH", "::HHHH>");
    }

    private String toASCIICar(String carAsString) {
        return CAR_ASCII_MAP.get(carAsString);
    }

    public ExoTrain detachEnd() {
        return new ExoTrain(truncateLastCharFrom(trainAsString));
    }

    public ExoTrain detachHead() {
        return new ExoTrain(truncateFirstCharFrom(trainAsString));
    }

    private String truncateFirstCharFrom(String string) {
        return string.substring(1);
    }

    private String truncateLastCharFrom(String string) {
        return string.substring(0, string.length()-1);
    }
}
