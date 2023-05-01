package collectionpack;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCls {

    public static void main(String[] args) {


    List<Mobile> telefonlar = new ArrayList<>();

    Mobile tel1 = new Mobile("One Plus", "6T", 1100);
    Mobile tel2 = new Mobile("Samsung", "A30", 470);
    Mobile tel3 = new Mobile("Xiaomi", "Redmi Note 7", 450);

    telefonlar.add(tel1);
    telefonlar.add(tel2);
    telefonlar.add(tel3);

    Mobile tel4 = new Mobile("Honor", "Note 7", 600);

    telefonlar.add(1,tel4);

    for (Mobile mob : telefonlar){
        System.out.println(mob );
    }

        System.out.println(telefonlar.size());
        //telefonlar.clear();
        //System.out.println(telefonlar.isEmpty());
        //System.out.println(telefonlar.get(2));

    }
}