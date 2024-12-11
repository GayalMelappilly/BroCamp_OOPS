// package Polymorphism;

public class Hello {
    
    public static void main(String[] args) {
        
        First f1 = new First();


        // The class First has two function with same name 'display'. So it'll automatically call the function according to the datatype passed from the object.
        f1.display("THIS IS A SAMPLE STRING");
        f1.display(12);

    }
}
