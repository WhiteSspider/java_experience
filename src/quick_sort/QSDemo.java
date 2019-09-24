package quick_sort;

public class QSDemo {
    public static void main(String[] args) {
        char a[] = {'d','x','a','r','p','j','i'};
        int i;
        System.out.println("Original array:");
        for(i=0;i<a.length;i++)
            System.out.println(a[i]);
        System.out.println();

        //отсортировать массив
        Quicksort.qsort(a);

        System.out.println("Stored array:");
        for(i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
