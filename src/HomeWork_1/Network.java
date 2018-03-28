package HomeWork_1;

import java.util.ArrayList;

/**
 * Created by Konstantin on 28.03.2018.
 */
public class Network {

    private static ArrayList net_phone_list = new ArrayList();

    // Registraition
    public static void phoneReg(String phoneNumber) {
        net_phone_list.add(phoneNumber);
        reg_in_network(phoneNumber);
        if(reg_in_network(phoneNumber))
            System.out.println("You number is registered in the network!");
        else
            System.out.println("You number is not registered in the network!");

    }

    public static boolean reg_in_network(String phone_n) {
        boolean res=false;
        for(int i=0; i<net_phone_list.size(); i++){
            if(net_phone_list.get(i).equals(phone_n))
                res=true;
        }

        return res;
    }
}
