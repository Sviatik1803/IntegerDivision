package ua.sviatik;


import ua.sviatik.calculator.Calculator;
import ua.sviatik.entity.Result;
import ua.sviatik.formatters.Formatter;
import ua.sviatik.formatters.FormatterFactory;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("\nUsage: division [dividend] [divisor] [type]\n");
            System.exit(1);
        }

        try {
            Calculator calculator = new Calculator();
            Result result = calculator.divide(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            Formatter classicFormatter = FormatterFactory.getFormatter(args[2]);
            String classicOutput = classicFormatter.format(result);
            System.out.println(classicOutput);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }
}