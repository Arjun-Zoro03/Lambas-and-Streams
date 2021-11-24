import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Product{
    int id;
    String name;
    float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList =
                productsList.stream()
                        .map(x->x.price)
                        .collect(Collectors.toList());
        System.out.println(productPriceList);

        Map<String,Float> map =
                productsList.stream()
                        .collect(Collectors.toMap(Product::getName, Product::getPrice));
        System.out.println(map);

        productsList.stream()
                .map(Product::getName)
                .limit(2)
                .forEach(System.out::println);

        productsList.stream()
                .map(Product::getName)
                .skip(2)
                .forEach(System.out::println);

        //anymatch
        System.out.println(productsList.stream().anyMatch((t) ->t.getName().equals("Dell Laptop")));

        //allmatch
        System.out.println(productsList.stream().allMatch((t) ->t.getName().equals("Dell Laptop")));

    }
}



