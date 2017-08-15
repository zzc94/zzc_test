import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList<Integer>();
		HashMap<Integer, List> m = new HashMap<Integer, List>();
		System.out.println("随机生成50个小于100的数，分别为：");
		for (int i = 0; i < 50; i++) {
			int random = (int) (Math.random() * 100);
			l.add(random);
			System.out.print(" " + random);
			int key = random / 10;
			if (m.containsKey(key)) {
				List list = (List) m.get(key);
				list.add(random);
			} else {
				List list = new ArrayList<Integer>();
				list.add(random);
				m.put(key, list);
			}

		}
		
		System.out.println("\nMap中的数据为：" + m);
		for (Entry<Integer, List> entry : m.entrySet()) {
			List lv = entry.getValue();
			lv.sort(null);
		}
		System.out.println("排序后的Map为：" + m);

	}

}
