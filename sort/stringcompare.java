package sort;

import java.util.*;
//sort the string  by length 
public class stringcompare {

	public static void main(String[] args) {
		Comparator<String>com=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
					if(o1.length()>o2.length())
					{
						return 1;
					}
				return -1;
			}
		};

		List <String>list=new ArrayList<>();
		list.add("vicky");
		list.add("ram");
		list.add("sreerajagobal");
		list.add("barath");
		list.add("guru");
		list.add("hari");
		Collections.sort(list,com);
		System.out.println(list);
		}

}
