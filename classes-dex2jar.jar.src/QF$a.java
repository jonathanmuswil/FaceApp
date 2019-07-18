import java.io.IOException;

final class Qf$a
  implements Appendable
{
  private final Appendable a;
  private boolean b = true;
  
  Qf$a(Appendable paramAppendable)
  {
    this.a = paramAppendable;
  }
  
  private CharSequence a(CharSequence paramCharSequence)
  {
    Object localObject = paramCharSequence;
    if (paramCharSequence == null) {
      localObject = "";
    }
    return (CharSequence)localObject;
  }
  
  public Appendable append(char paramChar)
    throws IOException
  {
    boolean bool1 = this.b;
    boolean bool2 = false;
    if (bool1)
    {
      this.b = false;
      this.a.append("  ");
    }
    if (paramChar == '\n') {
      bool2 = true;
    }
    this.b = bool2;
    this.a.append(paramChar);
    return this;
  }
  
  public Appendable append(CharSequence paramCharSequence)
    throws IOException
  {
    paramCharSequence = a(paramCharSequence);
    append(paramCharSequence, 0, paramCharSequence.length());
    return this;
  }
  
  public Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    throws IOException
  {
    paramCharSequence = a(paramCharSequence);
    boolean bool1 = this.b;
    boolean bool2 = false;
    if (bool1)
    {
      this.b = false;
      this.a.append("  ");
    }
    bool1 = bool2;
    if (paramCharSequence.length() > 0)
    {
      bool1 = bool2;
      if (paramCharSequence.charAt(paramInt2 - 1) == '\n') {
        bool1 = true;
      }
    }
    this.b = bool1;
    this.a.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Qf$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */