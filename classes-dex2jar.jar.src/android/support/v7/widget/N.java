package android.support.v7.widget;

import Vd;
import android.content.Context;
import android.support.v4.widget.C;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class n
  extends CheckedTextView
{
  private static final int[] a = { 16843016 };
  private final H b = new H(this);
  
  public n(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public n(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(mb.a(paramContext), paramAttributeSet, paramInt);
    this.b.a(paramAttributeSet, paramInt);
    this.b.a();
    paramContext = pb.a(getContext(), paramAttributeSet, a, paramInt, 0);
    setCheckMarkDrawable(paramContext.b(0));
    paramContext.a();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    H localH = this.b;
    if (localH != null) {
      localH.a();
    }
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    r.a(localInputConnection, paramEditorInfo, this);
    return localInputConnection;
  }
  
  public void setCheckMarkDrawable(int paramInt)
  {
    setCheckMarkDrawable(Vd.b(getContext(), paramInt));
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(C.a(this, paramCallback));
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */