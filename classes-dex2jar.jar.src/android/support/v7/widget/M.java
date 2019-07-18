package android.support.v7.widget;

import Gd;
import Vd;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.D;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class m
  extends CheckBox
  implements D
{
  private final o a = new o(this);
  
  public m(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.checkboxStyle);
  }
  
  public m(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(mb.a(paramContext), paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
  }
  
  public int getCompoundPaddingLeft()
  {
    int i = super.getCompoundPaddingLeft();
    o localo = this.a;
    int j = i;
    if (localo != null) {
      j = localo.a(i);
    }
    return j;
  }
  
  public ColorStateList getSupportButtonTintList()
  {
    Object localObject = this.a;
    if (localObject != null) {
      localObject = ((o)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode()
  {
    Object localObject = this.a;
    if (localObject != null) {
      localObject = ((o)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public void setButtonDrawable(int paramInt)
  {
    setButtonDrawable(Vd.b(getContext(), paramInt));
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    paramDrawable = this.a;
    if (paramDrawable != null) {
      paramDrawable.d();
    }
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    o localo = this.a;
    if (localo != null) {
      localo.a(paramColorStateList);
    }
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    o localo = this.a;
    if (localo != null) {
      localo.a(paramMode);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */