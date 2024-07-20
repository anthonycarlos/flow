package net.calledtoconstruct.givenfake;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import net.calledtoconstruct.Either;
import net.calledtoconstruct.Left;
import net.calledtoconstruct.UnexpectedNeitherException;

class WhenInvokingLeftMergeFailToLeftTest {

    private final static Random RANDOM = new Random();
    private final static long INPUT = RANDOM.nextLong();

    private final static String OUTPUT = String.format("%d", RANDOM.nextLong());

    private final Either<Long, Integer> left = new Left<>(INPUT);
    private final Either<Boolean, String> other = new FakeEither<>();

    private String functionMergeLeft(final Long first, final Boolean second) {
        return OUTPUT;
    }

    private String functionMergeRight(final Integer first, final String second) {
        return new String();
    }

    private String transformThis(final Long first) {
        return new String();
    }

    private String transformOther(final Boolean first) {
        return new String();
    }

    @Test
    void thenFunctionMergeLeftThrowsUnexpectedNeitherException() {
        Assertions.assertThrows(UnexpectedNeitherException.class, () -> left.mergeFailToLeft(
            other,
            this::functionMergeLeft,
            this::functionMergeRight,
            this::transformThis,
            this::transformOther
        ));
    }

}
