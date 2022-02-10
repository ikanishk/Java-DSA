package oops;
//This is to explain about constructors
//We used parametrized constructors when we don't want to write complete declarations for every object.
//instead we can pass them as arguments.
public class Classes_Objects_2 {
    public static  class Phone{
    	String model;
        String color;
        
        public  Phone(){ 
        this.model=null;
        this.color=null;
        } 
        
        
    	 public  Phone(String model, String color){ //Parameterized constuctors:
    		 										//Usually we have a default constructor but when we want to initialize
    		 										// values for an object, we pass it through parameterized constructors.
   		 this.model=model;
   		 this.color=color;
    	 }  	
        
         static void sayhi(String model,String color) {
        	StringBuilder sb=new StringBuilder();
        	sb.append(model);
        	sb.append(color);
        	System.out.println(sb);
        }
    }
    
    public static void main(String args[]) {
    	Phone m=new Phone("Apple","Lime");

        Phone.sayhi(m.model,m.color);
        Phone m1=new Phone("Apple","Lime Orange");
        Phone.sayhi(m.model,m.color);
      
        
      }
}
