public class avreageaandgrade {
    public static void main(String[] args) {
        int maths = 80;
        int science = 85;
        int history = 90;
        int total = maths + science + history;
        int average = total / 3;
        if (average > 90) {
            System.out.println("grade a" + average);

        } else if (average >= 70 && average <= 89) {
            System.out.println("Grade b " + average);

        } else if (average <= 69 && average >= 50) {
            System.err.println(" Grade c" + average);

        } else if (average <= 49 && average >= 30) {
            System.out.println("Grade c " + average);
        } else {
            System.out.println("fails");
        }
    }

}
