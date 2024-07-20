package net.calledtoconstruct.givenfake;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import net.calledtoconstruct.Either;
import net.calledtoconstruct.UnexpectedNeitherException;

class WhenInvokingCoalesceTest {

    private final Either<Integer, Integer> systemUnderTest = new FakeEither<Integer, Integer>();

    @Test
    void thenFunctionCoalesceThrowsUnexpectedNeitherException() {
        Assertions.assertThrows(UnexpectedNeitherException.class, () -> Either.coalesce(systemUnderTest));
    }
}
