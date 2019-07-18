package android.support.design.widget;

import android.widget.ImageButton;

public class ga
  extends ImageButton
{
  private int a;
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    super.setVisibility(paramInt);
    if (paramBoolean) {
      this.a = paramInt;
    }
  }
  
  public final int getUserSetVisibility()
  {
    return this.a;
  }
  
  public void setVisibility(int paramInt)
  {
    a(paramInt, true);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */