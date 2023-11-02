package ua.sviatik.formatters;

import ua.sviatik.entity.DividingType;
import ua.sviatik.formatters.impl.ClassicFormatter;

public final class FormatterFactory {
    public static Formatter getFormatter(String format) {

        if (format.equalsIgnoreCase(DividingType.CLASSIC.name())) {
            return new ClassicFormatter();
        }
        throw new IllegalArgumentException("Incorrect argument of type");
    }

    private FormatterFactory() {

    }
}
