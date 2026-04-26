/**
 * Stellt ein Element innerhalb des Stacks dar.
 * Enthält eine Referenz auf das nächste Element.
**/
public class Element{
  private Object value;
  private Element next;
  
  public Element(Object pValue,Element pNext){
    value = pValue;
    next = pNext;
    }
  public Object getValue(){
    return value;
    }
  public void setValue(Object pValue){
    value = pValue;
    }
  public Element getNext(){
    return next;
    }
  public void setNext(Element pNext){
    next = pNext;
    }
  }
