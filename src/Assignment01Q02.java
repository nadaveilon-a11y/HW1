public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int times = Integer.valueOf(args[0]);
        for (int i = 1; i <= times; i++){
            double next = 1.0/(2*i - 1);
            if (i%2 == 1) approxPi += next;
            else approxPi -= next;
        }
        approxPi*=4;
        System.out.println(approxPi + " " + actualPi);
    }
}
