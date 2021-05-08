package depots;

public class DepotA extends Depot {

    //Constructor
    public DepotA(int id, String company, int nativeStock, int externalStock1, int externalStock2, int budget, int productPrice, int deliveryPrice){
        this.id = id;
        this.company = company;
        this.nativeStock = nativeStock;
        this.externalStock1 = externalStock1;
        this.externalStock2 = externalStock2;
        this.budget = budget;
        this.productPrice = productPrice;
        this.deliveryPrice = deliveryPrice;

    }

    //Specific implementation for Depot COMPANY A
    @Override
    public String toString() {
        return "Depot " + id + " from Company A {" +
                 " NativeStock = " + nativeStock +
                ", externalStock1 = " + externalStock1 +
                ", externalStock2 = " + externalStock2 +
                ", budget = " + budget +
                ", productPrice = " + productPrice +
                ", deliveryPrice = " + deliveryPrice +
                '}';
    }

}
