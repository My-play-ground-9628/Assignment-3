public class Table {
    public static void main(String[] args) {
        
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_GREEN_BOLD = "\033[32;1m";
        final String COLOR_YELLOW_BOLD = "\033[33;1m";
        final String RESET = "\033[30;0m";

        String name = "Shashi";
        int age = 15;
        String subject1 = "SE-5";
        String subject2 = "SE-70";
        String subject3 = "SE-250";
        double marks1 = 75.25;
        double marks2 = 88.333;
        double marks3 = 45.624;

        double total = marks1 + marks2 + marks3;
        double avg = total/3;

        String Status; // Overall status
        String subject1Status; //sub1 status
        String subject2Status; // sub2 status
        String subject3Status; // sub3 status

        final String DISTINGUISHED_PASS = COLOR_BLUE_BOLD + "DISTINGUISHED PASS (DP)" + RESET;
        final String CREDIT_PASS = COLOR_GREEN_BOLD + "CREDIT PASS (CP)" + RESET;
        final String PASS = COLOR_YELLOW_BOLD + "PASS (P)" + RESET;
        final String FAIL = COLOR_RED_BOLD + "FAIL (F)" + RESET;


        //Determini the overall status
        if (avg >= 75) Status = DISTINGUISHED_PASS;
        else if (avg >= 65) Status = CREDIT_PASS;
        else if (avg >= 55) Status = PASS;
        else Status = FAIL;


        //subject1 status 
        if (marks1 >= 75) subject1Status = DISTINGUISHED_PASS;
        else if (marks1 >=65) subject1Status = CREDIT_PASS;
        else if (marks1 >=55) subject1Status = PASS;
        else subject1Status = FAIL;

        //subject2 status
        if (marks2 >= 75) subject2Status = DISTINGUISHED_PASS;
        else if (marks2 >=65) subject2Status = CREDIT_PASS;
        else if (marks2 >=55) subject2Status = PASS;
        else subject2Status = FAIL;

        //subject3 status
        if (marks3 >= 75) subject3Status = DISTINGUISHED_PASS;
        else if (marks3 >=65) subject3Status = CREDIT_PASS;
        else if (marks3 >=55) subject3Status = PASS;
        else subject3Status = FAIL;

        subject1 = String.format("SE-%03d", Integer.valueOf(subject1.substring(3)));
        subject2 = String.format("SE-%03d", Integer.valueOf(subject2.substring(3)));
        subject3 = String.format("SE-%03d", Integer.valueOf(subject3.substring(3)));

        name = String.format("%s%s%s", COLOR_BLUE_BOLD, name.toUpperCase(), RESET);


        //Lets generate the table 
        System.out.println("+".concat("-".repeat(40)).concat("+"));
        System.out.printf("|%10s: %-42s|\n", "Name", name);
        System.out.printf("|%10s: %-28s|\n", "Age", age + " years old");
        System.out.printf("|%10s: %-42s|\n", "Status", Status);
        System.out.printf("|%10s: %-28s|\n", "Total", String.format("%.2f", total));
        System.out.printf("|%10s: %-28s|\n", "Average", String.format("%.2f", avg).concat("%"));
        


        final String LINE = "+".concat("-".repeat(6).concat("+")).concat("-".repeat(12)).concat("+").concat("-".repeat(20).concat("+"));
        System.out.println(LINE);
        System.out.printf("|%-7s|%-12s|%-19s|\n", "Subject", "Marks", "Grade");
        System.out.println(LINE);
        System.out.printf("|%-7s|%-12.2f|%-19s|\n", subject1, marks1, subject1Status);
        System.out.printf("|%-7s|%-12.2f|%-19s|\n", subject2, marks2, subject2Status);
        System.out.printf("|%-7s|%-12.2f|%-19s|\n", subject3, marks3, subject3Status);
        System.out.println("+".concat("-".repeat(40)).concat("+"));


    }
    
}
