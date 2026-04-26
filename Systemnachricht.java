public class Systemnachricht{
  private String text;
  
  public Systemnachricht(String text){
    this.text = text;
    }
  public String getText(){
    return text;  
    }
  public void anzeigen(){
    System.out.println(text);
    }
  }