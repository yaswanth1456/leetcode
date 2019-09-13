package labdaexpressions;



interface Sayable{  
    public int say(int a,int b);  
}  
public class LambdaExpressionExample3{  
public static void main(String[] args) {  
    Sayable s=(a,b)->{return a*b;};  
       
		 
   
   System.out.println(s.say(20,30));  
}  
}  