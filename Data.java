import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Products> dbProducts = new ArrayList<Products>();

    public void addProducts(String brand, float price, int size){
        Products products = new Products(brand, price, size);
        dbProducts.add(products);
    }

    public void productList(){
        for (int i = 0; i < dbProducts.size(); i++){
            System.out.println("ID: " + (i+1) + " Brand: " + dbProducts.get(i).getBrand() +
                    " Price: $" + dbProducts.get(i).getPrice() + " Size: " +dbProducts.get(i).getSize());
        }
    }

    public void filter(String contain){
        boolean thereIs = false;
        for (int i = 0; i < dbProducts.size(); i++){
            if (dbProducts.get(i).getBrand().toLowerCase().contains(contain.toLowerCase())){
                thereIs = true;
                System.out.println("ID: " + (i+1) + " Brand: " + dbProducts.get(i).getBrand() +
                        " Price: $" + dbProducts.get(i).getPrice() + " Size: " +dbProducts.get(i).getSize());
            }
        }
        if (thereIs == false){
            System.out.println("Nenhum registro encontrado!!!");
        }
    }
}
