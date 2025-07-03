public class total{
    public static void main(String[]agrs){
        int[] marks = {90,89,88,89,78};
        int total=345;
        for(int mark:marks){
            System.out.println(mark);
            total+=mark;
        }

          System.out.println("total marks:"+ total);
    }
}
