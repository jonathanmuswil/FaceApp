import android.graphics.PointF;
import android.net.Uri;

public abstract class mza$b
{
  public static final class a
    extends mza.b
  {
    private final Uri a;
    
    public a(Uri paramUri)
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
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a)) {}
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
      localStringBuilder.append("GallerySelected(uri=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends mza.b
  {
    public static final b a = new b();
    
    private b()
    {
      super();
    }
  }
  
  public static final class c
    extends mza.b
  {
    private final kka a;
    
    public c(kka paramkka)
    {
      super();
      this.a = paramkka;
    }
    
    public final kka a()
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
      kka localkka = this.a;
      int i;
      if (localkka != null) {
        i = localkka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectBackground(item=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends mza.b
  {
    public static final d a = new d();
    
    private d()
    {
      super();
    }
  }
  
  public static final class e
    extends mza.b
  {
    private final kka a;
    
    public e(kka paramkka)
    {
      super();
      this.a = paramkka;
    }
    
    public final kka a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof e))
        {
          paramObject = (e)paramObject;
          if (oXa.a(this.a, ((e)paramObject).a)) {}
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
      kka localkka = this.a;
      int i;
      if (localkka != null) {
        i = localkka.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SelectPro(item=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class f
    extends mza.b
  {
    public static final f a = new f();
    
    private f()
    {
      super();
    }
  }
  
  public static final class g
    extends mza.b
  {
    private final boolean a;
    
    public g(boolean paramBoolean)
    {
      super();
      this.a = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof g))
        {
          paramObject = (g)paramObject;
          int i;
          if (this.a == ((g)paramObject).a) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {}
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
      int i = this.a;
      int j = i;
      if (i != 0) {
        j = 1;
      }
      return j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SetBefore(before=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class h
    extends mza.b
  {
    public static final h a = new h();
    
    private h()
    {
      super();
    }
  }
  
  public static final class i
    extends mza.b
  {
    private final PointF a;
    
    public i(PointF paramPointF)
    {
      super();
      this.a = paramPointF;
    }
    
    public final PointF a()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof i))
        {
          paramObject = (i)paramObject;
          if (oXa.a(this.a, ((i)paramObject).a)) {}
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
      PointF localPointF = this.a;
      int i;
      if (localPointF != null) {
        i = localPointF.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SetLightSource(source=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static final class j
    extends mza.b
  {
    private final pya a;
    private final float b;
    
    public j(pya parampya, float paramFloat)
    {
      super();
      this.a = parampya;
      this.b = paramFloat;
    }
    
    public final pya a()
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
        if ((paramObject instanceof j))
        {
          paramObject = (j)paramObject;
          if ((oXa.a(this.a, ((j)paramObject).a)) && (Float.compare(this.b, ((j)paramObject).b) == 0)) {}
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
      pya localpya = this.a;
      int i;
      if (localpya != null) {
        i = localpya.hashCode();
      } else {
        i = 0;
      }
      return i * 31 + Float.floatToIntBits(this.b);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SetValue(range=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", value=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mza$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */