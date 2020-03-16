package test;

public class Test2 {
    /*
    1.	数组排序：{1,23,6,74,8,19,104} 按 从小到大排序。
     */
   public void t1(){
       System.out.println("——————————第1题——————————");
       int [] arg = {1,23,6,74,8,19,104};
       for(int i = 0; i<arg.length; i++){
           for(int j = 0; j < arg.length-1-i; j++){
               if(arg[j] > arg[j+1]){
                   int temp = arg[j];
                   arg[j] = arg[j+1];
                   arg[j+1] = temp;
               }
           }
       }
       for(int i = 0; i < arg.length; i++){
           System.out.print(arg[i]+" ");
       }
       System.out.println();
   }
   /*
   2.	数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的5 生成新的数组。
    */
    public void t2(){
        System.out.println("——————————第2题——————————");
       int []arg = {1,2,3,4,5,5,5,5,5,6,7,8,9};
       int []arg2 = new int[10];
       int num = 0;//统计5的个数
       for(int i = 0,j = 0; i < arg.length; i++){
           if(arg[i] != 5){
               arg2[j] = arg[i];
               j++;
           }else{
               num++;
           }
       }
       for(int i = 0; i<arg.length-num; i++){
           System.out.print(arg2[i]+" ");
       }
        System.out.println();
    }
    /*
    3.	数字 a{1,3,5,7,9}  b{2,4,6,8,10},将两个数组合并，
    并按照从小到大的顺序排序，生成新数组。
     */
    public void t3(){
        System.out.println("——————————第3题——————————");
        int []a = {1,3,5,7,9};
        int []b = {2,4,6,8,10};
        int []c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++){
            c[j+a.length] = b[j];
        }
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c.length-1-i; j++){
                if(c[j] > c[j+1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]+" ");
        }

    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.t1();
        test2.t2();
        test2.t3();
    }
}
