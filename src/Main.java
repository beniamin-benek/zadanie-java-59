import java.time.LocalDate;
import java.util.Date;

class Main {

    public static void main(String[] args) {

        //dwa produkty przypisane do tej samej kategorii
        Category category1 = new Category("Produkty spożywcze", "Możesz je zjeść lub wypić!");
        Product product1 = new Product( "Mleko", 3.5, "Mleko wprost od krowy.", category1);
        Product product2 = new Product("Chleb", 1.99, "Czarny chleb.", category1);

        //produkt innej kategorii
        Category category2 = new Category("Przybory szkolne", "Rzeczy przydatne w szkole!");
        Product product3 = new Product("Zeszyt", 3, "Zeszyt w kratkę.", category2);

        //produkt bez kategorii
        Product product4 = new Product("Woda", 2, "Woda mineralna gazowana.");

        //oferta specjalna
        //Date startDate1 = new Date(2019, 1, 14);
        //Date endDate1 = new Date(2019,1,21);

        LocalDate startDate = LocalDate.of(2019,1,14);
        LocalDate endDate = LocalDate.of(2019,1,21);

        SpecialOffer specialOffer1 = new SpecialOffer(product4, "Promocja na wodę.", startDate, endDate, 0.2);

        product1.printInfo();
        product2.printInfo();
        product3.printInfo();
        product4.printInfo();
        specialOffer1.printInfo();

    }

}