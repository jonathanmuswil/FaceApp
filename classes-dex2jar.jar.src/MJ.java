import android.graphics.Bitmap;
import android.widget.ImageView;

public class mj
  extends oj<Bitmap>
{
  public mj(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  protected void a(Bitmap paramBitmap)
  {
    ((ImageView)this.d).setImageBitmap(paramBitmap);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */