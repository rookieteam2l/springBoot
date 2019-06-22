package com.sunshine.free;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<user> list1 =  new ArrayList<>();
        List<user> list2 =  new ArrayList<>();
        List<user> list3 =  new ArrayList<>();

        user p = new user(1,"苹果",55);
        user x = new user(2,"香蕉",99);
        user l = new user(3,"梨",66);

        user p1 = new user(1,"苹果",88);
        user x1 = new user(2,"香蕉",88);
        user l2 = new user(3,"梨",88);


        user p2 = new user(1,"苹果",55);
        user x2 = new user(2,"香蕉",99);


        list1.add(p);
        list1.add(x);
        list1.add(l);

        list2.add(p1);
        list2.add(x1);
        list2.add(l2);

        list3.add(p2);
        list3.add(x2);
        Boolean flag= true;
        for (int i=0; i<list1.size(); i++){

            for (int j=0; j<list2.size();j++){

                if (list1.get(i).getId()==list2.get(j).getId()){

                    for (int k=0; k<list3.size();k++){

                        if (list1.get(i).getId()==list3.get(k).getId()){
                            flag= false;
                            if (list1.get(i).getPrice()>list2.get(j).getPrice()){
                                list1.get(i).setPrice(list2.get(j).getPrice());

                            }
                        }
                    }

                    if (flag){
                        list1.get(i).setPrice(list2.get(j).getPrice());
                    }
                    flag=true;
                }

            }
        }

        System.out.println(list1);
    }
}
