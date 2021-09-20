import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ExoTrainTest {
    //`HPP` ---> `<HHHH::|OOOO|::|OOOO|`
    
    @Test
    void convert_to_ASCII_a_train_with_just_the_locomotive() {
        String asciiArt = new ExoTrain("H").toASCIIArt();
        assertThat(asciiArt).isEqualTo("<HHHH");
    }
    
    @Test
    void convert_to_ASCII_a_train_with_the_locomotive_and_two_passenger_cars() {
        String asciiArt = new ExoTrain("HPP").toASCIIArt();
        assertThat(asciiArt).isEqualTo("<HHHH::|OOOO|::|OOOO|");
    }
}
