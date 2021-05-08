package depots;

//Generic depots. ALL common things things for depots are here
public abstract class Depot {

    //All de depots attributes for all depots.
    protected int id;
    protected String company;
    protected int nativeStock;
    protected int externalStock1;
    protected int externalStock2;
    protected int budget;
    protected int productPrice;
    protected int deliveryPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNativeStock() {
        return nativeStock;
    }

    public void setNativeStock(int nativeStock) {
        this.nativeStock = nativeStock;
    }

    public int getExternalStock1() {
        return externalStock1;
    }

    public void setExternalStock1(int externalStock1) {
        this.externalStock1 = externalStock1;
    }

    public int getExternalStock2() {
        return externalStock2;
    }

    public void setExternalStock2(int externalStock2) {
        this.externalStock2 = externalStock2;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public String toString() {
        return "Depot{" + "id=" + id + ", company='" + company + '\'' + '}';
    }
}
