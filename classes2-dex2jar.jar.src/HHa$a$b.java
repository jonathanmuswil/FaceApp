import com.android.billingclient.api.I;

public final class HHa$a$b
  extends HHa.a
{
  private final I c;
  private final VOa d;
  
  public HHa$a$b(I paramI, VOa paramVOa)
  {
    super(paramI, paramVOa, null);
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/HHa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */