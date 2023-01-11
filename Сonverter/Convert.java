package Сonverter;



public class Convert {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("t=" + new CelsiusConverter().getConverterValue(temperature));
        System.out.println("t=" + new KelvinConverter().getConverterValue(temperature));
        System.out.println("t="+ new FahrenheitConverter().getConverterValue(temperature));
    }
}
