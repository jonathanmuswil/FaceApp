import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import io.faceapp.ui.image_editor.common.view.ResultingBitmapView.d;
import io.faceapp.ui.misc.c;

public abstract interface mza
  extends sla, c, zza
{
  public abstract void a(PointF paramPointF, boolean paramBoolean);
  
  public abstract void a(ResultingBitmapView.d paramd);
  
  public abstract void a(mza.a parama, String paramString);
  
  public abstract void a(rka paramrka);
  
  public abstract void c(float paramFloat);
  
  public abstract QQa<mza.b> getViewActions();
  
  public abstract RectF ha();
  
  public abstract void ia();
  
  public abstract void j(boolean paramBoolean);
  
  public static final class a
  {
    private final Bitmap a;
    private final boolean b;
    private final rka c;
    private final boolean d;
    
    public a(Bitmap paramBitmap, boolean paramBoolean1, rka paramrka, boolean paramBoolean2)
    {
      this.a = paramBitmap;
      this.b = paramBoolean1;
      this.c = paramrka;
      this.d = paramBoolean2;
    }
    
    public final rka a()
    {
      return this.c;
    }
    
    public final boolean b()
    {
      return this.d;
    }
    
    public final Bitmap c()
    {
      return this.a;
    }
    
    public final boolean d()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a))
          {
            int i;
            if (this.b == ((a)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (oXa.a(this.c, ((a)paramObject).c)))
            {
              if (this.d == ((a)paramObject).d) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label94;
              }
            }
          }
        }
        return false;
      }
      label94:
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
      int k = this.b;
      int m = k;
      int n;
      if (k != 0) {
        n = 1;
      }
      localObject = this.c;
      if (localObject != null) {
        i = ((rka)localObject).hashCode();
      }
      int i1 = this.d;
      k = i1;
      if (i1 != 0) {
        k = 1;
      }
      return ((j * 31 + n) * 31 + i) * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("CatalogModel(thumb=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", isPro=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", backTool=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", demoMode=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class b
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */