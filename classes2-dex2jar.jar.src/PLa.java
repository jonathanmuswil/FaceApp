import android.content.Context;
import android.view.View;
import io.faceapp.m;

public final class pLa
  implements hLa
{
  private final int a;
  private final cXa<m, cWa> b;
  
  public pLa(int paramInt, cXa<? super m, cWa> paramcXa)
  {
    this.a = paramInt;
    this.b = paramcXa;
  }
  
  public View a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    return new oLa(paramContext, this.b, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pLa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */