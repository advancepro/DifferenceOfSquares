package sample;

public class DifferenceOfSquares {
    public int computeSquareOfSumTo(int i) {
        int sum = i * (i + 1) >> 1;
        return sum * sum;
    }

    public int computeSumOfSquaresTo(int i) {
        return i * (i + 1) * (2 * i + 1) / 6;
    }

    public int computeDifferenceOfSquares(int i) {
        return this.computeSquareOfSumTo(i) - this.computeSumOfSquaresTo(i);
    }
}
