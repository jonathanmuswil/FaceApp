package android.support.v7.widget;

import Gd;
import Vd;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.w;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class u
  extends MultiAutoCompleteTextView
  implements w
{
  private static final int[] a = { 16843126 };
  private final k b;
  private final H c;
  
  public u(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.autoCompleteTextViewStyle);
  }
  
  public u(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(mb.a(paramContext), paramAttributeSet, paramInt);
    paramContext = pb.a(getContext(), paramAttributeSet, a, paramInt, 0);
    if (paramContext.g(0)) {
      setDropDownBackgroundDrawable(paramContext.b(0));
    }
    paramContext.a();
    this.b = new k(this);
    this.b.a(paramAttributeSet, paramInt);
    this.c = new H(this);
    this.c.a(paramAttributeSet, paramInt);
    this.c.a();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.b;
    if (localObject != null) {
      ((k)localObject).a();
    }
    localObject = this.c;
    if (localObject != null) {
      ((H)localObject).a();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = ((k)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = ((k)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    r.a(localInputConnection, paramEditorInfo, this);
    return localInputConnection;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    k localk = this.b;
    if (localk != null) {
      localk.a(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    k localk = this.b;
    if (localk != null) {
      localk.a(paramInt);
    }
  }
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    setDropDownBackgroundDrawable(Vd.b(getContext(), paramInt));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    k localk = this.b;
    if (localk != null) {
      localk.b(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    k localk = this.b;
    if (localk != null) {
      localk.a(paramMode);
    }
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    H localH = this.c;
    if (localH != null) {
      localH.a(paramContext, paramInt);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */