package ec.edu.epn.git.Proyect_Agile;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalesTest {

    Client client = new Client("1725674020");
    Sales sales = new Sales(client);
    @Before
    public void add_Client(){
        System.out.println("add_Client()");
        client.insert_client("Pedro","Azar","p.azar@mail.com","02896563","Calle A");
    }

    @Test
    public void given_client_when_change_them_ok(){
        System.out.println("Test 1");
        Client client2 = new Client("0503408080");
        client2.insert_client("Luis","Taco","ltaco@mail.com","03569856","Calle Z");
        boolean expected = true;
        boolean actual = sales.change_client(client2);
        assertEquals(expected,actual);
    }

    @Test
    public void given_quantity_when_change_them_ok(){
        System.out.println("Test 2");
        sales.add_Product();
        boolean expected = true;
        boolean actual = sales.change_quantity_product(1,13);
        assertEquals(expected, actual);
    }

    @Test
    public void given_id_when_search_then_ok(){
        System.out.println("Test 3");
        sales.add_Product();
        int expected = 0;
        int actual = sales.search_product(1);
        assertEquals(expected, actual);
    }

    @Test
    public void given_id_when_delete_product_them_ok(){
        System.out.println("Test 4");
        sales.add_Product();
        boolean expected = true;
        boolean actual = sales.delete_product(1);
        assertEquals(expected,actual);
    }

    @Test
    public void given_discount_when_change_discount_them_ok(){
        System.out.println("Test 5");
        sales.add_Product();
        int expected = 0;
        int actual = sales.change_discount();
        assertEquals(expected, actual);
    }

    @Test(timeout = 110)
    public void given_quantity_when_change_quantity_them_timeout(){
        System.out.println("Test 6");
        sales.add_Product();
        boolean expected = true;
        boolean actual = sales.change_quantity_product(1,13);
        assertEquals(expected, actual);
    }





}