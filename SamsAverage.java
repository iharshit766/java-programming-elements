public class SamsAverage {
    public static void main(String[] args) {
        // store marks for each subject
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        
        // calculate total marks
        int totalMarks = maths + physics + chemistry;
        
        // find average percentage
        double average = totalMarks / 3.0;
        
        // print the result
        System.out.println("Sam's average mark in PCM is " + average);
    }
}
