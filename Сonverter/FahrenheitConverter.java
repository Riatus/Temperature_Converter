package Сonverter;


public class FahrenheitConverter implements Converter {

    @Override
    public double getConverterValue(double baseValue) {
        return 1.8 + baseValue+32;
    }
}
