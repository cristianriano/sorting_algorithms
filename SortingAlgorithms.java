import java.util.*;

public class SortingAlgorithms{

  public static void main(String... args){
    // Default array
    Integer array[] = {4,76,34,97,12,8,123,46};

    Scanner sc = new Scanner(System.in);
    String line;
    char option;    
    boolean flag = true;

    printMenu(array);
    while((line = sc.nextLine()) != null){
      option = line.charAt(0);
      switch(option){
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

        case '2':
          Sorter.bubble(array);
          System.out.println("Sorted: ");
          Sorter.printArray(array);
          break;

      }

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
    System.out.println(" 3. Radix sort");
    System.out.println();
    System.out.println("=========================================");
  }
}
