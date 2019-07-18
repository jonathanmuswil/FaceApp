import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class hb
  extends Property<View, PointF>
{
  hb(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF a(View paramView)
  {
    return null;
  }
  
  public void a(View paramView, PointF paramPointF)
  {
    _b.a(paramView, Math.round(paramPointF.x), Math.round(paramPointF.y), paramView.getRight(), paramView.getBottom());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */