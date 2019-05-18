public class PovesteaBisericilorDinBucuresti{
    public static void main(String[] args)
    {
        Biserica bisericaSfIosif= new Biserica();
        bisericaSfIosif.nume= "Catedrala Romano Catolica Sf Iosif";
        bisericaSfIosif.capacitate=5000;
        bisericaSfIosif.latitudine=21.3;
        bisericaSfIosif.longitudine=45.3;
        bisericaSfIosif.rating=5;
        bisericaSfIosif.tipReligie="Catolica";
        bisericaSfIosif.program="9.00 - 20.30";
        bisericaSfIosif.buget=500000;

        Biserica catedralaMN=new Biserica();
        catedralaMN.nume="Catedrala Mantuirii Neamului";
        catedralaMN.capacitate=20000;
        catedralaMN.latitudine=30.2;
        catedralaMN.longitudine=25.9;
        catedralaMN.rating=1;
        catedralaMN.tipReligie="Crestin Ortodox";
        catedralaMN.program="6.00 - 22.00";
        catedralaMN.buget=20000000;

        bisericaSfIosif.faSlujba();
        bisericaSfIosif.primesteOameni(5000);
        catedralaMN.faSlujba();
        catedralaMN.primesteOameni(19900);
        catedralaMN.primesteOameni(110);


    }
}