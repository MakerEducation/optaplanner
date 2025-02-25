package org.optaplanner.constraint.streams.bavet.common;

import java.util.function.Function;

import org.optaplanner.core.api.score.stream.uni.UniConstraintStream;

/**
 * A tuple must not implement equals()/hashCode() to fact equality,
 * because some stream operations ({@link UniConstraintStream#map(Function)}, ...)
 * might create 2 different tuple instances to contain the same facts
 * and because a tuple's origin may replace a tuple's fact.
 */
public interface Tuple {

    BavetTupleState getState();

    void setState(BavetTupleState state);

    <Value_> Value_ getStore(int index);

    void setStore(int index, Object value);

}
