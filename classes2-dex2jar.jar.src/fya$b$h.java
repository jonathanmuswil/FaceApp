import android.os.Bundle;

public final class fya$b$h
  extends fya.b
{
  private final Bundle a;
  
  public fya$b$h(Bundle paramBundle)
  {
    super(null);
    this.a = paramBundle;
  }
  
  public final Bundle a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        if (oXa.a(this.a, ((h)paramObject).a)) {}
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
    Bundle localBundle = this.a;
    int i;
    if (localBundle != null) {
      i = localBundle.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SetConfig(config=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fya$b$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */