package io.faceapp.ui.image_editor.common.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import oXa;

public final class g
{
  public static final void a(View paramView)
  {
    oXa.b(paramView, "$this$animateToInvisible");
    int i;
    if (paramView.getVisibility() != 4) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      paramView.animate().cancel();
    } else {
      paramView.animate().alpha(0.0F).scaleX(0.9F).scaleY(0.9F).setDuration(100L).withEndAction(new f(paramView)).start();
    }
  }
  
  public static final void a(View paramView, boolean paramBoolean)
  {
    oXa.b(paramView, "$this$animateVisibility");
    if (paramBoolean) {
      b(paramView);
    } else {
      a(paramView);
    }
  }
  
  public static final void b(View paramView)
  {
    oXa.b(paramView, "$this$animateToShow");
    int i;
    if ((paramView.getVisibility() == 0) && (paramView.getAlpha() == 1.0F)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i == 0)
    {
      paramView.animate().cancel();
    }
    else
    {
      if (paramView.getVisibility() != 0)
      {
        paramView.setAlpha(0.0F);
        paramView.setScaleX(0.9F);
        paramView.setScaleY(0.9F);
        paramView.setVisibility(0);
      }
      paramView.animate().alpha(1.0F).scaleX(1.0F).scaleY(1.0F).setDuration(100L).start();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */