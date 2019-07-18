import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.File;
import java.util.List;

public class jga
  extends bia<jga.b>
{
  public static final jga.a j = new jga.a(null);
  private final String k;
  private final List<String> l;
  private final boolean m;
  
  public jga(Eda paramEda, List<String> paramList, boolean paramBoolean)
  {
    super(paramEda);
    this.l = paramList;
    this.m = paramBoolean;
    paramEda = new StringBuilder();
    paramEda.append(super.c());
    paramEda.append(".Editor");
    this.k = paramEda.toString();
  }
  
  private final QQa<uia> a(Fka paramFka, File paramFile)
  {
    paramFka = QQa.a(new kga(this, paramFile, paramFka));
    oXa.a(paramFka, "Observable.create { subs…}\n            }\n        }");
    return paramFka;
  }
  
  private final void a(Canvas paramCanvas, Fka paramFka, APa paramAPa1, APa paramAPa2)
  {
    Bitmap localBitmap = WOa.e.a(paramFka, paramAPa1);
    Rect localRect = new Rect(0, 0, localBitmap.getWidth(), localBitmap.getHeight());
    Paint localPaint = new Paint();
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
    if (this.m)
    {
      paramCanvas.drawBitmap(localBitmap, localRect, paramFka.b(), localPaint);
    }
    else
    {
      paramFka = paramFka.b();
      paramCanvas.drawBitmap(localBitmap, localRect, new RectF(paramFka.left / paramAPa1.c() * paramAPa2.c(), paramFka.top / paramAPa1.b() * paramAPa2.b(), paramFka.right / paramAPa1.c() * paramAPa2.c(), paramFka.bottom / paramAPa1.b() * paramAPa2.b()), localPaint);
    }
    localBitmap.recycle();
  }
  
  protected kRa a()
  {
    uXa localuXa = new uXa();
    localuXa.a = null;
    Object localObject = i().a(this.l).f().c(new lga(this, localuXa));
    oXa.a(localObject, "photoOp.editorApiRespons…orFile)\n                }");
    localObject = RPa.a((QQa)localObject, new Rfa.f[] { Rfa.f.j.e }).b(EVa.b()).a(new mga(this, localuXa), new nga(this));
    oXa.a(localObject, "photoOp.editorApiRespons…        { setError(it) })");
    return (kRa)localObject;
  }
  
  public final List<String> j()
  {
    return this.l;
  }
  
  public final boolean k()
  {
    return this.m;
  }
  
  public static final class a
  {
    public final jga a(Eda paramEda, wka paramwka)
    {
      oXa.b(paramEda, "photoOp");
      oXa.b(paramwka, "faceCursors");
      return new gga(paramEda, paramwka, paramEda, mWa.a(), false);
    }
    
    public final jga b(Eda paramEda, wka paramwka)
    {
      oXa.b(paramEda, "photoOp");
      oXa.b(paramwka, "faceCursors");
      return new iga(paramEda, paramwka, paramEda, mWa.a(), true);
    }
  }
  
  public static final class b
  {
    private final File a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    
    public b(File paramFile, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      this.a = paramFile;
      this.b = paramString1;
      this.c = paramString2;
      this.d = paramString3;
      this.e = paramString4;
    }
    
    public final String a()
    {
      return this.b;
    }
    
    public final b a(File paramFile, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      oXa.b(paramFile, "file");
      oXa.b(paramString1, "depthToken");
      oXa.b(paramString2, "triMapToken");
      oXa.b(paramString3, "facePointsToken");
      oXa.b(paramString4, "hairMaskToken");
      return new b(paramFile, paramString1, paramString2, paramString3, paramString4);
    }
    
    public final String b()
    {
      return this.d;
    }
    
    public final File c()
    {
      return this.a;
    }
    
    public final String d()
    {
      return this.e;
    }
    
    public final String e()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c)) && (oXa.a(this.d, ((b)paramObject).d)) && (oXa.a(this.e, ((b)paramObject).e))) {}
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
        j = ((File)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      int k;
      if (localObject != null) {
        k = ((String)localObject).hashCode();
      } else {
        k = 0;
      }
      localObject = this.c;
      int m;
      if (localObject != null) {
        m = ((String)localObject).hashCode();
      } else {
        m = 0;
      }
      localObject = this.d;
      int n;
      if (localObject != null) {
        n = ((String)localObject).hashCode();
      } else {
        n = 0;
      }
      localObject = this.e;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Result(file=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", depthToken=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", triMapToken=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", facePointsToken=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", hairMaskToken=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */