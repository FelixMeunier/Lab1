public class PersonInfo1 {

    public static String firstName = "Felix";
    public static String lastName = "Meunier";
<<<<<<< HEAD
    public static int studentNo = 000;
    public static String description = "I am me";
=======
    public static int studentNo = 300060508;
    public static String description = "I am undescribable";
>>>>>>> fm/newbranch

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
