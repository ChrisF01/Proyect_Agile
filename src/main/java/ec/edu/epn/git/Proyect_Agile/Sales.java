package ec.edu.epn.git.Proyect_Agile;

import java.util.ArrayList;
import java.util.Date;

public class Sales {
    private Client client;
    private Date date_sales;
    private ArrayList<Detail> list_detail = new ArrayList<>();
    private double tax;
    private double discount;
    private double total;

    public Sales(Client client) {
        this.client = client;
    }

    public boolean change_client(Client client){
        this.client = client;
        this.discount = 0;
        return true;
    }

    public boolean change_quantity_product(int id_product, int quantity){
        int index = search_product(id_product);
        Detail detail = list_detail.get(index);
        detail.setQuantity(quantity);
        list_detail.set(index,detail);
        return true;
    }

    public int change_discount(){
        int total_quantity=0;
        for (Detail detail:list_detail) {
          total_quantity=total_quantity+detail.getQuantity();
        }
        if(total_quantity>12){
            return 10;
        }
        return 0;
    }


    public boolean delete_product(int id_product){
        int index = search_product(id_product);
        list_detail.remove(index);
        if(list_detail.size()!=0){
            if(search_product(id_product)==index){
                return false;
            }
        }
        return true;
    }

    public int search_product(int id_Product){
        for (int i=0;i<=list_detail.size();i++) {
            Detail detail = list_detail.get(i);
            if(detail.getProduct().getId_product()==id_Product){
                return i;
            }
        }
        return -1;
    }

    public boolean time_change_quantity(int id_product ,int quantity) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return change_quantity_product(id_product, quantity);
    }

    public void add_Product(){
        Product product1 = new Product(1, "Jeans",20.0);
        Detail detail = new Detail(1,product1,12);
        list_detail.add(detail);
    }
    public void setTotal(){

        for (Detail detail:list_detail) {
            this.total=this.total+(detail.getQuantity()*detail.getProduct().getPrice());
        }
        this.total = this.total-(this.total*this.discount);
    }

    private void setTax() {
        this.tax = this.total*0.12;
    }

}
