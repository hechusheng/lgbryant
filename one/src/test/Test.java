package test;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.t1();
        test.t2();
        test.t3();
        test.t4();
    }
    /*
    写出计算1+2+3+···+100的和的代码。
     */
    public void t1(){
        int sum = 0;
        System.out.println("——————————第1题测试结果：——————————");
        for(int i = 1 ; i <= 100 ; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
    /*
    写出在控制台打印九九乘法表的代码。
     */
    public void t2(){
        System.out.println("——————————第2题测试结果：————————");
        for(int i = 1 ; i < 10 ; i++){
            for (int j = 1; j <= i ; j++){
                System.out.print(i+"*"+j+"="+j*i+" ");
            }
            System.out.println();
        }
    }
    /*
    写出打印1-100所有整数中的单数的代码。
     */
    public void t3(){
        int a = 0;
        System.out.println("——————————第3题测试结果—————————：");
        for(int i = 1 ; i <= 100 ; i++){
            if(i%2 == 1){
                System.out.print(i+" ");

            }
        }
        System.out.println();
    }
    /*
    写出打印101-200只有的所有素数，并求出所素数的和的代码。
     */
    public void t4(){
        System.out.println("——————————第4题测试结果：————————");
        int sum = 0 ;
        for(int i = 101 ; i <= 200 ; i++){
            for(int j = 2 ; j < i ; j++){
                if(i % j == 0){
                    break;
                }else if(j == i - 1){
                    System.out.print(i + " ");
                    sum = sum + i ;
                }
            }
        }
        System.out.println();
        System.out.println("101到200的素数和为："+sum);

    }
}
