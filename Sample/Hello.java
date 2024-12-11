public class Hello{
    public static void main(String[] args) {
        
        sum s1 = new sum();
        sum s2 = new sum();

        s1.a = 23432;
        s1.b = 31231;

        s2.a = 12312;
        s2.b = 14213;

        s1.calSum();
        s2.calSum();

        s1.display();
        s2.display();

    }
}