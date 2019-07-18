package android.support.design.transformation;

import aa;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.e;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.K;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import ga;
import ha;
import ia;
import ja;
import java.util.ArrayList;
import java.util.List;
import ka;
import na;
import oa;
import pa;
import ua;
import wa;
import ya;
import ya.c;
import ya.d;

public abstract class FabTransformationBehavior
  extends ExpandableTransformationBehavior
{
  private final Rect c = new Rect();
  private final RectF d = new RectF();
  private final RectF e = new RectF();
  private final int[] f = new int[2];
  
  public FabTransformationBehavior() {}
  
  public FabTransformationBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private float a(a parama, oa paramoa, float paramFloat1, float paramFloat2)
  {
    long l1 = paramoa.a();
    long l2 = paramoa.b();
    parama = parama.a.a("expansion");
    float f1 = (float)(parama.a() + parama.b() + 17L - l1) / (float)l2;
    return ga.a(paramFloat1, paramFloat2, paramoa.c().getInterpolation(f1));
  }
  
  private float a(View paramView1, View paramView2, pa parampa)
  {
    RectF localRectF1 = this.d;
    RectF localRectF2 = this.e;
    a(paramView1, localRectF1);
    a(paramView2, localRectF2);
    localRectF2.offset(-c(paramView1, paramView2, parampa), 0.0F);
    return localRectF1.centerX() - localRectF2.left;
  }
  
  private ViewGroup a(View paramView)
  {
    View localView = paramView.findViewById(aa.mtrl_child_content_container);
    if (localView != null) {
      return c(localView);
    }
    if ((!(paramView instanceof i)) && (!(paramView instanceof h))) {
      return c(paramView);
    }
    return c(((ViewGroup)paramView).getChildAt(0));
  }
  
  private void a(View paramView, long paramLong, int paramInt1, int paramInt2, float paramFloat, List<Animator> paramList)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (paramLong > 0L))
    {
      paramView = ViewAnimationUtils.createCircularReveal(paramView, paramInt1, paramInt2, paramFloat, paramFloat);
      paramView.setStartDelay(0L);
      paramView.setDuration(paramLong);
      paramList.add(paramView);
    }
  }
  
  private void a(View paramView, long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, float paramFloat, List<Animator> paramList)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramLong1 += paramLong2;
      if (paramLong1 < paramLong3)
      {
        paramView = ViewAnimationUtils.createCircularReveal(paramView, paramInt1, paramInt2, paramFloat, paramFloat);
        paramView.setStartDelay(paramLong1);
        paramView.setDuration(paramLong3 - paramLong1);
        paramList.add(paramView);
      }
    }
  }
  
  private void a(View paramView, RectF paramRectF)
  {
    paramRectF.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    int[] arrayOfInt = this.f;
    paramView.getLocationInWindow(arrayOfInt);
    paramRectF.offsetTo(arrayOfInt[0], arrayOfInt[1]);
    paramRectF.offset((int)-paramView.getTranslationX(), (int)-paramView.getTranslationY());
  }
  
  private void a(View paramView, a parama, oa paramoa1, oa paramoa2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, RectF paramRectF)
  {
    paramFloat1 = a(parama, paramoa1, paramFloat1, paramFloat3);
    paramFloat2 = a(parama, paramoa2, paramFloat2, paramFloat4);
    paramoa1 = this.c;
    paramView.getWindowVisibleDisplayFrame(paramoa1);
    parama = this.d;
    parama.set(paramoa1);
    paramoa1 = this.e;
    a(paramView, paramoa1);
    paramoa1.offset(paramFloat1, paramFloat2);
    paramoa1.intersect(parama);
    paramRectF.set(paramoa1);
  }
  
  private void a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, a parama, float paramFloat1, float paramFloat2, List<Animator> paramList, List<Animator.AnimatorListener> paramList1)
  {
    if (!(paramView2 instanceof ya)) {
      return;
    }
    ya localya = (ya)paramView2;
    float f1 = a(paramView1, paramView2, parama.b);
    float f2 = b(paramView1, paramView2, parama.b);
    ((FloatingActionButton)paramView1).a(this.c);
    float f3 = this.c.width() / 2.0F;
    oa localoa = parama.a.a("expansion");
    if (paramBoolean1)
    {
      if (!paramBoolean2) {
        localya.setRevealInfo(new ya.d(f1, f2, f3));
      }
      if (paramBoolean2) {
        f3 = localya.getRevealInfo().c;
      }
      paramView1 = ua.a(localya, f1, f2, K.a(f1, f2, 0.0F, 0.0F, paramFloat1, paramFloat2));
      paramView1.addListener(new f(this, localya));
      a(paramView2, localoa.a(), (int)f1, (int)f2, f3, paramList);
    }
    else
    {
      paramFloat1 = localya.getRevealInfo().c;
      paramView1 = ua.a(localya, f1, f2, f3);
      long l = localoa.a();
      int i = (int)f1;
      int j = (int)f2;
      a(paramView2, l, i, j, paramFloat1, paramList);
      a(paramView2, localoa.a(), localoa.b(), parama.a.a(), i, j, f3, paramList);
    }
    localoa.a(paramView1);
    paramList.add(paramView1);
    paramList1.add(ua.a(localya));
  }
  
  private void a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, a parama, List<Animator> paramList, List<Animator.AnimatorListener> paramList1)
  {
    if (!(paramView2 instanceof ViewGroup)) {
      return;
    }
    if (((paramView2 instanceof ya)) && (wa.a == 0)) {
      return;
    }
    paramView1 = a(paramView2);
    if (paramView1 == null) {
      return;
    }
    if (paramBoolean1)
    {
      if (!paramBoolean2) {
        ja.a.set(paramView1, Float.valueOf(0.0F));
      }
      paramView1 = ObjectAnimator.ofFloat(paramView1, ja.a, new float[] { 1.0F });
    }
    else
    {
      paramView1 = ObjectAnimator.ofFloat(paramView1, ja.a, new float[] { 0.0F });
    }
    parama.a.a("contentFade").a(paramView1);
    paramList.add(paramView1);
  }
  
  private void a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, a parama, List<Animator> paramList, List<Animator.AnimatorListener> paramList1, RectF paramRectF)
  {
    float f1 = c(paramView1, paramView2, parama.b);
    float f2 = d(paramView1, paramView2, parama.b);
    if (f1 != 0.0F)
    {
      boolean bool = f2 < 0.0F;
      if (bool)
      {
        if (((paramBoolean1) && (f2 < 0.0F)) || ((!paramBoolean1) && (bool)))
        {
          paramView1 = parama.a.a("translationXCurveUpwards");
          paramList1 = parama.a.a("translationYCurveUpwards");
          break label148;
        }
        paramView1 = parama.a.a("translationXCurveDownwards");
        paramList1 = parama.a.a("translationYCurveDownwards");
        break label148;
      }
    }
    paramView1 = parama.a.a("translationXLinear");
    paramList1 = parama.a.a("translationYLinear");
    label148:
    if (paramBoolean1)
    {
      if (!paramBoolean2)
      {
        paramView2.setTranslationX(-f1);
        paramView2.setTranslationY(-f2);
      }
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_X, new float[] { 0.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Y, new float[] { 0.0F });
      a(paramView2, parama, paramView1, paramList1, -f1, -f2, 0.0F, 0.0F, paramRectF);
      parama = localObjectAnimator1;
      paramView2 = localObjectAnimator2;
    }
    else
    {
      parama = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_X, new float[] { -f1 });
      paramView2 = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Y, new float[] { -f2 });
    }
    paramView1.a(parama);
    paramList1.a(paramView2);
    paramList.add(parama);
    paramList.add(paramView2);
  }
  
  private float b(View paramView1, View paramView2, pa parampa)
  {
    RectF localRectF1 = this.d;
    RectF localRectF2 = this.e;
    a(paramView1, localRectF1);
    a(paramView2, localRectF2);
    localRectF2.offset(0.0F, -d(paramView1, paramView2, parampa));
    return localRectF1.centerY() - localRectF2.top;
  }
  
  private int b(View paramView)
  {
    ColorStateList localColorStateList = y.d(paramView);
    if (localColorStateList != null) {
      return localColorStateList.getColorForState(paramView.getDrawableState(), localColorStateList.getDefaultColor());
    }
    return 0;
  }
  
  private void b(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, a parama, List<Animator> paramList, List<Animator.AnimatorListener> paramList1)
  {
    if (!(paramView2 instanceof ya)) {
      return;
    }
    paramView2 = (ya)paramView2;
    int i = b(paramView1);
    if (paramBoolean1)
    {
      if (!paramBoolean2) {
        paramView2.setCircularRevealScrimColor(i);
      }
      paramView1 = ObjectAnimator.ofInt(paramView2, ya.c.a, new int[] { 0xFFFFFF & i });
    }
    else
    {
      paramView1 = ObjectAnimator.ofInt(paramView2, ya.c.a, new int[] { i });
    }
    paramView1.setEvaluator(ia.a());
    parama.a.a("color").a(paramView1);
    paramList.add(paramView1);
  }
  
  private float c(View paramView1, View paramView2, pa parampa)
  {
    RectF localRectF1 = this.d;
    RectF localRectF2 = this.e;
    a(paramView1, localRectF1);
    a(paramView2, localRectF2);
    int i = parampa.a & 0x7;
    float f1;
    float f2;
    if (i != 1)
    {
      if (i != 3)
      {
        if (i != 5)
        {
          f1 = 0.0F;
          break label114;
        }
        f1 = localRectF2.right;
        f2 = localRectF1.right;
      }
      else
      {
        f1 = localRectF2.left;
        f2 = localRectF1.left;
      }
    }
    else
    {
      f1 = localRectF2.centerX();
      f2 = localRectF1.centerX();
    }
    f1 -= f2;
    label114:
    return f1 + parampa.b;
  }
  
  private ViewGroup c(View paramView)
  {
    if ((paramView instanceof ViewGroup)) {
      return (ViewGroup)paramView;
    }
    return null;
  }
  
  @TargetApi(21)
  private void c(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, a parama, List<Animator> paramList, List<Animator.AnimatorListener> paramList1)
  {
    float f1 = y.h(paramView2) - y.h(paramView1);
    if (paramBoolean1)
    {
      if (!paramBoolean2) {
        paramView2.setTranslationZ(-f1);
      }
      paramView1 = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Z, new float[] { 0.0F });
    }
    else
    {
      paramView1 = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Z, new float[] { -f1 });
    }
    parama.a.a("elevation").a(paramView1);
    paramList.add(paramView1);
  }
  
  private float d(View paramView1, View paramView2, pa parampa)
  {
    RectF localRectF1 = this.d;
    RectF localRectF2 = this.e;
    a(paramView1, localRectF1);
    a(paramView2, localRectF2);
    int i = parampa.a & 0x70;
    float f1;
    float f2;
    if (i != 16)
    {
      if (i != 48)
      {
        if (i != 80)
        {
          f1 = 0.0F;
          break label117;
        }
        f1 = localRectF2.bottom;
        f2 = localRectF1.bottom;
      }
      else
      {
        f1 = localRectF2.top;
        f2 = localRectF1.top;
      }
    }
    else
    {
      f1 = localRectF2.centerY();
      f2 = localRectF1.centerY();
    }
    f1 -= f2;
    label117:
    return f1 + parampa.c;
  }
  
  private void d(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, a parama, List<Animator> paramList, List<Animator.AnimatorListener> paramList1)
  {
    if (((paramView2 instanceof ya)) && ((paramView1 instanceof ImageView)))
    {
      ya localya = (ya)paramView2;
      Drawable localDrawable = ((ImageView)paramView1).getDrawable();
      if (localDrawable == null) {
        return;
      }
      localDrawable.mutate();
      if (paramBoolean1)
      {
        if (!paramBoolean2) {
          localDrawable.setAlpha(255);
        }
        paramView1 = ObjectAnimator.ofInt(localDrawable, ka.a, new int[] { 0 });
      }
      else
      {
        paramView1 = ObjectAnimator.ofInt(localDrawable, ka.a, new int[] { 255 });
      }
      paramView1.addUpdateListener(new d(this, paramView2));
      parama.a.a("iconFade").a(paramView1);
      paramList.add(paramView1);
      paramList1.add(new e(this, localya, localDrawable));
    }
  }
  
  protected abstract a a(Context paramContext, boolean paramBoolean);
  
  public void a(CoordinatorLayout.e parame)
  {
    if (parame.h == 0) {
      parame.h = 80;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    if (paramView1.getVisibility() != 8)
    {
      boolean bool1 = paramView2 instanceof FloatingActionButton;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        int i = ((FloatingActionButton)paramView2).getExpandedComponentIdHint();
        if (i != 0)
        {
          bool3 = bool2;
          if (i != paramView1.getId()) {}
        }
        else
        {
          bool3 = true;
        }
      }
      return bool3;
    }
    throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
  }
  
  protected AnimatorSet b(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = a(paramView2.getContext(), paramBoolean1);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if (Build.VERSION.SDK_INT >= 21) {
      c(paramView1, paramView2, paramBoolean1, paramBoolean2, (a)localObject, localArrayList1, localArrayList2);
    }
    RectF localRectF = this.d;
    a(paramView1, paramView2, paramBoolean1, paramBoolean2, (a)localObject, localArrayList1, localArrayList2, localRectF);
    float f1 = localRectF.width();
    float f2 = localRectF.height();
    d(paramView1, paramView2, paramBoolean1, paramBoolean2, (a)localObject, localArrayList1, localArrayList2);
    a(paramView1, paramView2, paramBoolean1, paramBoolean2, (a)localObject, f1, f2, localArrayList1, localArrayList2);
    b(paramView1, paramView2, paramBoolean1, paramBoolean2, (a)localObject, localArrayList1, localArrayList2);
    a(paramView1, paramView2, paramBoolean1, paramBoolean2, (a)localObject, localArrayList1, localArrayList2);
    localObject = new AnimatorSet();
    ha.a((AnimatorSet)localObject, localArrayList1);
    ((AnimatorSet)localObject).addListener(new c(this, paramBoolean1, paramView2, paramView1));
    int i = 0;
    int j = localArrayList2.size();
    while (i < j)
    {
      ((AnimatorSet)localObject).addListener((Animator.AnimatorListener)localArrayList2.get(i));
      i++;
    }
    return (AnimatorSet)localObject;
  }
  
  protected static class a
  {
    public na a;
    public pa b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/transformation/FabTransformationBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */