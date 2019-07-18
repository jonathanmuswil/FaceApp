import android.graphics.Bitmap;
import android.net.Uri;

public abstract class lxa$b$a
  extends lxa.b
{
  private final Eka a;
  private final lxa.d b;
  private final boolean c;
  
  private lxa$b$a(Eka paramEka, lxa.d paramd, boolean paramBoolean)
  {
    super(null);
    this.a = paramEka;
    this.b = paramd;
    this.c = paramBoolean;
  }
  
  public final Eka a()
  {
    return this.a;
  }
  
  public final lxa.d b()
  {
    return this.b;
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public static final class a
    extends lxa.b.a
  {
    private final Eka d;
    private final lxa.d e;
    private final boolean f;
    private final Uri g;
    private final APa h;
    private final boolean i;
    private final APa j;
    
    public a(Eka paramEka, lxa.d paramd, boolean paramBoolean1, Uri paramUri, APa paramAPa1, boolean paramBoolean2, APa paramAPa2)
    {
      super(paramd, paramBoolean1, null);
      this.d = paramEka;
      this.e = paramd;
      this.f = paramBoolean1;
      this.g = paramUri;
      this.h = paramAPa1;
      this.i = paramBoolean2;
      this.j = paramAPa2;
    }
    
    public final boolean d()
    {
      return this.i;
    }
    
    public final APa e()
    {
      return this.h;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.d, ((a)paramObject).d)) && (oXa.a(this.e, ((a)paramObject).e)))
          {
            int k;
            if (this.f == ((a)paramObject).f) {
              k = 1;
            } else {
              k = 0;
            }
            if ((k != 0) && (oXa.a(this.g, ((a)paramObject).g)) && (oXa.a(this.h, ((a)paramObject).h)))
            {
              if (this.i == ((a)paramObject).i) {
                k = 1;
              } else {
                k = 0;
              }
              if ((k != 0) && (oXa.a(this.j, ((a)paramObject).j))) {
                break label136;
              }
            }
          }
        }
        return false;
      }
      label136:
      return true;
    }
    
    public final Uri f()
    {
      return this.g;
    }
    
    public final APa g()
    {
      return this.j;
    }
    
    public int hashCode()
    {
      Object localObject = this.d;
      int k = 0;
      int m;
      if (localObject != null) {
        m = ((Eka)localObject).hashCode();
      } else {
        m = 0;
      }
      localObject = this.e;
      int n;
      if (localObject != null) {
        n = localObject.hashCode();
      } else {
        n = 0;
      }
      int i1 = this.f;
      int i3 = i1;
      if (i1 != 0) {
        i3 = 1;
      }
      localObject = this.g;
      int i2;
      if (localObject != null) {
        i2 = ((Uri)localObject).hashCode();
      } else {
        i2 = 0;
      }
      localObject = this.h;
      int i4;
      if (localObject != null) {
        i4 = ((APa)localObject).hashCode();
      } else {
        i4 = 0;
      }
      int i5 = this.i;
      int i6 = i5;
      if (i5 != 0) {
        i6 = 1;
      }
      localObject = this.j;
      if (localObject != null) {
        k = ((APa)localObject).hashCode();
      }
      return (((((m * 31 + n) * 31 + i3) * 31 + i2) * 31 + i4) * 31 + i6) * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ContentAfter(f=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", sO=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", bI=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", imageUri=");
      localStringBuilder.append(this.g);
      localStringBuilder.append(", imageSize=");
      localStringBuilder.append(this.h);
      localStringBuilder.append(", hasBeforeState=");
      localStringBuilder.append(this.i);
      localStringBuilder.append(", viewSize=");
      localStringBuilder.append(this.j);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends lxa.b.a
  {
    private final Eka d;
    private final lxa.d e;
    private final Bitmap f;
    private final APa g;
    private final Float h;
    
    public b(Eka paramEka, lxa.d paramd, Bitmap paramBitmap, APa paramAPa, Float paramFloat)
    {
      super(paramd, true, null);
      this.d = paramEka;
      this.e = paramd;
      this.f = paramBitmap;
      this.g = paramAPa;
      this.h = paramFloat;
    }
    
    public final Bitmap d()
    {
      return this.f;
    }
    
    public final Float e()
    {
      return this.h;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((oXa.a(this.d, ((b)paramObject).d)) && (oXa.a(this.e, ((b)paramObject).e)) && (oXa.a(this.f, ((b)paramObject).f)) && (oXa.a(this.g, ((b)paramObject).g)) && (oXa.a(this.h, ((b)paramObject).h))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public final APa f()
    {
      return this.g;
    }
    
    public int hashCode()
    {
      Object localObject = this.d;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((Eka)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.e;
      int k;
      if (localObject != null) {
        k = localObject.hashCode();
      } else {
        k = 0;
      }
      localObject = this.f;
      int m;
      if (localObject != null) {
        m = localObject.hashCode();
      } else {
        m = 0;
      }
      localObject = this.g;
      int n;
      if (localObject != null) {
        n = ((APa)localObject).hashCode();
      } else {
        n = 0;
      }
      localObject = this.h;
      if (localObject != null) {
        i = ((Float)localObject).hashCode();
      }
      return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ContentBefore(f=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", sO=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", bitmap=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", viewDimenRatio=");
      localStringBuilder.append(this.g);
      localStringBuilder.append(", progress=");
      localStringBuilder.append(this.h);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lxa$b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */