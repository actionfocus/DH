package com.imooc;

import java.util.*;

import javax.imageio.IIOException;

public class testmooc {
	public static void main(String[] args) throws IIOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Charlie，请输入一个数字(1~7)：");
		int c = 0;
		do{
			int i = scan.nextInt();
			c = i;
//			System.out.println(i);
			switch(i){
				case 1:
					System.out.println("张力仁");
					break;
				case 2:
					System.out.println("张孝贤");
					break;
				case 3:
					System.out.println("钟逸福");
					break;
				case 4:
					System.out.println("陈钰");
					break;
				case 5:
					System.out.println("徐钥沛");
					break;
				case 6:
					System.out.println("陈洪景");
					break;
				case 7:
					System.out.println("张雅洁");
					break;
				default:
					System.out.println("输入的数字不在范围内！");
			}
		}while(c<999);
		System.out.println("游戏退出！");
		scan.close();
	}
}
