package creational.patterns.strategy.demo;

/**
 * @description:
 * @author: OnePotSake
 * @createTime: 2020.08.21
 */
public class Sorter<T> {
  public static void sort(Cat[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int mminpos = 0;
      for (int j = i + 1; j < arr.length; j++) {
        mminpos = arr[i].compareTo(arr[j]);
        swap(arr, i, j, mminpos);
      }
    }
  }

  public static void sortObject(Comparable[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int mminpos = 0;
      for (int j = i + 1; j < arr.length; j++) {
        mminpos = arr[i].compareTo(arr[j]);
        swap(arr, i, j, mminpos);
      }
    }
  }

  private static void swap(Comparable[] arr, int i, int j, int mminpos) {
    Comparable temp;
    if (mminpos == 1) {
      temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
    }
  }

  public void sortObjectElment(T[] arr, Comparator<T> com) {
    for (int i = 0; i < arr.length - 1; i++) {
      int mminpos = 0;
      for (int j = i + 1; j < arr.length; j++) {
        mminpos =com.compare(arr[i], arr[j]);
        swapT(arr, i, j, mminpos);
      }
    }
  }

    void swapT(T[] arr, int i, int j, int mminpos) {
    T temp;
    if (mminpos == 1) {
      temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
    }
  }
}
