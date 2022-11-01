class Testing 
{
   int divide(int a) throws Exception
   {
       if(a==0)
        {
          throw new Exception("3A: Divide by zero!");
         }
        else{
              return(20/a);
             }
         }
  }
class Test
{
    public static void main(String args[]){
       Testing obj=new Testing();
        try
         {
              int r=obj.divide(0);
              System.out.println("Output= "+r);
         }
        catch(Exception e)
          {
               System.out.println("catch Block");
               System.out.println(e);
           }   
         finally{
              System.out.println("Exit,bye");
            }
     }
 }
