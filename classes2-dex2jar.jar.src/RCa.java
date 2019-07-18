import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public final class rCa
{
  private final File a;
  private final tBa<File> b;
  private final Eda c;
  
  public rCa(Eda paramEda)
  {
    this.c = paramEda;
    this.a = uBa.a("bg_shadow.jpg");
    this.b = new tBa();
  }
  
  private final Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, String paramString, PointF paramPointF)
  {
    Object localObject = (File)this.b.a(true).a(paramString);
    if (localObject != null)
    {
      localObject = cBa.d.a((File)localObject);
      if (localObject != null) {
        return (Bitmap)localObject;
      }
    }
    Bitmap localBitmap = oya.a(paramBitmap3, 0.3F, oya.b(paramPointF) * 20.0F + 1.0F);
    localObject = new PointF(-oya.b(paramPointF) * (float)Math.sin(oya.c(paramPointF)) / 10.0F, oya.b(paramPointF) * (float)Math.cos(oya.c(paramPointF)) / 10.0F);
    localObject = xBa.a.a(paramBitmap1, localBitmap, paramBitmap2, (PointF)localObject);
    this.b.a(true).a(paramString, new sCa((Bitmap)localObject, this, localBitmap, paramBitmap3, paramPointF, paramBitmap1, paramBitmap2, paramString));
    localBitmap.recycle();
    paramBitmap1 = (Bitmap)localObject;
    return paramBitmap1;
  }
  
  private final Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, boolean paramBoolean, float paramFloat)
  {
    paramBitmap2 = oya.a(paramBitmap2, 0.03F, 20.0F);
    float f;
    if (paramBoolean) {
      f = 3.0F;
    } else {
      f = 1.0F;
    }
    paramBitmap1 = xBa.a.a(paramBitmap1, paramBitmap3, paramBitmap2, paramFloat / f);
    paramBitmap2.recycle();
    return paramBitmap1;
  }
  
  private final Bitmap a(Bitmap paramBitmap, Bundle paramBundle)
  {
    Object localObject = oya.h(oya.v(paramBundle));
    paramBundle = paramBitmap;
    if (localObject != null)
    {
      localObject = oya.a(paramBitmap, (RectF)localObject);
      paramBitmap.recycle();
      paramBundle = paramBitmap;
      if (localObject != null) {
        paramBundle = (Bundle)localObject;
      }
    }
    return paramBundle;
  }
  
  public final rCa.a a(BPa paramBPa, AtomicInteger paramAtomicInteger, GVa<pBa> paramGVa, oBa paramoBa)
  {
    oXa.b(paramBPa, "tracer");
    oXa.b(paramAtomicInteger, "inputFlag");
    oXa.b(paramGVa, "progress");
    oXa.b(paramoBa, "cfg");
    nBa.a();
    paramBPa.a("background2");
    int i = paramoBa.e();
    Object localObject1 = paramoBa.g();
    oya.i(paramoBa.a());
    paramBPa = oya.e(oya.a(paramoBa.a()));
    Object localObject2 = oya.g(oya.a(paramoBa.a()));
    boolean bool1 = oya.q(oya.a(paramoBa.a()));
    float f = oya.a(oya.a(paramoBa.a()), pya.a.i);
    PointF localPointF = oya.m(oya.a(paramoBa.a()));
    boolean bool2 = false;
    String str = HCa.a("bt-sh", new Object[] { HCa.a("bt-up", new Object[] { localObject1, paramBPa, localObject2, Boolean.valueOf(bool1) }), localPointF });
    Object localObject3 = pBa.c.b;
    boolean bool3;
    if (i != paramAtomicInteger.get()) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    HCa.a(paramGVa, (pBa)localObject3, bool3);
    int j;
    if (paramBPa.length() == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      return new rCa.a.b(a(paramoBa.f().a(), paramoBa.a()));
    }
    localObject1 = (zha.a)HCa.a(this.c.h((String)localObject1), new uCa(paramGVa, i, paramAtomicInteger));
    if ((paramBPa.hashCode() == -1801473548) && (paramBPa.equals("android-gallery"))) {
      paramBPa = new WOa.d((String)localObject2);
    } else {
      paramBPa = new WOa.b((File)HCa.a(this.c.a((String)localObject2), new tCa(paramGVa, i, paramAtomicInteger)));
    }
    localObject2 = paramoBa.f().a();
    localObject3 = HCa.a((zha.a)localObject1);
    localObject1 = HCa.a(paramBPa);
    paramBPa = pBa.a.b;
    if (i != paramAtomicInteger.get()) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    HCa.a(paramGVa, paramBPa, bool3);
    Bitmap localBitmap = a((Bitmap)localObject2, (Bitmap)localObject1, (Bitmap)localObject3, bool1, f);
    if (!bool1)
    {
      paramBPa = (BPa)localObject1;
    }
    else
    {
      paramBPa = pBa.a.b;
      bool3 = bool2;
      if (i != paramAtomicInteger.get()) {
        bool3 = true;
      }
      HCa.a(paramGVa, paramBPa, bool3);
      paramBPa = a((Bitmap)localObject2, (Bitmap)localObject1, (Bitmap)localObject3, str, localPointF);
    }
    ((Bitmap)localObject2).recycle();
    ((Bitmap)localObject3).recycle();
    if (!bool1) {
      localObject1 = null;
    }
    if (localObject1 != null) {
      ((Bitmap)localObject1).recycle();
    }
    paramGVa = a(localBitmap, paramoBa.a());
    paramAtomicInteger = paramBPa;
    if (bool1) {
      paramAtomicInteger = a(paramBPa, paramoBa.a());
    }
    return new rCa.a.a(paramGVa, paramAtomicInteger, bool1);
  }
  
  public static abstract class a
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
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */