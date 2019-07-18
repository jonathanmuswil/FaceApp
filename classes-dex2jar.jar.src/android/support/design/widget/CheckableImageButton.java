package android.support.design.widget;

import Gd;
import android.content.Context;
import android.support.v4.view.y;
import android.support.v7.widget.s;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;

public class CheckableImageButton
  extends s
  implements Checkable
{
  private static final int[] c = { 16842912 };
  private boolean d;
  
  public CheckableImageButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.imageButtonStyle);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    y.a(this, new q(this));
  }
  
  public boolean isChecked()
  {
    return this.d;
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    if (this.d) {
      return ImageButton.mergeDrawableStates(super.onCreateDrawableState(paramInt + c.length), c);
    }
    return super.onCreateDrawableState(paramInt);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    if (this.d != paramBoolean)
    {
      this.d = paramBoolean;
      refreshDrawableState();
      sendAccessibilityEvent(2048);
    }
  }
  
  public void toggle()
  {
    setChecked(this.d ^ true);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/CheckableImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */