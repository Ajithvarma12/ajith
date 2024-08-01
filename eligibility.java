class criteria
{
 	public static void main(String args[])
 		{
		String qualification="btech";
		double percentage = 60;
		int yop = 2024;
		String skills = "java";
   		double fee = 25000;
		String exam = "qualify";
    		double discount = 20000;
 		if((qualification == "btech"||qualification == "Mtech"||qualification =="mca") && (percentage>=60) &&												 (yop==2024||yop==2023) && (skills =="java"||skills =="c"||skills =="python") && exam=="qualify")
		{
		System.out.println("elibility");
		fee = fee-discount;
		}
                else
		{
		System.out.println("not eligibility");
		}
     		System.out.println(fee);
		}
}