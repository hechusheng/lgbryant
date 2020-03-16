package test;

public class Test3 {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.t1();
        test3.t2();
        test3.t3();
    }
    /*
    1.	字符串：“Hello World!”，在字符串前面拼接自己的名字。
     */
    public void t1(){
        System.out.println("——————————第1题——————————");
        String str = "Hello World !";
        String str2 = "何楚盛";
        String str3 = str2.concat(str);
        System.out.println(str3);
    }
    /*
    2.	字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组，并在控制台打印。
     */
    public void t2(){
        System.out.println("——————————第2题——————————");
        String str = "1,2,3,4,5,6,7";
        String str2[] = str.split(",");
        for(int i = 0; i < str2.length; i++){
            System.out.print(str2[i]);
        }
        System.out.println();
    }
    /*
    3.	计算Hello World! 中出现了几次l。
     */
    public void t3(){
        System.out.println("——————————第3题——————————");
        String str = "Hello World";
        String str2[] = str.split("");
        int count = 0;
        for(int i = 0; i < str2.length; i++){
            if(str2[i].equals("l")){
                count++;
            }
        }
        System.out.println(count);
    }
}
