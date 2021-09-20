import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SomethingTest {

    @Test
    void a_failing_test() {
        assertThat(1).isEqualTo(2);
    }
}
