package android.support.v7.widget;

import Ld;
import Pd;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;

public class ActionBarContainer
  extends FrameLayout
{
  private boolean a;
  private View b;
  private View c;
  private View d;
  Drawable e;
  Drawable f;
  Drawable g;
  boolean h;
  boolean i;
  private int j;
  
  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    y.a(this, new b(this));
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Pd.ActionBar);
    this.e = paramContext.getDrawable(Pd.ActionBar_background);
    this.f = paramContext.getDrawable(Pd.ActionBar_backgroundStacked);
    this.j = paramContext.getDimensionPixelSize(Pd.ActionBar_height, -1);
    if (getId() == Ld.split_action_bar)
    {
      this.h = true;
      this.g = paramContext.getDrawable(Pd.ActionBar_backgroundSplit);
    }
    paramContext.recycle();
    boolean bool1 = this.h;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = bool2;
      if (this.g != null) {}
    }
    else
    {
      do
      {
        bool1 = true;
        break;
        bool1 = bool2;
        if (this.e != null) {
          break;
        }
        bool1 = bool2;
      } while (this.f == null);
    }
    setWillNotDraw(bool1);
  }
  
  private int a(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin;
  }
  
  private boolean b(View paramView)
  {
    boolean bool;
    if ((paramView != null) && (paramView.getVisibility() != 8) && (paramView.getMeasuredHeight() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.e;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      this.e.setState(getDrawableState());
    }
    localDrawable = this.f;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      this.f.setState(getDrawableState());
    }
    localDrawable = this.g;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      this.g.setState(getDrawableState());
    }
  }
  
  public View getTabContainer()
  {
    return this.b;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = this.e;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = this.f;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = this.g;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = findViewById(Ld.action_bar);
    this.d = findViewById(Ld.action_context_bar);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if ((!this.a) && (!super.onInterceptTouchEvent(paramMotionEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject1 = this.b;
    paramInt2 = 1;
    paramInt4 = 0;
    if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    Object localObject2;
    if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8))
    {
      int k = getMeasuredHeight();
      localObject2 = (FrameLayout.LayoutParams)((View)localObject1).getLayoutParams();
      ((View)localObject1).layout(paramInt1, k - ((View)localObject1).getMeasuredHeight() - ((FrameLayout.LayoutParams)localObject2).bottomMargin, paramInt3, k - ((FrameLayout.LayoutParams)localObject2).bottomMargin);
    }
    if (this.h)
    {
      localObject1 = this.g;
      if (localObject1 != null)
      {
        ((Drawable)localObject1).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        paramInt1 = paramInt2;
      }
      else
      {
        paramInt1 = 0;
      }
    }
    else
    {
      paramInt1 = paramInt4;
      if (this.e != null)
      {
        if (this.c.getVisibility() == 0)
        {
          this.e.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
        }
        else
        {
          localObject2 = this.d;
          if ((localObject2 != null) && (((View)localObject2).getVisibility() == 0)) {
            this.e.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
          } else {
            this.e.setBounds(0, 0, 0, 0);
          }
        }
        paramInt1 = 1;
      }
      this.i = paramBoolean;
      if (paramBoolean)
      {
        localObject2 = this.f;
        if (localObject2 != null)
        {
          ((Drawable)localObject2).setBounds(((View)localObject1).getLeft(), ((View)localObject1).getTop(), ((View)localObject1).getRight(), ((View)localObject1).getBottom());
          paramInt1 = paramInt2;
        }
      }
    }
    if (paramInt1 != 0) {
      invalidate();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int k = paramInt2;
    if (this.c == null)
    {
      k = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
      {
        int m = this.j;
        k = paramInt2;
        if (m >= 0) {
          k = View.MeasureSpec.makeMeasureSpec(Math.min(m, View.MeasureSpec.getSize(paramInt2)), Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(paramInt1, k);
    if (this.c == null) {
      return;
    }
    paramInt2 = View.MeasureSpec.getMode(k);
    View localView = this.b;
    if ((localView != null) && (localView.getVisibility() != 8) && (paramInt2 != 1073741824))
    {
      if (!b(this.c)) {
        paramInt1 = a(this.c);
      } else if (!b(this.d)) {
        paramInt1 = a(this.d);
      } else {
        paramInt1 = 0;
      }
      if (paramInt2 == Integer.MIN_VALUE) {
        paramInt2 = View.MeasureSpec.getSize(k);
      } else {
        paramInt2 = Integer.MAX_VALUE;
      }
      setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + a(this.b), paramInt2));
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = this.e;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(this.e);
    }
    this.e = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      paramDrawable = this.c;
      if (paramDrawable != null) {
        this.e.setBounds(paramDrawable.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
      }
    }
    boolean bool1 = this.h;
    boolean bool2 = true;
    if (bool1 ? this.g == null : (this.e != null) || (this.f != null)) {
      bool2 = false;
    }
    setWillNotDraw(bool2);
    invalidate();
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = this.g;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(this.g);
    }
    this.g = paramDrawable;
    boolean bool1 = false;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (this.h)
      {
        paramDrawable = this.g;
        if (paramDrawable != null) {
          paramDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
      }
    }
    boolean bool2;
    if (this.h)
    {
      bool2 = bool1;
      if (this.g != null) {}
    }
    else
    {
      do
      {
        bool2 = true;
        break;
        bool2 = bool1;
        if (this.e != null) {
          break;
        }
        bool2 = bool1;
      } while (this.f == null);
    }
    setWillNotDraw(bool2);
    invalidate();
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = this.f;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(this.f);
    }
    this.f = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (this.i)
      {
        paramDrawable = this.f;
        if (paramDrawable != null) {
          paramDrawable.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
        }
      }
    }
    boolean bool1 = this.h;
    boolean bool2 = true;
    if (bool1 ? this.g == null : (this.e != null) || (this.f != null)) {
      bool2 = false;
    }
    setWillNotDraw(bool2);
    invalidate();
  }
  
  public void setTabContainer(Sa paramSa)
  {
    Object localObject = this.b;
    if (localObject != null) {
      removeView((View)localObject);
    }
    this.b = paramSa;
    if (paramSa != null)
    {
      addView(paramSa);
      localObject = paramSa.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = -1;
      ((ViewGroup.LayoutParams)localObject).height = -2;
      paramSa.setAllowCollapse(false);
    }
  }
  
  public void setTransitioning(boolean paramBoolean)
  {
    this.a = paramBoolean;
    int k;
    if (paramBoolean) {
      k = 393216;
    } else {
      k = 262144;
    }
    setDescendantFocusability(k);
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Drawable localDrawable = this.e;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
    localDrawable = this.f;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
    localDrawable = this.g;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
  {
    if (paramInt != 0) {
      return super.startActionModeForChild(paramView, paramCallback, paramInt);
    }
    return null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if (((paramDrawable == this.e) && (!this.h)) || ((paramDrawable == this.f) && (this.i)) || ((paramDrawable == this.g) && (this.h)) || (super.verifyDrawable(paramDrawable))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */