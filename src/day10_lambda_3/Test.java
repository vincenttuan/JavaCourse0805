package day10_lambda_3;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Test {

    static void checkValues(Integer[] scores, Predicate<Integer> predicate) {
//        for(Integer score : scores) {
//            if(predicate.test(score)) {
//                System.out.println(score);
//            }
//        }

        IntStream.range(0, scores.length).forEach(i -> {
            if (predicate.test(scores[i])) {
                System.out.println(scores[i]);
            }
        });

    }

    public static void main(String[] args) {
        Integer[] scores = {100, 40, 50, 90};
        checkValues(scores, (score) -> score >= 60);
        checkValues(scores, (score) -> score >= 95);
        checkValues(scores, (score) -> score <= 60);
    }
}
