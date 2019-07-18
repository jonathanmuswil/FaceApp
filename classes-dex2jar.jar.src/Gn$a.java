import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

class Gn$a
  implements Callable<String>
{
  private WeakReference<View> a;
  
  public Gn$a(View paramView)
  {
    this.a = new WeakReference(paramView);
  }
  
  public String call()
    throws Exception
  {
    Object localObject = (View)this.a.get();
    if ((localObject != null) && (((View)localObject).getWidth() != 0) && (((View)localObject).getHeight() != 0))
    {
      Bitmap localBitmap = Bitmap.createBitmap(((View)localObject).getWidth(), ((View)localObject).getHeight(), Bitmap.Config.RGB_565);
      ((View)localObject).draw(new Canvas(localBitmap));
      localObject = new ByteArrayOutputStream();
      localBitmap.compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)localObject);
      return Base64.encodeToString(((ByteArrayOutputStream)localObject).toByteArray(), 2);
    }
    return "";
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Gn$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */