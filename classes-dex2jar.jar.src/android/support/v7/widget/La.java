package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.z;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ListView;

public abstract class la
  implements View.OnTouchListener, View.OnAttachStateChangeListener
{
  private final float a;
  private final int b;
  private final int c;
  final View d;
  private Runnable e;
  private Runnable f;
  private boolean g;
  private int h;
  private final int[] i = new int[2];
  
  public la(View paramView)
  {
    this.d = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    this.a = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.b = ViewConfiguration.getTapTimeout();
    this.c = ((this.b + ViewConfiguration.getLongPressTimeout()) / 2);
  }
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    View localView = this.d;
    Object localObject = h();
    if ((localObject != null) && (((z)localObject).L()))
    {
      ga localga = (ga)((z)localObject).M();
      if ((localga != null) && (localga.isShown()))
      {
        localObject = MotionEvent.obtainNoHistory(paramMotionEvent);
        a(localView, (MotionEvent)localObject);
        b(localga, (MotionEvent)localObject);
        boolean bool1 = localga.a((MotionEvent)localObject, this.h);
        ((MotionEvent)localObject).recycle();
        int j = paramMotionEvent.getActionMasked();
        boolean bool2 = true;
        if ((j != 1) && (j != 3)) {
          j = 1;
        } else {
          j = 0;
        }
        if ((!bool1) || (j == 0)) {
          bool2 = false;
        }
        return bool2;
      }
    }
    return false;
  }
  
  private static boolean a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = -paramFloat3;
    boolean bool;
    if ((paramFloat1 >= f1) && (paramFloat2 >= f1) && (paramFloat1 < paramView.getRight() - paramView.getLeft() + paramFloat3) && (paramFloat2 < paramView.getBottom() - paramView.getTop() + paramFloat3)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean a(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = this.i;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
    return true;
  }
  
  private boolean b(MotionEvent paramMotionEvent)
  {
    View localView = this.d;
    if (!localView.isEnabled()) {
      return false;
    }
    int j = paramMotionEvent.getActionMasked();
    if (j != 0)
    {
      if (j != 1) {
        if (j != 2)
        {
          if (j != 3) {
            break label173;
          }
        }
        else
        {
          j = paramMotionEvent.findPointerIndex(this.h);
          if ((j < 0) || (a(localView, paramMotionEvent.getX(j), paramMotionEvent.getY(j), this.a))) {
            break label173;
          }
          l();
          localView.getParent().requestDisallowInterceptTouchEvent(true);
          return true;
        }
      }
      l();
    }
    else
    {
      this.h = paramMotionEvent.getPointerId(0);
      if (this.e == null) {
        this.e = new a();
      }
      localView.postDelayed(this.e, this.b);
      if (this.f == null) {
        this.f = new b();
      }
      localView.postDelayed(this.f, this.c);
    }
    label173:
    return false;
  }
  
  private boolean b(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = this.i;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(-arrayOfInt[0], -arrayOfInt[1]);
    return true;
  }
  
  private void l()
  {
    Runnable localRunnable = this.f;
    if (localRunnable != null) {
      this.d.removeCallbacks(localRunnable);
    }
    localRunnable = this.e;
    if (localRunnable != null) {
      this.d.removeCallbacks(localRunnable);
    }
  }
  
  public abstract z h();
  
  protected boolean i()
  {
    z localz = h();
    if ((localz != null) && (!localz.L())) {
      localz.K();
    }
    return true;
  }
  
  protected boolean j()
  {
    z localz = h();
    if ((localz != null) && (localz.L())) {
      localz.dismiss();
    }
    return true;
  }
  
  void k()
  {
    l();
    View localView = this.d;
    if ((localView.isEnabled()) && (!localView.isLongClickable()))
    {
      if (!i()) {
        return;
      }
      localView.getParent().requestDisallowInterceptTouchEvent(true);
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      localView.onTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
      this.g = true;
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.g;
    boolean bool2 = true;
    boolean bool3;
    if (bool1)
    {
      if ((!a(paramMotionEvent)) && (j())) {
        bool3 = false;
      } else {
        bool3 = true;
      }
    }
    else
    {
      if ((b(paramMotionEvent)) && (i())) {
        bool4 = true;
      } else {
        bool4 = false;
      }
      bool3 = bool4;
      if (bool4)
      {
        long l = SystemClock.uptimeMillis();
        paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        this.d.onTouchEvent(paramView);
        paramView.recycle();
        bool3 = bool4;
      }
    }
    this.g = bool3;
    boolean bool4 = bool2;
    if (!bool3) {
      if (bool1) {
        bool4 = bool2;
      } else {
        bool4 = false;
      }
    }
    return bool4;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    this.g = false;
    this.h = -1;
    paramView = this.e;
    if (paramView != null) {
      this.d.removeCallbacks(paramView);
    }
  }
  
  private class a
    implements Runnable
  {
    a() {}
    
    public void run()
    {
      ViewParent localViewParent = la.this.d.getParent();
      if (localViewParent != null) {
        localViewParent.requestDisallowInterceptTouchEvent(true);
      }
    }
  }
  
  private class b
    implements Runnable
  {
    b() {}
    
    public void run()
    {
      la.this.k();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */