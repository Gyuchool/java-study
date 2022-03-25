package techcourse.fp.mission;

import java.util.List;

public class Calculator {

    public static int sumAll(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(number -> number)
                .sum();
    }

    public static int sumAllEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number)
                .sum();
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number >3)
                .mapToInt(number -> number)
                .sum();
        //TODO: List에 담긴 값 중 3보다 큰 수만을 더해야 한다.

    }
}
