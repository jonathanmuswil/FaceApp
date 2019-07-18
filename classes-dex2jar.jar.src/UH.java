import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import java.io.IOException;

public class uh<DataType>
  implements k<DataType, BitmapDrawable>
{
  private final k<DataType, Bitmap> a;
  private final Resources b;
  
  public uh(Resources paramResources, k<DataType, Bitmap> paramk)
  {
    Nj.a(paramResources);
    this.b = ((Resources)paramResources);
    Nj.a(paramk);
    this.a = ((k)paramk);
  }
  
  public Wf<BitmapDrawable> a(DataType paramDataType, int paramInt1, int paramInt2, j paramj)
    throws IOException
  {
    paramDataType = this.a.a(paramDataType, paramInt1, paramInt2, paramj);
    return Nh.a(this.b, paramDataType);
  }
  
  public boolean a(DataType paramDataType, j paramj)
    throws IOException
  {
    return this.a.a(paramDataType, paramj);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */