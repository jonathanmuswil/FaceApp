import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

public class ka
  extends Property<Drawable, Integer>
{
  public static final Property<Drawable, Integer> a = new ka();
  private final WeakHashMap<Drawable, Integer> b = new WeakHashMap();
  
  private ka()
  {
    super(Integer.class, "drawableAlphaCompat");
  }
  
  public Integer a(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return Integer.valueOf(paramDrawable.getAlpha());
    }
    if (this.b.containsKey(paramDrawable)) {
      return (Integer)this.b.get(paramDrawable);
    }
    return Integer.valueOf(255);
  }
  
  public void a(Drawable paramDrawable, Integer paramInteger)
  {
    if (Build.VERSION.SDK_INT < 19) {
      this.b.put(paramDrawable, paramInteger);
    }
    paramDrawable.setAlpha(paramInteger.intValue());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */