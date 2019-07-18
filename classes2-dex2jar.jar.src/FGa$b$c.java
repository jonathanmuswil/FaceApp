import android.net.Uri;

public final class FGa$b$c
  extends FGa.b
{
  private final Uri a;
  
  public FGa$b$c(Uri paramUri)
  {
    super(null);
    this.a = paramUri;
  }
  
  public final Uri a()
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
    Uri localUri = this.a;
    int i;
    if (localUri != null) {
      i = localUri.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ready(imageUri=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/FGa$b$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */