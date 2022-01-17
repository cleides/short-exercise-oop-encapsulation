package com.techreturners.encapsulation.bankaccount.model;

import static org.junit.jupiter.api.Assertions.*;

class WeatherReporter2Test {

    @org.junit.jupiter.api.Test
    void testGetWeatherInfo() {
        //arrange
        WeatherReporter2 sut = new WeatherReporter2("London", 30);
        String expectedResult = "I am in London and it is \uD83C\uDF26. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 86.";
        //action
        String actualResult = sut.getWeatherInfo();
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testGetTemperatureMessage01() {
        //arrange
        WeatherReporter2 sut = new WeatherReporter2("London", 35);
        String expectedResult = "It's too hot 🥵!";
        //action
        String actualResult = sut.getTemperatureMessage();
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void testGetTemperatureMessage02() {
        //arrange
        WeatherReporter2 sut = new WeatherReporter2("London", 3);
        String expectedResult = "It's too cold 🥶!";
        //action
        String actualResult = sut.getTemperatureMessage();
        //assert
        assertEquals(expectedResult, actualResult);
    }
}