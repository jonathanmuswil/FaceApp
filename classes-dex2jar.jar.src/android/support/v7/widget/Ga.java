package android.support.v7.widget;

import Gd;
import _d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.J;
import android.support.v4.widget.p;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

class ga
  extends ListView
{
  private final Rect a = new Rect();
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private int f;
  private Field g;
  private a h;
  private boolean i;
  private boolean j;
  private boolean k;
  private J l;
  private p m;
  b n;
  
  ga(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, Gd.dropDownListViewStyle);
    this.j = paramBoolean;
    setCacheColorHint(0);
    try
    {
      this.g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.g.setAccessible(true);
    }
    catch (NoSuchFieldException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private void a()
  {
    this.k = false;
    setPressed(false);
    drawableStateChanged();
    Object localObject = getChildAt(this.f - getFirstVisiblePosition());
    if (localObject != null) {
      ((View)localObject).setPressed(false);
    }
    localObject = this.l;
    if (localObject != null)
    {
      ((J)localObject).a();
      this.l = null;
    }
  }
  
  private void a(int paramInt, View paramView)
  {
    Rect localRect = this.a;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    localRect.left -= this.b;
    localRect.top -= this.c;
    localRect.right += this.d;
    localRect.bottom += this.e;
    try
    {
      boolean bool = this.g.getBoolean(this);
      if (paramView.isEnabled() != bool)
      {
        paramView = this.g;
        if (!bool) {
          bool = true;
        } else {
          bool = false;
        }
        paramView.set(this, Boolean.valueOf(bool));
        if (paramInt != -1) {
          refreshDrawableState();
        }
      }
    }
    catch (IllegalAccessException paramView)
    {
      paramView.printStackTrace();
    }
  }
  
  private void a(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    b(paramInt, paramView);
    paramView = getSelector();
    if ((paramView != null) && (paramInt != -1)) {
      android.support.v4.graphics.drawable.a.a(paramView, paramFloat1, paramFloat2);
    }
  }
  
  private void a(Canvas paramCanvas)
  {
    if (!this.a.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(this.a);
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  private void a(View paramView, int paramInt)
  {
    performItemClick(paramView, paramInt, getItemIdAtPosition(paramInt));
  }
  
  private void a(View paramView, int paramInt, float paramFloat1, float paramFloat2)
  {
    this.k = true;
    if (Build.VERSION.SDK_INT >= 21) {
      drawableHotspotChanged(paramFloat1, paramFloat2);
    }
    if (!isPressed()) {
      setPressed(true);
    }
    layoutChildren();
    int i1 = this.f;
    if (i1 != -1)
    {
      View localView = getChildAt(i1 - getFirstVisiblePosition());
      if ((localView != null) && (localView != paramView) && (localView.isPressed())) {
        localView.setPressed(false);
      }
    }
    this.f = paramInt;
    float f1 = paramView.getLeft();
    float f2 = paramView.getTop();
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.drawableHotspotChanged(paramFloat1 - f1, paramFloat2 - f2);
    }
    if (!paramView.isPressed()) {
      paramView.setPressed(true);
    }
    a(paramInt, paramView, paramFloat1, paramFloat2);
    setSelectorEnabled(false);
    refreshDrawableState();
  }
  
  private void b(int paramInt, View paramView)
  {
    Drawable localDrawable = getSelector();
    boolean bool = true;
    int i1;
    if ((localDrawable != null) && (paramInt != -1)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0) {
      localDrawable.setVisible(false, false);
    }
    a(paramInt, paramView);
    if (i1 != 0)
    {
      paramView = this.a;
      float f1 = paramView.exactCenterX();
      float f2 = paramView.exactCenterY();
      if (getVisibility() != 0) {
        bool = false;
      }
      localDrawable.setVisible(bool, false);
      android.support.v4.graphics.drawable.a.a(localDrawable, f1, f2);
    }
  }
  
  private boolean b()
  {
    return this.k;
  }
  
  private void c()
  {
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (b()) && (isPressed())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  private void setSelectorEnabled(boolean paramBoolean)
  {
    a locala = this.h;
    if (locala != null) {
      locala.a(paramBoolean);
    }
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt3 = getListPaddingTop();
    paramInt2 = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int i1 = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null) {
      return paramInt3 + paramInt2;
    }
    if ((i1 <= 0) || (localObject == null)) {
      i1 = 0;
    }
    int i2 = localListAdapter.getCount();
    paramInt3 += paramInt2;
    localObject = null;
    int i3 = 0;
    int i4 = 0;
    int i5;
    for (paramInt2 = 0; i3 < i2; paramInt2 = i5)
    {
      i5 = localListAdapter.getItemViewType(i3);
      int i6 = i4;
      if (i5 != i4)
      {
        localObject = null;
        i6 = i5;
      }
      View localView = localListAdapter.getView(i3, (View)localObject, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localObject = localLayoutParams;
      if (localLayoutParams == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      i4 = ((ViewGroup.LayoutParams)localObject).height;
      if (i4 > 0) {
        i4 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
      } else {
        i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
      }
      localView.measure(paramInt1, i4);
      localView.forceLayout();
      i4 = paramInt3;
      if (i3 > 0) {
        i4 = paramInt3 + i1;
      }
      paramInt3 = i4 + localView.getMeasuredHeight();
      if (paramInt3 >= paramInt4)
      {
        paramInt1 = paramInt4;
        if (paramInt5 >= 0)
        {
          paramInt1 = paramInt4;
          if (i3 > paramInt5)
          {
            paramInt1 = paramInt4;
            if (paramInt2 > 0)
            {
              paramInt1 = paramInt4;
              if (paramInt3 != paramInt4) {
                paramInt1 = paramInt2;
              }
            }
          }
        }
        return paramInt1;
      }
      i5 = paramInt2;
      if (paramInt5 >= 0)
      {
        i5 = paramInt2;
        if (i3 >= paramInt5) {
          i5 = paramInt3;
        }
      }
      i3++;
      i4 = i6;
      localObject = localView;
    }
    return paramInt3;
  }
  
  public boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 != 1) {
      if (i1 != 2) {
        if (i1 == 3) {}
      }
    }
    boolean bool;
    for (;;)
    {
      paramInt = 0;
      bool = true;
      break;
      label45:
      do
      {
        paramInt = 0;
        bool = false;
        break;
        bool = true;
        break label45;
        bool = false;
        i2 = paramMotionEvent.findPointerIndex(paramInt);
      } while (i2 < 0);
      paramInt = (int)paramMotionEvent.getX(i2);
      int i3 = (int)paramMotionEvent.getY(i2);
      int i2 = pointToPosition(paramInt, i3);
      if (i2 == -1)
      {
        paramInt = 1;
        break;
      }
      View localView = getChildAt(i2 - getFirstVisiblePosition());
      a(localView, i2, paramInt, i3);
      if (i1 == 1) {
        a(localView, i2);
      }
    }
    if ((!bool) || (paramInt != 0)) {
      a();
    }
    if (bool)
    {
      if (this.m == null) {
        this.m = new p(this);
      }
      this.m.a(true);
      this.m.onTouch(this, paramMotionEvent);
    }
    else
    {
      paramMotionEvent = this.m;
      if (paramMotionEvent != null) {
        paramMotionEvent.a(false);
      }
    }
    return bool;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    a(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged()
  {
    if (this.n != null) {
      return;
    }
    super.drawableStateChanged();
    setSelectorEnabled(true);
    c();
  }
  
  public boolean hasFocus()
  {
    boolean bool;
    if ((!this.j) && (!super.hasFocus())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean hasWindowFocus()
  {
    boolean bool;
    if ((!this.j) && (!super.hasWindowFocus())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isFocused()
  {
    boolean bool;
    if ((!this.j) && (!super.isFocused())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isInTouchMode()
  {
    boolean bool;
    if (((this.j) && (this.i)) || (super.isInTouchMode())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected void onDetachedFromWindow()
  {
    this.n = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return super.onHoverEvent(paramMotionEvent);
    }
    int i1 = paramMotionEvent.getActionMasked();
    if ((i1 == 10) && (this.n == null))
    {
      this.n = new b();
      this.n.b();
    }
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if ((i1 != 9) && (i1 != 7))
    {
      setSelection(-1);
    }
    else
    {
      i1 = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if ((i1 != -1) && (i1 != getSelectedItemPosition()))
      {
        paramMotionEvent = getChildAt(i1 - getFirstVisiblePosition());
        if (paramMotionEvent.isEnabled()) {
          setSelectionFromTop(i1, paramMotionEvent.getTop() - getTop());
        }
        c();
      }
    }
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      this.f = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
    b localb = this.n;
    if (localb != null) {
      localb.a();
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  void setListSelectionHidden(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      localObject = new a(paramDrawable);
    } else {
      localObject = null;
    }
    this.h = ((a)localObject);
    super.setSelector(this.h);
    Object localObject = new Rect();
    if (paramDrawable != null) {
      paramDrawable.getPadding((Rect)localObject);
    }
    this.b = ((Rect)localObject).left;
    this.c = ((Rect)localObject).top;
    this.d = ((Rect)localObject).right;
    this.e = ((Rect)localObject).bottom;
  }
  
  private static class a
    extends _d
  {
    private boolean b = true;
    
    a(Drawable paramDrawable)
    {
      super();
    }
    
    void a(boolean paramBoolean)
    {
      this.b = paramBoolean;
    }
    
    public void draw(Canvas paramCanvas)
    {
      if (this.b) {
        super.draw(paramCanvas);
      }
    }
    
    public void setHotspot(float paramFloat1, float paramFloat2)
    {
      if (this.b) {
        super.setHotspot(paramFloat1, paramFloat2);
      }
    }
    
    public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (this.b) {
        super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public boolean setState(int[] paramArrayOfInt)
    {
      if (this.b) {
        return super.setState(paramArrayOfInt);
      }
      return false;
    }
    
    public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (this.b) {
        return super.setVisible(paramBoolean1, paramBoolean2);
      }
      return false;
    }
  }
  
  private class b
    implements Runnable
  {
    b() {}
    
    public void a()
    {
      ga localga = ga.this;
      localga.n = null;
      localga.removeCallbacks(this);
    }
    
    public void b()
    {
      ga.this.post(this);
    }
    
    public void run()
    {
      ga localga = ga.this;
      localga.n = null;
      localga.drawableStateChanged();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */