import android.graphics.Bitmap;

public abstract class rCa$a
{
  public static final class a
    extends rCa.a
  {
    private final Bitmap a;
    private final Bitmap b;
    private final boolean c;
    
    public a(Bitmap paramBitmap1, Bitmap paramBitmap2, boolean paramBoolean)
    {
      super();
      this.a = paramBitmap1;
      this.b = paramBitmap2;
      this.c = paramBoolean;
    }
    
    public final Bitmap a()
    {
      return this.b;
    }
    
    public final Bitmap b()
    {
      return this.a;
    }
    
    public final boolean c()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)))
          {
            int i;
            if (this.c == ((a)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label72;
            }
          }
        }
        return false;
      }
      label72:
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
      int k = this.c;
      int m = k;
      if (k != 0) {
        m = 1;
      }
      return (j * 31 + i) * 31 + m;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("BgPair(foreground=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", background=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", withShadow=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends rCa.a
  {
    private final Bitmap a;
    
    public b(Bitmap paramBitmap)
    {
      super();
      this.a = paramBitmap;
    }
    
    public final Bitmap a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if (oXa.a(this.a, ((b)paramObject).a)) {}
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
      int i;
      if (localBitmap != null) {
        i = localBitmap.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Origin(bitmap=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rCa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */