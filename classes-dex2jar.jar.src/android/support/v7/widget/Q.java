package android.support.v7.widget;

import Gd;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.w;
import android.support.v4.widget.C;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public class q
  extends EditText
  implements w
{
  private final k a = new k(this);
  private final H b;
  
  public q(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public q(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.editTextStyle);
  }
  
  public q(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
  
  public Editable getText()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return super.getText();
    }
    return super.getEditableText();
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
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */