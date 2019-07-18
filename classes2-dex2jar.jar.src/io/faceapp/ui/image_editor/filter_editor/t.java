package io.faceapp.ui.image_editor.filter_editor;

import _Va;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import oXa;

final class t
  implements ValueAnimator.AnimatorUpdateListener
{
  t(FilterStrengthItemView paramFilterStrengthItemView) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    FilterStrengthItemView localFilterStrengthItemView = this.a;
    oXa.a(paramValueAnimator, "anim");
    paramValueAnimator = paramValueAnimator.getAnimatedValue();
    if (paramValueAnimator != null)
    {
      FilterStrengthItemView.a(localFilterStrengthItemView, ((Float)paramValueAnimator).floatValue());
      this.a.invalidate();
      return;
    }
    throw new _Va("null cannot be cast to non-null type kotlin.Float");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */