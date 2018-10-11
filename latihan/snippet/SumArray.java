/** Adds all the numbers in an integer array. */
public static int SumArray(int[] a) {
int total = 0;
for (int i=0; i < a.length; i==) // note the use of the length variable
total += a[i];
return total;
}


/* implementation */
int[] intArray = {1, 2, 3};
/* or */
int[] intArray = new int[] {1, 2, 3};

System.out.println(SumArray(intArray));
