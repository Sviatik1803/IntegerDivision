package ua.sviatik.entity;

public class Step {
    private final int firstNumber;
    private final int secondNumber;
    private final int remainder;

    public Step(int firstNumber, int secondNumber, int remainder) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.remainder = remainder;
    }


    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getRemainder() {
        return remainder;
    }

    @Override
    public String toString() {
        return "Step{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", remainder=" + remainder +
                '}';
    }
}
