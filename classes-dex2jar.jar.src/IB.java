import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class ib
  extends Property<View, PointF>
{
  ib(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF a(View paramView)
  {
    return null;
  }
  
  public void a(View paramView, PointF paramPointF)
  {
    int i = Math.round(paramPointF.x);
    int j = Math.round(paramPointF.y);
    _b.a(paramView, i, j, paramView.getWidth() + i, paramView.getHeight() + j);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */