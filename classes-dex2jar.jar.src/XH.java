import android.graphics.Bitmap;

public class xh
  implements Wf<Bitmap>, Rf
{
  private final Bitmap a;
  private final eg b;
  
  public xh(Bitmap paramBitmap, eg parameg)
  {
    Nj.a(paramBitmap, "Bitmap must not be null");
    this.a = ((Bitmap)paramBitmap);
    Nj.a(parameg, "BitmapPool must not be null");
    this.b = ((eg)parameg);
  }
  
  public static xh a(Bitmap paramBitmap, eg parameg)
  {
    if (paramBitmap == null) {
      return null;
    }
    return new xh(paramBitmap, parameg);
  }
  
  public void a()
  {
    this.b.a(this.a);
  }
  
  public int b()
  {
    return Pj.a(this.a);
  }
  
  public Class<Bitmap> c()
  {
    return Bitmap.class;
  }
  
  public void d()
  {
    this.a.prepareToDraw();
  }
  
  public Bitmap get()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */