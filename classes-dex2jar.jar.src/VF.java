import com.bumptech.glide.load.g;
import java.security.MessageDigest;

final class vf
  implements g
{
  private final g a;
  private final g b;
  
  vf(g paramg1, g paramg2)
  {
    this.a = paramg1;
    this.b = paramg2;
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    this.a.a(paramMessageDigest);
    this.b.a(paramMessageDigest);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof vf;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (vf)paramObject;
      bool3 = bool2;
      if (this.a.equals(((vf)paramObject).a))
      {
        bool3 = bool2;
        if (this.b.equals(((vf)paramObject).b)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public int hashCode()
  {
    return this.a.hashCode() * 31 + this.b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataCacheKey{sourceKey=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", signature=");
    localStringBuilder.append(this.b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */