import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public class fg
  implements eg
{
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
  }
  
  public void a() {}
  
  public void a(int paramInt) {}
  
  public void a(Bitmap paramBitmap)
  {
    paramBitmap.recycle();
  }
  
  public Bitmap b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return a(paramInt1, paramInt2, paramConfig);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */