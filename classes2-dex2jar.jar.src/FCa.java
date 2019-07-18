import android.graphics.Bitmap;
import android.graphics.PointF;

public final class fCa
{
  private hCa a;
  private dCa b;
  private LBa c;
  
  private final LBa b()
  {
    LBa localLBa = this.c;
    if (localLBa == null)
    {
      localLBa = new LBa();
      this.c = localLBa;
    }
    return localLBa;
  }
  
  private final dCa c()
  {
    dCa localdCa = this.b;
    if (localdCa == null)
    {
      localdCa = new dCa();
      this.b = localdCa;
    }
    return localdCa;
  }
  
  private final hCa d()
  {
    hCa localhCa = this.a;
    if (localhCa == null)
    {
      localhCa = new hCa();
      this.a = localhCa;
    }
    return localhCa;
  }
  
  public final FBa a()
  {
    GBa localGBa = new GBa();
    localGBa.a(this.a);
    localGBa.a(this.b);
    localGBa.a(this.c);
    return localGBa;
  }
  
  public final void a(float paramFloat)
  {
    b().a(paramFloat);
  }
  
  public final void a(float paramFloat, Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "unsharp");
    d().a(paramBitmap);
    d().a(paramFloat);
  }
  
  public final void a(float paramFloat, Bitmap paramBitmap, PointF paramPointF)
  {
    oXa.b(paramBitmap, "noise");
    oXa.b(paramPointF, "stretch");
    c().a(paramBitmap, paramPointF);
    c().a(paramFloat);
  }
  
  public final void b(float paramFloat)
  {
    b().b(paramFloat);
  }
  
  public final void c(float paramFloat)
  {
    b().c(paramFloat);
  }
  
  public final void d(float paramFloat)
  {
    b().d(paramFloat);
  }
  
  public final void e(float paramFloat)
  {
    b().e(paramFloat);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */