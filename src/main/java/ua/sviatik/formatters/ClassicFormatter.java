package ua.sviatik.formatters;


import ua.sviatik.Result;
import ua.sviatik.calculator.Step;

public class ClassicFormatter implements Formatter {
    public String format(Result result) {
        int dividendLength = Integer.toString(result.getDividend()).length();
        StringBuilder stringBuilder = new StringBuilder();
        Step firstStep = result.getSteps().get(0);

        int spacesAmount = 0;
        for (int i = 0; i < result.getSteps().size(); i++) {
            final int firstNumber = result.getSteps().get(i).getFirstNumber();
            final int secondNumber = result.getSteps().get(i).getSecondNumber();
            if (i == 0) {
                writeFirstStep(result, dividendLength, stringBuilder, firstStep);
            } else {
                writeStep(stringBuilder, spacesAmount, firstNumber, secondNumber);
            }

            if (firstNumber == secondNumber) {
                spacesAmount += Integer.toString(firstNumber).length() - 1;
            }


            spacesAmount++;
            if (i == result.getSteps().size() - 1) {
                stringBuilder.append(getSpaces(dividendLength)).append(result.getRemainder());
            }
        }


        return stringBuilder.toString();
    }

    private static void writeFirstStep(Result result, int dividendLength, StringBuilder stringBuilder, Step firstStep) {
        int dividend = result.getDividend();
        int divisor = result.getDivisor();
        stringBuilder.append(String.format("_%s|%s%n", dividend, result.getDivisor()));
        stringBuilder.append(String.format("_%s%s|%s%n", firstStep.getSecondNumber(),
                " ".repeat(dividendLength - String.valueOf(divisor).length()), getDashes(result.getQuotient())));
        stringBuilder.append(String.format(" %s%s|%s%n", getDashes(firstStep.getSecondNumber()), " ".repeat(dividendLength - String.valueOf(firstStep.getSecondNumber()).length()), result.getQuotient()));
    }

    private static void writeStep(StringBuilder stringBuilder, int spacesAmount, int firstNumber, int secondNumber) {
        stringBuilder.append(String.format("%s_%s%n", getSpaces(spacesAmount), firstNumber));
        stringBuilder.append(String.format("%s%s%n", getSpaces(spacesAmount + 1), secondNumber));
        stringBuilder.append(String.format("%s%s%n", getSpaces(spacesAmount + 1), getDashes(secondNumber)));
    }

    private static String getDashes(int number) {
        return "-".repeat(Integer.toString(number).length());
    }

    private static String getSpaces(int i) {
        return " ".repeat(i);
    }
}
