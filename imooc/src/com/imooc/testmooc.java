package com.imooc;

import java.util.*;

import javax.imageio.IIOException;

public class testmooc {
	public static void main(String[] args) throws IIOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Charlie��������һ������(1~7)��");
		int c = 0;
		do{
			int i = scan.nextInt();
			c = i;
//			System.out.println(i);
			switch(i){
				case 1:
					System.out.println("������");
					break;
				case 2:
					System.out.println("��Т��");
					break;
				case 3:
					System.out.println("���ݸ�");
					break;
				case 4:
					System.out.println("����");
					break;
				case 5:
					System.out.println("��Կ��");
					break;
				case 6:
					System.out.println("�º龰");
					break;
				case 7:
					System.out.println("���Ž�");
					break;
				default:
					System.out.println("��������ֲ��ڷ�Χ�ڣ�");
			}
		}while(c<999);
		System.out.println("��Ϸ�˳���");
		scan.close();
	}
}
