import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public final class gi
  implements Re.a
{
  private final eg a;
  private final bg b;
  
  public gi(eg parameg, bg parambg)
  {
    this.a = parameg;
    this.b = parambg;
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return this.a.b(paramInt1, paramInt2, paramConfig);
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.a.a(paramBitmap);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    bg localbg = this.b;
    if (localbg == null) {
      return;
    }
    localbg.put(paramArrayOfByte);
  }
  
  public void a(int[] paramArrayOfInt)
  {
    bg localbg = this.b;
    if (localbg == null) {
      return;
    }
    localbg.put(paramArrayOfInt);
  }
  
  public int[] a(int paramInt)
  {
    bg localbg = this.b;
    if (localbg == null) {
      return new int[paramInt];
    }
    return (int[])localbg.b(paramInt, int[].class);
  }
  
  public byte[] b(int paramInt)
  {
    bg localbg = this.b;
    if (localbg == null) {
      return new byte[paramInt];
    }
    return (byte[])localbg.b(paramInt, byte[].class);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */