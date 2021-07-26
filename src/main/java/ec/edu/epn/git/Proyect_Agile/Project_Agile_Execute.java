package ec.edu.epn.git.Proyect_Agile;

public class Project_Agile_Execute {
    public static void main(String[] args){
        System.out.println("=====Project Agile Execute=====");
        Client client1 = new Client("1725674020");
        System.out.println("Cliente1 ci: "+client1.getCi());

        Client client2 = new Client("0503408080");
        System.out.println("Cliente2 ci: "+client2.getCi());

        Sales sales = new Sales(client2);
        sales.add_Product();

        System.out.println("Change name sales from client1 to client2");
        boolean value = sales.change_client(client2);
        System.out.println(value);

        System.out.println("Change quantity product from 12 to 13");
        boolean value2 = sales.change_quantity_product(1,13);
        System.out.println(value2);

        System.out.println("Delete product 1 from the list");
        boolean value3 = sales.delete_product(1);
        System.out.println(value3);




    }

}
