import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ExoTrainTest {
    //`HPP` ---> `<HHHH::|OOOO|::|OOOO|`
    
    @Test
    void a_train_with_just_the_locomotive() {
        String asciiArt = new ExoTrain("H").toASCIIArt();
        assertThat(asciiArt).isEqualTo("<HHHH");
    }
}
