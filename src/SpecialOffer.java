import java.time.LocalDate;
import java.util.Date;

class SpecialOffer {

    Product product;
    String offerDescription;
    //Date startDate;
    //Date endDate;
    LocalDate startDate;
    LocalDate endDate;
    double offerDiscount;

    SpecialOffer (Product product, String offerDescription, LocalDate startDate, LocalDate endDate, double offerDiscount) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.offerDiscount = offerDiscount;
    }

    void printInfo(){
        System.out.printf("Promocja:\nProdukt: %s\nOpis oferty: %s\nCzas trwania: od %s do %s\nRabat: %d procent\n", product.productName, offerDescription, startDate.toString(), endDate.toString(), (int)(offerDiscount*100));
    }

}