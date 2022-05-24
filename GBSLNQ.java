public class GBSLNQ<ItemType> extends Object implements Queue<ItemType>
{
  private ListNode<ItemType> N1, N2;
  private int numItemsInQueue;
  
  
  public GBSLNQ()
  {
    ItemType x = null;
    N1 = new ListNode<ItemType>(x);
    N2 = new ListNode<ItemType>(x);
    numItemsInQueue = 0;


  }

  public boolean isEmpty()
{
  if (numItemsInQueue==0){
    return true;
  }
  return false;
} 

  public void enqueue(ItemType newV){
    if (isEmpty() == true){
      N1.value = newV;
      numItemsInQueue++;
      }
    else if(numItemsInQueue ==1){
      N2.value = newV;
      N1.next = N2;
      numItemsInQueue++;
    }
    else{
      ListNode<ItemType> temp= new ListNode<ItemType>(newV);
      N2.next = temp;
      N2 = temp;
      numItemsInQueue++;
    }
    
}

  public ItemType peekFront(){
    if (isEmpty()){
      throw new Error("Empty Queue");
    }
  return N1.value;
  }

  public ItemType dequeue(){
    if (isEmpty()){
      throw new Error("Empty Queue");
    }
    ItemType val = N1.value;
    N1 = N1.next; 
      numItemsInQueue--;
      return val;
  }

  @Override
  public String toString(){
    String s = "";
    ListNode<ItemType> temp = N1;
    for (int x = 0; x<numItemsInQueue;x++ ){
    
      s+= String.valueOf(temp.value) + " ";
      if (temp.next != null){
          temp= temp.next;
      }
      
    }
  return s;
  }






private class ListNode<T> extends Object
{
  public T value;
  public ListNode next;

  public ListNode(T v)
  {
    value = v;
    next = null;
  }
}






}


