package test;

import java.awt.print.Pageable;
import java.util.*;
import java.util.function.Predicate;

/**
 * 1.	建立一个实体类Student类，属性：姓名，年龄，成绩，班级
 * 建立一个list1，包含 “张三，18岁，80分，1班”，“李四，19岁，100分，1班”，“王五，17岁，59分，1班”。
 * 建立一个list2，包含 “赵六，18岁，85分，2班”，“刘七，19岁，93分，2班”，“孙八，17岁，55分，2班”。
 *
 * hechusheng
 * 2020/03/04 18:00
 */
public class Test6 {


    public static void main(String[] args) {
        List <Student> list1 = new ArrayList<>();

        list1.add(new Student("张三", 18, 80, "1班"));
        list1.add(new Student("李四", 19, 100, "1班"));
        list1.add(new Student("王五", 17, 59, "1班"));
        //System.out.println(list1.toString());
        List <Student> list2 = new ArrayList<>();
        list2.add(new Student("赵六", 18, 85, "2班"));
        list2.add(new Student("刘七", 19, 93, "2班"));
        list2.add(new Student("孙八", 17, 55, "2班"));


        /**
         * （1）整合两个list学生信息成一个新的list
         */
        System.out.println("——————————第1题——————————");
        List<Student> newList = new ArrayList<>();
        newList.addAll(list1);
        newList.addAll(list2);
        System.out.println(list1.toString());


        /**
         * （2）按照分数给出学生信息排名
         */
        System.out.println("——————————第2题——————————");
        Collections.sort(newList,(v1,v2)->v2.getScore()-v1.getScore());
        System.out.println(newList.toString());


        /**
         * （3）输出不及格的学生信息
         */
        System.out.println("——————————第3题——————————");
        for(int i = 1; i <= list1.size(); i++){
            if(list1.get(i).getScore()<60){
                list1.remove(i);
                System.out.println(list1.toString());
            }
        }


        /**
         * （4）查找张三的信息
         */
        System.out.println("——————————第4题——————————");
        for(Student student:newList){
            if ("张三".equals(student.getStudentName())){
                System.out.println("名字："+ student.getStudentName());
                System.out.println("年龄："+ student.getAge());
                System.out.println("成绩："+ student.getScore());
                System.out.println("班级："+ student.getGrade());
                break;
            }
        }


        /**
         * （5）从list剔除年龄大于18岁的学生信息
         */
        System.out.println("——————————第5题——————————");
        List<Student> list3 = filter(newList,(str)->{return str.getAge()<=18;});
        int count2 = 1;
        for(Student student:list3){
            System.out.println("名字："+ student.getStudentName());
            System.out.println("年龄："+ student.getAge());
            System.out.println("成绩："+ student.getScore());
            System.out.println("班级："+ student.getGrade());
        }
    }
    private static List<Student> filter(List<Student> list, Predicate<Student> pre){
        List<Student> results = new ArrayList<>();
        for(Student r:list){
            if(pre.test(r))  //测试是否符合要求
            {
                results.add(r);
            }
        }
        return results;
    }

}

