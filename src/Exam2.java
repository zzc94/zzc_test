import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int moon;
		int day;
		int lastday = 31;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("����������(����#�ż��˳�)��");
			String date_str = sc.nextLine();
			if("#".equals(date_str))
			{
				System.out.println("�˳���");
				return ;
			}
			String[] date_arr = date_str.split("-");
			if(date_arr.length!=3)
			{
				System.out.println("��ʽ���ԣ�������yyyy-mm-dd");
				continue;
			}
			year = Integer.parseInt(date_arr[0]);
			moon = Integer.parseInt(date_arr[1]);
			day = Integer.parseInt(date_arr[2]);
			if (moon == 1 || moon == 3 || moon == 5 || moon == 7 || moon == 8 || moon == 10 || moon == 12) {
				lastday = 31;
			} else if (moon == 4 || moon == 6 || moon == 9 || moon == 11) {
				lastday = 30;
			} else if (moon == 2) {
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					lastday = 29;
				} else
					lastday = 28;
			}

			if (day < lastday) {
				day++;
			} else if (day == lastday) {
				moon++;
				if (moon == 13) {
					year++;
					moon = 1;
				}
				day = 1;
			} else {
				System.out.println("����������ڲ�����");
				continue;
			}
			System.out.println("��һ��Ϊ��" + year + "-" + moon + "-" + day);
		}
}
}
