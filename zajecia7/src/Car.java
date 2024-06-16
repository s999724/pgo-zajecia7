public class Car implements Comparable<Car>{
    private String carName;
    private int yearMade;
    public Car(String carName, int yearMade) {
        this.carName = carName;
        this.yearMade = yearMade;
    }
    public String getCarName() {
        return carName;
    }
    public int getYearMade() {
        return yearMade;
    }
    @Override
    public int compareTo(Car car) {
        return this.yearMade - car.yearMade;
    }
}
