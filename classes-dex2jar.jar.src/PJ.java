import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class pj
{
  public <Z> tj<ImageView, Z> a(ImageView paramImageView, Class<Z> paramClass)
  {
    if (Bitmap.class.equals(paramClass)) {
      return new mj(paramImageView);
    }
    if (Drawable.class.isAssignableFrom(paramClass)) {
      return new nj(paramImageView);
    }
    paramImageView = new StringBuilder();
    paramImageView.append("Unhandled class: ");
    paramImageView.append(paramClass);
    paramImageView.append(", try .as*(Class).transcode(ResourceTranscoder)");
    throw new IllegalArgumentException(paramImageView.toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */