package android.support.v7.widget;

import Pd;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.y;
import android.support.v4.widget.s;
import android.support.v7.view.menu.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class va
  implements z
{
  private static Method a;
  private static Method b;
  private static Method c;
  final e A = new e();
  private final d B = new d();
  private final c C = new c();
  private final a D = new a();
  private Runnable E;
  final Handler F;
  private final Rect G = new Rect();
  private Rect H;
  private boolean I;
  PopupWindow J;
  private Context d;
  private ListAdapter e;
  ga f;
  private int g = -2;
  private int h = -2;
  private int i;
  private int j;
  private int k = 1002;
  private boolean l;
  private boolean m = true;
  private boolean n;
  private boolean o;
  private int p = 0;
  private boolean q = false;
  private boolean r = false;
  int s = Integer.MAX_VALUE;
  private View t;
  private int u = 0;
  private DataSetObserver v;
  private View w;
  private Drawable x;
  private AdapterView.OnItemClickListener y;
  private AdapterView.OnItemSelectedListener z;
  
  static
  {
    try
    {
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
    }
    try
    {
      Class localClass1 = Integer.TYPE;
      Class localClass2 = Boolean.TYPE;
      b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, localClass1, localClass2 });
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
    }
    try
    {
      c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
    }
    catch (NoSuchMethodException localNoSuchMethodException3)
    {
      Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
    }
  }
  
  public va(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public va(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.d = paramContext;
    this.F = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, Pd.ListPopupWindow, paramInt1, paramInt2);
    this.i = localTypedArray.getDimensionPixelOffset(Pd.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    this.j = localTypedArray.getDimensionPixelOffset(Pd.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (this.j != 0) {
      this.l = true;
    }
    localTypedArray.recycle();
    this.J = new v(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.J.setInputMethodMode(1);
  }
  
  private int a(View paramView, int paramInt, boolean paramBoolean)
  {
    Method localMethod = b;
    if (localMethod != null) {
      try
      {
        int i1 = ((Integer)localMethod.invoke(this.J, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
        return i1;
      }
      catch (Exception localException)
      {
        Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
      }
    }
    return this.J.getMaxAvailableHeight(paramView, paramInt);
  }
  
  private void c(boolean paramBoolean)
  {
    Method localMethod = a;
    if (localMethod != null) {
      try
      {
        localMethod.invoke(this.J, new Object[] { Boolean.valueOf(paramBoolean) });
      }
      catch (Exception localException)
      {
        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
      }
    }
  }
  
  private int i()
  {
    Object localObject1 = this.f;
    boolean bool = true;
    Object localObject2;
    int i1;
    int i2;
    if (localObject1 == null)
    {
      localObject1 = this.d;
      this.E = new ta(this);
      this.f = a((Context)localObject1, this.I ^ true);
      localObject2 = this.x;
      if (localObject2 != null) {
        this.f.setSelector((Drawable)localObject2);
      }
      this.f.setAdapter(this.e);
      this.f.setOnItemClickListener(this.y);
      this.f.setFocusable(true);
      this.f.setFocusableInTouchMode(true);
      this.f.setOnItemSelectedListener(new ua(this));
      this.f.setOnScrollListener(this.C);
      localObject2 = this.z;
      if (localObject2 != null) {
        this.f.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject2);
      }
      localObject2 = this.f;
      View localView = this.t;
      if (localView != null)
      {
        localObject1 = new LinearLayout((Context)localObject1);
        ((LinearLayout)localObject1).setOrientation(1);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        i1 = this.u;
        if (i1 != 0)
        {
          if (i1 != 1)
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Invalid hint position ");
            ((StringBuilder)localObject2).append(this.u);
            Log.e("ListPopupWindow", ((StringBuilder)localObject2).toString());
          }
          else
          {
            ((LinearLayout)localObject1).addView((View)localObject2, localLayoutParams);
            ((LinearLayout)localObject1).addView(localView);
          }
        }
        else
        {
          ((LinearLayout)localObject1).addView(localView);
          ((LinearLayout)localObject1).addView((View)localObject2, localLayoutParams);
        }
        i2 = this.h;
        if (i2 >= 0)
        {
          i1 = Integer.MIN_VALUE;
        }
        else
        {
          i2 = 0;
          i1 = 0;
        }
        localView.measure(View.MeasureSpec.makeMeasureSpec(i2, i1), 0);
        localObject2 = (LinearLayout.LayoutParams)localView.getLayoutParams();
        i1 = localView.getMeasuredHeight() + ((LinearLayout.LayoutParams)localObject2).topMargin + ((LinearLayout.LayoutParams)localObject2).bottomMargin;
      }
      else
      {
        i1 = 0;
        localObject1 = localObject2;
      }
      this.J.setContentView((View)localObject1);
    }
    else
    {
      localObject1 = (ViewGroup)this.J.getContentView();
      localObject1 = this.t;
      if (localObject1 != null)
      {
        localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
        i1 = ((View)localObject1).getMeasuredHeight() + ((LinearLayout.LayoutParams)localObject2).topMargin + ((LinearLayout.LayoutParams)localObject2).bottomMargin;
      }
      else
      {
        i1 = 0;
      }
    }
    localObject1 = this.J.getBackground();
    int i4;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).getPadding(this.G);
      localObject1 = this.G;
      i3 = ((Rect)localObject1).top;
      i2 = ((Rect)localObject1).bottom + i3;
      i4 = i2;
      if (!this.l)
      {
        this.j = (-i3);
        i4 = i2;
      }
    }
    else
    {
      this.G.setEmpty();
      i4 = 0;
    }
    if (this.J.getInputMethodMode() != 2) {
      bool = false;
    }
    int i3 = a(b(), this.j, bool);
    if ((!this.q) && (this.g != -1))
    {
      i2 = this.h;
      if (i2 != -2) {
        if (i2 != -1) {
          i2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
      }
      for (;;)
      {
        break;
        i2 = this.d.getResources().getDisplayMetrics().widthPixels;
        localObject1 = this.G;
        i2 = View.MeasureSpec.makeMeasureSpec(i2 - (((Rect)localObject1).left + ((Rect)localObject1).right), 1073741824);
        continue;
        i2 = this.d.getResources().getDisplayMetrics().widthPixels;
        localObject1 = this.G;
        i2 = View.MeasureSpec.makeMeasureSpec(i2 - (((Rect)localObject1).left + ((Rect)localObject1).right), Integer.MIN_VALUE);
      }
      i3 = this.f.a(i2, 0, -1, i3 - i1, -1);
      i2 = i1;
      if (i3 > 0) {
        i2 = i1 + (i4 + (this.f.getPaddingTop() + this.f.getPaddingBottom()));
      }
      return i3 + i2;
    }
    return i3 + i4;
  }
  
  private void j()
  {
    Object localObject = this.t;
    if (localObject != null)
    {
      localObject = ((View)localObject).getParent();
      if ((localObject instanceof ViewGroup)) {
        ((ViewGroup)localObject).removeView(this.t);
      }
    }
  }
  
  public void K()
  {
    int i1 = i();
    boolean bool1 = g();
    s.a(this.J, this.k);
    boolean bool2 = this.J.isShowing();
    boolean bool3 = true;
    int i2;
    int i3;
    Object localObject;
    if (bool2)
    {
      if (!y.A(b())) {
        return;
      }
      i2 = this.h;
      if (i2 == -1)
      {
        i3 = -1;
      }
      else
      {
        i3 = i2;
        if (i2 == -2) {
          i3 = b().getWidth();
        }
      }
      i2 = this.g;
      if (i2 == -1)
      {
        if (!bool1) {
          i1 = -1;
        }
        if (bool1)
        {
          localObject = this.J;
          if (this.h == -1) {
            i2 = -1;
          } else {
            i2 = 0;
          }
          ((PopupWindow)localObject).setWidth(i2);
          this.J.setHeight(0);
        }
        else
        {
          localObject = this.J;
          if (this.h == -1) {
            i2 = -1;
          } else {
            i2 = 0;
          }
          ((PopupWindow)localObject).setWidth(i2);
          this.J.setHeight(-1);
        }
      }
      else if (i2 != -2)
      {
        i1 = i2;
      }
      localObject = this.J;
      if ((this.r) || (this.q)) {
        bool3 = false;
      }
      ((PopupWindow)localObject).setOutsideTouchable(bool3);
      localObject = this.J;
      View localView = b();
      i2 = this.i;
      int i4 = this.j;
      if (i3 < 0) {
        i3 = -1;
      }
      if (i1 < 0) {
        i1 = -1;
      }
      ((PopupWindow)localObject).update(localView, i2, i4, i3, i1);
    }
    else
    {
      i2 = this.h;
      if (i2 == -1)
      {
        i3 = -1;
      }
      else
      {
        i3 = i2;
        if (i2 == -2) {
          i3 = b().getWidth();
        }
      }
      i2 = this.g;
      if (i2 == -1) {
        i1 = -1;
      } else if (i2 != -2) {
        i1 = i2;
      }
      this.J.setWidth(i3);
      this.J.setHeight(i1);
      c(true);
      localObject = this.J;
      if ((!this.r) && (!this.q)) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      ((PopupWindow)localObject).setOutsideTouchable(bool3);
      this.J.setTouchInterceptor(this.B);
      if (this.o) {
        s.a(this.J, this.n);
      }
      localObject = c;
      if (localObject != null) {
        try
        {
          ((Method)localObject).invoke(this.J, new Object[] { this.H });
        }
        catch (Exception localException)
        {
          Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", localException);
        }
      }
      s.a(this.J, b(), this.i, this.j, this.p);
      this.f.setSelection(-1);
      if ((!this.I) || (this.f.isInTouchMode())) {
        a();
      }
      if (!this.I) {
        this.F.post(this.D);
      }
    }
  }
  
  public boolean L()
  {
    return this.J.isShowing();
  }
  
  public ListView M()
  {
    return this.f;
  }
  
  ga a(Context paramContext, boolean paramBoolean)
  {
    return new ga(paramContext, paramBoolean);
  }
  
  public View.OnTouchListener a(View paramView)
  {
    return new sa(this, paramView);
  }
  
  public void a()
  {
    ga localga = this.f;
    if (localga != null)
    {
      localga.setListSelectionHidden(true);
      localga.requestLayout();
    }
  }
  
  public void a(int paramInt)
  {
    this.J.setAnimationStyle(paramInt);
  }
  
  public void a(Rect paramRect)
  {
    this.H = paramRect;
  }
  
  public void a(Drawable paramDrawable)
  {
    this.J.setBackgroundDrawable(paramDrawable);
  }
  
  public void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.y = paramOnItemClickListener;
  }
  
  public void a(ListAdapter paramListAdapter)
  {
    DataSetObserver localDataSetObserver = this.v;
    if (localDataSetObserver == null)
    {
      this.v = new b();
    }
    else
    {
      ListAdapter localListAdapter = this.e;
      if (localListAdapter != null) {
        localListAdapter.unregisterDataSetObserver(localDataSetObserver);
      }
    }
    this.e = paramListAdapter;
    if (paramListAdapter != null) {
      paramListAdapter.registerDataSetObserver(this.v);
    }
    paramListAdapter = this.f;
    if (paramListAdapter != null) {
      paramListAdapter.setAdapter(this.e);
    }
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.J.setOnDismissListener(paramOnDismissListener);
  }
  
  public void a(boolean paramBoolean)
  {
    this.I = paramBoolean;
    this.J.setFocusable(paramBoolean);
  }
  
  public View b()
  {
    return this.w;
  }
  
  public void b(int paramInt)
  {
    Object localObject = this.J.getBackground();
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(this.G);
      localObject = this.G;
      this.h = (((Rect)localObject).left + ((Rect)localObject).right + paramInt);
    }
    else
    {
      j(paramInt);
    }
  }
  
  public void b(View paramView)
  {
    this.w = paramView;
  }
  
  public void b(boolean paramBoolean)
  {
    this.o = true;
    this.n = paramBoolean;
  }
  
  public Drawable c()
  {
    return this.J.getBackground();
  }
  
  public void c(int paramInt)
  {
    this.p = paramInt;
  }
  
  public int d()
  {
    return this.i;
  }
  
  public void d(int paramInt)
  {
    if ((paramInt < 0) && (-2 != paramInt) && (-1 != paramInt)) {
      throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }
    this.g = paramInt;
  }
  
  public void dismiss()
  {
    this.J.dismiss();
    j();
    this.J.setContentView(null);
    this.f = null;
    this.F.removeCallbacks(this.A);
  }
  
  public int e()
  {
    if (!this.l) {
      return 0;
    }
    return this.j;
  }
  
  public void e(int paramInt)
  {
    this.i = paramInt;
  }
  
  public int f()
  {
    return this.h;
  }
  
  public void f(int paramInt)
  {
    this.J.setInputMethodMode(paramInt);
  }
  
  public void g(int paramInt)
  {
    this.u = paramInt;
  }
  
  public boolean g()
  {
    boolean bool;
    if (this.J.getInputMethodMode() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void h(int paramInt)
  {
    ga localga = this.f;
    if ((L()) && (localga != null))
    {
      localga.setListSelectionHidden(false);
      localga.setSelection(paramInt);
      if (localga.getChoiceMode() != 0) {
        localga.setItemChecked(paramInt, true);
      }
    }
  }
  
  public boolean h()
  {
    return this.I;
  }
  
  public void i(int paramInt)
  {
    this.j = paramInt;
    this.l = true;
  }
  
  public void j(int paramInt)
  {
    this.h = paramInt;
  }
  
  private class a
    implements Runnable
  {
    a() {}
    
    public void run()
    {
      va.this.a();
    }
  }
  
  private class b
    extends DataSetObserver
  {
    b() {}
    
    public void onChanged()
    {
      if (va.this.L()) {
        va.this.K();
      }
    }
    
    public void onInvalidated()
    {
      va.this.dismiss();
    }
  }
  
  private class c
    implements AbsListView.OnScrollListener
  {
    c() {}
    
    public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      if ((paramInt == 1) && (!va.this.g()) && (va.this.J.getContentView() != null))
      {
        paramAbsListView = va.this;
        paramAbsListView.F.removeCallbacks(paramAbsListView.A);
        va.this.A.run();
      }
    }
  }
  
  private class d
    implements View.OnTouchListener
  {
    d() {}
    
    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if (i == 0)
      {
        paramView = va.this.J;
        if ((paramView != null) && (paramView.isShowing()) && (j >= 0) && (j < va.this.J.getWidth()) && (k >= 0) && (k < va.this.J.getHeight()))
        {
          paramView = va.this;
          paramView.F.postDelayed(paramView.A, 250L);
          break label126;
        }
      }
      if (i == 1)
      {
        paramView = va.this;
        paramView.F.removeCallbacks(paramView.A);
      }
      label126:
      return false;
    }
  }
  
  private class e
    implements Runnable
  {
    e() {}
    
    public void run()
    {
      Object localObject = va.this.f;
      if ((localObject != null) && (y.A((View)localObject)) && (va.this.f.getCount() > va.this.f.getChildCount()))
      {
        int i = va.this.f.getChildCount();
        localObject = va.this;
        if (i <= ((va)localObject).s)
        {
          ((va)localObject).J.setInputMethodMode(2);
          va.this.K();
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */