import org.example.SimpleCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {

    SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    @DisplayName("1 * 2 = 2")
    public void t1(){
        int rs = simpleCalculator.multiply(1,2);
        assertThat(rs).isEqualTo(2);
    }

    @Test
    @DisplayName("1 * 2 = 2")
    public void t1_f(){
        int rs = simpleCalculator.multiply(1,3);
        assertThat(rs).isEqualTo(2);
    }
    @Test
    @DisplayName("1 / 2 = -1")
    public void t2(){
        int rs = simpleCalculator.minus(1,2);
        assertThat(rs).isEqualTo(-1);
    }
    @Test
    @DisplayName("1 / 2 = -1")
    public void t2_f(){
        int rs = simpleCalculator.minus(1,3);
        assertThat(rs).isEqualTo(-1);
    }
    @Test
    @DisplayName("10 / 2 = 5")
    public void t3(){
        int rs = simpleCalculator.divide(10,2);
        assertThat(rs).isEqualTo(5);
    }
    @Test
    @DisplayName("10 / 2 = 5")
    public void t3_f(){
        int rs = simpleCalculator.divide(10,3);
        assertThat(rs).isEqualTo(5);
    }
    @Test
    @DisplayName("10 % 5 = 0")
    public void t4(){
        int rs = simpleCalculator.reminder(10,5);
        assertThat(rs).isEqualTo(0);
    }
    @Test
    @DisplayName("10 % 5 = 0")
    public void t4_f(){
        int rs = simpleCalculator.reminder(10,3);
        assertThat(rs).isEqualTo(0);
    }
}
