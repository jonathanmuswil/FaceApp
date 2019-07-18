package android.support.design.widget;

import Aa;
import Ca;
import Ja;
import Y;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.c;
import android.support.v4.view.w;
import android.support.v7.widget.p;
import android.support.v7.widget.t;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import fa;
import java.util.List;
import na;
import ud;

@CoordinatorLayout.c(Behavior.class)
public class FloatingActionButton
  extends ga
  implements w, android.support.v4.widget.E, Aa
{
  private ColorStateList b;
  private PorterDuff.Mode c;
  private ColorStateList d;
  private PorterDuff.Mode e;
  private ColorStateList f;
  private int g;
  private int h;
  private int i;
  private int j;
  boolean k;
  final Rect l;
  private final Rect m;
  private final t n;
  private final Ca o;
  private E p;
  
  private int a(int paramInt)
  {
    int i1 = this.h;
    if (i1 != 0) {
      return i1;
    }
    Resources localResources = getResources();
    if (paramInt != -1)
    {
      if (paramInt != 1) {
        return localResources.getDimensionPixelSize(Y.design_fab_size_normal);
      }
      return localResources.getDimensionPixelSize(Y.design_fab_size_mini);
    }
    if (Math.max(localResources.getConfiguration().screenWidthDp, localResources.getConfiguration().screenHeightDp) < 470) {
      paramInt = a(1);
    } else {
      paramInt = a(0);
    }
    return paramInt;
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i1 != Integer.MIN_VALUE)
    {
      if (i1 != 0) {
        if (i1 == 1073741824) {
          paramInt1 = paramInt2;
        } else {
          throw new IllegalArgumentException();
        }
      }
    }
    else {
      paramInt1 = Math.min(paramInt1, paramInt2);
    }
    return paramInt1;
  }
  
  private E.d a(a parama)
  {
    if (parama == null) {
      return null;
    }
    return new A(this, parama);
  }
  
  private E c()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return new F(this, new b());
    }
    return new E(this, new b());
  }
  
  private void c(Rect paramRect)
  {
    int i1 = paramRect.left;
    Rect localRect = this.l;
    paramRect.left = (i1 + localRect.left);
    paramRect.top += localRect.top;
    paramRect.right -= localRect.right;
    paramRect.bottom -= localRect.bottom;
  }
  
  private void d()
  {
    Drawable localDrawable = getDrawable();
    if (localDrawable == null) {
      return;
    }
    Object localObject = this.d;
    if (localObject == null)
    {
      a.b(localDrawable);
      return;
    }
    int i1 = ((ColorStateList)localObject).getColorForState(getDrawableState(), 0);
    PorterDuff.Mode localMode = this.e;
    localObject = localMode;
    if (localMode == null) {
      localObject = PorterDuff.Mode.SRC_IN;
    }
    localDrawable.mutate().setColorFilter(p.a(i1, (PorterDuff.Mode)localObject));
  }
  
  private E getImpl()
  {
    if (this.p == null) {
      this.p = c();
    }
    return this.p;
  }
  
  public void a(Animator.AnimatorListener paramAnimatorListener)
  {
    getImpl().a(paramAnimatorListener);
  }
  
  void a(a parama, boolean paramBoolean)
  {
    getImpl().a(a(parama), paramBoolean);
  }
  
  public boolean a()
  {
    this.o.b();
    throw null;
  }
  
  @Deprecated
  public boolean a(Rect paramRect)
  {
    if (android.support.v4.view.y.B(this))
    {
      paramRect.set(0, 0, getWidth(), getHeight());
      c(paramRect);
      return true;
    }
    return false;
  }
  
  public void b(Animator.AnimatorListener paramAnimatorListener)
  {
    getImpl().b(paramAnimatorListener);
  }
  
  public void b(Rect paramRect)
  {
    paramRect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
    c(paramRect);
  }
  
  void b(a parama, boolean paramBoolean)
  {
    getImpl().b(a(parama), paramBoolean);
  }
  
  public boolean b()
  {
    return getImpl().h();
  }
  
  public void c(Animator.AnimatorListener paramAnimatorListener)
  {
    getImpl().c(paramAnimatorListener);
  }
  
  public void d(Animator.AnimatorListener paramAnimatorListener)
  {
    getImpl().d(paramAnimatorListener);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    getImpl().a(getDrawableState());
  }
  
  public ColorStateList getBackgroundTintList()
  {
    return this.b;
  }
  
  public PorterDuff.Mode getBackgroundTintMode()
  {
    return this.c;
  }
  
  public float getCompatElevation()
  {
    return getImpl().b();
  }
  
  public float getCompatHoveredFocusedTranslationZ()
  {
    return getImpl().d();
  }
  
  public float getCompatPressedTranslationZ()
  {
    return getImpl().e();
  }
  
  public Drawable getContentBackground()
  {
    return getImpl().a();
  }
  
  public int getCustomSize()
  {
    return this.h;
  }
  
  public int getExpandedComponentIdHint()
  {
    this.o.a();
    throw null;
  }
  
  public na getHideMotionSpec()
  {
    return getImpl().c();
  }
  
  @Deprecated
  public int getRippleColor()
  {
    ColorStateList localColorStateList = this.f;
    int i1;
    if (localColorStateList != null) {
      i1 = localColorStateList.getDefaultColor();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public ColorStateList getRippleColorStateList()
  {
    return this.f;
  }
  
  public na getShowMotionSpec()
  {
    return getImpl().f();
  }
  
  public int getSize()
  {
    return this.g;
  }
  
  int getSizeDimension()
  {
    return a(this.g);
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    return getBackgroundTintList();
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    return getBackgroundTintMode();
  }
  
  public ColorStateList getSupportImageTintList()
  {
    return this.d;
  }
  
  public PorterDuff.Mode getSupportImageTintMode()
  {
    return this.e;
  }
  
  public boolean getUseCompatPadding()
  {
    return this.k;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    getImpl().i();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getImpl().j();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    getImpl().l();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getSizeDimension();
    this.i = ((i1 - this.j) / 2);
    getImpl().p();
    paramInt1 = Math.min(a(i1, paramInt1), a(i1, paramInt2));
    Rect localRect = this.l;
    setMeasuredDimension(localRect.left + paramInt1 + localRect.right, paramInt1 + localRect.top + localRect.bottom);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof Ja))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (Ja)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.l());
    this.o.a((Bundle)paramParcelable.c.get("expandableWidgetHelper"));
    throw null;
  }
  
  protected Parcelable onSaveInstanceState()
  {
    ud localud = new Ja(super.onSaveInstanceState()).c;
    this.o.c();
    throw null;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) && (a(this.m)) && (!this.m.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))) {
      return false;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundResource(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.b != paramColorStateList)
    {
      this.b = paramColorStateList;
      getImpl().a(paramColorStateList);
    }
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.c != paramMode)
    {
      this.c = paramMode;
      getImpl().a(paramMode);
    }
  }
  
  public void setCompatElevation(float paramFloat)
  {
    getImpl().a(paramFloat);
  }
  
  public void setCompatElevationResource(int paramInt)
  {
    setCompatElevation(getResources().getDimension(paramInt));
  }
  
  public void setCompatHoveredFocusedTranslationZ(float paramFloat)
  {
    getImpl().b(paramFloat);
  }
  
  public void setCompatHoveredFocusedTranslationZResource(int paramInt)
  {
    setCompatHoveredFocusedTranslationZ(getResources().getDimension(paramInt));
  }
  
  public void setCompatPressedTranslationZ(float paramFloat)
  {
    getImpl().d(paramFloat);
  }
  
  public void setCompatPressedTranslationZResource(int paramInt)
  {
    setCompatPressedTranslationZ(getResources().getDimension(paramInt));
  }
  
  public void setCustomSize(int paramInt)
  {
    if (paramInt >= 0)
    {
      this.h = paramInt;
      return;
    }
    throw new IllegalArgumentException("Custom size must be non-negative");
  }
  
  public void setExpandedComponentIdHint(int paramInt)
  {
    this.o.a(paramInt);
    throw null;
  }
  
  public void setHideMotionSpec(na paramna)
  {
    getImpl().a(paramna);
  }
  
  public void setHideMotionSpecResource(int paramInt)
  {
    setHideMotionSpec(na.a(getContext(), paramInt));
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    getImpl().o();
  }
  
  public void setImageResource(int paramInt)
  {
    this.n.a(paramInt);
  }
  
  public void setRippleColor(int paramInt)
  {
    setRippleColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setRippleColor(ColorStateList paramColorStateList)
  {
    if (this.f != paramColorStateList)
    {
      this.f = paramColorStateList;
      getImpl().b(this.f);
    }
  }
  
  public void setShowMotionSpec(na paramna)
  {
    getImpl().b(paramna);
  }
  
  public void setShowMotionSpecResource(int paramInt)
  {
    setShowMotionSpec(na.a(getContext(), paramInt));
  }
  
  public void setSize(int paramInt)
  {
    this.h = 0;
    if (paramInt != this.g)
    {
      this.g = paramInt;
      requestLayout();
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    setBackgroundTintList(paramColorStateList);
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    setBackgroundTintMode(paramMode);
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    if (this.d != paramColorStateList)
    {
      this.d = paramColorStateList;
      d();
    }
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    if (this.e != paramMode)
    {
      this.e = paramMode;
      d();
    }
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.k != paramBoolean)
    {
      this.k = paramBoolean;
      getImpl().k();
    }
  }
  
  protected static class BaseBehavior<T extends FloatingActionButton>
    extends CoordinatorLayout.b<T>
  {
    private Rect a;
    private FloatingActionButton.a b;
    private boolean c;
    
    public BaseBehavior()
    {
      this.c = true;
    }
    
    public BaseBehavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, fa.FloatingActionButton_Behavior_Layout);
      this.c = paramContext.getBoolean(fa.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
      paramContext.recycle();
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton)
    {
      Rect localRect = paramFloatingActionButton.l;
      if ((localRect != null) && (localRect.centerX() > 0) && (localRect.centerY() > 0))
      {
        CoordinatorLayout.e locale = (CoordinatorLayout.e)paramFloatingActionButton.getLayoutParams();
        int i = paramFloatingActionButton.getRight();
        int j = paramCoordinatorLayout.getWidth();
        int k = locale.rightMargin;
        int m = 0;
        if (i >= j - k) {
          k = localRect.right;
        } else if (paramFloatingActionButton.getLeft() <= locale.leftMargin) {
          k = -localRect.left;
        } else {
          k = 0;
        }
        if (paramFloatingActionButton.getBottom() >= paramCoordinatorLayout.getHeight() - locale.bottomMargin) {
          m = localRect.bottom;
        } else if (paramFloatingActionButton.getTop() <= locale.topMargin) {
          m = -localRect.top;
        }
        if (m != 0) {
          android.support.v4.view.y.b(paramFloatingActionButton, m);
        }
        if (k != 0) {
          android.support.v4.view.y.a(paramFloatingActionButton, k);
        }
      }
    }
    
    private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
    {
      if (!a(paramAppBarLayout, paramFloatingActionButton)) {
        return false;
      }
      if (this.a == null) {
        this.a = new Rect();
      }
      Rect localRect = this.a;
      y.a(paramCoordinatorLayout, paramAppBarLayout, localRect);
      if (localRect.bottom <= paramAppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
        paramFloatingActionButton.a(this.b, false);
      } else {
        paramFloatingActionButton.b(this.b, false);
      }
      return true;
    }
    
    private static boolean a(View paramView)
    {
      paramView = paramView.getLayoutParams();
      if ((paramView instanceof CoordinatorLayout.e)) {
        return ((CoordinatorLayout.e)paramView).d() instanceof BottomSheetBehavior;
      }
      return false;
    }
    
    private boolean a(View paramView, FloatingActionButton paramFloatingActionButton)
    {
      CoordinatorLayout.e locale = (CoordinatorLayout.e)paramFloatingActionButton.getLayoutParams();
      if (!this.c) {
        return false;
      }
      if (locale.c() != paramView.getId()) {
        return false;
      }
      return paramFloatingActionButton.getUserSetVisibility() == 0;
    }
    
    private boolean b(View paramView, FloatingActionButton paramFloatingActionButton)
    {
      if (!a(paramView, paramFloatingActionButton)) {
        return false;
      }
      CoordinatorLayout.e locale = (CoordinatorLayout.e)paramFloatingActionButton.getLayoutParams();
      if (paramView.getTop() < paramFloatingActionButton.getHeight() / 2 + locale.topMargin) {
        paramFloatingActionButton.a(this.b, false);
      } else {
        paramFloatingActionButton.b(this.b, false);
      }
      return true;
    }
    
    public void a(CoordinatorLayout.e parame)
    {
      if (parame.h == 0) {
        parame.h = 80;
      }
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, int paramInt)
    {
      List localList = paramCoordinatorLayout.b(paramFloatingActionButton);
      int i = localList.size();
      for (int j = 0; j < i; j++)
      {
        View localView = (View)localList.get(j);
        if ((localView instanceof AppBarLayout) ? !a(paramCoordinatorLayout, (AppBarLayout)localView, paramFloatingActionButton) : (a(localView)) && (b(localView, paramFloatingActionButton))) {
          break;
        }
      }
      paramCoordinatorLayout.c(paramFloatingActionButton, paramInt);
      a(paramCoordinatorLayout, paramFloatingActionButton);
      return true;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, Rect paramRect)
    {
      paramCoordinatorLayout = paramFloatingActionButton.l;
      paramRect.set(paramFloatingActionButton.getLeft() + paramCoordinatorLayout.left, paramFloatingActionButton.getTop() + paramCoordinatorLayout.top, paramFloatingActionButton.getRight() - paramCoordinatorLayout.right, paramFloatingActionButton.getBottom() - paramCoordinatorLayout.bottom);
      return true;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
    {
      if ((paramView instanceof AppBarLayout)) {
        a(paramCoordinatorLayout, (AppBarLayout)paramView, paramFloatingActionButton);
      } else if (a(paramView)) {
        b(paramView, paramFloatingActionButton);
      }
      return false;
    }
  }
  
  public static class Behavior
    extends FloatingActionButton.BaseBehavior<FloatingActionButton>
  {
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
  }
  
  public static abstract class a
  {
    public abstract void a(FloatingActionButton paramFloatingActionButton);
    
    public abstract void b(FloatingActionButton paramFloatingActionButton);
  }
  
  private class b
    implements M
  {
    b() {}
    
    public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      FloatingActionButton.this.l.set(paramInt1, paramInt2, paramInt3, paramInt4);
      FloatingActionButton localFloatingActionButton = FloatingActionButton.this;
      localFloatingActionButton.setPadding(paramInt1 + FloatingActionButton.a(localFloatingActionButton), paramInt2 + FloatingActionButton.a(FloatingActionButton.this), paramInt3 + FloatingActionButton.a(FloatingActionButton.this), paramInt4 + FloatingActionButton.a(FloatingActionButton.this));
    }
    
    public void a(Drawable paramDrawable)
    {
      FloatingActionButton.a(FloatingActionButton.this, paramDrawable);
    }
    
    public boolean a()
    {
      return FloatingActionButton.this.k;
    }
    
    public float b()
    {
      return FloatingActionButton.this.getSizeDimension() / 2.0F;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/FloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */