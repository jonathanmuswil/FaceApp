public abstract class lxa$d
{
  public static final class a
    extends lxa.d
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends lxa.d
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends lxa.d
  {
    private final lka a;
    
    public c(lka paramlka)
    {
      super();
      this.a = paramlka;
    }
    
    public final lka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if (oXa.a(this.a, ((c)paramObject).a)) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      lka locallka = this.a;
      int i;
      if (locallka != null) {
        i = locallka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("GoPro(editorFilter=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends lxa.d
  {
    public static final d a = new d();
    
    private d()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */