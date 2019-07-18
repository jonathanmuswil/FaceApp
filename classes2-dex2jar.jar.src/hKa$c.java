public abstract class hKa$c
{
  public static final class a
    extends hKa.c
  {
    private final dka a;
    private final int b;
    
    public a(dka paramdka, int paramInt)
    {
      super();
      this.a = paramdka;
      this.b = paramInt;
    }
    
    public final int a()
    {
      return this.b;
    }
    
    public final dka b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a))
          {
            int i;
            if (this.b == ((a)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label58;
            }
          }
        }
        return false;
      }
      label58:
      return true;
    }
    
    public int hashCode()
    {
      dka localdka = this.a;
      int i;
      if (localdka != null) {
        i = localdka.hashCode();
      } else {
        i = 0;
      }
      return i * 31 + this.b;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Logged(user=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", unreadUpdates=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends hKa.c
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hKa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */