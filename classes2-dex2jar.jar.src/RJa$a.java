import com.android.billingclient.api.I;

public final class RJa$a
{
  private final qja a;
  private final I b;
  
  public RJa$a(qja paramqja, I paramI)
  {
    this.a = paramqja;
    this.b = paramI;
  }
  
  public final qja a()
  {
    return this.a;
  }
  
  public final I b()
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
      j = ((Enum)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((I)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ProItem(sku=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", skuDetails=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RJa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */