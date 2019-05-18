public class Biserica{
    String nume;
    double latitudine;
    double longitudine;
    String tipReligie;
    String program;
    int buget;
    int rating;
    int capacitate;
    int oameniPrezenti;
    public void faSlujba()
    {
        System.out.println("Bine ati venit la slujba de la biserica " + nume);
    }
    public int primesteOameni(int nrOameni)
    {
        if(capacitate == oameniPrezenti)
        {
            System.out.println("NU MAI AVEM LOCURI");
            return 0;
        }
        int locuriInBiserica=capacitate - oameniPrezenti;
        if(nrOameni>locuriInBiserica)
        {
            System.out.println("Din pacate au putut intra in biserica doar " + locuriInBiserica+ " oameni");
            this.oameniPrezenti=capacitate;
            int ramasiPeAfara=nrOameni - locuriInBiserica;
            System.out.println("Au ramas pe afara " + ramasiPeAfara);
            return locuriInBiserica;
        }
        this.oameniPrezenti+=nrOameni;
        System.out.println("Am primit " +nrOameni+ " oameni credinciosi");
        return nrOameni;
    }
}
