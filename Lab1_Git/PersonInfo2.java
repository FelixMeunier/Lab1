public class PersonInfo2 {

    public static String firstName = "RJ";
    public static String lastName = "Stead";
<<<<<<< HEAD
    public static int studentNo = 300072868;
    public static String description = "MacBook";
=======
    public static int studentNo = 35534;
    public static String description = "Je marque n'importe quoi.";
>>>>>>> ee96bc2e7bedc299d60501cf3ffd1fe7b9b67613

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
