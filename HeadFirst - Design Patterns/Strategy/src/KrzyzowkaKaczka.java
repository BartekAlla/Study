public class KrzyzowkaKaczka extends Kaczka {
    public KrzyzowkaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }

    public void wyswietl() {
        System.out.println("Jestem kaczka krzyzowka.");
    }
}
