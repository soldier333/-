package com.qinli.puzzle1;


/**
 * @Author Cambria
 * @creat 2021/2/3 23:29
 * 修改：弓明禄
 */
public class Main {
    static Student[] students = new Student[3];
    public static void main(String[] args) {

        students[0]=new Student("法外狂徒张三",20);
        students[1]=new Student( "李四",21);
        students[2] = new Student("王五",19);
        printStu();

    }

    static void printStu(){
        for (Student student : students) {
            System.out.println("姓名：" + student.name);
            System.out.println("年龄：" + student.age);
        }
    }
}
