public abstract class wva$b
{
  public static final class a
    extends wva.b
  {
    private final boolean a;
    
    public a(boolean paramBoolean)
    {
      super();
      this.a = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          int i;
          if (this.a == ((a)paramObject).a) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {}
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
      int i = this.a;
      int j = i;
      if (i != 0) {
        j = 1;
      }
      return j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Dismiss(confirmed=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends wva.b
  {
    private final Rja a;
    
    public b(Rja paramRja)
    {
      super();
      this.a = paramRja;
    }
    
    public final Rja a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if (oXa.a(this.a, ((b)paramObject).a)) {}
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
      Rja localRja = this.a;
      int i;
      if (localRja != null) {
        i = localRja.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("OnImageClicked(imageDesc=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends wva.b
  {
    public static final c a = new c();
    
    private c()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wva$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */