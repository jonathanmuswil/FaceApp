package android.support.v7.widget;

import Gd;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.w;
import android.support.v4.widget.C;
import android.support.v4.widget.b;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class l
  extends Button
  implements w, b
{
  private final k a = new k(this);
  private final H b;
  
  public l(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.buttonStyle);
  }
  
  public l(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(mb.a(paramContext), paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
    this.b = new H(this);
    this.b.a(paramAttributeSet, paramInt);
    this.b.a();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.a;
    if (localObject != null) {
      ((k)localObject).a();
    }
    localObject = this.b;
    if (localObject != null) {
      ((H)localObject).a();
    }
  }
  
  public int getAutoSizeMaxTextSize()
  {
    if (b.a) {
      return super.getAutoSizeMaxTextSize();
    }
    H localH = this.b;
    if (localH != null) {
      return localH.c();
    }
    return -1;
  }
  
  public int getAutoSizeMinTextSize()
  {
    if (b.a) {
      return super.getAutoSizeMinTextSize();
    }
    H localH = this.b;
    if (localH != null) {
      return localH.d();
    }
    return -1;
  }
  
  public int getAutoSizeStepGranularity()
  {
    if (b.a) {
      return super.getAutoSizeStepGranularity();
    }
    H localH = this.b;
    if (localH != null) {
      return localH.e();
    }
    return -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    if (b.a) {
      return super.getAutoSizeTextAvailableSizes();
    }
    H localH = this.b;
    if (localH != null) {
      return localH.f();
    }
    return new int[0];
  }
  
  public int getAutoSizeTextType()
  {
    boolean bool = b.a;
    int i = 0;
    if (bool)
    {
      if (super.getAutoSizeTextType() == 1) {
        i = 1;
      }
      return i;
    }
    H localH = this.b;
    if (localH != null) {
      return localH.g();
    }
    return 0;
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.a;
    if (localObject != null) {
      localObject = ((k)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.a;
    if (localObject != null) {
      localObject = ((k)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    H localH = this.b;
    if (localH != null) {
      localH.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence = this.b;
    if ((paramCharSequence != null) && (!b.a) && (paramCharSequence.h())) {
      this.b.b();
    }
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws IllegalArgumentException
  {
    if (b.a)
    {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    else
    {
      H localH = this.b;
      if (localH != null) {
        localH.a(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
    throws IllegalArgumentException
  {
    if (b.a)
    {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
    }
    else
    {
      H localH = this.b;
      if (localH != null) {
        localH.a(paramArrayOfInt, paramInt);
      }
    }
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (b.a)
    {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    }
    else
    {
      H localH = this.b;
      if (localH != null) {
        localH.a(paramInt);
      }
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    k localk = this.a;
    if (localk != null) {
      localk.a(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    k localk = this.a;
    if (localk != null) {
      localk.a(paramInt);
    }
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(C.a(this, paramCallback));
  }
  
  public void setSupportAllCaps(boolean paramBoolean)
  {
    H localH = this.b;
    if (localH != null) {
      localH.a(paramBoolean);
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    k localk = this.a;
    if (localk != null) {
      localk.b(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    k localk = this.a;
    if (localk != null) {
      localk.a(paramMode);
    }
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    H localH = this.b;
    if (localH != null) {
      localH.a(paramContext, paramInt);
    }
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    if (b.a)
    {
      super.setTextSize(paramInt, paramFloat);
    }
    else
    {
      H localH = this.b;
      if (localH != null) {
        localH.a(paramInt, paramFloat);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */