package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test5 {
/*

 */
//    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("贡茶", "熊猫奶盖绿");
//        map.put("麦当劳", "麦辣鸡腿堡");
//        map.put("肯德基", "全家桶");
//        map.put("西餐厅","惠灵顿牛排");
//
//        //第一种：普遍使用，二次取值
//        System.out.println("通过Map.keySet遍历key和value：");
//        for(String key : map.keySet()){
//            System.out.println(key+" "+map.get(key));
//        }
//
//        //第二种
//        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> entry = iterator.next();
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//
//        //第三种：推荐，尤其是容量大时
//        System.out.println("通过Map.entrySet遍历key和value");
//        for(Map.Entry<String, String> entry : map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        //第四种
//        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
//        for (String v : map.values()) {
//            System.out.println("value= " + v);
//        }
//    }

    /**
     * 获取两个数中的最小值
     * @param num1
     * @param num2
     * @return
     * 何楚盛
     * 2020/3/4
     */
    public static int max(int num1, int num2){
        int result = 0;
        if(num1 < num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;

    }

    /**
     * 修改狗的名字
     * @param name
     * @return
     * LG.BRYANT
     * 2020/3/4
     */
    public static String changeDogName(String name){
        Dog dog = new Dog();
        dog.setName(name);
        return name;
    }
    public static void main(String[] args) {
        int i = 6;
        int j = 9;
        int k = max(i,j);
        System.out.println("最小值是：" + k);
        Dog dog = new Dog();
        dog.name = changeDogName("bryant");
        System.out.println(dog.name);
    }


}
