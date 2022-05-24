interface Queue<ItemType>
{
  //No constructors allowed
  
  ItemType peekFront();
  ItemType dequeue();
  void enqueue(ItemType x);
  boolean isEmpty();
}
