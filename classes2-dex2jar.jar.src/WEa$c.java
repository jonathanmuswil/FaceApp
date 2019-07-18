import android.net.Uri;

public abstract class WEa$c
{
  public static final class a
    extends WEa.c
  {
    private final float a;
    
    public a(float paramFloat)
    {
      super();
      this.a = paramFloat;
    }
    
    public final float a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (Float.compare(this.a, ((a)paramObject).a) == 0) {}
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
      return Float.floatToIntBits(this.a);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Downloading(progress=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends WEa.c
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends WEa.c
  {
    private final Uri a;
    
    public c(Uri paramUri)
    {
      super();
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WEa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */