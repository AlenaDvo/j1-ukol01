package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        nakresliPrasatko(100);
    }

    private void nakresliPrasatko(int strana) {
        nakresliObdelnik(strana);

        // predni nohy
        nakresliNohy(strana);

        // presun a zadni nohy
        zofka.turnRight(90);
        zofka.move(strana * 1.5);
        zofka.turnLeft(90);
        nakresliNohy(strana);

        // presun, hlava a oko
        zofka.turnLeft(90);
        zofka.move(strana * 1.5);
        nakresliHlavu(strana);
        zofka.turnRight(120);
        zofka.move(strana / 2);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(strana / 2);
        zofka.penDown();
        zofka.move(1);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(strana / 2);
        zofka.turnLeft(90);
        zofka.move(strana / 2);

        // ocas
        zofka.turnRight(90);
        zofka.move(strana * 1.5);
        zofka.turnRight(45);

        zofka.penDown();
        for (int i = 0; i < 10; i++) {
            zofka.move(10);
            zofka.turnLeft(180 / 10);
        }
        for (int i = 0; i < 10; i++) {
            zofka.move(7);
            zofka.turnLeft(180 / 10);
        }
        for (int i = 0; i < 10; i++) {
            zofka.move(3);
            zofka.turnLeft(180 / 10);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(strana / 2);
        zofka.turnLeft(45);
        zofka.move(strana);
        zofka.turnRight(180);
    }

    private void nakresliObdelnik(int strana) {
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(strana);
            zofka.turnRight(90);
            zofka.move(strana * 1.5);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    private void nakresliNohy(int strana) {
//        1. noha
        zofka.turnLeft(150);
        zofka.penDown();
        zofka.move(strana / 2);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(strana / 2);
        zofka.turnRight(150);

//        2. noha
        zofka.turnLeft(30);
        zofka.penDown();
        zofka.move(strana / 2);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(strana / 2);
        zofka.turnRight(30);
    }

    private void nakresliHlavu(int strana) {
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(strana);
        zofka.turnRight(120);
        zofka.move(strana);
        zofka.penUp();
    }
}
