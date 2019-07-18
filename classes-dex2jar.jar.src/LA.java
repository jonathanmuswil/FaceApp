import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class la
  extends Property<ImageView, Matrix>
{
  private final Matrix a = new Matrix();
  
  public la()
  {
    super(Matrix.class, "imageMatrixProperty");
  }
  
  public Matrix a(ImageView paramImageView)
  {
    this.a.set(paramImageView.getImageMatrix());
    return this.a;
  }
  
  public void a(ImageView paramImageView, Matrix paramMatrix)
  {
    paramImageView.setImageMatrix(paramMatrix);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */