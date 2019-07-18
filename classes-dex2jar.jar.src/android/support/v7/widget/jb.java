package android.support.v7.widget;

import android.util.Property;

final class jb
  extends Property<SwitchCompat, Float>
{
  jb(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float a(SwitchCompat paramSwitchCompat)
  {
    return Float.valueOf(paramSwitchCompat.z);
  }
  
  public void a(SwitchCompat paramSwitchCompat, Float paramFloat)
  {
    paramSwitchCompat.setThumbPosition(paramFloat.floatValue());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */