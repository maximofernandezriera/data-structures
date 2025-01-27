## Linked List
### Description

LinkedList is a data structure in which data is stored in a linear manner. It usually contains a data field and a link to the memory location of the next node.

### Structure

```
class LinkedList<E>{
    E value;
    LinkedList next;
}
```

The `next` variable points to the next node in the data structure and value stores the data. Any number of nodes can be linked in this manner. The structure will be:


### Properties
1. Linked list does not provide indexing like an array. For accessing a node at position `p` , &theta;(p) nodes need to be accessed.
2. Main advantage of linked list is addition and removal of nodes near the end and beginning of lists. It can be done just by updating the link (O(1) time)
3. Unlike an array, its size is not predefined. So any number of nodes can be appended.

# Hashmap

A hash map organizes data so you can quickly look up values for a given key.

## Strengths:
- **Fast lookups**: Lookups take O(1) time on average.
- **Flexible keys**: Most data types can be used for keys, as long as they're hashable.

## Weaknesses:
- **Slow worst-case**: Lookups take O(n) time in the worst case.
- **Unordered**: Keys aren't stored in a special order. If you're looking for the smallest key, the largest key, or all the keys in a range, you'll need to look through every key to find it.
- **Single-directional lookups**: While you can look up the value for a given key in O(1) time, looking up the keys for a given value requires looping through the whole dataset—O(n) time.
- **Not cache-friendly**: Many hash table implementations use linked lists, which don't put data next to each other in memory.

## Time Complexity
|        | AVERAGE | WORST |
|--------|---------|-------|
| Space  | O(n)    | O(n)  |
| Insert | O(1)    | O(n)  |
| Lookup | O(1)    | O(n)  |
| Delete | O(1)    | O(n)  |

## Internal Structure of HashMap
Internally HashMap contains an array of Node and a node is represented as a class that contains 4 fields:
- int hash
- K key
- V value
- Node next

It can be seen that the node contains a reference to its object. So it’s a linked list.

## Performance of HashMap
The performance of HashMap depends on 2 parameters which are named as follows:
- Initial Capacity
- Load Factor


##### Extends: https://github.com/TheAlgorithms/Java/tree/master/src/main/java/com/thealgorithms/datastructures
