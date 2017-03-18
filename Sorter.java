public class Sorter{

  public static void bubble(int[] array){
    int tmp;
    for(int i=0; i<array.length; i++){
      // Compare every value with the next ones to find for lower values
      for(int j=i+1; j<array.length; j++){
        // If it's lower then shift
        if(array[i] > array[j]){
          tmp = array[i];
          array[i] = array[j];
          array[j] = tmp;
        }
      }
    }
  }

  public static void printArray(int[] array){
    for(int i=0; i<array.length; i++){
      System.out.print("["+array[i]+"] ");
    }
    System.out.println();
  }
}
