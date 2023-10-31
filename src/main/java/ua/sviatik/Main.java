package ua.sviatik;


import ua.sviatik.calculator.Calculator;
import ua.sviatik.entity.Result;
import ua.sviatik.formatters.Formatter;
import ua.sviatik.formatters.FormatterFactory;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Result result = calculator.divide(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        Formatter classicFormatter = FormatterFactory.getFormatter(args[2]);
        String classicOutput = classicFormatter.format(result);
        System.out.println(classicOutput);
    }
}