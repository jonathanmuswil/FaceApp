import android.graphics.Bitmap;

public abstract class GDa$a
{
  public static final class a
    extends GDa.a
  {
    public static final a a = new a();
    
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends GDa.a
  {
    private final Bitmap a;
    private final float b;
    
    public b(Bitmap paramBitmap, float paramFloat)
    {
      super();
      this.a = paramBitmap;
      this.b = paramFloat;
    }
    
    public final Bitmap a()
    {
      return this.a;
    }
    
    public final float b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((oXa.a(this.a, ((b)paramObject).a)) && (Float.compare(this.b, ((b)paramObject).b) == 0)) {}
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
      return i * 31 + Float.floatToIntBits(this.b);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Progress(preview=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", progress=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
    extends GDa.a
  {
    private final nsa.b a;
    
    public c(nsa.b paramb)
    {
      super();
      this.a = paramb;
    }
    
    public final nsa.b a()
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
      nsa.b localb = this.a;
      int i;
      if (localb != null) {
        i = localb.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SavedTo(sharedImage=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends GDa.a
  {
    private final Bitmap a;
    private final nsa.b b;
    
    public d(Bitmap paramBitmap, nsa.b paramb)
    {
      super();
      this.a = paramBitmap;
      this.b = paramb;
    }
    
    public final Bitmap a()
    {
      return this.a;
    }
    
    public final nsa.b b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          if ((oXa.a(this.a, ((d)paramObject).a)) && (oXa.a(this.b, ((d)paramObject).b))) {}
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
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((nsa.b)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Success(preview=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", sharedImage=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/GDa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */