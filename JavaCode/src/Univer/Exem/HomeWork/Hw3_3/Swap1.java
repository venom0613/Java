import java.util.*;

public class Swap1 {
    public static void main(String[] argv)
            throws Exception
    {

        try {

            // creating object of List<String>
            List<String> vector = new ArrayList<String>();

            // populate the vector
            vector.add("A");
            vector.add("B");


            // printing the vector before swap
            System.out.println("1 번호출: " + vector);

            // swap the elements
            System.out.println("\nSwapping 0th and 1th element.");
            Collections.swap(vector, 0, 1);

            // printing the vector after swap
            System.out.println("\n2 번호출: " + vector);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }
    }
}

