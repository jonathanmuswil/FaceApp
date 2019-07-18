package android.support.v7.widget;

import Pd;
import Vd;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.o;
import android.util.AttributeSet;
import android.widget.ImageView;

public class t
{
  private final ImageView a;
  private nb b;
  private nb c;
  private nb d;
  
  public t(ImageView paramImageView)
  {
    this.a = paramImageView;
  }
  
  private boolean a(Drawable paramDrawable)
  {
    if (this.d == null) {
      this.d = new nb();
    }
    nb localnb = this.d;
    localnb.a();
    Object localObject = o.a(this.a);
    if (localObject != null)
    {
      localnb.d = true;
      localnb.a = ((ColorStateList)localObject);
    }
    localObject = o.b(this.a);
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
  
  private boolean e()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    if (i > 21)
    {
      if (this.b == null) {
        bool = false;
      }
      return bool;
    }
    return i == 21;
  }
  
  void a()
  {
    Drawable localDrawable = this.a.getDrawable();
    if (localDrawable != null) {
      fa.b(localDrawable);
    }
    if (localDrawable != null)
    {
      if ((e()) && (a(localDrawable))) {
        return;
      }
      nb localnb = this.c;
      if (localnb != null)
      {
        p.a(localDrawable, localnb, this.a.getDrawableState());
      }
      else
      {
        localnb = this.b;
        if (localnb != null) {
          p.a(localDrawable, localnb, this.a.getDrawableState());
        }
      }
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt != 0)
    {
      Drawable localDrawable = Vd.b(this.a.getContext(), paramInt);
      if (localDrawable != null) {
        fa.b(localDrawable);
      }
      this.a.setImageDrawable(localDrawable);
    }
    else
    {
      this.a.setImageDrawable(null);
    }
    a();
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (this.c == null) {
      this.c = new nb();
    }
    nb localnb = this.c;
    localnb.a = paramColorStateList;
    localnb.d = true;
    a();
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    if (this.c == null) {
      this.c = new nb();
    }
    nb localnb = this.c;
    localnb.b = paramMode;
    localnb.c = true;
    a();
  }
  
  public void a(AttributeSet paramAttributeSet, int paramInt)
  {
    pb localpb = pb.a(this.a.getContext(), paramAttributeSet, Pd.AppCompatImageView, paramInt, 0);
    try
    {
      Drawable localDrawable = this.a.getDrawable();
      paramAttributeSet = localDrawable;
      if (localDrawable == null)
      {
        paramInt = localpb.g(Pd.AppCompatImageView_srcCompat, -1);
        paramAttributeSet = localDrawable;
        if (paramInt != -1)
        {
          localDrawable = Vd.b(this.a.getContext(), paramInt);
          paramAttributeSet = localDrawable;
          if (localDrawable != null)
          {
            this.a.setImageDrawable(localDrawable);
            paramAttributeSet = localDrawable;
          }
        }
      }
      if (paramAttributeSet != null) {
        fa.b(paramAttributeSet);
      }
      if (localpb.g(Pd.AppCompatImageView_tint)) {
        o.a(this.a, localpb.a(Pd.AppCompatImageView_tint));
      }
      if (localpb.g(Pd.AppCompatImageView_tintMode)) {
        o.a(this.a, fa.a(localpb.d(Pd.AppCompatImageView_tintMode, -1), null));
      }
      return;
    }
    finally
    {
      localpb.a();
    }
  }
  
  ColorStateList b()
  {
    Object localObject = this.c;
    if (localObject != null) {
      localObject = ((nb)localObject).a;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  PorterDuff.Mode c()
  {
    Object localObject = this.c;
    if (localObject != null) {
      localObject = ((nb)localObject).b;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  boolean d()
  {
    Drawable localDrawable = this.a.getBackground();
    return (Build.VERSION.SDK_INT < 21) || (!(localDrawable instanceof RippleDrawable));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */