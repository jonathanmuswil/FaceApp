import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import java.util.List;

public final class fFa
  extends HEa<gFa>
{
  private final String s = "ModeLens";
  private final String t = "lens";
  private final String u = "lens.jpg";
  private final int v = KDa.c.b.a();
  private String w;
  
  public fFa(Eda paramEda)
  {
    super(paramEda);
  }
  
  public KDa a(int paramInt)
  {
    Object localObject;
    if (KDa.d.b.a() == paramInt) {
      localObject = KDa.d.b;
    } else {
      localObject = KDa.c.b;
    }
    return (KDa)localObject;
  }
  
  public Bitmap a(Context paramContext, List<? extends Uri> paramList, Matrix paramMatrix, WVa<Integer, Integer> paramWVa)
  {
    oXa.b(paramContext, "context");
    oXa.b(paramList, "uris");
    oXa.b(paramMatrix, "imageMatrix");
    oXa.b(paramWVa, "partSize");
    return dFa.a.a(paramContext, paramList, paramMatrix, paramWVa);
  }
  
  public Matrix a(Matrix paramMatrix)
  {
    oXa.b(paramMatrix, "baseMatrix");
    return paramMatrix;
  }
  
  public bia<? extends Object> a(int paramInt, String paramString)
  {
    if (paramInt == KDa.d.b.a())
    {
      Eda localEda = h();
      if (paramString == null)
      {
        paramString = this.w;
        if (paramString == null) {}
      }
      else
      {
        return localEda.c(paramString);
      }
      oXa.b("originSmallFilterId");
      throw null;
    }
    else if (paramString != null)
    {
      paramString = h().a(paramString, false);
    }
    else
    {
      paramString = h().a(false);
    }
    return paramString;
  }
  
  public Matrix b(Matrix paramMatrix)
  {
    oXa.b(paramMatrix, "baseMatrix");
    return paramMatrix;
  }
  
  public String b()
  {
    return this.s;
  }
  
  public void k()
  {
    super.k();
    this.w = g().g().d();
  }
  
  public String m()
  {
    return this.t;
  }
  
  public String n()
  {
    return this.u;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */