import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class gb
  extends Property<View, PointF>
{
  gb(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF a(View paramView)
  {
    return null;
  }
  
  public void a(View paramView, PointF paramPointF)
  {
    _b.a(paramView, paramView.getLeft(), paramView.getTop(), Math.round(paramPointF.x), Math.round(paramPointF.y));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */