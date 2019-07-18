package io.faceapp.ui.image_editor.common.view;

import QQa;
import aW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import cWa;
import cXa;
import jRa;
import kRa;
import oXa;

public final class BeforeAfterView
  extends ImageView
{
  private cXa<? super Boolean, cWa> a = a.b;
  
  public BeforeAfterView(Context paramContext)
  {
    this(paramContext, null, 0, 6, null);
  }
  
  public BeforeAfterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0, 4, null);
  }
  
  public BeforeAfterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final BeforeAfterView a(cXa<? super Boolean, cWa> paramcXa)
  {
    oXa.b(paramcXa, "pressedFunc");
    this.a = paramcXa;
    return this;
  }
  
  public final BeforeAfterView a(jRa paramjRa)
  {
    oXa.b(paramjRa, "disposable");
    paramjRa.a(new kRa[] { aW.d(this).e(b.a).e().c(new c(this)) });
    return this;
  }
  
  public final void a(boolean paramBoolean)
  {
    float f1 = 1.0F;
    float f2;
    if (paramBoolean) {
      f2 = 0.0F;
    } else {
      f2 = 1.0F;
    }
    if (paramBoolean) {
      f1 = 0.9F;
    }
    animate().alpha(f2).scaleX(f1).scaleY(f1).setDuration(100L).start();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setImageResource(2131230961);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/BeforeAfterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */