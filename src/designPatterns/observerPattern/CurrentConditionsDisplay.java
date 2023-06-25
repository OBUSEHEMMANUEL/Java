package designPatterns.observerPattern;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this::update);
    }

    public void update() {
     this.temperature = weatherData.getTemperature();
     this.humidity = weatherData.getHumidity();
        displayElement();
    }

    @Override
    public void displayElement() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}