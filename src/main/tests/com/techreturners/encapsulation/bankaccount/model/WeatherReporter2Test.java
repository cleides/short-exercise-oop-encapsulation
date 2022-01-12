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
}