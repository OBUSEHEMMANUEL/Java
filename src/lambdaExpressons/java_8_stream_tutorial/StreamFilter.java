package lambdaExpressons.java_8_stream_tutorial;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<Product>();
        for (Product product: getProducts()){
            list.add(product);
        }
        for (Product product : list){
            System.out.println(product);
        }
        System.out.println("###################################################");

        var streamProduct = getProducts().stream().filter((product) -> product.getPrice() > 2500f).collect(Collectors.toList());
streamProduct.forEach(System.out::println);
    }

    private static List<Product> getProducts(){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Hp Laptop",2500f));
        productList.add(new Product(2,"Dell Laptop",3000f));
        productList.add(new Product(3,"Lenovo",28000f));
        productList.add(new Product(4,"Song Laptop",2800f));
        productList.add(new Product(5,"Apple Laptop",9000f));
        return productList;
    }

}

class Product{
    private int id;
    private String name;
    private float price;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
