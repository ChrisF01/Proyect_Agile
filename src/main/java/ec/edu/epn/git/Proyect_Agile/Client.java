package ec.edu.epn.git.Proyect_Agile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    private String ci;
    private String first_name;
    private String last_name;
    private String email;
    private String telephone;
    private String address;

    public Client(String ci) {
        this.ci = ci;

    }

    public void insert_client(String first_name, String last_name, String email, String telephone, String address) {

        if (first_name.equals("") || last_name.equals("") || email.equals("") || telephone.equals("") || address.equals("")) {

        }
    }

    public boolean update_client(String first_name, String last_name) {

        if (first_name.equals("") || last_name.equals("")) {
            return false;
        }

        return true;
    }

    public String update_email_client(String new_email) {
        if (!new_email.equals("") || new_email.equals(this.email)) {
            this.email = new_email;
            return this.email;
        }
        return this.email;
    }

    public boolean update_telephone_client(String new_telephone) {
        Matcher mat = getMatcher(new_telephone);
        if (mat.matches()) {
            this.telephone = new_telephone;
            return true;
        }
        return false;
    }

    private Matcher getMatcher(String new_telephone) {
        Pattern pat = Pattern.compile("^([0][9])\\d{8}$");
        Matcher mat = pat.matcher(new_telephone);
        return mat;
    }

    public boolean update_address_client(String new_address) {
        if ( empty(new_address) || new_address.equals(new_address)) {
            return false;
        }
        this.address = new_address;
        return true;
    }

    public boolean empty(String new_String){
        if(new_String.equals("")){
            return false;
        }else {
            return true;
        }
    }

    public boolean time_update_client(String new_first_name, String new_last_name) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return update_client(new_first_name, new_last_name);
    }

    public String time_email_client(String new_email) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return update_email_client(new_email);
    }

    public boolean time_telephone_client(String new_telephone) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return update_telephone_client(new_telephone);
    }

    public boolean time_address_client(String new_address) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return update_address_client(new_address);
    }

    public String getCi() {
        return ci;
    }
}
