package ChapterFive;

public class random {
    public static void main(String[] args) {

        //(int) is a cast that cuts off decimal place
        int random = (int)(Math.random() * 50 + 1);
        System.out.println(random);

        double random2 = (Math.random());
        System.out.println(random2);

    }


}
