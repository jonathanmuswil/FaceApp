import android.net.Uri;
import java.util.List;

public final class gNa$d$a
  extends gNa.d
{
  private final Uri a;
  private final APa b;
  private final List<vka> c;
  
  public gNa$d$a(Uri paramUri, APa paramAPa, List<vka> paramList)
  {
    super(null);
    this.a = paramUri;
    this.b = paramAPa;
    this.c = paramList;
  }
  
  public final List<vka> a()
  {
    return this.c;
  }
  
  public final APa b()
  {
    return this.b;
  }
  
  public final Uri c()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c))) {}
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
    int k;
    if (localObject != null) {
      k = ((APa)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.c;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FaceSelector(imageUri=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", imageSize=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", faces=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gNa$d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */