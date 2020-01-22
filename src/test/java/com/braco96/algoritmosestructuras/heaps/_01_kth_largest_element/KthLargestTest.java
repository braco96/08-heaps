package com.braco96.algoritmosestructuras.heaps._01_kth_largest_element;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.braco96.algoritmosestructuras.heaps._01_kth_largest_element.KthLargest;

public class KthLargestTest {

  @Test
  public void kthLargestElementTest() {
    KthLargest kthLargest = new KthLargest(4, new int[] {1, 2, 3, 4, 5});

    assertEquals(3, kthLargest.add(6));
    assertEquals(3, kthLargest.add(2));
    assertEquals(3, kthLargest.add(1));
    assertEquals(4, kthLargest.add(8));
  }
}
