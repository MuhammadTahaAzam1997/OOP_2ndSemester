public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int average;
        double[] sample=new double[50];
        for(int i=0;i<50;i++)
            sample=100.0*Math.random();
        for(int i=0;i<50;i++)
            average+=sample[i];
        System.out.print(average/=50);
      
    }
}
