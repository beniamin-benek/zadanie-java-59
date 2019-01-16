class Product {

    String productName;
    double productPrice;
    String productDescription;
    Category productCategory;

    Product (String productName, double productPrice, String productDescription, Category productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    //konstrukor do tworzenia produktu bez kategorii
    Product (String productName, double productPrice, String productDescription) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    void printInfo() {
        if (productCategory == null){
            System.out.printf("Nazwa produktu: %s\nCena: %f zł\nOpis: %s\nKategoria: %s\nOpis kategorii: %s\n\n", productName, productPrice, productDescription, "brak", "brak");
        }
        else
            System.out.printf("Nazwa produktu: %s\nCena: %f zł\nOpis: %s\nKategoria: %s\nOpis kategorii: %s\n\n", productName, productPrice, productDescription, productCategory.categoryName, productCategory.categoryDescription);
    }

}