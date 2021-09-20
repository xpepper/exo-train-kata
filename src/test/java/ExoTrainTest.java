import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ExoTrainTest {
    //`HPP` ---> `<HHHH::|OOOO|::|OOOO|`
    // `HPRP` ---> `<HHHH::|OOOO|::|hThT|::|OOOO|`
    
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
    
    @Test
    void convert_to_ASCII_a_train_with_a_restaurant_car() {
        String asciiArt = new ExoTrain("HPRP").toASCIIArt();
        assertThat(asciiArt).isEqualTo("<HHHH::|OOOO|::|hThT|::|OOOO|");
    }
    
    @Test
    void convert_to_ASCII_a_train_with_a_locomotive_attached_at_the_end() {
        String asciiArt = new ExoTrain("HPRPH").toASCIIArt();
        assertThat(asciiArt).isEqualTo("<HHHH::|OOOO|::|hThT|::|OOOO|::HHHH>");
    }

    @Test
    void a_car_can_be_deatached_from_the_end_of_the_train() {
        String asciiArt = new ExoTrain("HPRPH").detachEnd().toASCIIArt();
        assertThat(asciiArt).isEqualTo("<HHHH::|OOOO|::|hThT|::|OOOO|");
    }

    @Test
    void a_car_can_be_deatached_from_the_head_of_the_train() {
        String asciiArt = new ExoTrain("HPRPH").detachHead().toASCIIArt();
        assertThat(asciiArt).isEqualTo("|OOOO|::|hThT|::|OOOO|::HHHH>");
    }
}
