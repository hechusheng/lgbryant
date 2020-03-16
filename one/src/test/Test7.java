package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1.	建立一个实体类Student类，属性：姓名，年龄，成绩，班级
 * 建立一个list1，包含 “张三，18岁，80分，1班”，“李四，19岁，100分，1班”，“王五，17岁，59分，1班”。
 * 建立一个list2，包含 “赵六，18岁，85分，2班”，“刘七，19岁，93分，2班”，“孙八，17岁，55分，2班”。
 *
 * hechusheng
 * 2020/03/04 19:00
 */
public class Test7 {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        int i = 0;
        map.put(i++, new Student("张三", 18, 80, "1班"));
        map.put(i++, new Student("李四", 19, 100, "1班"));
        map.put(i++, new Student("王五", 17, 59, "1班"));
        Map<Integer, Student> map2 = new HashMap<>();
        map2.put(i++, new Student("赵六", 18, 85, "2班"));
        map2.put(i++, new Student("刘七", 19, 93, "2班"));
        map2.put(i++, new Student("孙八", 17, 55, "2班"));

        /**
         * （1）整合两个list学生信息成一个新的list
         */
        System.out.println("——————————第1题——————————");
        Map<Integer, Student> map3 = new HashMap<>();
        map3.putAll(map);
        map3.putAll(map2);
        Set<Map.Entry<Integer, Student>> entrySet = map3.entrySet();
        int count = 1;
        for (Map.Entry<Integer, Student> entry : entrySet) {
            Student student = entry.getValue();
            System.out.println("姓名：" + student.getStudentName());
            System.out.println("年龄：" + student.getAge());
            System.out.println("成绩：" + student.getScore());
            System.out.println("班级：" + student.getGrade());

        }



        /**
         * （2）按照分数给出学生信息排名
         */
        System.out.println("——————————第2题——————————");
        for ( i = 0; i < map3.size(); i++) {
            Student student;
            for (int j = i + 1 ; j < map3.size() ; j++){
                if (map3.get(i).getScore()<map3.get(j).getScore()){
                    student = map3.get(i);
                    map3.replace(i,map3.get(j));
                    map3.replace(j,student);
                }
            }
            student = map3.get(i);
            System.out.println("名字："+ student.getStudentName());
            System.out.println("年龄："+ student.getAge());
            System.out.println("成绩："+ student.getScore());
            System.out.println("班级："+ student.getGrade());
        }


        /**
         * （3）输出不及格的学生信息
         */
        System.out.println("——————————第3题——————————");
        Student findStu = null;

        Map<Integer,Student> map4 = new HashMap<>();
        for (Map.Entry<Integer,Student > entry:entrySet){
            Student student = entry.getValue();
            if (student.getScore()<60){
                System.out.println("名字："+ student.getStudentName());
                System.out.println("年龄："+ student.getAge());
                System.out.println("成绩："+ student.getScore());
                System.out.println("班级："+ student.getGrade());
            }
            if ("张三".equals(student.getStudentName())){ //查找张三的信息
                findStu = student;
            }

            if (student.getAge()<=18){ //将年龄小于等于18的学生信息加入map4
                map4.put(count++,student);
            }
        }


        /**
         * （4）查找张三的信息
         */
        System.out.println("——————————第4题——————————");
        if (findStu!=null){
            System.out.println("名字："+ findStu.getStudentName());
            System.out.println("年龄："+ findStu.getAge());
            System.out.println("成绩："+ findStu.getScore());
            System.out.println("班级："+ findStu.getGrade());
        }


        /**
         * （5）从list剔除年龄大于18岁的学生信息
         */
        System.out.println("——————————第5题——————————");
        Set<Map.Entry<Integer,Student>> entrySet2 = map4.entrySet();
        int count3 = 1;
        for (Map.Entry<Integer,Student> entry:entrySet2){
            Student student = entry.getValue();
            System.out.println("第"+ count3++ +"个");
            System.out.println("名字："+ student.getStudentName());
            System.out.println("年龄："+ student.getAge());
            System.out.println("成绩："+ student.getScore());
            System.out.println("班级："+ student.getGrade());
        }

    }
}
