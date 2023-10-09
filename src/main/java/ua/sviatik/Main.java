package ua.sviatik;


import ua.sviatik.calculator.Calculator;
import ua.sviatik.formatters.ClassicFormatter;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Result result = calculator.divide(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
//        Result result = calculator.divide(630440,610);
//        Result result = calculator.divide(12341235,1234);

        ClassicFormatter classicFormatter = new ClassicFormatter();
        String classicFormatterString = classicFormatter.format(result);
        System.out.println(classicFormatterString);

        //args
        //interface
        //factory
        //enum




        System.out.println(result.toString());
        System.out.println("_78454|4");
        System.out.println(" 4    |-----");
        System.out.println(" -    |19613");
        System.out.println("_38");
        System.out.println(" 36");
        System.out.println(" --");
        System.out.println(" _24");
        System.out.println("  24");
        System.out.println("  --");
        System.out.println("   _5");
        System.out.println("    4");
        System.out.println("    -");
        System.out.println("   _14");
        System.out.println("    12");
        System.out.println("    --");
        System.out.println("     2");

    }
}