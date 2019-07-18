import java.util.List;

final class nv
  extends kv
{
  private final lv b = new lv();
  
  public final void a(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    if (paramThrowable2 != paramThrowable1)
    {
      if (paramThrowable2 != null)
      {
        this.b.a(paramThrowable1, true).add(paramThrowable2);
        return;
      }
      throw new NullPointerException("The suppressed exception cannot be null.");
    }
    throw new IllegalArgumentException("Self suppression is not allowed.", paramThrowable2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */