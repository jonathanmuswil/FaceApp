import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import java.util.List;

public final class jFa
  extends HEa<kFa>
{
  private final String s = "ModeMirror";
  private final String t = "mirror";
  private final String u = "mirror.jpg";
  
  public jFa(Eda paramEda)
  {
    super(paramEda);
  }
  
  public KDa.e a(int paramInt)
  {
    return new KDa.e(paramInt);
  }
  
  public Bitmap a(Context paramContext, List<? extends Uri> paramList, Matrix paramMatrix, WVa<Integer, Integer> paramWVa)
  {
    oXa.b(paramContext, "context");
    oXa.b(paramList, "uris");
    oXa.b(paramMatrix, "imageMatrix");
    oXa.b(paramWVa, "partSize");
    return hFa.a.a(paramContext, paramList, paramMatrix, ((Number)paramWVa.d()).intValue());
  }
  
  public Matrix a(Matrix paramMatrix)
  {
    oXa.b(paramMatrix, "baseMatrix");
    return paramMatrix;
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */