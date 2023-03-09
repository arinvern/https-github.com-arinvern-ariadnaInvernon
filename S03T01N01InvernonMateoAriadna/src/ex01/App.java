package ex01;

public class App {
    public static void main(String[] args) {
        Undo undo = Undo.getSingletonInstance();
        undo.afegirComanda("comanda1");
        undo.afegirComanda("comanda2");
        undo.llistarCommanda();
        undo.desferUltimaComanda();
        undo.llistarCommanda();
    }
}