package net.calledtoconstruct.givenfake;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import net.calledtoconstruct.Either;
import net.calledtoconstruct.Right;
import net.calledtoconstruct.UnexpectedNeitherException;

class WhenInvokingMergeFailToRightTest {

    private final static Random RANDOM = new Random();
    private final static boolean RIGHT_VALUE = RANDOM.nextBoolean();
    private final static String OUTPUT = String.format("%d", RANDOM.nextLong());

    private final Either<Long, Integer> left = new FakeEither<>();
    private final Right<String, Boolean> right = new Right<>(RIGHT_VALUE); 

    private String functionMergeLeft(final String first, final Long second) {
        return new String();
    }

    private String functionMergeRight(final Boolean first, final Integer second) {
        return new String();
    }

    private String transformThis(final Boolean first) {
        return OUTPUT;
    }

    private String transformOther(final Integer first) {
        return new String();
    }
    
    @Test
    void thenFunctionMergeFailToRightThrowsUnexpectedNeitherException() {
        Assertions.assertThrows(UnexpectedNeitherException.class, () -> right.mergeFailToRight(
            left,
            this::functionMergeLeft,
            this::functionMergeRight,
            this::transformThis,
            this::transformOther
        ));
    }
    
}
