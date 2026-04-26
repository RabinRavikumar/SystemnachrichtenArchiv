public class SystemnachrichtenArchiv{
  private Stack archiv;
  
  public SystemnachrichtenArchiv(){
    archiv = new Stack();
    }
  public void archivieren(String text){
    archiv.push(new Systemnachricht(text));
    System.out.println(text);
    }
  public void letzteNachrichtenAusgeben(){
    if (archiv.isEmpty()) {
      System.out.println("Letztenachricht ist Null!");
    } // end of if
    else {
      Systemnachricht test = (Systemnachricht) archiv.top();
      archiv.pop();
      test.anzeigen();
    } // end of if-else
    }
  public void alleNachrichtenAusgeben(){
    archiv.top();
    while (!archiv.isEmpty()) { 
      Systemnachricht test = (Systemnachricht) archiv.top();
      archiv.pop();
      test.anzeigen();
    } // end of while
    }
  public static void main(String[]args) {
    SystemnachrichtenArchiv erste = new SystemnachrichtenArchiv();
    erste.archivieren("Halo");
    erste.archivieren("p");
    erste.alleNachrichtenAusgeben();
  }
  }