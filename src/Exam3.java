import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList<Integer>();
		Map m=new HashMap<Integer, List>();
		System.out.println("�������50��С��100�������ֱ�Ϊ��");
		for(int i=0;i<50;i++){
			int random = (int)(Math.random()*100);
			l.add(random);
			System.out.print(" "+random);
			int key=random/10;
			if(m.containsKey(key)){
				List list = (List) m.get(key);
				list.add(random);
			}
			else
			{
				List list=new ArrayList<Integer>();
				list.add(random);
				m.put(key, list);
			}
			
		}
		System.out.println("\nMap�е�����Ϊ��"+m);
		Set entrySet = m.entrySet();
		 
		for (Object b : entrySet) {
			Map.Entry<Integer, List> c=(Map.Entry<Integer, List>)b;
			//System.out.println(c);
			List lv = c.getValue();
			lv.sort(null);
			
		}
		System.out.println("������MapΪ��"+m);
       
	}

}