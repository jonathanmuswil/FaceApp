import android.net.Uri;

public final class UNa$b$k
  extends UNa.b
{
  private final Uri a;
  private final boolean b;
  
  public UNa$b$k(Uri paramUri, boolean paramBoolean)
  {
    super(null);
    this.a = paramUri;
    this.b = paramBoolean;
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final Uri b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof k))
      {
        paramObject = (k)paramObject;
        if (oXa.a(this.a, ((k)paramObject).a))
        {
          int i;
          if (this.b == ((k)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label58;
          }
        }
      }
      return false;
    }
    label58:
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
    int j = this.b;
    int k = j;
    if (j != 0) {
      k = 1;
    }
    return i * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NewAvatarSelected(imageUri=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", cropped=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/UNa$b$k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */