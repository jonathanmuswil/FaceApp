import android.os.Bundle;

public final class qBa$c
  extends qBa
{
  private final Bundle a;
  private final Object b;
  
  public qBa$c(Bundle paramBundle, Object paramObject)
  {
    super(null);
    this.a = paramBundle;
    this.b = paramObject;
  }
  
  public final Bundle a()
  {
    return this.a;
  }
  
  public final Object b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((oXa.a(this.a, ((c)paramObject).a)) && (oXa.a(this.b, ((c)paramObject).b))) {}
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
      i = localObject.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Success(config=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", result=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qBa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */