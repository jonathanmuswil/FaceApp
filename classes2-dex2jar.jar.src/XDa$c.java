public abstract class XDa$c
{
  public static final class a
    extends XDa.c
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends XDa.c
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends XDa.c
  {
    private final XDa.b a;
    
    public c(XDa.b paramb)
    {
      super();
      this.a = paramb;
    }
    
    public final XDa.b a()
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
      XDa.b localb = this.a;
      int i;
      if (localb != null) {
        i = localb.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SwitchToMode(newMode=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XDa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */