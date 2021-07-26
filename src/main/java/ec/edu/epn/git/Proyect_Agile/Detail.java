package ec.edu.epn.git.Proyect_Agile;

public class Detail {
    private int num_detail;
    private Product product;
    private  int quantity;

    public Detail(int num_detail, Product product, int quantity) {
        this.num_detail = num_detail;
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}
