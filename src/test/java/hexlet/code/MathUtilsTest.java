package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MathUtilsTest {

    @Test
    public void testIsPrime() {
        assertThat(MathUtils.isPrime(2)).isTrue();
        assertThat(MathUtils.isPrime(3)).isTrue();
        assertThat(MathUtils.isPrime(19)).isTrue();
        assertThat(MathUtils.isPrime(233)).isTrue();

        assertThat(MathUtils.isPrime(9)).isFalse();
        assertThat(MathUtils.isPrime(1)).isFalse();
        assertThat(MathUtils.isPrime(6)).isFalse();
        assertThat(MathUtils.isPrime(453)).isFalse();
    }
}
