import java.util.*;

public class SortingAlgorithms{

  public static void main(String... args){
    // Default array
    Integer array[] = {4,76,34,97,12,8,123,46};

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
    System.out.println();
    System.out.println("=========================================");
  }
}
