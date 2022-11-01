public class eggs
{
  public static void main(String args[])
 {
  int eggs=Integer.parseInt(args[0]);
  // no. of eggs in gross
  int gross=eggs/144;
  
  int aboveGross=eggs%144;
  // no. of eggs in dozen
  int dozen=aboveGross/12;

  // no. of eggs leftOver
  int leftOver=aboveGross%12;
    
  System.out.print("Your number of eggs is ");
  System.out.print(gross+" gross, ");
  System.out.print(dozen+" dozen and ");
  System.out.println(leftOver);
 }
}
