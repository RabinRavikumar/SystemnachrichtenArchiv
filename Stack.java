public class Stack{
  private Element first;
  
  public Stack(){
    first = null;
    }
  public Object top(){
    if (isEmpty()) {
      return null;
    } // end of if
    else {
      return first.getValue();
    } // end of if-else
    }
  public void push(Object pObject){
    if (pObject != null) {
      first = new Element(pObject,first);
    } // end of if
    }
  public void pop(){
    if (!isEmpty()) {
      first = first.getNext();
    } // end of if
    }
  public boolean isEmpty(){
    return first == null;
    }
  }