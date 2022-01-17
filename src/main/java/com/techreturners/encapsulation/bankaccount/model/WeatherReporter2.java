package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter2 {

    private String location;
    private double temperatureInCelsius;
    private double temperatureInFahrenheit;

    public WeatherReporter2(String location, double temperatureInCelsius) {
        this.location = location;
        this.temperatureInCelsius = temperatureInCelsius;
        this.temperatureInFahrenheit = celsiusToFahr(temperatureInCelsius);
    }

    public String getWeatherInfo() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location, getWeatherSymbol(location), getTemperatureMessage(), temperatureInFahrenheit);
    }

    private double celsiusToFahr(double temperatureInCelsius) {
        final double CONVERSION_MULTIPLIER = 9.0/5.0;
        final double CONVERSION_TO_C = 32;
        return CONVERSION_MULTIPLIER * temperatureInCelsius + CONVERSION_TO_C;
    }

    public String getWeatherSymbol(String location) {
        if (location == "London") {
            return "🌦";

        } else if (location == "California") {
            return "🌅";

        } else if (location == "Cape Town") {
            return "🌤";
        }
        return "🔆";
    }

    public String getTemperatureMessage() {

        if (this.temperatureInCelsius > 30) {
            return "It's too hot 🥵!";

        } else if (this.temperatureInCelsius < 10) {
            return "It's too cold 🥶!";
        }
        return "Ahhh...it's just right 😊!";
    }
}
