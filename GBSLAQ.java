public class GBSLAQ<ItemType> extends Object implements Queue<ItemType>
{
  private int N1, N2;
  private int numItemsInQueue;
  private ItemType[] queue;
  private int qsz;
  private ItemType[] nq;

  public GBSLAQ()
  {
    qsz = 5;
    queue = (ItemType[])new Object[qsz];
    N1 = 0;
    N2 = 0;
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
      N1 = 0;
        queue[N1] = newV;
        numItemsInQueue++;
      }
    
    else if (N2+2 > qsz || N2+1 == N1){
          if(N1 == 0){
        ItemType[] nq = (ItemType[]) new Object[qsz*2];
            for (int x = 0; x<qsz; x++){

              nq[x] = queue[x];
              if (x+1 == qsz){
                nq[x+1] = newV;
                N2++;
              }
            }
            queue = nq;
            numItemsInQueue++; 
            qsz*=2;
          }
          else{
            N2 = 1;
            queue[N2] = newV;
            numItemsInQueue++; 
          } 
        }
    else{
      N2++;
      queue[N2] = newV;
      numItemsInQueue++;

    }
}

  public ItemType peekFront(){
    if (isEmpty()){
      throw new Error("Empty Queue");
    }
  return queue[N1];
  }

  public ItemType dequeue(){
    if (isEmpty()){
      throw new Error("Empty Queue");
    }
    ItemType val = queue[N1];
    // System.out.print(N1);
    if(N2 == N1){
          N1 = 1;
          N2 = -1;
    }
    else{
      N1++;
    }
     
      numItemsInQueue--;
      return val;
  }

// [1,2,3,4,5]
//          xy          
 @Override
  public String toString(){
    String s = "";
    System.out.print(N1);
    System.out.println(" " +N2);
    if (isEmpty()){
      return s;
    }
    
    
    if (N2<N1){
      System.out.print("he");
      for (int x = N1; x<numItemsInQueue;x++ ){
      s+= String.valueOf(queue[x]) + " ";
    }
      for (int x = 0; x<=N2;x++ ){
        s+= String.valueOf(queue[x]) + " ";
      }
      
    }

  else if (N2==N1){
    System.out.print("no");
    }{
    
 for (int x = N1; x<N2;x++ ){
  //  System.out.print(numItemsInQueue);
  //  System.out.print("ok");
      s+= String.valueOf(queue[x]) + " ";
    }
  }
   
  return s;
  }


  
}