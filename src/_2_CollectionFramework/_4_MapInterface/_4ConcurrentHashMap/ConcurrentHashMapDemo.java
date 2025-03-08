package _2_CollectionFramework._4_MapInterface._4ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

// 1) Note-> Hashtable me saare methods synchronized, means ki get bhi hoga,
//    jiski vjaha se problem aayi, kyuki read me bhi lock lag ra tha
// 2) Therefore ConcurrentHashMaps aya, it is thread safe.
// 3) It implements ConcurrentMap.
// 4) has step by step incremental.
// Ques: why locking is only in resizing and collision ?

// NOTE -> MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
//      ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();   // ConcurrentMap is parent class.

//   Java 7 --> segment Based locking --> 16 segments (by default is 16) --> smaller hashmaps
      // pura concurrentHashMap 16 chhote chhote hashMaps me bat jaaega.
      // har segment me independent locking hoti hai.
      // so jis bhi segment ko read yaa write karna ho vahi lock hoga.
      // read: don't require unless there is a write operation happening on the same segment.

//    Java 8 --> no segmentation
        // uses  Compare-And-Swap approach -> no locking except resizing or collision

    }
}
