import com.android.billingclient.api.I;

public abstract class HHa$a
  extends HHa
{
  private final I a;
  private final VOa b;
  
  private HHa$a(I paramI, VOa paramVOa)
  {
    super(null);
    this.a = paramI;
    this.b = paramVOa;
  }
  
  public final VOa a()
  {
    return this.b;
  }
  
  public final I b()
  {
    return this.a;
  }
  
  public static final class a
    extends HHa.a
  {
    private final I c;
    private final VOa d;
    
    public a(I paramI, VOa paramVOa)
    {
      super(paramVOa, null);
      this.c = paramI;
      this.d = paramVOa;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.c, ((a)paramObject).c)) && (oXa.a(this.d, ((a)paramObject).d))) {}
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
      Object localObject = this.c;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((I)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.d;
      if (localObject != null) {
        i = ((Enum)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Yearly(sku=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", g=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends HHa.a
  {
    private final I c;
    private final VOa d;
    
    public b(I paramI, VOa paramVOa)
    {
      super(paramVOa, null);
      this.c = paramI;
      this.d = paramVOa;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((oXa.a(this.c, ((b)paramObject).c)) && (oXa.a(this.d, ((b)paramObject).d))) {}
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
      Object localObject = this.c;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((I)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.d;
      if (localObject != null) {
        i = ((Enum)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("YearlyTrial(sku=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", g=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/HHa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */