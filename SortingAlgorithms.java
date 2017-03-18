public class SortingAlgorithms{

  public static void main(String... args){
    // Default array
    int array[] = {4,76,34,97,12,8};

    // Print current array
    Sorter.printArray(array);

    // Sort and print array
    Sorter.bubble(array);
    Sorter.printArray(array);
  }
}
