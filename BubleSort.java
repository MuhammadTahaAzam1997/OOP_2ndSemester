class BubleSort {

    public static void main(String []args) {
    int i;



    int a[]  = new int[10] ;
    System.out.println("Values Before the sort:\n");
    for (i = 0; i <a.length; i++){
 a[i]=(int)(Math.random()*900+100);
    System.out.print(a[i] + "  ");

    System.out.println();
}
    bubble_srt(a, a.length);
    System.out.print("Values after the sort:\n");
    for (i = 0; i < a.length; i++)
        System.out.print(a[i] + "  ");
    System.out.println();



static void bubble_srt(int a[], int n) {
    int i, j, t = 0;
    for (i = 0; i < n; i++) {
        for (j = 1; j < (n - i); j++) {
            if (a[j - 1] > a[j]) {
                t = a[j - 1];
                a[j - 1] = a[j];
                a[j] = t;
            }
        }
    }
}
}