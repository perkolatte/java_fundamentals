package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class CustomExceptionExample {

    public static void main(String[] args) {

        Printer printer1 = new Printer(1);

        try {

            while (true) {
                System.out.println(printer1.trays[0].sheetsRemaining + " sheet(s) remaining");
                printer1.printFrom(1);
            }

        } catch (OutOfPaperException e) {

            System.out.println(e.toString());

        }

    }

}

class OutOfPaperException extends Exception {

    @Override
    public String toString() {
        return "OutOfPaperException { That tray is out of paper. }";
    }

}

class Printer {

    PaperTray[] trays;

    public Printer(int NumPaperTrays) {
        trays = new PaperTray[NumPaperTrays];
        for (int i = 0; i < NumPaperTrays; i++) {
            trays[i] = (new PaperTray(PaperTray.SHEETCAPACITY));
        }
    }

    public void printFrom(int trayNum) throws OutOfPaperException {
        this.trays[trayNum - 1].takeSheet();
    }

}

class PaperTray {

    public int sheetsRemaining;
    public static int SHEETCAPACITY = 100;

    public PaperTray(int sheetsRemaining) {
        this.sheetsRemaining = sheetsRemaining;
    }

    public void takeSheet() throws OutOfPaperException {
        if (this.sheetsRemaining >= 1) {
            this.sheetsRemaining--;
        } else {
            throw new OutOfPaperException();
        }
    }
}

