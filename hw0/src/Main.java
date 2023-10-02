//Creative Exercise 1a: Drawing a Triangle
public class Main {
    public static void main(String[] args) {
        int n = 5,i = 1 ;
        String star = "*";
        while (i<n+1){
            System.out.println(star);
            i++;
            star += '*';
        }
    }
}