package android.support.design.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import ga;

public class HideBottomViewOnScrollBehavior<V extends View>
  extends CoordinatorLayout.b<V>
{
  private int a = 0;
  private int b = 2;
  private ViewPropertyAnimator c;
  
  public HideBottomViewOnScrollBehavior() {}
  
  public HideBottomViewOnScrollBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(V paramV, int paramInt, long paramLong, TimeInterpolator paramTimeInterpolator)
  {
    this.c = paramV.animate().translationY(paramInt).setInterpolator(paramTimeInterpolator).setDuration(paramLong).setListener(new a(this));
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.b != 1) && (paramInt2 > 0)) {
      a(paramV);
    } else if ((this.b != 2) && (paramInt2 < 0)) {
      b(paramV);
    }
  }
  
  protected void a(V paramV)
  {
    ViewPropertyAnimator localViewPropertyAnimator = this.c;
    if (localViewPropertyAnimator != null)
    {
      localViewPropertyAnimator.cancel();
      paramV.clearAnimation();
    }
    this.b = 1;
    a(paramV, this.a, 175L, ga.c);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    this.a = paramV.getMeasuredHeight();
    return super.a(paramCoordinatorLayout, paramV, paramInt);
  }
  
  protected void b(V paramV)
  {
    ViewPropertyAnimator localViewPropertyAnimator = this.c;
    if (localViewPropertyAnimator != null)
    {
      localViewPropertyAnimator.cancel();
      paramV.clearAnimation();
    }
    this.b = 2;
    a(paramV, 0, 225L, ga.d);
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt)
  {
    boolean bool;
    if (paramInt == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/behavior/HideBottomViewOnScrollBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */