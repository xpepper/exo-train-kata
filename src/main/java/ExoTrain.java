import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ExoTrain {
    private final String trainAsString;

    public ExoTrain(String trainAsString) {
        this.trainAsString = trainAsString;
    }

    public String toASCIIArt() {
        return trainAsString.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(c -> toCar(c))
                .collect(joining("::"));
                
    }

    private String toCar(String c) {
        if (c.equals("H")) return "<HHHH";
        return "|OOOO|";
    }
}
