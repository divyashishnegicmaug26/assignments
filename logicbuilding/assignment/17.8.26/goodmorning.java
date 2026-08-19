public class goodmorning {
    public static void main(String[] args) {
        int hours = 6;
        String ampm = "pm";
        if ((hours < 12 && ampm == "am" && hours >= 5) || (hours == 12 && ampm == "pm")) {
            System.out.println("Good Morning");
        } else {
            System.out.print("Good Night");
        }
    }

}
