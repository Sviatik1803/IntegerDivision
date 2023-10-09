package ua.sviatik;

import ua.sviatik.calculator.Step;

import java.util.Collections;
import java.util.List;

public class Result {
    private final int dividend;
    private final int divisor;
    private final int quotient;
    private final int remainder;

    private final List<Step> steps;

    public Result(int dividend, int divisor, int quotient, int remainder, List<Step> steps) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.quotient = quotient;
        this.remainder = remainder;
        this.steps = Collections.unmodifiableList(steps);
    }

    public List<Step> getSteps() {
        return steps;
    }

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public int getQuotient() {
        return quotient;
    }

    public int getRemainder() {
        return remainder;
    }

    @Override
    public String toString() {
        return "Result{" +
                "dividend=" + dividend +
                ", divisor=" + divisor +
                ", quotient=" + quotient +
                ", remainder=" + remainder +
                ", steps=" + steps +
                '}';
    }
}
