import java.util.Objects;
import java.util.Scanner;

class StackOperations{
    int top = -1;
    int size = 10;
    int[] array = new int[size];
    // push element stack function
    void push() {

        Scanner sc = new Scanner(System.in);

        if (top == size - 1) {
            System.out.println("Your Stack is fully");
            System.out.println();
        } else {
            System.out.print("Enter the element : ");
            int i = sc.nextInt();
            top = top + 1;
            array[top] = i;
            System.out.println("Item Inserted");
            System.out.println();
        }
    }
    //    pop element stack function
    void pop(){
        if (top==-1){
            System.out.println("Your Stack is Empty");
            System.out.println();
        } else {

            System.out.printf("Deleted Element is %d ",array[top]);
            top = top - 1;
            System.out.println();
        }
    }
    // display element function
    void display(){
        if (top==-1){
            System.out.println("Your Stack is Empty");
            System.out.println();
        }else {
            System.out.println("Your Stack Present Element is : ");
            for (int j=top; j>=0; j--){
                System.out.printf("%d ",array[j]);
            }
        }
        System.out.println();
    }

}

class QueueOperations{
    int front = -1;
    int rear = -1;
    int size = 10;

    int[] array = new int[size];
    // enter the element of queue function
    void enqueue(){

        Scanner sc = new Scanner(System.in);

        if (rear == size){
            System.out.println("Your Queue is Full.");
            System.out.println();
        } else {
            System.out.print("Enter the element : ");
            int e = sc.nextInt();

            rear++;
            array[rear] = e;

            System.out.println("Element Inserted.");
            System.out.println();

            if (front==-1){
                front = 0;
            }
        }
    }

    //    delete the element of queue function
    void deQueue(){
        if (front==-1){
            System.out.println("Queue is Empty");
            System.out.println();
        } else {
            System.out.printf("Your queue deleted element is %d\n",array[front]);
            front++;
            System.out.println();
        }
    }

    // display all queue element function
    void disQueue(){
        if (front==-1){
            System.out.println("Queue is Empty");

        }else {
            System.out.println("Your queue element is :");
            for (int i = front; i<=rear; i++){
                System.out.printf("%d ",array[i]);
            }
        }
        System.out.println();
    }
    // display the front element of queue function
    void disFrontQueue(){
        if (front==-1){
            System.out.println("Queue is Empty");
            System.out.println();
        } else {
            System.out.printf("Your queue front element is %d\n",array[front]);
            System.out.println();
        }

    }
    // display the last element of queue function
    void disLastQueue(){
        if (front==-1){
            System.out.println("Queue is Empty");
            System.out.println();
        } else {
            System.out.printf("Your queue last element is %d\n",array[rear]);
            System.out.println();

        }
    }

}

public class DSA_Main_Project {

    public static void findFactorial() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO FIND FACTORIAL ANY NUMBER <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        int count = 1;

        for (int i=n; i>=1; i--){
            count = count * i;
        }

        System.out.printf("Your number %d factorial is %d",n,count);
        System.out.println();

    }

    public static void reverseString() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO REVERSE STRING ANY NUMBER <><><><><><><><>");
        System.out.println();

        System.out.print("Enter any String : ");
        String name = sc.nextLine();

        char[] reverseName = name.toCharArray();

        System.out.print("Your String reverse is : ");

        for (int i=reverseName.length-1; i>=0; i--){
            System.out.print(reverseName[i]);
        }
        System.out.println();

    }

    public static void writeTable() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO WRITE TABLE ANY NUMBER <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the any Number : ");
        int n = sc.nextInt();

        System.out.printf("Your number %d table is :",n);
        System.out.println();
        System.out.println();

        for (int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
        System.out.println();

    }

    public static void swappingTwoNumber() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO SWAPPING TWO NUMBER <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second Number : ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.printf("First Number = %d\n",a);
        System.out.printf("Second Number = %d\n",b);

        System.out.println();

    }

    public static void tower_Hanoi(int n, char source, char help, char destination){
        if(n<=0){
            System.out.println("Disk is not Present Tower.");
        } else if (n==1) {
            System.out.printf("%c to %c\n",source,destination);
        }else {
            tower_Hanoi(n-1,'A','C','B');
            tower_Hanoi(1,'A','B','C');
            tower_Hanoi(n-1, 'B','A','C');
        }
    }

    public static void towerHanoiProblem() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO TOWER HANOI PROBLEM ANY DISKS <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the number of Disk : ");
        int n = sc.nextInt();

        int base = 2;
        int result = 1;

        for (int i=1; i<=n; i++){
            result = result * base;
        }
        int step = result - 1;

        System.out.println();
        System.out.printf("Number of Disk Transfer is %d times.\n",step);
        System.out.println();

        tower_Hanoi(n,'A','B','C');

    }

    public static void otherProgram() {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();
            System.out.println("Press 1 into Find Factorial any Number");
            System.out.println("Press 2 into Reverse String");
            System.out.println("Press 3 into Table Any Number");
            System.out.println("Press 4 into Swapping Two Number");
            System.out.println("Press 5 into Tower Hanoi Problem");
            System.out.println("Press 0 into Back Program");
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();

            System.out.print("Choose the Operation : ");
            n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    findFactorial();
                }
                case 2 -> {
                    reverseString();
                }
                case 3 -> {
                    writeTable();
                }
                case 4 -> {
                    swappingTwoNumber();
                }
                case 5 -> {
                    towerHanoiProblem();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("Your program back one step.");
                    System.out.println();
                }
                default -> {
                    System.out.println();
                    System.out.println("Your choice is not given number. Please try again.");
                    System.out.println();
                }
            }
        }while(n!=0);
    }



    public static void stackOperation() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO STACK OPERATION USING ARRAY <><><><><><><><>");
        System.out.println();

        StackOperations s = new StackOperations();

        int n;

        do {
            System.out.println();
            System.out.println("Press 1 to Push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to Display");
            System.out.println("Press 0 to Back Program");
            System.out.println();
            System.out.print("Enter the choice : ");
            n = sc.nextInt();
            System.out.println();

            switch (n){

                case 1 -> {
                    s.push();
                }

                case 2 -> {
                    s.pop();
                }

                case 3 ->{
                    s.display();
                }

                case 0 -> {
                    System.out.println("Your program back one step.");
                    System.out.println();
                }

                default -> {
                    System.out.println("Your choice is not given number. Please try again.");
                    System.out.println();
                }
            }

        }while(n!=0);

    }

    public static void queueOperation() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO QUEUE OPERATION USING ARRAY <><><><><><><><>");
        System.out.println();

        QueueOperations q = new QueueOperations();

        int n;

        do {
            System.out.println();
            System.out.println("Press 1 into Enter Element Queue");
            System.out.println("Press 2 into Delete Element Queue");
            System.out.println("Press 3 into Display All Element Queue");
            System.out.println("Press 4 into Display Front Element Queue");
            System.out.println("Press 5 into Display Last Element Queue");
            System.out.println("Press 0 into Back Program");
            System.out.println();

            System.out.print("Enter the Choice : ");
            n = sc.nextInt();
            System.out.println();

            switch (n) {
                case 1 -> {
                    q.enqueue();
                }
                case 2 -> {
                    q.deQueue();
                }
                case 3 -> {
                    q.disQueue();
                }
                case 4 -> {
                    q.disFrontQueue();
                }
                case 5 -> {
                    q.disLastQueue();
                }
                case 0 -> {
                    System.out.println("Your program back one step.");
                }
                default -> {
                    System.out.println("Your choice is not given number. Please try again.");
                }
            }

        }while (n!=0);
    }

    public static void stack_queueOperation() {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();
            System.out.println("Press 1 into Stack Operation");
            System.out.println("Press 2 into Queue Operation");
            System.out.println("Press 0 into Back Program");
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();

            System.out.print("Enter your choice : ");
            n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    stackOperation();
                }
                case 2 -> {
                    queueOperation();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("Your program back one step.");
                    System.out.println();
                }
                default -> {
                    System.out.println();
                    System.out.println("Your choice is not given number. Please try again.");
                    System.out.println();
                }
            }
        }while(n!=0);
    }

    public static void matrixAddition() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO MATRIX ADDITION USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the row of Matrix : ");
        int row = sc.nextInt();

        System.out.print("Enter the column of Matrix : ");
        int column = sc.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];


        System.out.println("Enter the element first Matrix .");

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.printf("Enter (%d,%d) element : ",i+1,j+1);
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the element second Matrix .");

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.printf("Enter (%d,%d) element : ",i+1,j+1);
                matrix2[i][j] = sc.nextInt();
            }
        }

        // sum of matrix

        int[][] matrixSum = new int[row][column];

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\nYour Matrix sum is :");

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.printf("%d ",matrixSum[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void matrixSubtraction() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO MATRIX SUBTRACTION USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the row of Matrix : ");
        int row = sc.nextInt();

        System.out.print("Enter the column of Matrix : ");
        int column = sc.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];


        System.out.println("Enter the element first Matrix .");

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.printf("Enter (%d,%d) element : ",i+1,j+1);
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the element second Matrix .");

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.printf("Enter (%d,%d) element : ",i+1,j+1);
                matrix2[i][j] = sc.nextInt();
            }
        }

        // sum of matrix

        int[][] matrixSum = new int[row][column];

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                matrixSum[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("\nYour Matrix subtract is :");

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.printf("%d ",matrixSum[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void matrixMultiplication() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO MATRIX MULTIPLICATION USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the row of First Matrix : ");
        int row1 = sc.nextInt();

        System.out.print("Enter the Column of First Matrix : ");
        int column1 = sc.nextInt();

        int[][] matrix1 = new int[row1][column1];

        System.out.println("Enter the element of First Matrix.");

        for (int i=0; i<row1; i++){
            for(int j=0; j<column1; j++){
                System.out.printf("Enter (%d,%d) element : ",i+1,j+1);
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the row of Second Matrix : ");
        int row2 = sc.nextInt();

        System.out.print("Enter the Column of Second Matrix : ");
        int column2 = sc.nextInt();

        int[][] matrix2 = new int[row2][column2];

        System.out.println("Enter the element of Second Matrix.");

        for (int i=0; i<row2; i++){
            for(int j=0; j<column2; j++){
                System.out.printf("Enter (%d,%d) element : ",i+1,j+1);
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] resultMatrix = new int[row1][column2];
        int sum = 0;

        if (column1==row2){
            for (int i=0; i<row1; i++){
                for (int j=0; j<column2; j++){
                    for (int k=0; k<column1; k++){
                        sum += matrix1[i][k] + matrix2[k][j];
                    }
                    resultMatrix[i][j] = sum;
                    sum = 0;
                }
            }
        } else{
            System.out.println("Your Matrix Order is not Valid for Matrix Multiplication.");
            return;
        }

        for (int i=0; i<row1; i++){
            for(int j=0; j<column2; j++){
                System.out.printf("%d ",resultMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void matrixDivision() {

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO MATRIX DIVISION USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.println("This program is not Completed.Please try a later after some days");
        System.out.println();
    }

    public static void matrixTraverse() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO MATRIX TRAVERSE USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the rows of matrix : ");
        int row = sc.nextInt();

        System.out.print("Enter the columns of matrix : ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the element of First Matrix.");

        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("Enter (%d,%d) element : ",i+1,j+1);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix ");
        for (int i=0; i<row; i++){
            System.out.print("    ");
            for(int j=0; j<col; j++){
                System.out.printf(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Traverse Matrix ");
        for (int i=0; i<row; i++){
            System.out.print("    ");
            for(int j=0; j<col; j++){
                System.out.printf(matrix[j][i]+" ");
            }
            System.out.println();
        }


        System.out.println();
    }

    public static void matrixCalculation() {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();
            System.out.println("Press 1 into Matrix Addition");
            System.out.println("Press 2 into Matrix Subtraction");
            System.out.println("Press 3 into Matrix Multiplication");
            System.out.println("Press 4 into Matrix Division");
            System.out.println("Press 5 into Matrix Traverse");
            System.out.println("Press 0 into Back Program");
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();

            System.out.print("Enter your choice : ");
            n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    matrixAddition();
                }
                case 2 -> {
                    matrixSubtraction();
                }
                case 3 -> {
                    matrixMultiplication();
                }
                case 4 -> {
                    matrixDivision();
                }
                case 5 -> {
                    matrixTraverse();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("Your program back one step.");
                    System.out.println();
                }
                default -> {
                    System.out.println();
                    System.out.println("Your choice is not given number. Please try again.");
                    System.out.println();
                }
            }
        }while(n!=0);
    }

    public static void insertionSort() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO INSERTION SORTING USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i=0; i<size; i++){
            System.out.printf("Enter %d element : ",i+1);
            array[i] = sc.nextInt();
        }

        System.out.println("\nYour Unsorted Array is ");
        for (int i=0; i<size; i++){
            System.out.printf("%d ",array[i]);
        }

        for (int i = 1; i < size; i++)
        {
            int current = array[i];
            int j = i-1;

            while (j>=0 && current<array[j])
            {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = current;

        }

        System.out.println("\nYour Sorted Array is ");
        for (int i=0; i<size; i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println();

    }

    public static void selectionSort() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO SELECTION SORTING USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i=0; i<size; i++){
            System.out.printf("Enter %d element : ",i+1);
            array[i] = sc.nextInt();
        }

        System.out.println("\nYour Unsorted Array is");
        for (int i=0; i<size; i++){
            System.out.printf("%d ",array[i]);
        }

        int smallest;

        for (int i=0; i<size; i++){
            smallest = i;
            for (int j=i+1; j<size; j++){
                if (array[smallest]>array[j]){
                    smallest = j;
                }
            }

            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

        System.out.println("\nYour Sorted Array is");
        for (int i=0; i<size; i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println();

    }

    public static void bobbleSort() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO BOBBLE SORTING USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the element of Array in One by One");

        for (int i=0; i<size; i++){
            System.out.printf("Enter %d element : ",i+1);
            array[i] = sc.nextInt();
        }

        System.out.println("\nYour Unsorted Array is ");

        for (int i=0; i<size; i++){
            System.out.printf("%d ",array[i]);
        }

        for (int i=0; i<size-1; i++){
            for (int j=0; j<size-i-1; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("\nYour Sorted Array is ");

        for (int i=0; i<size; i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println();

    }

    public static void quickSort() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO QUICK SORTING USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        int low = 0;
        int high = size - 1;


        System.out.println("Enter the element of Array in One by One.");
        for (int i=0; i<=high; i++){
            System.out.printf("Enter %d element : ",i+1);
            array[i] = sc.nextInt();
        }

        System.out.println("\nYour Unsorted Array is.");
        for (int i=0; i<=high; i++){
            System.out.printf("%d ",array[i]);
        }

        quicksort(array,low,high);

        System.out.println("\nYour Sorted Array is.");
        for (int i=0; i<=high; i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println();
    }

    public static void quicksort(int[] array, int low, int high) {

        int partitionIndex;

        if (low<high){
            partitionIndex = partition(array,low,high);
            quicksort(array,low,partitionIndex-1);
            quicksort(array,partitionIndex+1,high);

        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;

        do {
            while (array[i]<=pivot){
                i++;
            }

            while (array[j]>pivot){
                j--;
            }

            if (i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }while (i<j);

        if (i>j){
            int temp = array[low];
            array[low] = array[j];
            array[j] = temp;
        }

        return j;
    }

    public static void mergeSort() {

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO MERGE SORTING USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.println("This program is not Completed.Please try a later after some days");
        System.out.println();

    }

    public static void sortingElement() {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();
            System.out.println("Press 1 into Insertion Sorting");
            System.out.println("Press 2 into Selection Sorting");
            System.out.println("Press 3 into Bobble Sorting");
            System.out.println("Press 4 into Quick Sorting");
            System.out.println("Press 5 into Merge Sorting");
            System.out.println("Press 0 into Back Program");
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();

            System.out.print("Enter your choice : ");
            n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    insertionSort();
                }
                case 2 -> {
                    selectionSort();
                }
                case 3 -> {
                    bobbleSort();
                }
                case 4 -> {
                    quickSort();
                }
                case 5 -> {
                    mergeSort();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("Your program back one step.");
                    System.out.println();
                }
                default -> {
                    System.out.println();
                    System.out.println("Your choice is not given number. Please try again.");
                    System.out.println();
                }
            }
        }while(n!=0);
    }

    public static void linearSearch() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO LINEAR SEARCH USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the element of one by one.");

        for (int i=0; i<size; i++){
            System.out.printf("Enter %d element : ",i+1);
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the search element : ");
        int search = sc.nextInt();

        int count = 0;

        for (int i=0; i<size; i++){
            if (array[i]==search){
                System.out.println();
                System.out.printf("Your element %d is position of this array %d.",search,i+1);
                count++;
                System.out.println();
            }
        }

        if (count==0){
            System.out.println();
            System.out.printf("Your element %d is not found this array.",search);
            System.out.println();
            return;
        }
    }

    public static int checkorder(int[] array, int size) {

        int count = 0;

        for (int i=0; i<size-1; i++){
            if (array[i] < array[i+1]){
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void binarySearch() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO BINARY SEARCH USING ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the element of one by one Ascending Order");

        for (int i=0; i<size; i++){
            System.out.printf("Enter %d element : ",i+1);
            array[i] = sc.nextInt();
        }

        int order = checkorder(array,size);

        if (order==size-1) {
            System.out.println("Your array is Sorted.");
        } else {
            System.out.println();
            System.out.println("Your element is not Ascending Order. Please try again.");
            System.out.println();
            return;
        }

        System.out.print("Enter the search element : ");
        int search = sc.nextInt();

        int low = 0;
        int high = size-1;
        int mid;
        int count = 0;

        do {
            mid = (low+high)/2;

            if (array[mid]==search){
                System.out.printf("Your element %d is position of this array %d.",search,mid+1);
                System.out.println();
                count++;
            }
            if (array[mid]>search){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }while(low<=high);

        if (count==0){
            System.out.printf("Your element %d is not found this array.",search);
            System.out.println();
        }
    }
    public static void linearSearchMultiArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO LINEAR SEARCH USING MULTI-ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the row of Multi-Array : ");
        int row = sc.nextInt();

        System.out.print("Enter the column of Multi_Array : ");
        int column = sc.nextInt();

        int[][] array = new int[row][column];

        System.out.println("Enter the element of Multi-Array in one by one.");

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.printf("Enter (%d,%d) element : ",i+1,j+1);
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Enter the search element : ");
        int search = sc.nextInt();
        int count =0;

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (array[i][j]==search){
                    System.out.printf("Your element %d is position of this multi-array (%d,%d).",search,i+1,j+1);
                    System.out.println();
                    count++;
                }
            }
        }

        if (count==0){
            System.out.printf("Your element %d is not found this array.",search);
            System.out.println();
        }

    }

    public static void binarySearchUnsortedArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("<><><><><><><><> WELCOME TO BINARY SEARCH USING UNSORTED ARRAY <><><><><><><><>");
        System.out.println();

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the element of one by one.");

        for (int i=0; i<size; i++){
            System.out.printf("Enter %d element : ",i+1);
            array[i] = sc.nextInt();
        }

        for (int i=0; i<size-1; i++){
            for (int j=0; j<size-i-1; j++){

                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.print("Your Sorted array is : ");

        for (int i=0; i<size; i++){
            System.out.printf("%d ",array[i]);
        }

        System.out.println();
        System.out.print("Enter the search element : ");
        int search = sc.nextInt();

        int low = 0;
        int high = size-1;
        int mid;
        int count = 0;

        do {
            mid = (low+high)/2;

            if (array[mid]==search){
                System.out.printf("Your element %d is position of this array %d.",search,mid+1);
                System.out.println();
                count++;
            }
            if (array[mid]>search){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }while(low<=high);

        if (count==0){
            System.out.printf("Your element %d is not found this array.",search);
            System.out.println();
        }
    }

    public static void searchElement() {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();
            System.out.println("Press 1 into Linear Search");
            System.out.println("Press 2 into Binary Search");
            System.out.println("Press 3 into Linear Search in Multi-array");
            System.out.println("Press 4 into Binary Search in Unsorted Array");
            System.out.println("Press 0 into Back Program");
            System.out.println();
            System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
            System.out.println();

            System.out.print("Enter your choice : ");
            n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    linearSearch();
                }
                case 2 -> {
                    binarySearch();
                }
                case 3 -> {
                    linearSearchMultiArray();
                }
                case 4 -> {
                    binarySearchUnsortedArray();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("Your program back one step.");
                    System.out.println();
                }
                default -> {
                    System.out.println();
                    System.out.println("Your choice is not given number. Please try again.");
                    System.out.println();
                }
            }
        }while(n!=0);
    }

    public static void usingArray() {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println();
            System.out.println("<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>");
            System.out.println();
            System.out.println("Press 1 into Searching Element");
            System.out.println("Press 2 into Sorting Element");
            System.out.println("Press 3 into Matrix Calculation");
            System.out.println("Press 4 into Stack/Queue Operation");
            System.out.println("Press 5 into Other Program");
            System.out.println("Press 0 into Back Program");
            System.out.println();
            System.out.println("<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>");
            System.out.println();

            System.out.print("Enter your choice : ");
            n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    searchElement();
                }
                case 2 -> {
                    sortingElement();
                }
                case 3 -> {
                    matrixCalculation();
                }
                case 4 -> {
                    stack_queueOperation();
                }
                case 5 -> {
                    otherProgram();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("Your program back one step.");
                }
                default -> {
                    System.out.println();
                    System.out.println("Your choice is not given number. Please try again.");
                }
            }
        }while(n!=0);

    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter the User_name : ");
        String userName = sc.next();

        if (Objects.equals(userName, "Happy")){

            System.out.print("Enter the Password : ");
            int password = sc.nextInt();

            if(password==2005){
                System.out.println();
                System.out.println("<><><><><><><> LogIn Successfully <><><><><><><>");
                System.out.println();
                System.out.println("<><><><><><> WELCOME TO DSA PROJECT <><><><><><>");
            }else {
                System.out.println("Your password is wrong. Please try again.");
                return;
            }
        }else {
            System.out.println("Your user_name is wrong. Please try again.");
            return;
        }

        int n;

        do {
            System.out.print("\n");
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
            System.out.print("\n");
            System.out.println("Press 1 into DSA Program Using Array");
            System.out.println("Press 2 into DSA Program Using Link list");
            System.out.println("Press 0 into Exit Program");
            System.out.print("\n");
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
            System.out.print("\n");

            System.out.print("Enter your choice : ");
            n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    usingArray();
                }
                case 2 -> {
//                    usingLinkList();
                }
                case 0 -> {
                    System.out.println();
                    System.out.println("<>*<>*<>*<>*<>*<> Thank You <>*<>*<>*<>*<>*<>");
                    System.out.println("Your program is exit successfully");
                    System.out.println();
                }
                default -> {
                    System.out.println();
                    System.out.println("Your choice is not given number. Please try again.");
                    System.out.println();
                }
            }
        }while (n!=0);
    }
}
