package android.support.v4.widget;

import android.os.Build.VERSION;

public abstract interface b
{
  public static final boolean a;
  
  static
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27) {
      bool = true;
    } else {
      bool = false;
    }
    a = bool;
  }
  
  public abstract int getAutoSizeMaxTextSize();
  
  public abstract int getAutoSizeMinTextSize();
  
  public abstract int getAutoSizeStepGranularity();
  
  public abstract void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws IllegalArgumentException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */