package sort;

import java.util.*;

public class compare {

	public static void main(String[] args) {
		Comparator<Integer>com=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
					if(o1%10>o2%10)
					{
						return 1;
					}
				return -1;
			}
		};

		List <Integer>list=new ArrayList<>();
		list.add(678);
		list.add(31);
		list.add(34);
		list.add(26);
		list.add(29);
		list.add(91);
		Collections.sort(list,com);
		System.out.println(list);
		}

}
