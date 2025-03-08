package _2_CollectionFramework._4_MapInterface._5ConcurrentSkipListMap;

// 1) NOTE -> MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap
// 2) Internally ConcurrentSkipListMap stores data in Skip list data structure.
// 3) Skip list is a probabilistic data structure, that allows for efficient search,
//    insertion, and deletion operations.
// 4) It is similar to a sorted linked list but with multiple layers that "skip"
//    over portions of the list to provide faster access to elements.
// 5) Skip list esliye use kiya kyuki RB Tree me complex algorithms lagte hai,
//    and cheeze vaha strict hoti hai.
// 6) But in case of skip lists aisa nhi hota, esme cheeze thodi randomly kii jati hai, strictness nahi hai.
// 7) So we use Skip lists to make things simpler.
// 8) It implements ConcurrentNavigableMap Interface.

import java.util.concurrent.ConcurrentSkipListMap;

// bass ye samjh lo ki ConcurrentSkipListMap me data, skip list me store hota hai
public class ConcurrentSkipListDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        // ab explore kar le
    }
}
