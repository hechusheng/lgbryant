package test;

/**
 * 学生信息
 * hechusheng
 * 2020/03/04/18:00
 */
public class Student {
    /*
    学生姓名
     */
    private String studentName;
    /*
    学生年龄
     */
    private int age;
    /*
    成绩
     */
    private int score;
    /*
         班级
          */
    private String grade;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(String studentName, int age, int score, String grade){
        super();
        this.studentName = studentName;
        this.age = age;
        this.score = score;
        this.grade = grade;
    }
@Override
    public String toString(){
        return (getStudentName() +" "+ getAge() +"岁"+" "+ getScore() +"分"+" "+ getGrade());
}


//    public int getAchievement() {
//        return v1.getEmpno()-v2.getEmpno();
//    }
}
