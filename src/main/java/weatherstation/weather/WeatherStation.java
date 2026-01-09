package weatherstation.weather;

import weatherstation.weather.displays.ForecastDisplay;
import weatherstation.weather.displays.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        System.out.println("Hello World!");
    }
}
