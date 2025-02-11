package setups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
 
public class Student {
 
	//name, class, 3 sub marks for each student
	
	String name;
	String className;
	int mark1;
	int mark2;
	int mark3;
	
	Student(String name,String className,int mark1,int mark2,int mark3){
		this.name=name;
		this.className=className;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
 
	}
	
	public static void studentMarks(List<Student> studList) {
		int max=0;
		String highestName = null;
		for(Student s:studList) {
			int total=s.mark1+s.mark2+s.mark3;
			if(total>max) {
				max=total;
				highestName=s.name;
			}
			
		}
		System.out.println(highestName);
	}
	
	public static void highestMark2(List<Student> stud) {
		int count=0;
		int first =stud.get(0).mark2;
		int mark2 =0;
		List<Student> names  = new ArrayList<Student>();
		for (Student s: stud) {
			if (s.mark2>=first){
				names.add(s);
				first=s.mark2;
			}else {
				System.out.println("");
			}
				
			}
		for (Student name:names)
			System.out.println(name.name);
	}
	
	public static void highestMark1(List<Student> stud) {
 
	}
	
	public static void main(String[] args) {
		Student stud1=new Student("Arav", "2", 30, 40, 50);
		Student stud2=new Student("Ann", "2", 60, 40, 60);
		Student stud3=new Student("Ben", "2", 40, 70, 60);
		//studentMarks(Arrays.asList(stud1,stud2,stud3));
		highestMark2(Arrays.asList(stud1,stud2,stud3));
 
 
	}
	
}