package weatherstation.weathespullversion.displays;

import weatherstation.weathespullversion.DisplayElementPullVersion;
import weatherstation.weathespullversion.ObserverPullVersion;
import weatherstation.weathespullversion.subject.WeatherDataPullVersion;

public class ForecastDisplay implements ObserverPullVersion, DisplayElementPullVersion {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private final WeatherDataPullVersion weatherDataPullVersion;

    public ForecastDisplay(WeatherDataPullVersion weatherDataPullVersion) {
        this.weatherDataPullVersion = weatherDataPullVersion;
        weatherDataPullVersion.registerObserver(this);
    }

    @Override
    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherDataPullVersion.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.print("[Pull Version] Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
