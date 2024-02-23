package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        zofka.penUp();

        double strana = 50;

        // 5 domu
        posunSeNahoru(3 * strana);
        posunSeDoleva(8 * strana);
        nakresliPetDomu(strana);

        // dum, prase, dum
        posunSeDolu(4 * strana);
        posunSeDoleva(15 * strana);
        nakresliDum(strana);
        posunSeDoprava(5 * strana);
        nakresliPrasatko(strana);
        posunSeDoprava(5 * strana);
        nakresliDum(strana);

        // slunce
        posunSeDoleva(18 * strana);
        posunSeNahoru(6 * strana);
        nakresliSlunce(strana / 2.0);

        // podpis
        posunSeDolu(11 * strana);
        posunSeDoprava(8 * strana);
        nakresliALena(strana);
    }

    private void nakresliALena(double strana) {
        nakresliA(strana);
        nakresliL(strana);
        nakresliE(strana);
        nakresliN(strana);
        nakresliA(strana);
    }

    private void nakresliPetDomu(double strana) {
        for (int i = 0; i < 5; i++) {
            nakresliDum(strana);
            if (i != 4) {
                posunSeDoprava(3 * strana);
            }
        }
    }

    private void nakresliOsmiuhelnik(double strana) {
        zofka.turnLeft(90);
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(strana / 2.0);
            zofka.turnRight(360 / 8.0);
        }
        zofka.penUp();
        zofka.turnRight(90);
    }

    private void nakresliA(double strana) {
        double rameno = Math.sqrt(10 * Math.pow(strana, 2));
        double uhel = Math.toDegrees(Math.asin(strana / rameno));

        // 1. sikmy tah nahoru
        zofka.penDown();
        zofka.turnRight(uhel);
        zofka.move(rameno);
        zofka.turnRight(180 - 2 * uhel);

        // 2. sikmy tah dolu
        zofka.move(rameno);
        zofka.turnRight(90 + uhel);
        zofka.penUp();
        zofka.move(2 * strana);
        zofka.turnRight(90);
        zofka.move(2 * strana);
        zofka.turnRight(90);

        // pricka
        zofka.move(0.8 * strana);
        zofka.penDown();
        zofka.move(strana);

        // posun na dalsi pismeno
        zofka.penUp();
        zofka.move(0.8 * strana);
        zofka.turnRight(90);
        zofka.move(2 * strana);
        zofka.turnRight(180);
    }

    private void nakresliL(double strana) {
        // svisly tah
        zofka.penDown();
        zofka.move(3 * strana);
        zofka.turnRight(180);
        zofka.move(3 * strana);
        zofka.turnLeft(90);

        // vodorovny tah
        zofka.move(2 * strana);

        // posun na dalsi pismeno
        zofka.penUp();
        zofka.move(0.8 * strana);
        zofka.turnLeft(90);
    }

    private void nakresliE(double strana) {
        // svisly tah
        zofka.penDown();
        zofka.move(3 * strana);

        // horni pricka
        zofka.turnRight(90);
        zofka.move(2 * strana);
        zofka.turnLeft(180);
        zofka.move(2 * strana);
        zofka.turnLeft(90);
        zofka.move(strana);
        zofka.turnLeft(90);

        // prostredni pricka
        zofka.move(strana);
        zofka.turnLeft(180);
        zofka.move(strana);
        zofka.turnLeft(90);
        zofka.move(2 * strana);
        zofka.turnLeft(90);

        // dolni pricka
        zofka.move(2 * strana);

        // posun na dalsi pismeno
        zofka.penUp();
        zofka.move(0.8 * strana);
        zofka.turnLeft(90);
    }

    private void nakresliN(double strana) {
        double uhlopricka = Math.sqrt(13 * Math.pow(strana, 2));
        double uhel = Math.toDegrees(Math.asin(2 * strana / uhlopricka));

        // 1. svisly tah
        zofka.penDown();
        zofka.move(3 * strana);
        zofka.turnRight(180 - uhel);

        // sikmy tah
        zofka.move(uhlopricka);
        zofka.turnLeft(180 - uhel);

        // 2. svisly tah
        zofka.move(3 * strana);
        zofka.turnLeft(180);
        zofka.move(3 * strana);
        zofka.turnLeft(90);

        // posun na dalsi pismeno
        zofka.penUp();
        zofka.move(0.8 * strana);
        zofka.turnLeft(90);
    }


    private void nakresliDum(double strana) {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(strana);
            zofka.turnRight(90);
        }
        zofka.penUp();
        posunSeNahoru(strana);
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(strana);
        zofka.turnRight(120);
        zofka.move(strana);
        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(strana);
        zofka.turnRight(180);
    }

    private void nakresliKolo(double strana) {
        zofka.turnLeft(90);
        zofka.penDown();
        for (int i = 0; i <= 50; i++) {
            zofka.move(strana / 10.0);
            zofka.turnRight(360 / 50.0);
        }
        zofka.penUp();
        zofka.turnRight(360 / 50.0);
        zofka.turnRight(90);
    }

    private void nakresliSlunce(double strana) {
        zofka.turnLeft(90);
        zofka.penDown();
        for (int i = 0; i <= 50; i++) {
            zofka.move(strana / 10.0);
            if (i % 4 == 0) {
                zofka.turnLeft(90);
                zofka.move(20);
                zofka.turnLeft(180);
                zofka.move(20);
                zofka.turnLeft(90);
            }
            zofka.turnRight(360 / 50.0);
        }
        zofka.penUp();
        zofka.turnLeft(360 / 50.0);
        zofka.turnRight(90);
    }

    private void posunSeDoleva(double strana) {
        zofka.turnLeft(90);
        zofka.move(strana);
        zofka.turnRight(90);
    }

    private void posunSeDoprava(double strana) {
        zofka.turnRight(90);
        zofka.move(strana);
        zofka.turnLeft(90);
    }

    private void posunSeNahoru(double strana) {
        zofka.move(strana);
    }

    private void posunSeDolu(double strana) {
        zofka.turnLeft(180);
        zofka.move(strana);
        zofka.turnRight(180);
    }

    private void nakresliPrasatko(double strana) {
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
        zofka.move(strana / 2.0);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(strana / 2.0);
        zofka.penDown();
        zofka.move(1);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(strana / 2.0);
        zofka.turnLeft(90);
        zofka.move(strana / 2.0);

        // ocas
        zofka.turnRight(90);
        zofka.move(strana * 1.5);
        zofka.turnRight(45);

        zofka.penDown();
        for (int i = 0; i < 10; i++) {
            zofka.move(10);
            zofka.turnLeft(180 / 10.0);
        }
        for (int i = 0; i < 10; i++) {
            zofka.move(7);
            zofka.turnLeft(180 / 10.0);
        }
        for (int i = 0; i < 10; i++) {
            zofka.move(3);
            zofka.turnLeft(180 / 10.0);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(strana / 2.0);
        zofka.turnLeft(45);
        zofka.move(strana);
        zofka.turnRight(180);
    }

    private void nakresliObdelnik(double strana) {
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(strana);
            zofka.turnRight(90);
            zofka.move(strana * 1.5);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    private void nakresliNohy(double strana) {
//        1. noha
        zofka.turnLeft(150);
        zofka.penDown();
        zofka.move(strana / 2.0);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(strana / 2.0);
        zofka.turnRight(150);

//        2. noha
        zofka.turnLeft(30);
        zofka.penDown();
        zofka.move(strana / 2.0);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(strana / 2.0);
        zofka.turnRight(30);
    }

    private void nakresliHlavu(double strana) {
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(strana);
        zofka.turnRight(120);
        zofka.move(strana);
        zofka.penUp();
    }
}
