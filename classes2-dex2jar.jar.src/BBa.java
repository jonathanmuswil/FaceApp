import android.graphics.Bitmap;
import java.io.File;

final class bBa
  implements Runnable
{
  bBa(Bitmap paramBitmap, File paramFile) {}
  
  public final void run()
  {
    Object localObject1 = cBa.d;
    ??? = this.b.getAbsolutePath();
    oXa.a(???, "file.absolutePath");
    synchronized (cBa.a((cBa)localObject1, (String)???))
    {
      localObject1 = VWa.a(this.b);
      int i = ((String)localObject1).hashCode();
      if (i != 105441)
      {
        if ((i != 111145) || (!((String)localObject1).equals("png"))) {
          break label115;
        }
        localObject1 = this.a;
        oXa.a(localObject1, "it");
        oya.b((Bitmap)localObject1, this.b);
      }
      else
      {
        if (!((String)localObject1).equals("jpg")) {
          break label115;
        }
        localObject1 = this.a;
        oXa.a(localObject1, "it");
        oya.a((Bitmap)localObject1, this.b);
      }
      return;
      label115:
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */