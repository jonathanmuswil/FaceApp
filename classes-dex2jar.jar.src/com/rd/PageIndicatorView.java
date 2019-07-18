package com.rd;

import AX;
import BX;
import MW;
import PX;
import QX;
import RX;
import ZW;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import ed;
import sX;
import vX.a;
import xX;
import yX;

public class PageIndicatorView
  extends View
  implements ViewPager.f, a.a, ViewPager.e, View.OnTouchListener
{
  private static final Handler a = new Handler(Looper.getMainLooper());
  private a b;
  private DataSetObserver c;
  private ViewPager d;
  private boolean e;
  private Runnable f = new c(this);
  
  public PageIndicatorView(Context paramContext)
  {
    super(paramContext);
    a(null);
  }
  
  public PageIndicatorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public PageIndicatorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  @TargetApi(21)
  public PageIndicatorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramAttributeSet);
  }
  
  private ViewPager a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildCount() <= 0) {
      return null;
    }
    paramViewGroup = paramViewGroup.findViewById(paramInt);
    if ((paramViewGroup != null) && ((paramViewGroup instanceof ViewPager))) {
      return (ViewPager)paramViewGroup;
    }
    return null;
  }
  
  private void a(AttributeSet paramAttributeSet)
  {
    o();
    b(paramAttributeSet);
    if (this.b.c().y()) {
      p();
    }
  }
  
  private void a(ViewParent paramViewParent)
  {
    if ((paramViewParent != null) && ((paramViewParent instanceof ViewGroup)) && (((ViewGroup)paramViewParent).getChildCount() > 0)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return;
    }
    int i = this.b.c().u();
    ViewPager localViewPager = a((ViewGroup)paramViewParent, i);
    if (localViewPager != null) {
      setViewPager(localViewPager);
    } else {
      a(paramViewParent.getParent());
    }
  }
  
  private void b(int paramInt, float paramFloat)
  {
    xX localxX = this.b.c();
    Object localObject = localxX.b();
    boolean bool = localxX.z();
    int i;
    if ((m()) && (bool) && (localObject != ZW.a)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return;
    }
    localObject = PX.a(localxX, paramInt, paramFloat, l());
    a(((Integer)((Pair)localObject).first).intValue(), ((Float)((Pair)localObject).second).floatValue());
  }
  
  private void b(AttributeSet paramAttributeSet)
  {
    this.b = new a(this);
    this.b.b().a(getContext(), paramAttributeSet);
    paramAttributeSet = this.b.c();
    paramAttributeSet.f(getPaddingLeft());
    paramAttributeSet.h(getPaddingTop());
    paramAttributeSet.g(getPaddingRight());
    paramAttributeSet.e(getPaddingBottom());
    this.e = paramAttributeSet.z();
  }
  
  private int c(int paramInt)
  {
    int i = this.b.c().c() - 1;
    int j;
    if (paramInt < 0)
    {
      j = 0;
    }
    else
    {
      j = paramInt;
      if (paramInt > i) {
        j = i;
      }
    }
    return j;
  }
  
  private void d(int paramInt)
  {
    xX localxX = this.b.c();
    boolean bool = m();
    int i = localxX.c();
    if (bool)
    {
      int j = paramInt;
      if (l()) {
        j = i - 1 - paramInt;
      }
      setSelection(j);
    }
  }
  
  private void j()
  {
    animate().cancel();
    animate().alpha(1.0F).setDuration(250L);
  }
  
  private void k()
  {
    animate().cancel();
    animate().alpha(0.0F).setDuration(250L);
  }
  
  private boolean l()
  {
    int i = d.a[this.b.c().n().ordinal()];
    boolean bool = true;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return false;
        }
        if (ed.a(getContext().getResources().getConfiguration().locale) != 1) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    return true;
  }
  
  private boolean m()
  {
    boolean bool;
    if ((getMeasuredHeight() == 0) && (getMeasuredWidth() == 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void n()
  {
    if (this.c == null)
    {
      ViewPager localViewPager = this.d;
      if ((localViewPager != null) && (localViewPager.getAdapter() != null))
      {
        this.c = new b(this);
        try
        {
          this.d.getAdapter().a(this.c);
        }
        catch (IllegalStateException localIllegalStateException)
        {
          localIllegalStateException.printStackTrace();
        }
      }
    }
  }
  
  private void o()
  {
    if (getId() == -1) {
      setId(RX.a());
    }
  }
  
  private void p()
  {
    a.removeCallbacks(this.f);
    a.postDelayed(this.f, this.b.c().e());
  }
  
  private void q()
  {
    a.removeCallbacks(this.f);
    j();
  }
  
  private void r()
  {
    if (this.c != null)
    {
      ViewPager localViewPager = this.d;
      if ((localViewPager != null) && (localViewPager.getAdapter() != null)) {
        try
        {
          this.d.getAdapter().c(this.c);
          this.c = null;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          localIllegalStateException.printStackTrace();
        }
      }
    }
  }
  
  private void s()
  {
    ViewPager localViewPager = this.d;
    if ((localViewPager != null) && (localViewPager.getAdapter() != null))
    {
      int i = this.d.getAdapter().a();
      int j;
      if (l()) {
        j = i - 1 - this.d.getCurrentItem();
      } else {
        j = this.d.getCurrentItem();
      }
      this.b.c().k(j);
      this.b.c().l(j);
      this.b.c().c(j);
      this.b.c().a(i);
      this.b.a().b();
      t();
      requestLayout();
    }
  }
  
  private void t()
  {
    if (!this.b.c().w()) {
      return;
    }
    int i = this.b.c().c();
    int j = getVisibility();
    if ((j != 0) && (i > 1)) {
      setVisibility(0);
    } else if ((j != 4) && (i <= 1)) {
      setVisibility(4);
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0) {
      this.b.c().e(this.e);
    }
  }
  
  public void a(int paramInt, float paramFloat)
  {
    xX localxX = this.b.c();
    if (!localxX.z()) {
      return;
    }
    int i = localxX.c();
    if ((i > 0) && (paramInt >= 0))
    {
      int j = i - 1;
      i = paramInt;
      if (paramInt > j) {
        i = j;
      }
    }
    else
    {
      i = 0;
    }
    float f1;
    if (paramFloat < 0.0F)
    {
      f1 = 0.0F;
    }
    else
    {
      f1 = paramFloat;
      if (paramFloat > 1.0F) {
        f1 = 1.0F;
      }
    }
    if (f1 == 1.0F)
    {
      localxX.c(localxX.q());
      localxX.k(i);
    }
    localxX.l(i);
    this.b.a().a(f1);
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    b(paramInt1, paramFloat);
  }
  
  public void a(ViewPager paramViewPager, s params1, s params2)
  {
    s();
  }
  
  public void b(int paramInt)
  {
    d(paramInt);
  }
  
  public long getAnimationDuration()
  {
    return this.b.c().a();
  }
  
  public int getCount()
  {
    return this.b.c().c();
  }
  
  public int getPadding()
  {
    return this.b.c().h();
  }
  
  public int getRadius()
  {
    return this.b.c().m();
  }
  
  public float getScaleFactor()
  {
    return this.b.c().o();
  }
  
  public int getSelectedColor()
  {
    return this.b.c().p();
  }
  
  public int getSelection()
  {
    return this.b.c().q();
  }
  
  public int getStrokeWidth()
  {
    return this.b.c().s();
  }
  
  public int getUnselectedColor()
  {
    return this.b.c().t();
  }
  
  public void h()
  {
    invalidate();
  }
  
  public void i()
  {
    ViewPager localViewPager = this.d;
    if (localViewPager != null)
    {
      localViewPager.b(this);
      this.d.b(this);
      this.d = null;
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a(getParent());
  }
  
  protected void onDetachedFromWindow()
  {
    r();
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.b.b().a(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Pair localPair = this.b.b().a(paramInt1, paramInt2);
    setMeasuredDimension(((Integer)localPair.first).intValue(), ((Integer)localPair.second).intValue());
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof AX))
    {
      xX localxX = this.b.c();
      paramParcelable = (AX)paramParcelable;
      localxX.k(paramParcelable.m());
      localxX.l(paramParcelable.n());
      localxX.c(paramParcelable.l());
      super.onRestoreInstanceState(paramParcelable.getSuperState());
    }
    else
    {
      super.onRestoreInstanceState(paramParcelable);
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    xX localxX = this.b.c();
    AX localAX = new AX(super.onSaveInstanceState());
    localAX.c(localxX.q());
    localAX.d(localxX.r());
    localAX.b(localxX.f());
    return localAX;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!this.b.c().y()) {
      return false;
    }
    int i = paramMotionEvent.getAction();
    if (i != 0)
    {
      if (i == 1) {
        p();
      }
    }
    else {
      q();
    }
    return false;
  }
  
  @SuppressLint({"ClickableViewAccessibility"})
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.b.b().a(paramMotionEvent);
    return true;
  }
  
  public void setAnimationDuration(long paramLong)
  {
    this.b.c().a(paramLong);
  }
  
  public void setAnimationType(ZW paramZW)
  {
    this.b.a(null);
    if (paramZW != null) {
      this.b.c().a(paramZW);
    } else {
      this.b.c().a(ZW.a);
    }
    invalidate();
  }
  
  public void setAutoVisibility(boolean paramBoolean)
  {
    if (!paramBoolean) {
      setVisibility(0);
    }
    this.b.c().a(paramBoolean);
    t();
  }
  
  public void setClickListener(vX.a parama)
  {
    this.b.b().a(parama);
  }
  
  public void setCount(int paramInt)
  {
    if ((paramInt >= 0) && (this.b.c().c() != paramInt))
    {
      this.b.c().a(paramInt);
      t();
      requestLayout();
    }
  }
  
  public void setDynamicCount(boolean paramBoolean)
  {
    this.b.c().b(paramBoolean);
    if (paramBoolean) {
      n();
    } else {
      r();
    }
  }
  
  public void setFadeOnIdle(boolean paramBoolean)
  {
    this.b.c().c(paramBoolean);
    if (paramBoolean) {
      p();
    } else {
      q();
    }
  }
  
  public void setIdleDuration(long paramLong)
  {
    this.b.c().b(paramLong);
    if (this.b.c().y()) {
      p();
    } else {
      q();
    }
  }
  
  public void setInteractiveAnimation(boolean paramBoolean)
  {
    this.b.c().e(paramBoolean);
    this.e = paramBoolean;
  }
  
  public void setOrientation(yX paramyX)
  {
    if (paramyX != null)
    {
      this.b.c().a(paramyX);
      requestLayout();
    }
  }
  
  public void setPadding(float paramFloat)
  {
    float f1 = paramFloat;
    if (paramFloat < 0.0F) {
      f1 = 0.0F;
    }
    this.b.c().d((int)f1);
    invalidate();
  }
  
  public void setPadding(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = 0;
    }
    paramInt = QX.a(i);
    this.b.c().d(paramInt);
    invalidate();
  }
  
  public void setRadius(float paramFloat)
  {
    float f1 = paramFloat;
    if (paramFloat < 0.0F) {
      f1 = 0.0F;
    }
    this.b.c().i((int)f1);
    invalidate();
  }
  
  public void setRadius(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = 0;
    }
    paramInt = QX.a(i);
    this.b.c().i(paramInt);
    invalidate();
  }
  
  public void setRtlMode(BX paramBX)
  {
    xX localxX = this.b.c();
    if (paramBX == null) {
      localxX.a(BX.b);
    } else {
      localxX.a(paramBX);
    }
    if (this.d == null) {
      return;
    }
    int i = localxX.q();
    if (l())
    {
      i = localxX.c() - 1 - i;
    }
    else
    {
      paramBX = this.d;
      if (paramBX != null) {
        i = paramBX.getCurrentItem();
      }
    }
    localxX.c(i);
    localxX.l(i);
    localxX.k(i);
    invalidate();
  }
  
  public void setScaleFactor(float paramFloat)
  {
    float f1;
    if (paramFloat > 1.0F)
    {
      f1 = 1.0F;
    }
    else
    {
      f1 = paramFloat;
      if (paramFloat < 0.3F) {
        f1 = 0.3F;
      }
    }
    this.b.c().a(f1);
  }
  
  public void setSelected(int paramInt)
  {
    xX localxX = this.b.c();
    ZW localZW = localxX.b();
    localxX.a(ZW.a);
    setSelection(paramInt);
    localxX.a(localZW);
  }
  
  public void setSelectedColor(int paramInt)
  {
    this.b.c().j(paramInt);
    invalidate();
  }
  
  public void setSelection(int paramInt)
  {
    xX localxX = this.b.c();
    paramInt = c(paramInt);
    if ((paramInt != localxX.q()) && (paramInt != localxX.r()))
    {
      localxX.e(false);
      localxX.c(localxX.q());
      localxX.l(paramInt);
      localxX.k(paramInt);
      this.b.a().a();
    }
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    int i = this.b.c().m();
    float f1;
    if (paramFloat < 0.0F)
    {
      f1 = 0.0F;
    }
    else
    {
      float f2 = i;
      f1 = paramFloat;
      if (paramFloat > f2) {
        f1 = f2;
      }
    }
    this.b.c().m((int)f1);
    invalidate();
  }
  
  public void setStrokeWidth(int paramInt)
  {
    int i = QX.a(paramInt);
    int j = this.b.c().m();
    if (i < 0)
    {
      paramInt = 0;
    }
    else
    {
      paramInt = i;
      if (i > j) {
        paramInt = j;
      }
    }
    this.b.c().m(paramInt);
    invalidate();
  }
  
  public void setUnselectedColor(int paramInt)
  {
    this.b.c().n(paramInt);
    invalidate();
  }
  
  @SuppressLint({"ClickableViewAccessibility"})
  public void setViewPager(ViewPager paramViewPager)
  {
    i();
    if (paramViewPager == null) {
      return;
    }
    this.d = paramViewPager;
    this.d.a(this);
    this.d.a(this);
    this.d.setOnTouchListener(this);
    this.b.c().o(this.d.getId());
    setDynamicCount(this.b.c().x());
    s();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/rd/PageIndicatorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */