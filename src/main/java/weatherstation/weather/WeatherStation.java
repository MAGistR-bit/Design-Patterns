package weatherstation.weather;

import weatherstation.weather.observers.CurrentConditionsDisplay;
import weatherstation.weather.observers.ForecastDisplay;
import weatherstation.weather.observers.StatisticsDisplay;
import weatherstation.weather.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(62, 90, 29.2f);
    }
}
