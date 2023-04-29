package chatgpt;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class CalculatorTest {

    @ParameterizedTest
    @MethodSource("additionParameters")
    public void coverageTest(int a, int b, int expecteSum) {


        Calculator calculator = new Calculator(a,b);
        int sum = calculator.coverageTest();
        assertEquals(expecteSum, sum);

    }
    private static Stream<Arguments> additionParameters() {
        return Stream.of(
                Arguments.of(-2, -2, -4)  ,
            Arguments.of(2, 3, 5),
           Arguments.of(-2, 2, 0)

        );
    }

}