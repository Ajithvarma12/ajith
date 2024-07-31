class largest
{
 public static void main(String args[])
 {
  char  ch='w';
  if(ch>=65&&ch<=90)
   { 
    int c=ch+32;
   System.out.println((char)c);
   }
   else if(ch>=97&&ch<=122)
   {
    int c=ch-32;
   System.out.println((char)c);
   }
  }
 }