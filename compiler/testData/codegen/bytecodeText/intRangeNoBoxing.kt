// NB shadows kotlin.ranges.unfil, which is intrinsified in 'for'.
infix fun Int.until(other: Int) = this..other - 1

fun foo() {
    for (i in 1 until 2) {
    }

    for (i in 1..2 step 4) {}
}

// 1 INVOKEVIRTUAL kotlin/ranges/IntRange.getFirst \(\)I
// 0 INVOKEVIRTUAL kotlin/ranges/IntRange.getFirst \(\)Ljava/lang/Integer;
// 1 INVOKEVIRTUAL kotlin/ranges/IntRange.getLast \(\)I
// 0 INVOKEVIRTUAL kotlin/ranges/IntRange.getLast \(\)Ljava/lang/Integer;

// 1 INVOKEVIRTUAL kotlin/ranges/IntProgression.getFirst \(\)I
// 0 INVOKEVIRTUAL kotlin/ranges/IntProgression.getFirst \(\)Ljava/lang/Integer;
// 1 INVOKEVIRTUAL kotlin/ranges/IntProgression.getLast \(\)I
// 0 INVOKEVIRTUAL kotlin/ranges/IntProgression.getLast \(\)Ljava/lang/Integer;