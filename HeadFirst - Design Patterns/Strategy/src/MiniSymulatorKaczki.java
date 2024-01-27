public class MiniSymulatorKaczki {
    public static void main(String[] args) {

        Kaczka dzika = new KrzyzowkaKaczka();
        dzika.wykonajKwacz();
        dzika.wykonajLec();

        Kaczka modelowa = new ModelowaKaczka();
        modelowa.wykonajLec();
        modelowa.ustawLatanieInterfejs(new LatamZNapedemRakietowym());
        modelowa.wykonajLec();
    }
}