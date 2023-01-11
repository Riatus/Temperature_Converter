package Сonverter;

public class KelvinConverter implements Converter {

    @Override
    public double getConverterValue(double baseValue) {
        return baseValue + 273.15;
    }
}
