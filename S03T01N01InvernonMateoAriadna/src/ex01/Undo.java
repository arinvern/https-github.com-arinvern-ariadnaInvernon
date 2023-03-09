package ex01;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance = null;
    private List<String> history;

    private Undo() {
        history = new ArrayList<>();
    }

    public static Undo getSingletonInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void afegirComanda(String comanda) {
        history.add(comanda);
    }

    public void desferUltimaComanda() {
        if (history.size() > 0) {
            history.remove(history.size() - 1);
        }
    }

    public void llistarCommanda() {
        for (String command : history) {
            System.out.println(command);
        }
    }
}