import android.graphics.Bitmap;

public abstract class ZAa$b
{
  public static final class a
    extends ZAa.b
  {
    private final Bitmap a;
    private final Bitmap b;
    
    public a(Bitmap paramBitmap1, Bitmap paramBitmap2)
    {
      super();
      this.a = paramBitmap1;
      this.b = paramBitmap2;
    }
    
    public final Bitmap a()
    {
      return this.a;
    }
    
    public final Bitmap b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
      Bitmap localBitmap = this.a;
      int i = 0;
      int j;
      if (localBitmap != null) {
        j = localBitmap.hashCode();
      } else {
        j = 0;
      }
      localBitmap = this.b;
      if (localBitmap != null) {
        i = localBitmap.hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AnimatedContent(bitmap1=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", bitmap2=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends ZAa.b
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends ZAa.b
  {
    private final String a;
    private final VOa b;
    
    public c(String paramString, VOa paramVOa)
    {
      super();
      this.a = paramString;
      this.b = paramVOa;
    }
    
    public final VOa a()
    {
      return this.b;
    }
    
    public final String b()
    {
      return this.a;
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
        j = ((String)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((Enum)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("StaticContent(imageUri=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", gender=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ZAa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */