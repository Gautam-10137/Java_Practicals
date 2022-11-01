class NoMatchExp extends Exception
{

   String msg;
   NoMatchExp(String s)
   {
     msg=s;
   }
  public String toString()
  {
      return (msg);
  }
}
class match
{
   static void matching(String str) throws NoMatchExp
      {
       if(str.equalsIgnoreCase("Welcome"))
        {
          System.out.println("String matched");
         }
      else{
           throw new NoMatchExp("String doesnot match");
          }
    }
    public static void main(String args[]){
           try{
              matching("well");
       }
          catch(NoMatchExp e)
           {
               System.out.println(e);
   }
 }
 }
