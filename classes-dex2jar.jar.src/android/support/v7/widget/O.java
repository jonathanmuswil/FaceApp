package android.support.v7.widget;

import Pd;
import Vd;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.graphics.drawable.a;
import android.support.v4.widget.g;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class o
{
  private final CompoundButton a;
  private ColorStateList b = null;
  private PorterDuff.Mode c = null;
  private boolean d = false;
  private boolean e = false;
  private boolean f;
  
  o(CompoundButton paramCompoundButton)
  {
    this.a = paramCompoundButton;
  }
  
  int a(int paramInt)
  {
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 17)
    {
      Drawable localDrawable = g.a(this.a);
      i = paramInt;
      if (localDrawable != null) {
        i = paramInt + localDrawable.getIntrinsicWidth();
      }
    }
    return i;
  }
  
  void a()
  {
    Drawable localDrawable = g.a(this.a);
    if ((localDrawable != null) && ((this.d) || (this.e)))
    {
      localDrawable = a.i(localDrawable).mutate();
      if (this.d) {
        a.a(localDrawable, this.b);
      }
      if (this.e) {
        a.a(localDrawable, this.c);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(this.a.getDrawableState());
      }
      this.a.setButtonDrawable(localDrawable);
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    this.b = paramColorStateList;
    this.d = true;
    a();
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    this.c = paramMode;
    this.e = true;
    a();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.a.getContext().obtainStyledAttributes(paramAttributeSet, Pd.CompoundButton, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(Pd.CompoundButton_android_button))
      {
        paramInt = paramAttributeSet.getResourceId(Pd.CompoundButton_android_button, 0);
        if (paramInt != 0) {
          this.a.setButtonDrawable(Vd.b(this.a.getContext(), paramInt));
        }
      }
      if (paramAttributeSet.hasValue(Pd.CompoundButton_buttonTint)) {
        g.a(this.a, paramAttributeSet.getColorStateList(Pd.CompoundButton_buttonTint));
      }
      if (paramAttributeSet.hasValue(Pd.CompoundButton_buttonTintMode)) {
        g.a(this.a, fa.a(paramAttributeSet.getInt(Pd.CompoundButton_buttonTintMode, -1), null));
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  ColorStateList b()
  {
    return this.b;
  }
  
  PorterDuff.Mode c()
  {
    return this.c;
  }
  
  void d()
  {
    if (this.f)
    {
      this.f = false;
      return;
    }
    this.f = true;
    a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */