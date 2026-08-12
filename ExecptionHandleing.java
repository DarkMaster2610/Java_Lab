public class ExecptionHandleing {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // Trigger division by zero

        try {
            // Code that might throw an exception
            int result = numerator / denominator;
            System.out.println("Result: " + result); 
            
        } catch (ArithmeticException e) {
            // Code that runs if the exception occurs
            System.out.println("Error: Cannot divide a number by zero!");
            
        } finally {
            // Code that ALWAYS runs, regardless of an exception
            System.out.println("Execution of try-catch block is complete.");
        }

        System.out.println("Program continues running smoothly...");
    }
}
