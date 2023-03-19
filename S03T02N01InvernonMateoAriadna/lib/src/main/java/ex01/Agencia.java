package ex01;

public class Agencia implements Observer {
    private String name;

    public Agencia(String name) {
        this.name = name;
    }

    public void update(double price) {
        System.out.println(name + " ha rebut una actualització de preus: " + price);
    }
}