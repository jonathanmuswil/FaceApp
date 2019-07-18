import android.os.Bundle;

public abstract class No$a<P extends No, E extends a>
  implements Go<P, E>
{
  private Bundle a = new Bundle();
  
  public E a(P paramP)
  {
    if (paramP != null) {
      this.a.putAll(paramP.a());
    }
    return this;
  }
  
  public E a(String paramString1, String paramString2)
  {
    this.a.putString(paramString1, paramString2);
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/No$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */