package net.calledtoconstruct.givenfake;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import net.calledtoconstruct.Either;

class FakeEither<TLeft, TRight> implements Either<TLeft, TRight> {

    @Override
    public <TOther> Either<TOther, TRight> onLeftApply(Function<TLeft, TOther> function) {
        throw new UnsupportedOperationException("Unimplemented method 'onLeftApply'");
    }

    @Override
    public Either<TLeft, TRight> onLeftAccept(Consumer<TLeft> consumer) {
        throw new UnsupportedOperationException("Unimplemented method 'onLeftAccept'");
    }

    @Override
    public <TOther> Either<TOther, TRight> onLeftSupply(Supplier<TOther> supplier) {
        throw new UnsupportedOperationException("Unimplemented method 'onLeftSupply'");
    }

    @Override
    public <TLeftOut> Either<TLeftOut, TRight> onLeftFlatMap(
        Function<TLeft, Optional<TLeftOut>> function,
        Function<TLeft, TLeftOut> otherwise
    ) {
        throw new UnsupportedOperationException("Unimplemented method 'onLeftFlatMap'");
    }

    @Override
    public <TOther> Either<TLeft, TOther> onRightApply(Function<TRight, TOther> function) {
        throw new UnsupportedOperationException("Unimplemented method 'onRightApply'");
    }

    @Override
    public Either<TLeft, TRight> onRightAccept(Consumer<TRight> consumer) {
        throw new UnsupportedOperationException("Unimplemented method 'onRightAccept'");
    }

    @Override
    public <TOther> Either<TLeft, TOther> onRightSupply(Supplier<TOther> supplier) {
        throw new UnsupportedOperationException("Unimplemented method 'onRightSupply'");
    }

    @Override
    public <TRightOut> Either<TLeft, TRightOut> onRightFlatMap(
        Function<TRight, Optional<TRightOut>> function,
        Function<TRight, TRightOut> otherwise
    ) {
        throw new UnsupportedOperationException("Unimplemented method 'onRightFlatMap'");
    }

    @Override
    public <TOtherLeft, TOtherRight, TLeftOut, TRightOut> Either<TLeftOut, TRightOut> mergeFailToLeft(
        Either<TOtherLeft, TOtherRight> other,
        BiFunction<TLeft, TOtherLeft, TLeftOut> functionMergeLeft,
        BiFunction<TRight, TOtherRight, TRightOut> functionMergeRight,
        Function<TLeft, TLeftOut> transformThis,
        Function<TOtherLeft, TLeftOut> transformOther
    ) {
        throw new UnsupportedOperationException("Unimplemented method 'mergeFailToLeft'");
    }

    @Override
    public <TOtherLeft, TOtherRight, TLeftOut, TRightOut> Either<TLeftOut, TRightOut> mergeFailToRight(
        Either<TOtherLeft, TOtherRight> other,
        BiFunction<TLeft, TOtherLeft, TLeftOut> functionMergeLeft,
        BiFunction<TRight, TOtherRight, TRightOut> functionMergeRight,
        Function<TRight, TRightOut> transformThis,
        Function<TOtherRight, TRightOut> transformOther
    ) {
        throw new UnsupportedOperationException("Unimplemented method 'mergeFailToRight'");
    }

    @Override
    public Either<TRight, TLeft> flip() {
        throw new UnsupportedOperationException("Unimplemented method 'flip'");
    }

}