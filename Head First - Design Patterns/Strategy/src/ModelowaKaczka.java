public class ModelowaKaczka extends Kaczka{
    public ModelowaKaczka() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new Kwacz();
    }
    public void wyswietl() {
        System.out.println("Jestem modelowa kaczka!");
    }
}
