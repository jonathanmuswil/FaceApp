import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

final class db
  extends Property<Drawable, PointF>
{
  private Rect a = new Rect();
  
  db(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF a(Drawable paramDrawable)
  {
    paramDrawable.copyBounds(this.a);
    paramDrawable = this.a;
    return new PointF(paramDrawable.left, paramDrawable.top);
  }
  
  public void a(Drawable paramDrawable, PointF paramPointF)
  {
    paramDrawable.copyBounds(this.a);
    this.a.offsetTo(Math.round(paramPointF.x), Math.round(paramPointF.y));
    paramDrawable.setBounds(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */