package Student;

public class Student {  
	 String name;  
	 int age;
	 String gender;
	 int id;
	 
     void setstudent(String n, int a,String g,int i) {
		 name = n;
		 age = a;
		 gender = g;
		 id = i;		 
	 }
	void getstudent()
	 {
		 System.out.println(name+ " " + age + " " + gender + " " + id); 
	 }
	void setName(String n){
         	this.name = n;
    	}
  	void setAge(int a){
         	this.age = a;
    	}
    	void setGender(String g){
   	     this.gender = g;
   	 }
   	void setId(int i){
        	this.id = i;
 	   }
  	public String getName(){
  	      return name;
   	 }
   	public int getAge(){
        	return age;
    	}
    	public String getGender(){
       		return gender;
    	}
    	public int getId(){
       		return id;
  	  }
	
}

class TestStudent1{  
	 public static void main(String args[]){  
	  Student s1=new Student(); 
	  s1.setstudent("vincent",20,"M",1234);
	  s1.getstudent();	  
	 }  
	}  
