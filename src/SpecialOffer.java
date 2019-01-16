import java.util.Date;

class SpecialOffer {

    Product product;
    String offerDescription;
    Date startDate; //klasę Date i jej metody wziąłem stąd https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
    Date endDate;
    double offerDiscount;

    SpecialOffer (Product product, String offerDescription, Date startDate, Date endDate, double offerDiscount) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.offerDiscount = offerDiscount;
    }

    void printInfo(){
        System.out.printf("Promocja:\nProdukt: %s\nOpis oferty: %s\nCzas trwania: %s - %s\nRabat: %d procent\n", product.productName, offerDescription, startDate.toString(), endDate.toString(), (int)(offerDiscount*100));
    }

}