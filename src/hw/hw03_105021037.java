package hw;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/03
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw03_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一正整數");
		int n =scn.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++){
			sum=sum*i;
			
		}System.out.print(sum);

	}

}
