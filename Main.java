public class Main {

    public static void main(String[] args){
        
        //just testing
        Data data = new Data();
        data.addProducts("Nike", 455.99f, 40);
        data.addProducts("Adidas", 699.99f, 39);
        data.addProducts("Puma", 899.99f, 41);
        data.addProducts("Nike", 955.99f, 43);
        data.addProducts("Adidas", 299.99f, 39);
        data.addProducts("Puma", 399.99f, 37);
        data.productList();
        System.out.println("");
        data.filter("NIK");

    }

}
