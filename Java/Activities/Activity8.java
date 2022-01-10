package activities;

public class Activity8 {
    public static void main(String[] args) {
        try {
            exceptionTest("Message is given in here");
            exceptionTest(null);
            exceptionTest("Not executed here");
        }catch (CustomException e){
            System.out.println("Exception caught :: "+e.getMessage());
        }
    }
    public static void exceptionTest(String mes) throws CustomException {
        if(mes==null)
            throw new CustomException("String is null");
        else System.out.println(mes);
    }
}
