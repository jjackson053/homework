package allwork;

public class Homework {
    public static void main(String[] args) {
        int x = 40;
        char lol = 't';
        System.out.printf("%d",x);
        System.out.println(" ");
        System.out.format("%c",lol);
        System.out.println(" ");


        System.out.printf("%3d",60);
        System.out.println(" ");
        System.out.format("%6d",120);
        System.out.println(" ");


        System.out.printf("%-3d",880);
        System.out.println(" ");
        System.out.format("%-7d",-10);
        System.out.println(" ");


        System.out.printf("%06d",9);
        System.out.println(" ");
        System.out.format("%09d",10);
        System.out.println(" ");

        System.out.printf("'%5d'",20);
        System.out.println(" ");
        System.out.format("'%-7d'",40);
        System.out.println(" ");

        System.out.printf("'%7.1f'",5.642);
        System.out.println(" ");
        System.out.format("'%6.2f'", 10.845);
        System.out.println(" ");

        System.out.printf("'%9s'","ello");
        System.out.println(" ");
        System.out.format("'%-7s'","help");
        System.out.println(" ");

        System.out.printf("Hello\neveryone");
        System.out.println(" ");
        System.out.format("Bye\tworld");
        System.out.println(" ");

        String result = String.format("the %s jumped over the %s, %d times", "cow", "moon", 2);
        System.out.println(result);

        System.out.format("the %s jumped over the %s, %d times", "cow", "moon", 2);
    }
}
