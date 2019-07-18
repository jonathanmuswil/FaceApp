import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public class ja
  extends Property<ViewGroup, Float>
{
  public static final Property<ViewGroup, Float> a = new ja("childrenAlpha");
  
  private ja(String paramString)
  {
    super(Float.class, paramString);
  }
  
  public Float a(ViewGroup paramViewGroup)
  {
    paramViewGroup = (Float)paramViewGroup.getTag(aa.mtrl_internal_children_alpha_tag);
    if (paramViewGroup != null) {
      return paramViewGroup;
    }
    return Float.valueOf(1.0F);
  }
  
  public void a(ViewGroup paramViewGroup, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    paramViewGroup.setTag(aa.mtrl_internal_children_alpha_tag, Float.valueOf(f));
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++) {
      paramViewGroup.getChildAt(j).setAlpha(f);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */