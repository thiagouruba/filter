
public class Products {

    private String brand;
    private float price;
    private int size;

    public Products(String brand, float price, int size){
        this.brand = brand;
        this.price = price;
        this.size = size;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
