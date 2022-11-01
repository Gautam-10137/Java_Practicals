public class swap
{
   public static void main(String args[]){
   int num1=Integer.parseInt(args[0]);
   int num2=Integer.parseInt(args[1]);
   num1=num1+num2;
   num2=num1-num2;
   num1=num1-num2;
   System.out.print(num1+" "); 
   System.out.println(num2);   
   
    

}

}
