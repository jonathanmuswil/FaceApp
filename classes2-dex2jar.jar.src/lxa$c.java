import java.util.List;

public abstract class lxa$c
{
  private final int a;
  
  private lxa$c(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public static final class a
    extends lxa.c
  {
    private final String b;
    private final int c;
    
    public a(String paramString, int paramInt)
    {
      super(null);
      this.b = paramString;
      this.c = paramInt;
    }
    
    public final String b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.b, ((a)paramObject).b))
          {
            int i;
            if (this.c == ((a)paramObject).c) {
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
      String str = this.b;
      int i;
      if (str != null) {
        i = str.hashCode();
      } else {
        i = 0;
      }
      return i * 31 + this.c;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ChangeSelected(newSelectedFilterId=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", cPos=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends lxa.c
  {
    private final List<Eka> b;
    private final String c;
    private final int d;
    
    public b(List<Eka> paramList, String paramString, int paramInt)
    {
      super(null);
      this.b = paramList;
      this.c = paramString;
      this.d = paramInt;
    }
    
    public final List<Eka> b()
    {
      return this.b;
    }
    
    public final String c()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c)))
          {
            int i;
            if (this.d == ((b)paramObject).d) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label72;
            }
          }
        }
        return false;
      }
      label72:
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.b;
      int i = 0;
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.c;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      return (j * 31 + i) * 31 + this.d;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Content(items=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", selectedFilterId=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", cPos=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */