public abstract class Kaczka {
    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;
    public Kaczka() {}

    public abstract void wyswietl();

    public void wykonajLec() {
        latanieInterfejs.lec();
    }

    public void wykonajKwacz(){
        kwakanieInterfejs.kwacz();
    }

    public void plyn(){
        System.out.println("wszystkie kaczki plywaja, nawet te sztuczne.");
    }
    public void ustawLatanieInterfejs(LatanieInterfejs li) {
        latanieInterfejs = li;
    }
    public void ustawKwakanieInterfejs(KwakanieInterfejs ki) {
        kwakanieInterfejs = ki;
    }
}
