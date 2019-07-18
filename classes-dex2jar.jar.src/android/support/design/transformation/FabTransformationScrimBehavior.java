package android.support.design.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.b;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import ha;
import java.util.ArrayList;
import java.util.List;
import oa;

public class FabTransformationScrimBehavior
  extends ExpandableTransformationBehavior
{
  private final oa c = new oa(75L, 150L);
  private final oa d = new oa(0L, 150L);
  
  public FabTransformationScrimBehavior() {}
  
  public FabTransformationScrimBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(View paramView, boolean paramBoolean1, boolean paramBoolean2, List<Animator> paramList, List<Animator.AnimatorListener> paramList1)
  {
    if (paramBoolean1) {
      paramList1 = this.c;
    } else {
      paramList1 = this.d;
    }
    if (paramBoolean1)
    {
      if (!paramBoolean2) {
        paramView.setAlpha(0.0F);
      }
      paramView = ObjectAnimator.ofFloat(paramView, View.ALPHA, new float[] { 1.0F });
    }
    else
    {
      paramView = ObjectAnimator.ofFloat(paramView, View.ALPHA, new float[] { 0.0F });
    }
    paramList1.a(paramView);
    paramList.add(paramView);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    return paramView2 instanceof FloatingActionButton;
  }
  
  protected AnimatorSet b(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList = new ArrayList();
    a(paramView2, paramBoolean1, paramBoolean2, localArrayList, new ArrayList());
    paramView1 = new AnimatorSet();
    ha.a(paramView1, localArrayList);
    paramView1.addListener(new g(this, paramBoolean1, paramView2));
    return paramView1;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    return super.b(paramCoordinatorLayout, paramView, paramMotionEvent);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/FabTransformationScrimBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */