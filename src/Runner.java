public class Runner {
    public static void main(String[] args) {
        car boy = new car(2016, "Tesla Model S",18);
        System.out.println(boy.toString());
        boy.drive(80);
        System.out.println(boy.toString());

        Rectangle test = new Rectangle(8,8);
        System.out.println(test.getDiagonal());
        System.out.println(test.getArea());
        System.out.println(test.isSquare());
    }
}