class Person{
	String name; 
	int age;
	Person(String n ,int a){
		 name=n; 
		 age=a;
	}
	void display(){
		System.out.println("Name: "+name+" Age: "+age);
	}
	
}
class student1 extends Person{
	String course; 
	int roll, Marks;
	student1(String n, int a,String c,int r, int M) {
		super(n, a);
		course=c; 
		roll=r;
		Marks=M;
	}

	void display(){
		super.display();
		System.out.println("Course: "+course+" Roll Number: "+roll+" Marks: "+Marks);

	}
}
class Teacher extends Person{
	 String subject_assigned ; 
		int contact_hour; 
	Teacher(String n, int a,String s,int c) {
		super(n, a);
		subject_assigned =s; 
		contact_hour=c; 
	}

		void display (){
super.display();			System.out.println("subject_assigned: "+subject_assigned+" contact_hour: "+contact_hour);
		}
}


public class AS_2_7 {

	public static void main(String[] args) {
		student1 s=new student1("Manshi",18,"CSE",317,10);
		Teacher t=new Teacher("Ambit",40,"DM",5);
s.display();
t.display();}

}
