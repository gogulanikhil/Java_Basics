package exceptionhandling;

public class RecursionCallError {
    public static int fibonocci(int position) {

        return fibonocci(position - 1) + fibonocci(position - 2);

//        to print recursion method without error uncomment below code and comment above line

//        if(position<=1){
//            return position;
//        }
//        return fibonocci(position-1)+ fibonocci(position-2);
//    }
    }

    class Output {
        public static void main(String[] args) {
            System.out.println(RecursionCallError.fibonocci(5));
        }
    }
}
