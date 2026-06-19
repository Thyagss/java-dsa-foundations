/*

ARRAY TRAVERSAL IN JAVA

Concepts Covered:

* Array Declaration and Initialization
* Array Traversal using for Loop
* Accessing Elements using Index
* Accessing Elements at Even Indexes
* Accessing Elements at Odd Indexes
* Traversing from Start to Middle
* Traversing from Middle to End

Notes:

* Arrays store multiple values of the same data type in a single variable.
* Array indexing starts from 0.
* for loop is useful when index access is required.
* for-each loop is useful for read-only traversal of array elements.
* arr.length returns the total number of elements in the array.
* Traversal means visiting each element of an array one by one.
* All array operations are implemented inside separate methods and invoked from main() for practice and better code organization.

*/

package arrays;

public class ArrayTraversal {

    // Store and Print Student Ages
    public void printStudentAges(){

        int arr[] = {18,19,20,21,22};

        for(int age : arr)
        {
            System.out.println(age);
        }

    }

    // Print Indexes of an Array
    public void printIndexes(){
        int arr[] = {1,2,3,4,5,6};

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(i);
        }
    }

    // Print Elements at Even Indexes
    public void printEvenIndex() {
        int arr[] = {1,2,3,4,5,6};

        System.out.print("Even Indexes Values: ");

        for(int i=0; i<arr.length; i+=2)
        {
            System.out.print(arr[i]+" ");
        }
    }

    // Print Elements at Odd Indexes
    public void printOddIndex() {
        int arr[] = {4,6,7,8,9,11,23,45,90,34,21};

        System.out.print("Odd Indexes Values: ");

        for(int i=1; i<arr.length; i+=2)
        {
            System.out.print(arr[i] + " ");
        }
    }

    // Print Elements from Start to Middle
    public void printTillMiddle() {
        int arr[] = {13,22,34,56,64,32,12,20};

        System.out.print("Start to Middle: ");

        for(int i=0; i<arr.length/2; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    // Print Elements from Middle to End
    public void printFromMiddle() {
        int arr[] = {13,22,34,56,64,32,12,20};

        System.out.print("Middle to End: ");

        for(int i=arr.length/2; i<=arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        ArrayTraversal obj = new ArrayTraversal();

        obj.printStudentAges();
        obj.printIndexes();
        obj.printEvenIndex();
        obj.printOddIndex();
        obj.printTillMiddle();
        obj.printFromMiddle();
    }

}
