package sort;
import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
    // public int compareTo(Student t)
    // {
    //     if(this.cgpa>t.cgpa)
    //     {
    //         return 1;
    //     }
    //     return -1;
    // }
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
    
        public String toString() {
        return fname;
    }

}

//Complete the code
public class studentinfo
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList,Comparator.comparing(Student::getCgpa).reversed()
        .thenComparing(Student::getFname)
        .thenComparing(Student::getId));
        
       
       
             	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
