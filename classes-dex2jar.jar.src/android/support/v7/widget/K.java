package android.support.v7.widget;

import Pd;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.view.View;

class k
{
  private final View a;
  private final p b;
  private int c = -1;
  private nb d;
  private nb e;
  private nb f;
  
  k(View paramView)
  {
    this.a = paramView;
    this.b = p.a();
  }
  
  private boolean b(Drawable paramDrawable)
  {
    if (this.f == null) {
      this.f = new nb();
    }
    nb localnb = this.f;
    localnb.a();
    Object localObject = y.d(this.a);
    if (localObject != null)
    {
      localnb.d = true;
      localnb.a = ((ColorStateList)localObject);
    }
    localObject = y.e(this.a);
    if (localObject != null)
    {
      localnb.c = true;
      localnb.b = ((PorterDuff.Mode)localObject);
    }
    if ((!localnb.d) && (!localnb.c)) {
      return false;
    }
    p.a(paramDrawable, localnb, this.a.getDrawableState());
    return true;
  }
  
  private boolean d()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    if (i > 21)
    {
      if (this.d == null) {
        bool = false;
      }
      return bool;
    }
    return i == 21;
  }
  
  void a()
  {
    Drawable localDrawable = this.a.getBackground();
    if (localDrawable != null)
    {
      if ((d()) && (b(localDrawable))) {
        return;
      }
      nb localnb = this.e;
      if (localnb != null)
      {
        p.a(localDrawable, localnb, this.a.getDrawableState());
      }
      else
      {
        localnb = this.d;
        if (localnb != null) {
          p.a(localDrawable, localnb, this.a.getDrawableState());
        }
      }
    }
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
    Object localObject = this.b;
    if (localObject != null) {
      localObject = ((p)localObject).b(this.a.getContext(), paramInt);
    } else {
      localObject = null;
    }
    a((ColorStateList)localObject);
    a();
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.d == null) {
        this.d = new nb();
      }
      nb localnb = this.d;
      localnb.a = paramColorStateList;
      localnb.d = true;
    }
    else
    {
      this.d = null;
    }
    a();
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    if (this.e == null) {
      this.e = new nb();
    }
    nb localnb = this.e;
    localnb.b = paramMode;
    localnb.c = true;
    a();
  }
  
  void a(Drawable paramDrawable)
  {
    this.c = -1;
    a(null);
    a();
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = pb.a(this.a.getContext(), paramAttributeSet, Pd.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (paramAttributeSet.g(Pd.ViewBackgroundHelper_android_background))
      {
        this.c = paramAttributeSet.g(Pd.ViewBackgroundHelper_android_background, -1);
        ColorStateList localColorStateList = this.b.b(this.a.getContext(), this.c);
        if (localColorStateList != null) {
          a(localColorStateList);
        }
      }
      if (paramAttributeSet.g(Pd.ViewBackgroundHelper_backgroundTint)) {
        y.a(this.a, paramAttributeSet.a(Pd.ViewBackgroundHelper_backgroundTint));
      }
      if (paramAttributeSet.g(Pd.ViewBackgroundHelper_backgroundTintMode)) {
        y.a(this.a, fa.a(paramAttributeSet.d(Pd.ViewBackgroundHelper_backgroundTintMode, -1), null));
      }
      return;
    }
    finally
    {
      paramAttributeSet.a();
    }
  }
  
  ColorStateList b()
  {
    Object localObject = this.e;
    if (localObject != null) {
      localObject = ((nb)localObject).a;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  void b(ColorStateList paramColorStateList)
  {
    if (this.e == null) {
      this.e = new nb();
    }
    nb localnb = this.e;
    localnb.a = paramColorStateList;
    localnb.d = true;
    a();
  }
  
  PorterDuff.Mode c()
  {
    Object localObject = this.e;
    if (localObject != null) {
      localObject = ((nb)localObject).b;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */