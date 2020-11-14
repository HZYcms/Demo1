package Progranms;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice="1";
        Socer studentScoreList = new Socer();
        System.out.println("**********欢迎来到重邮学生成绩管理系统********");
        while(choice.equals("0") == false) {
            System.out.println("1.添加学生成绩");
            System.out.println("2.查看学生成绩单");
            System.out.println("3.修改学生成绩");
            System.out.println("4.删除学生成绩");
            System.out.println("5.学生成绩排名");
            System.out.println("0.退出程序");
            System.out.print("输入你想要选择的项目：");
            choice = input.next();

            switch(choice) {
                case "0":
                    System.out.println("谢谢您的使用！"+"\n" + "**********按任意键结束程序**********");
                    break;

                case "1":
                    int i = 1;
                    do {
                        studentScoreList.add();
                        System.out.println("\n"+"是否继续添加？" + "\n" + "0.否" + "\n" + "1.是");
                        i = input.nextInt();
                    }while(i == 1);
                    System.out.println("请问您还需要什么服务？"+"\n");
                    break;

                case "2":
                    try {
                        studentScoreList.display();
                    } catch (Exception exception) {

                    }
                    System.out.println("请问您还需要什么服务？"+"\n");//这里报错，用到try chtch语句
                    break;
                case "3":
                    studentScoreList.recompose();
                    System.out.println("请问您还需要什么服务？"+"\n");
                    break;

                case"4":
                    studentScoreList.delete();
                    System.out.println("请问您还需要什么服务？");

                case "5":
                    studentScoreList.sort();
                  try {
                      studentScoreList.display();
                  }catch (Exception exception) {


                  }
                    System.out.println("请问您还需要什么服务？\n");
                    break;

                default:
                    System.out.println("您输入的内容不对，请重新输入！");
                    break;
            }

        }
    }

}
