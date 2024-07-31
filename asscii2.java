class asscii2
{
  public static void main(String args[])
  {
   char c ='a';
   int ascii=c;
   System.out.println(ascii);
   if(c>=65&& c<=90)
   System.out.println("upper case");
   else  
   if(c>=97&& c<=122)
   System.out.println("lower case");
   else
   if(c>=48&& c<=58)
   System.out.println("number");
   else
   System.out.println("sysmbol");
  }
}