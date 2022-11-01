public class tax1
{
   public static void main(String args[]){
   String gender=args[0];
   int income=Integer.parseInt(args[1]);
   double tax=0;
   if(gender.equalsIgnoreCase("male")){
      if(income<=180000){
           tax=0;
      }
      else if(income<=500000){
       tax=0.1*(income-180000);
      }
      else if(income<=800000){
       tax=0.2*(income-500000)+0.1*180000;
     }
      else if(income>800000){
          tax=0.3*(income-800000) + 0.2*500000 + 0.1*180000;
     }
    System.out.println(tax); 

    }

   else if(gender.equalsIgnoreCase("female")){
      if(income<=190000){
         tax=0;
      }
      else if(income<=500000){
         tax= 0.1*(income-190000);
      }
      else if(income<=800000){
         tax=0.2*(income-500000)+0.1*500000;
      }
      else if(income>800000){
         tax=0.3*(income-800000)+0.2*(800000)+0.1*500000;
      }
      System.out.println(tax); 

    }
  else 
 {
  System.out.println("Wrong choice!"); 
 }
} 



}

