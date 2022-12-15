public class Grader {
    public char determinelettergrade(int numbergrade){
        if (numbergrade<0){
           throw new IllegalArgumentException("number grade cannot be cannot be lesss than 0");

        } else if (numbergrade<60) {
            return 'F';
            
        } else if (numbergrade<70) {
            return 'D';
            
            
        } else if (numbergrade<80) {
            return 'C';
            
        } else if (numbergrade<90) {

            return 'B';
        }
        else {
            return 'A';
        }
    }
}
