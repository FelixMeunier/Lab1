public class PersonInfo3 {

    public static String firstName = "Yanic";
    public static String lastName = "Mainville";
    public static int studentNo = 173819;
    public static String description = "Speedrunning forever";
    public static int studentNo = 300060226;

    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;

        System.out.println(out);
    }


    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;

        System.out.println(out);
    }
}
