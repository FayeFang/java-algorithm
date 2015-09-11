public void RemoveDuplicates(ListNode n){
  ListNode current = n;
  HashSet<Integer> set = new HashSet<Integer>();
  set.add(current.data);
  while (current.next != null) {
   if(set.contains(current.next.data)) {
      current.next = current.next.next;
    } else {
        set.add(current.next.data);
        current = current.next;
    }
  }
}