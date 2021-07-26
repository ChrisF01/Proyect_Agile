package ec.edu.epn.git.Proyect_Agile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class SalesParametersTest {
    private int id_product, quantity;
    private Client client;
    private boolean value;

    Client client2 = new Client("0503408080");

    public SalesParametersTest(int id_product, int quantity, Client client, boolean value) {
        this.id_product = id_product;
        this.quantity = quantity;
        this.client = client;
        this.value = value;
    }
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{1,10,new Client("172564420"),true});
        objects.add(new Object[]{1,5,new Client("171563421"),true});
        objects.add(new Object[]{1,20,new Client("1725342220"),true});
        objects.add(new Object[]{1,40,new Client("1715352221"),true});
        objects.add(new Object[]{1,15,new Client("1756342223"),true});
        objects.add(new Object[]{1,11,new Client("1715382260"),true});
        return objects;
    }

    @Test
    public void given_client_when_change_them_ok(){
        Sales sales = new Sales(client2);
        sales.add_Product();
        boolean expected = true;
        boolean actual = sales.change_client(client);
        assertEquals(expected,actual);
    }

    @Test
    public void given_quantity_when_change_them_ok(){
        Sales sales = new Sales(client);
        sales.add_Product();
        boolean expected = true;
        boolean actual = sales.change_quantity_product(id_product,quantity);
        assertEquals(expected, actual);
    }


}