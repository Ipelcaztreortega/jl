package Fundamentals.Methods;

public class LocalVarAndScope {
    // Local variables is called local because it is available for use by the code block in which it was declared
    // Local variables are always in scope in the block they are declared

    // They are also in scope for any nested blocks or blocks contained within the outer block
    public static void main(String[] args) {
        boolean math = false;
        // example
        if (math) {
            int myCounter = 10; // myCounter is local to this if block
        };

        // myCounter is out of scope here, same for the for loops

        // Fundamentals.Switch.Switch is different
        int value = 2;
        switch (value) {
            case 1:
                int i = 10;
                break;
            default:
                i = value;              // This is ok
                System.out.println(i); // This is ok
                break;
        };
    }
}
