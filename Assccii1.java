class Assccii1
{
 public static void main(String args[])
 {
  char c='9';
  if(c<=90 && c>=65)
   	System.out.println("capital letter");
  else if(c<=122 && c>=97)
   	System.out.println("lower letter");
  else if(c<=57 && c>=48)
   	System.out.println("digit");
  else
    	System.out.println("Sysmbol");
 }
}