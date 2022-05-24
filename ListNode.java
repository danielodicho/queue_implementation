public class ListNode<T> extends Object
{
  public T value;
  public ListNode next;

  public ListNode(T v, ListNode n)
  {
    value = v;
    next = n;
  }

  public ListNode(T v)
  {
    this(v, null);
  }

  public T getValue() 
  {
    return value;
  }

  public ListNode<T> getNext()
  {
    return next;
  }

  /*
    this method will change the value that is stored in the ListNode
    and return the value that was kicked out 
  */
  public T setValue(T v)
  {
    T temp = value;
    value = v;
    return temp;
  }

  /*
    this method will change "next" to refer to the explicit parameter, 
    and will return a reference to the ListNode that "next" used to refer to 
  */  
  public ListNode<T> setNext(ListNode<T> n)
  {
    ListNode<T> temp = next;
    next = n;
    return temp;
  }
}