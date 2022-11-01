class Adder
{
    long add(int a,long b){
        return a+b;
   }
  /*double add(int a,int b){
        return a+b;
   } */
  /* long add(long a,int b){
        return a+b;
   }  */  
    
  int add(int a,int b,int c){
       return a+b+c;
   }
    double add(double a,double b){
       return a+b;
   }

}
class calculator
{
   public  static void main(String args[]){
      Adder ob=new Adder();
      long x=ob.add(1,2);
      System.out.println(x);
      System.out.println(ob.add(1,2,3));
      System.out.println(ob.add(1.1,2.2));

}
}


