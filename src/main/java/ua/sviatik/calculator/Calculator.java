package ua.sviatik.calculator;

import ua.sviatik.Result;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public Result divide(int dividend, int divisor) {
        //78454 / 4
        List<Step> steps = new ArrayList<>();
        int tempNumber = dividend;
        for (int i = Integer.toString(tempNumber).length() - 1; i >= 0; i--) {
            double number = Math.pow(10, i);
            if (tempNumber / number >= divisor) {
                int firstNumber = (int)(tempNumber/number);
                int secondNumber = ((int)(tempNumber / number) / divisor) * divisor;
                steps.add(new Step(firstNumber,secondNumber));
                tempNumber = tempNumber - (int)(secondNumber * number);
            }

        }

        return new Result(dividend, divisor, dividend / divisor, dividend % divisor, steps);
    }
}
