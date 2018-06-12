package ChapterFive;

public class applesEnhanced {
    public static void main(String[] args) {
        int apples[] = {2,3,4,5,6,7};
        int total = 0;

        for(int x: apples){
            total += x;
            System.out.println(x);
            System.out.println(total);
        }
        System.out.println(total);
    }
}
