import java.util.*;
class student
{
	
	int rollnumber ;
	String name;
	String course ;
	void input_student()
	{      Scanner s =new Scanner (System.in); 
		System.out.println("enter roll,name,course ");
		 rollnumber =s.nextInt();
		 name =s.next();
		 
		 course = s.next();
		 
	}
	void display_student()
	{
		System.out.println("ROLL NUMBER = "+rollnumber);
		System.out.println("NAME = "+name );
		System.out.println("COURSE =  "+course);
	}
}	

      class exam extends student 
{
	int mark_1,mark_2,mark_3;
	void input_marks ()
	{    
		super.input_student();
		Scanner s =new Scanner (System.in);
		System.out.println("enter mark of three subjects ");
		mark_1=s.nextInt();
		mark_2=s.nextInt();
		mark_3=s.nextInt();
	}
	void display_Result()
	{   
		super.display_student();
		System.out.println("mark in 1st subject = "+mark_1);
		System.out.println("mark in 2nd subject = "+mark_2);
		System.out.println("mark in 3rd subject = "+mark_3);
	}
}
     public  class student_marks
     {
    	 public static void main(String []args)
    	 {
    		 exam e[] = new exam[5];
    		 for (int i =0;i<5;i++)
    		  e[i] = new exam() ; 
    		 for(int i=0;i<5;i++)
    			 e[i].input_marks();
    		 for(int i=0;i<5;i++)
    			 e[i].display_Result();
    		 
		}
     }

