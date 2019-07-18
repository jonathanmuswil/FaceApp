import android.net.Uri;

public final class lxa$e$j
  extends lxa.e
{
  private final Uri a;
  private final APa b;
  
  public lxa$e$j(Uri paramUri, APa paramAPa)
  {
    super(null);
    this.a = paramUri;
    this.b = paramAPa;
  }
  
  public final Uri a()
  {
    return this.a;
  }
  
  public final APa b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof j))
      {
        paramObject = (j)paramObject;
        if ((oXa.a(this.a, ((j)paramObject).a)) && (oXa.a(this.b, ((j)paramObject).b))) {}
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
      j = ((Uri)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((APa)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UpdateViewSize(imageUri=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", viewSize=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$e$j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */