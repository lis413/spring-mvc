package web.Model;

public class Car {
    private String model;
    private String series;
    private int age;

    public Car(String model, String series, int age) {
        this.model = model;
        this.series = series;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getAge() {
        return age;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String sreies) {
        this.series = sreies;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", sreies='" + series + '\'' +
                ", age=" + age +
                '}';
    }
}
