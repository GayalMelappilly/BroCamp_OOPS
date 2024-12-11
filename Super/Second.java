// package Super;

public class Second extends First {

    int a=40;

    void display(){
        // Using the keyword Super, the value of the variable a is taken from the parent class
        super.display();
        System.out.println("Second class, A : "+super.a);
    }

    public static void main(String[] args) {
        
        Second s1 = new Second();

        s1.display();

    }
    
}
