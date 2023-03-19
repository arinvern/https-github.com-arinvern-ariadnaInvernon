package ex01;

public class App {
    public static void main(String[] args) {
        Borsa borsa = new Borsa();

        Agencia agencia1 = new Agencia("Agencia 1");
        Agencia agencia2 = new Agencia("Agencia 2");
        Agencia agencia3 = new Agencia("Agencia 3");

        borsa.addObserver(agencia1);
        borsa.addObserver(agencia2);
        borsa.addObserver(agencia3);

        borsa.setPreu(100.0);
        borsa.setPreu(105.0);
        borsa.setPreu(95.0);

        borsa.removeObserver(agencia3);

        borsa.setPreu(110.0);
    }
}