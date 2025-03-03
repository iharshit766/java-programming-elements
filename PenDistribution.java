public class PenDistribution {
    public static void main(String[] args) {
        // store total pens and number of students
        int totalPens = 14;
        int students = 3;
        
        // calculate pens per student
        int pensPerStudent = totalPens / students;
        
        // calculate remaining pens
        int remainingPens = totalPens % students;
        
        // print the result
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
