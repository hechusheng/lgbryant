package test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("d");
        list2.add("e");
        list2.add("f");
        list.addAll(list2);
        list.remove("a");
        list.set(0,"g");

        List<Pakho> pk = new ArrayList<>();
        Pakho pakho = new Pakho();
        pakho.setName("周柏豪");
        pakho.setAge(10);

        boolean boo = list.containsAll(list2);
        System.out.println(boo);
        if(null != list && list.size()>0){

        }
        String[] str =  list.toArray(new String[0]);

//        for (int i = 0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
        for(String str2 : str){
            System.out.println(str2);
        }
        System.out.println(pakho.toString());
    }
}
