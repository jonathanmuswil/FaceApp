import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import java.util.List;

public final class bFa
  extends HEa<cFa>
{
  private final String s = "ModeDuo";
  private final String t = "duo";
  private final String u = "duo.jpg";
  
  public bFa(Eda paramEda)
  {
    super(paramEda);
  }
  
  private final void d(Matrix paramMatrix)
  {
    Matrix localMatrix = l();
    if (localMatrix != null) {
      localMatrix.set(paramMatrix);
    }
  }
  
  public KDa.b a(int paramInt)
  {
    return new KDa.b(paramInt);
  }
  
  public Bitmap a(Context paramContext, List<? extends Uri> paramList, Matrix paramMatrix, WVa<Integer, Integer> paramWVa)
  {
    oXa.b(paramContext, "context");
    oXa.b(paramList, "uris");
    oXa.b(paramMatrix, "imageMatrix");
    oXa.b(paramWVa, "partSize");
    return XEa.a.a(paramContext, paramList, paramMatrix, paramWVa);
  }
  
  public Matrix a(Matrix paramMatrix)
  {
    oXa.b(paramMatrix, "baseMatrix");
    return paramMatrix;
  }
  
  public void a(cFa paramcFa)
  {
    oXa.b(paramcFa, "view");
    super.b(paramcFa);
    gla.b(this, paramcFa.p(), null, null, new aFa(this), 3, null);
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
  
  public String m()
  {
    return this.t;
  }
  
  public String n()
  {
    return this.u;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */