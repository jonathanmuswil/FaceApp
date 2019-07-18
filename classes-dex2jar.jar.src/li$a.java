import android.graphics.Bitmap;
import android.os.Handler;

class li$a
  extends qj<Bitmap>
{
  private final Handler d;
  final int e;
  private final long f;
  private Bitmap g;
  
  li$a(Handler paramHandler, int paramInt, long paramLong)
  {
    this.d = paramHandler;
    this.e = paramInt;
    this.f = paramLong;
  }
  
  public void a(Bitmap paramBitmap, xj<? super Bitmap> paramxj)
  {
    this.g = paramBitmap;
    paramBitmap = this.d.obtainMessage(1, this);
    this.d.sendMessageAtTime(paramBitmap, this.f);
  }
  
  Bitmap b()
  {
    return this.g;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/li$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */