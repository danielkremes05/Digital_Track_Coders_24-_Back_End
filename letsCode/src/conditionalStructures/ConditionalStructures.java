package conditionalStructures;

public class ConditionalStructures {

    public static void main(String[] args) {
        int grandeStudent = -10;

        if (grandeStudent >= 90) {
            System.out.println("Student Approved A");
        } else if (grandeStudent >= 70 && grandeStudent < 90){
            System.out.println("Student Approved B");
        } else if (grandeStudent >= 60 && grandeStudent < 70){
            System.out.println("Student Approved C");
        } else if (grandeStudent < 60 && grandeStudent > 0) {
            System.out.println("Student reproved");
        } else {
            System.out.println("Invalid note");
        }
    }

}
