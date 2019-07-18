package android.support.design.bottomappbar;

import Ga;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.a;
import android.support.design.widget.CoordinatorLayout.b;
import android.support.design.widget.CoordinatorLayout.e;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.y;
import android.support.v7.app.a.a;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import ga;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar
  extends Toolbar
  implements CoordinatorLayout.a
{
  private final int P;
  private final Ga Q;
  private final e R;
  private Animator S;
  private Animator T;
  private Animator U;
  private int V;
  private boolean W;
  private boolean aa;
  AnimatorListenerAdapter ba;
  
  private float a(boolean paramBoolean)
  {
    FloatingActionButton localFloatingActionButton = t();
    if (localFloatingActionButton == null) {
      return 0.0F;
    }
    Rect localRect = new Rect();
    localFloatingActionButton.a(localRect);
    float f1 = localRect.height();
    float f2 = f1;
    if (f1 == 0.0F) {
      f2 = localFloatingActionButton.getMeasuredHeight();
    }
    float f3 = localFloatingActionButton.getHeight() - localRect.bottom;
    float f4 = localFloatingActionButton.getHeight() - localRect.height();
    f1 = -getCradleVerticalOffset();
    float f5 = f2 / 2.0F;
    f2 = f4 - localFloatingActionButton.getPaddingBottom();
    f4 = -getMeasuredHeight();
    if (paramBoolean) {
      f2 = f1 + f5 + f3;
    }
    return f4 + f2;
  }
  
  private void a(int paramInt, List<Animator> paramList)
  {
    if (!this.aa) {
      return;
    }
    paramList = new float[2];
    this.R.e();
    throw null;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (!y.B(this)) {
      return;
    }
    Object localObject = this.U;
    if (localObject != null) {
      ((Animator)localObject).cancel();
    }
    localObject = new ArrayList();
    if (!v())
    {
      paramInt = 0;
      paramBoolean = false;
    }
    a(paramInt, paramBoolean, (List)localObject);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether((Collection)localObject);
    this.U = localAnimatorSet;
    this.U.addListener(new b(this));
    this.U.start();
  }
  
  private void a(int paramInt, boolean paramBoolean, List<Animator> paramList)
  {
    Object localObject = getActionMenuView();
    if (localObject == null) {
      return;
    }
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localObject, "alpha", new float[] { 1.0F });
    if (((!this.aa) && ((!paramBoolean) || (!v()))) || ((this.V != 1) && (paramInt != 1)))
    {
      if (((ViewGroup)localObject).getAlpha() < 1.0F) {
        paramList.add(localObjectAnimator1);
      }
    }
    else
    {
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(localObject, "alpha", new float[] { 0.0F });
      localObjectAnimator2.addListener(new c(this, (ActionMenuView)localObject, paramInt, paramBoolean));
      localObject = new AnimatorSet();
      ((AnimatorSet)localObject).setDuration(150L);
      ((AnimatorSet)localObject).playSequentially(new Animator[] { localObjectAnimator2, localObjectAnimator1 });
      paramList.add(localObject);
    }
  }
  
  private void a(FloatingActionButton paramFloatingActionButton)
  {
    b(paramFloatingActionButton);
    paramFloatingActionButton.a(this.ba);
    paramFloatingActionButton.b(this.ba);
  }
  
  private void a(ActionMenuView paramActionMenuView, int paramInt, boolean paramBoolean)
  {
    int i;
    if (y.l(this) == 1) {
      i = 1;
    } else {
      i = 0;
    }
    int j = 0;
    int n;
    for (int k = 0; j < getChildCount(); k = n)
    {
      View localView = getChildAt(j);
      int m;
      if (((localView.getLayoutParams() instanceof Toolbar.b)) && ((((Toolbar.b)localView.getLayoutParams()).a & 0x800007) == 8388611)) {
        m = 1;
      } else {
        m = 0;
      }
      n = k;
      if (m != 0)
      {
        if (i != 0) {
          n = localView.getLeft();
        } else {
          n = localView.getRight();
        }
        n = Math.max(k, n);
      }
      j++;
    }
    if (i != 0) {
      i = paramActionMenuView.getRight();
    } else {
      i = paramActionMenuView.getLeft();
    }
    float f;
    if ((paramInt == 1) && (paramBoolean)) {
      f = k - i;
    } else {
      f = 0.0F;
    }
    paramActionMenuView.setTranslationX(f);
  }
  
  private void b(int paramInt, List<Animator> paramList)
  {
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(t(), "translationX", new float[] { c(paramInt) });
    localObjectAnimator.setDuration(300L);
    paramList.add(localObjectAnimator);
  }
  
  private void b(FloatingActionButton paramFloatingActionButton)
  {
    paramFloatingActionButton.c(this.ba);
    paramFloatingActionButton.d(this.ba);
  }
  
  private int c(int paramInt)
  {
    int i = y.l(this);
    int j = 0;
    int k = 1;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if (paramInt == 1)
    {
      j = getMeasuredWidth() / 2;
      int m = this.P;
      paramInt = k;
      if (i != 0) {
        paramInt = -1;
      }
      j = (j - m) * paramInt;
    }
    return j;
  }
  
  private void d(int paramInt)
  {
    if ((this.V != paramInt) && (y.B(this)))
    {
      Object localObject = this.T;
      if (localObject != null) {
        ((Animator)localObject).cancel();
      }
      localObject = new ArrayList();
      a(paramInt, (List)localObject);
      b(paramInt, (List)localObject);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether((Collection)localObject);
      this.T = localAnimatorSet;
      this.T.addListener(new a(this));
      this.T.start();
    }
  }
  
  private ActionMenuView getActionMenuView()
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if ((localView instanceof ActionMenuView)) {
        return (ActionMenuView)localView;
      }
    }
    return null;
  }
  
  private float getFabTranslationX()
  {
    return c(this.V);
  }
  
  private float getFabTranslationY()
  {
    return a(this.aa);
  }
  
  private void s()
  {
    Animator localAnimator = this.S;
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    localAnimator = this.U;
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    localAnimator = this.T;
    if (localAnimator != null) {
      localAnimator.cancel();
    }
  }
  
  private FloatingActionButton t()
  {
    if (!(getParent() instanceof CoordinatorLayout)) {
      return null;
    }
    Iterator localIterator = ((CoordinatorLayout)getParent()).c(this).iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      if ((localView instanceof FloatingActionButton)) {
        return (FloatingActionButton)localView;
      }
    }
    return null;
  }
  
  private boolean u()
  {
    Animator localAnimator = this.S;
    if ((localAnimator == null) || (!localAnimator.isRunning()))
    {
      localAnimator = this.U;
      if ((localAnimator == null) || (!localAnimator.isRunning()))
      {
        localAnimator = this.T;
        if ((localAnimator == null) || (!localAnimator.isRunning())) {
          break label53;
        }
      }
    }
    boolean bool = true;
    return bool;
    label53:
    bool = false;
    return bool;
  }
  
  private boolean v()
  {
    FloatingActionButton localFloatingActionButton = t();
    boolean bool;
    if ((localFloatingActionButton != null) && (localFloatingActionButton.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void w()
  {
    this.R.d(getFabTranslationX());
    throw null;
  }
  
  public ColorStateList getBackgroundTint()
  {
    this.Q.a();
    throw null;
  }
  
  public CoordinatorLayout.b<BottomAppBar> getBehavior()
  {
    return new Behavior();
  }
  
  public float getCradleVerticalOffset()
  {
    this.R.a();
    throw null;
  }
  
  public int getFabAlignmentMode()
  {
    return this.V;
  }
  
  public float getFabCradleMargin()
  {
    this.R.b();
    throw null;
  }
  
  public float getFabCradleRoundedCornerRadius()
  {
    this.R.c();
    throw null;
  }
  
  public boolean getHideOnScroll()
  {
    return this.W;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    s();
    w();
    throw null;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof a))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (a)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.l());
    this.V = paramParcelable.c;
    this.aa = paramParcelable.d;
  }
  
  protected Parcelable onSaveInstanceState()
  {
    a locala = new a(super.onSaveInstanceState());
    locala.c = this.V;
    locala.d = this.aa;
    return locala;
  }
  
  public void setBackgroundTint(ColorStateList paramColorStateList)
  {
    android.support.v4.graphics.drawable.a.a(this.Q, paramColorStateList);
  }
  
  public void setCradleVerticalOffset(float paramFloat)
  {
    if (paramFloat == getCradleVerticalOffset()) {
      return;
    }
    this.R.a(paramFloat);
    throw null;
  }
  
  public void setFabAlignmentMode(int paramInt)
  {
    d(paramInt);
    a(paramInt, this.aa);
    this.V = paramInt;
  }
  
  public void setFabCradleMargin(float paramFloat)
  {
    if (paramFloat == getFabCradleMargin()) {
      return;
    }
    this.R.b(paramFloat);
    throw null;
  }
  
  public void setFabCradleRoundedCornerRadius(float paramFloat)
  {
    if (paramFloat == getFabCradleRoundedCornerRadius()) {
      return;
    }
    this.R.c(paramFloat);
    throw null;
  }
  
  void setFabDiameter(int paramInt)
  {
    this.R.d();
    throw null;
  }
  
  public void setHideOnScroll(boolean paramBoolean)
  {
    this.W = paramBoolean;
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {}
  
  public void setTitle(CharSequence paramCharSequence) {}
  
  public static class Behavior
    extends HideBottomViewOnScrollBehavior<BottomAppBar>
  {
    private final Rect d = new Rect();
    
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    private boolean a(FloatingActionButton paramFloatingActionButton, BottomAppBar paramBottomAppBar)
    {
      ((CoordinatorLayout.e)paramFloatingActionButton.getLayoutParams()).d = 17;
      BottomAppBar.a(paramBottomAppBar, paramFloatingActionButton);
      return true;
    }
    
    protected void a(BottomAppBar paramBottomAppBar)
    {
      super.a(paramBottomAppBar);
      paramBottomAppBar = BottomAppBar.a(paramBottomAppBar);
      if (paramBottomAppBar != null)
      {
        paramBottomAppBar.a(this.d);
        float f = paramBottomAppBar.getMeasuredHeight() - this.d.height();
        paramBottomAppBar.clearAnimation();
        paramBottomAppBar.animate().translationY(-paramBottomAppBar.getPaddingBottom() + f).setInterpolator(ga.c).setDuration(175L);
      }
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, BottomAppBar paramBottomAppBar, int paramInt)
    {
      FloatingActionButton localFloatingActionButton = BottomAppBar.a(paramBottomAppBar);
      if (localFloatingActionButton != null)
      {
        a(localFloatingActionButton, paramBottomAppBar);
        localFloatingActionButton.b(this.d);
        paramBottomAppBar.setFabDiameter(this.d.height());
      }
      if (BottomAppBar.b(paramBottomAppBar))
      {
        paramCoordinatorLayout.c(paramBottomAppBar, paramInt);
        return super.a(paramCoordinatorLayout, paramBottomAppBar, paramInt);
      }
      BottomAppBar.c(paramBottomAppBar);
      throw null;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, BottomAppBar paramBottomAppBar, View paramView1, View paramView2, int paramInt1, int paramInt2)
    {
      boolean bool;
      if ((paramBottomAppBar.getHideOnScroll()) && (super.b(paramCoordinatorLayout, paramBottomAppBar, paramView1, paramView2, paramInt1, paramInt2))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    protected void b(BottomAppBar paramBottomAppBar)
    {
      super.b(paramBottomAppBar);
      FloatingActionButton localFloatingActionButton = BottomAppBar.a(paramBottomAppBar);
      if (localFloatingActionButton != null)
      {
        localFloatingActionButton.clearAnimation();
        localFloatingActionButton.animate().translationY(BottomAppBar.d(paramBottomAppBar)).setInterpolator(ga.d).setDuration(225L);
      }
    }
  }
  
  static class a
    extends android.support.v4.view.c
  {
    public static final Parcelable.Creator<a> CREATOR = new d();
    int c;
    boolean d;
    
    public a(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.c = paramParcel.readInt();
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.d = bool;
    }
    
    public a(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.c);
      paramParcel.writeInt(this.d);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/bottomappbar/BottomAppBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */