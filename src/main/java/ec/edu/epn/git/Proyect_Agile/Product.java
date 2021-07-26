package ec.edu.epn.git.Proyect_Agile;

public class Product {
    private int id_product;
    private String name_product;
    private double price;

    public Product(int id_product, String name_product, double price) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.price = price;
    }

    public int getId_product() {
        return id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public double getPrice() {
        return price;
    }
}
