package weatherstation.weathespullversion;

import weatherstation.weathespullversion.displays.CurrentConditionDisplay;
import weatherstation.weathespullversion.displays.ForecastDisplay;
import weatherstation.weathespullversion.subject.WeatherDataPullVersion;

public class WeatherStationPullVersion {

    public static void main(String[] args) {
        WeatherDataPullVersion weatherDataPullVersion = new WeatherDataPullVersion();

        ObserverPullVersion currentConditionDisplay = new CurrentConditionDisplay(weatherDataPullVersion);
        ObserverPullVersion forecastDisplay = new ForecastDisplay(weatherDataPullVersion);

        weatherDataPullVersion.setMeasurements(12, 96, 29.4f);
        weatherDataPullVersion.setMeasurements(22, 80, 15.4f);

        weatherDataPullVersion.removeObserver(forecastDisplay);

        weatherDataPullVersion.setMeasurements(80, 65, 30.4f);
    }
}
