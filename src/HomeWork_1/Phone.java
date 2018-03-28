package HomeWork_1;

import java.util.ArrayList;

/**
 * Created by KOS on 27.03.2018.
 */
public class Phone {

    private String  phone_number;
    private String  name;
    private static ArrayList net_phone_list = new ArrayList();

    public Phone() {
    }
    public Phone(String phone_number, String name) {
        this.phone_number = phone_number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void registrarion(){
        Network.phoneReg(getPhone_number());
    }

    public void CallToContact(String phone){
        if(Network.reg_in_network(getPhone_number())) {
            if (Network.reg_in_network(phone))
                System.out.println("Hello! Who is it?");
            else
                System.out.println("The subscriber's phone is switched off or out of the network coverage area! Please call back later!");
        }
        else
            System.out.println("Network not found!");
    }


/*

    public void reg_network(){
        int tmp =0;
        for(int i=0; i<this.network_phone_book.length; i++){
            if(this.network_phone_book[i].equals(this.getPhone_number())) {
                System.out.println("You are connected to the network!");
                tmp=1;
                break;
            }
        }
        if(tmp==0)
            System.out.println("You are not connected to the network!");
    }


*/

}
