package ec.edu.epn.git.Proyect_Agile;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;

public class Sales {
    private Client client;
    private Date date_sales;
    private ArrayList<Detail> list_detail = new ArrayList<>();
    private double tax;
    private double total;

    public Sales(Client client) {
        this.client = client;
    }

    public void add_Product(){
        Product product1 = new Product(1, "Jeans",20.0);
        Detail detail = new Detail(1,product1,2);
        list_detail.add(detail);
    }
    public void setTotal(){

        for (Detail detail:list_detail) {
            this.total=this.total+(detail.getQuantity()*detail.getProduct().getPrice());
        }
    }

    private void setTax() {
        this.tax = this.total*0.12;
    }
}
