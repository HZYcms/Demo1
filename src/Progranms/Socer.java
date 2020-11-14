package Progranms;

import java.util.Scanner;

public class Socer<T> { // 定义一个分数的类，里面有添加成绩，查看成绩，修改成绩和删除学生的功能
        int maxLength = 10000;
        int length = 0;
        Students[] s = new Students[maxLength];
        Scanner a = new Scanner(System.in);

        public Socer() {

        }
        public void add() {
            if (length < maxLength) {
                s[length] = new Students();
                System.out.println("请输入学生姓名：");
                s[length].setName(a.next());
                System.out.println("请输入高数成绩：");
                s[length].setMathsocer(a.nextFloat());
                System.out.println("请输入英语成绩：");
                s[length].setEnglishsocer(a.nextFloat());
                System.out.println("请输入线代成绩：");
                s[length].setLinearscoer(a.nextFloat());
                System.out.println("请输入体育成绩：");
                s[length].setGymsocer(a.nextFloat());
                s[length].setAll(s[length].mathsocer+s[length].Englishsocer+s[length].linearscoer+s[length].gymsocer);
                length++;
                System.out.println("添加成功！");
            }
            else{
                System.out.println("添加失败！");
            }
        }
        public void delete() {
            System.out.print("请输入您要删除信息的学生的姓名: ");
            String number1 = a.next();
            int i, b = length;
            for(i = 0; i < length; i++) {
                if(number1.equals(s[i].name)) {
                    b = i; break;
                }
            }
            if(i == length) {
                System.out.println("查无此人！请核对后重新输入 \n");
                delete();
            }
            else {
                for(int j = b; j < length; j++) {
                    s[j] = s[j + 1];
                }
                System.out.println("删除成功！\n");
                length -= 1;
            }
        }

        public void display(){
            System.out.println("*********************************************");
            System.out.println("姓名 高数     英语     线代     体育     总分");
            for(int i=0;i<100;i++) {
                System.out.println(s[i].name+"\t"+s[i].mathsocer+"\t"+s[i].Englishsocer+"\t"+
                  s[i].linearscoer+"\t"+s[i].gymsocer+"\t"+s[i].all);
            }
            System.out.println("*********************************************");
            display();
        }
        public void recompose() {
            System.out.print("请输入您要修改信息的学生的姓名：");
            String b = a.next();
            int i;
            for(i = 0; i < length; i++) {
                if(b.equals(s[i].name)) {
                    System.out.println("请输入该学生新的高数，英语，线代，体育成绩(以空格键隔开)：");
                    s[i].setMathsocer(a.nextFloat());
                    s[i].setEnglishsocer(a.nextFloat());
                    s[i].setLinearscoer(a.nextFloat());
                    s[i].setGymsocer(a.nextFloat());
                    System.out.println("修改成功！\n");
                    break;
                }
            }
            if(i == length) {
                System.out.println("查无此人！请核对后重新输入姓名\n");
                recompose();
            }
        }
        public void sort() {
            Students temp ;
            for(int i = 1; i < length; i++) {
                for(int j = 0; j < length - i; j++) {
                    if(s[j].all < s[j + 1].all) {
                        temp = s[j];
                        s[j] = s[j + 1];
                        s[j + 1]= temp;
                    }

                }
            }
        }

    }
