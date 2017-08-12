import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("输入工资：");
		String str_gz = sc.nextLine();
		double gz= Double.parseDouble(str_gz);
		double  jiju=gz-3500;
		double  su=0;
		if(jiju<=0){
			;
		}
		else if(jiju>0&&jiju<=1500)
		{
			su=jiju*0.03;
		}
		else if(jiju>1500&&jiju<=4500)
		{
			su=jiju*0.1;
		}
		else if(jiju>4500&&jiju<=9000)
		{
			su=jiju*0.2;
		}
		else if(jiju>9000&&jiju<=35000)
		{
			su=jiju*0.25;
		}
		else if(jiju>35000&&jiju<=55000)
		{
			su=jiju*0.30;
		}
		else if(jiju>55000&&jiju<=80000)
		{
			su=jiju*0.35;
		}
		else
		{
			su=jiju*0.45;
		}
		System.out.println("税费为："+su);

	}

}

