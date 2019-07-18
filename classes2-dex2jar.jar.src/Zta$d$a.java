import android.net.Uri;

public final class Zta$d$a
  extends Zta.d
{
  private final String d;
  private final String e;
  private final Uri f;
  
  public Zta$d$a(String paramString1, String paramString2, Uri paramUri)
  {
    super(paramString1, paramString2, paramUri, null);
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramUri;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e)) && (oXa.a(this.f, ((a)paramObject).f))) {}
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
    Object localObject = this.d;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.e;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.f;
    if (localObject != null) {
      i = ((Uri)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Content(fN=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", lN=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", aU=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Zta$d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */