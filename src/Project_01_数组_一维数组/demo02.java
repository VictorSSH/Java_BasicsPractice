package Project_01_数组_一维数组;


import java.util.Scanner;

/*
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级
 *   成绩>=最高分-10 等级为'A'
 *   成绩>=最高分-20 等级为'B'
 *   成绩>=最高分-30 等级为'C'
 *   其余              等级为D
 *
 *
 * */
public class demo02 {
    public static void main(String[] args) {
        //1,控制台输入学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学习人数: " + scanner);
        int number = scanner.nextInt();

        //2，创建数组，存储学生成绩，动态初始数组
        int[] scors = new int[number];

        //3，给动态创建数组元素赋值
        System.out.println("请输入" + number + "学生成绩");
        for (int i = 0; i < scors.length; i++) {
            scors[i] = scanner.nextInt();
        }
        // 4,获取数组元素的最大值，最高分
        int maxScor =0;
        for (int i = 0; i < scors.length; i++) {
            if (maxScor < scors[i]){
                maxScor = scors[i];
            }
        }
        //5, 根据每个学生的成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level;
        for (int i = 0; i < scors.length; i++) {
            if (maxScor - scors[i] <= 10){
                level = 'A';
            }else if (maxScor - scors[i] <= 20){
                level = 'B';
            }else if (maxScor - scors[i] <=30){
                level ='C';
            }else {
                level='D';
            }
            System.out.println("student "+i+"scors is "+ scors[i]+",grade is "+level);
        }
    }
}
