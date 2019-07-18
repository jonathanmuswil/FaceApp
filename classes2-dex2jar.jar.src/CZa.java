import android.graphics.PointF;

final class cza
  extends pXa
  implements cXa<WVa<? extends PointF, ? extends Boolean>, cWa>
{
  cza(lza paramlza)
  {
    super(1);
  }
  
  public final void a(WVa<? extends PointF, Boolean> paramWVa)
  {
    PointF localPointF = (PointF)paramWVa.a();
    paramWVa = (Boolean)paramWVa.b();
    mza localmza = (mza)this.b.c();
    if (localmza != null)
    {
      oXa.a(localPointF, "source");
      oXa.a(paramWVa, "smooth");
      localmza.a(localPointF, paramWVa.booleanValue());
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */