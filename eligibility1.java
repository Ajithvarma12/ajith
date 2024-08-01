class Eligibility {
    public static void main(String[] args) {
        int fee = 25000;
        String qualification = "btech";
        double percentage = 60;
        int yop = 2024;
        String skills = "java"; // Corrected here
        double discount = 20000;
        String exam = "qualify";

        if ((qualification.equals("btech") || qualification.equals("MTech") || qualification.equals("mca")) &&
            (percentage >= 60) &&
            (yop == 2023 || yop == 2024) &&
            (skills.equals("java") || skills.equals("c") || skills.equals("python")) &&
            (exam.equals("qualify"))) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }
}
