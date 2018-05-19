/**
 *Fibonacci
 * @author wyong
 */
package com.practice02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacii{
	public static void main(String[] args) throws Exception{
		System.out.println("请输入：");
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n<0){
				throw new Exception("输入不能为负数异常！");
			}
			System.out.println(fibonacii(n));
			
		} catch (InputMismatchException e) {
			System.out.println("输入字符格式异常：" + e);
			
		}
	}
	//递归方式
	public static int fibonacii(int n){
		if(n<=2){
			return 1;
		}else{
			
			return fibonacii(n-1) + fibonacii(n-2);
		}
	}
}