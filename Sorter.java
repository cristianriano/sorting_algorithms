public class Sorter{

  public static void bubble(Integer[] array){
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

  public static void quick(Integer[] array, int first, int last){
    int i, j, tmp, pivot;
    i = first;
    j = last;
    pivot = array[(first+last)/2];
    System.out.println("Pivot: "+pivot);
    do{
      // Find an element to the left lower than the pivot value
      while(array[i] < pivot) i++;
      // Find an element to the right greater than the pivot value
      while(array[j] > pivot) j--;

      // Make the switch
      if(i<=j){
        tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
        i++;
        j--;
      }

    } while(i <= j);

    if(first < j)
      quick(array, first, j);
    if(i < last)
      quick(array, i, last);
  }

  public static int[] insertion(int [] array, int n){
    int j, tmp;
    for(int i=0; i<n; i++){
      tmp = array[i];
      j = i - 1;

      while(j >= 0 && array[j] > tmp){
        array[j+1] = array[j];
        j--;
      }

      array[j+1] = tmp;
    }
    return array;
  }

  public static void shell(Integer[] array){
    int j,k,tmp,jump;
    jump = array.length/2;
    while(jump > 0){
      do{
        k = 0;
        for(int i=0; i+jump<array.length; i++){
          if(array[i] > array[i+jump]){
            tmp = array[i];
            array[i] = array[i+jump];
            array[i+jump] = tmp;
            k++;
          }
        }
      } while(k > 0);
      jump = jump/2;
    }
  }

  public static Integer[] intercalation(Integer[] array1, Integer[] array2){
    int l1 = array1.length;
    int l2 = array2.length;
    Integer[] array = new Integer[l1+l2];
    int i,j,k;
    for(i = j = k =0; i < l1 && j < l2; k++){
      if(array1[i] < array2[j]){
        array[k] = array1[i];
        i++;
      }
      else{
        array[k] = array2[j];
        j++;
      }
    }
    // Add remaining elements from array 1
    for(;i < l1 ; i++, k++)
      array[k] = array1[i];

    for(;j < l2 ; j++, k++)
      array[k] = array2[j];
      
    return array;
  }

  public static void printArray(Integer[] array){
    for(int i=0; i<array.length; i++){
      System.out.print("["+array[i]+"] ");
    }
    System.out.println();
  }

  public static void printArray(int[] array){
    for(int i=0; i<array.length; i++){
      System.out.print("["+array[i]+"] ");
    }
    System.out.println();
  }
}
