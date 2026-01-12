package weatherstation.weathespullversion.displays;

import weatherstation.weathespullversion.DisplayElementPullVersion;
import weatherstation.weathespullversion.ObserverPullVersion;
import weatherstation.weathespullversion.subject.WeatherDataPullVersion;

public class CurrentConditionDisplay implements ObserverPullVersion, DisplayElementPullVersion {

    private float temperature;
    private float humidity;
    private final WeatherDataPullVersion weatherData;

    public CurrentConditionDisplay(WeatherDataPullVersion weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("[Pull Version] Current conditions: " + temperature
                           + "F degrees and " + humidity + "% humidity");
    }
}
