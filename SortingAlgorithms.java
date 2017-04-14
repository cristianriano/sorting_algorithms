import java.util.*;

public class SortingAlgorithms{

  public static void main(String... args){
    // Default array
    Integer array[] = {4,76,34,97,12,8,123,46};
    Integer array2[] = {23,54,32,67,89,72};

    Scanner sc = new Scanner(System.in);
    String line;
    char option;
    boolean flag = true;
    int n;
    int[] vector;

    printMenu(array);
    while((line = sc.nextLine()) != null){
      option = line.charAt(0);
      switch(option){
        // Input new array
        case '1':
          List<Integer> newArray = new ArrayList<Integer>();
          do {
            flag = true;
            System.out.println("Input a letter to end");
            line = sc.nextLine();
            for(char digit:line.toCharArray()){
              flag = (flag && Character.isDigit(digit));
            }
            if(flag)
              newArray.add(Integer.parseInt(line));
          } while(flag);
          array = new Integer[newArray.size()];
          array = newArray.toArray(array);
          break;

        // Bubble Sort
        case '2':
          Sorter.bubble(array);
          System.out.println("Sorted: ");
          Sorter.printArray(array);
          break;

        // Quick sort
        case '3':
          Sorter.quick(array, 0, array.length - 1);
          System.out.println("Sorted: ");
          Sorter.printArray(array);
          break;

        // Insertion sort
        case '4':
          System.out.println("Input array length: ");
          n = sc.nextInt();
          vector = new int[n];
          for(int i=0; i<n; i++){
            vector[i] = sc.nextInt();
            Sorter.insertion(vector, i+1);
            Sorter.printArray(vector);
          }
          break;

        case '5':
          Sorter.shell(array);
          System.out.println("Sorted: ");
          Sorter.printArray(array);
          break;

        case '6':
          // Sort array 1
          Sorter.shell(array);
          System.out.println("Array 1: ");
          Sorter.printArray(array);
          // Sort array 2
          Sorter.shell(array2);
          System.out.println("Array 2: ");
          Sorter.printArray(array2);
          // Result
          System.out.println("Sorted: ");
          Sorter.printArray(Sorter.intercalation(array, array2));
          break;

        default:
          System.out.println("Invalid value");
          break;

      }
      sc.nextLine();
      printMenu(array);
    }

    // Sort and print array
    Sorter.bubble(array);
    Sorter.printArray(array);
  }

  static void printMenu(Integer[] array){
    System.out.println();
    System.out.println("=========================================");
    System.out.print("Array: ");
    Sorter.printArray(array);
    System.out.println();
    System.out.println("Pick and option:");
    System.out.println(" 1. Input new Array");
    System.out.println(" 2. Bubble sort");
    System.out.println(" 3. Quick sort");
    System.out.println(" 4. Insertion sort");
    System.out.println(" 5. Shell sort");
    System.out.println(" 6. Intercalation");
    System.out.println();
    System.out.println("=========================================");
  }
}
