import android.net.Uri;

public final class Qda$b
{
  private final Yja a;
  private final Uri b;
  private final dfa c;
  private final xia d;
  
  public Qda$b(Yja paramYja, Uri paramUri, dfa paramdfa, xia paramxia)
  {
    this.a = paramYja;
    this.b = paramUri;
    this.c = paramdfa;
    this.d = paramxia;
  }
  
  public final dfa a()
  {
    return this.c;
  }
  
  public final xia b()
  {
    return this.d;
  }
  
  public final Yja c()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c)) && (oXa.a(this.d, ((b)paramObject).d))) {}
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
      j = ((Yja)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    int k;
    if (localObject != null) {
      k = ((Uri)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.c;
    int m;
    if (localObject != null) {
      m = ((dfa)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return ((j * 31 + k) * 31 + m) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RequestParams(sourceImageInfo=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", imageUriForUpload=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", photoInfo=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", requestBody=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Qda$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */