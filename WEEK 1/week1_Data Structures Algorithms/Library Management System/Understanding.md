# Linear Search

Linear Search is a basic method for finding an item in a list:

1. Start from the Top: Look at the first item.
2. Check Each Item: Compare the target item with each item in the list, one by one.
3. Find or Finish: Continue until you find the item or reach the end of the list.

Time Complexity: O(n), where `n` is the number of items in the list. This means it might take up to `n` comparisons in the worst case.

Pros: Simple and works on any list.
Cons: Can be slow for large lists because you may need to check every item.

# Binary Search

Binary Search is an efficient method for finding an item in a sorted list:

1. Start in the Middle: Look at the middle item of the list.
2. Compare and Narrow: If the middle item is the target, you're done. If not, decide whether to search the left or right half based on the target's value.
3. Repeat: Continue this process on the chosen half until you find the item or the search space is empty.

**Time Complexity**: O(log n), where `n` is the number of items in the list. This means it quickly narrows down the search space, requiring fewer comparisons compared to linear search.

Pros: Much faster for large lists.
Cons: Only works on sorted lists and requires a bit more setup.
