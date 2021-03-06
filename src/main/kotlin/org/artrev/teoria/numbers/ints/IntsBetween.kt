package org.artrev.teoria.numbers.ints

import org.junit.experimental.theories.ParametersSuppliedBy

/**
 * Annotating a [Theory] method int parameter with &#064;IntsBetween causes it to be
 * supplied with values between the specified int values given when run as
 * a theory by the [Theories] runner.
 *
 * For example, the below method would be called for all the values between the
 * specified first and last value by the Theories runner, once with each of the
 * generated int values larger then the specified.
 *
 * ```
 * @Theory
 * fun shouldPassForSomeInts(@IntsBetween(first = 1, last = 3) param: Int) {
 *     ...
 * }
 * ```
 */
@Retention(AnnotationRetention.RUNTIME)
@ParametersSuppliedBy(IntsBetweenSupplier::class)
annotation class IntsBetween(
        val first: Int,
        val last: Int
)
