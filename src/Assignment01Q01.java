public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String st: args){
            char c = st.charAt(0);
            int asc = c;
            if (asc%5 == 0) System.out.println(c);
        }
    }
}
