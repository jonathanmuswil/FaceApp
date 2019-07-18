import java.util.List;

public abstract class RJa$c
{
  public static final class a
    extends RJa.c
  {
    private final List<RJa.a> a;
    private final RJa.a b;
    
    public a(List<RJa.a> paramList, RJa.a parama)
    {
      super();
      this.a = paramList;
      this.b = parama;
    }
    
    public final List<RJa.a> a()
    {
      return this.a;
    }
    
    public final RJa.a b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((RJa.a)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Free(availableItems=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", selectedProItem=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends RJa.c
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends RJa.c
  {
    private final qja a;
    private final boolean b;
    
    public c(qja paramqja, boolean paramBoolean)
    {
      super();
      this.a = paramqja;
      this.b = paramBoolean;
    }
    
    public final qja a()
    {
      return this.a;
    }
    
    public final boolean b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if (oXa.a(this.a, ((c)paramObject).a))
          {
            int i;
            if (this.b == ((c)paramObject).b) {
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
      qja localqja = this.a;
      int i;
      if (localqja != null) {
        i = localqja.hashCode();
      } else {
        i = 0;
      }
      int j = this.b;
      int k = j;
      if (j != 0) {
        k = 1;
      }
      return i * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Purchased(sku=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", isDebugPurchase=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends RJa.c
  {
    public static final d a = new d();
    
    private d()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RJa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */