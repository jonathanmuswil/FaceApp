package android.support.design.widget;

import O;
import P;
import Q;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.N;
import android.support.v4.view.f;
import android.support.v4.view.o;
import android.support.v4.view.q;
import android.support.v4.view.r;
import android.support.v4.view.y;
import android.support.v4.widget.I;
import android.support.v4.widget.j;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pd;
import qd;
import sd;

public class CoordinatorLayout
  extends ViewGroup
  implements o
{
  static final String a;
  static final Class<?>[] b = { Context.class, AttributeSet.class };
  static final ThreadLocal<Map<String, Constructor<b>>> c = new ThreadLocal();
  static final Comparator<View> d;
  private static final qd<Rect> e = new sd(12);
  private final List<View> f = new ArrayList();
  private final j<View> g = new j();
  private final List<View> h = new ArrayList();
  private final List<View> i = new ArrayList();
  private final int[] j = new int[2];
  private Paint k;
  private boolean l;
  private boolean m;
  private int[] n;
  private View o;
  private View p;
  private f q;
  private boolean r;
  private N s;
  private boolean t;
  private Drawable u;
  ViewGroup.OnHierarchyChangeListener v;
  private r w;
  private final q x = new q(this);
  
  static
  {
    Object localObject = CoordinatorLayout.class.getPackage();
    if (localObject != null) {
      localObject = ((Package)localObject).getName();
    } else {
      localObject = null;
    }
    a = (String)localObject;
    if (Build.VERSION.SDK_INT >= 21) {
      d = new h();
    } else {
      d = null;
    }
  }
  
  public CoordinatorLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, O.coordinatorLayoutStyle);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int i1 = 0;
    if (paramInt == 0) {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, Q.CoordinatorLayout, 0, P.Widget_Support_CoordinatorLayout);
    } else {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, Q.CoordinatorLayout, paramInt, 0);
    }
    paramInt = paramAttributeSet.getResourceId(Q.CoordinatorLayout_keylines, 0);
    if (paramInt != 0)
    {
      paramContext = paramContext.getResources();
      this.n = paramContext.getIntArray(paramInt);
      float f1 = paramContext.getDisplayMetrics().density;
      int i2 = this.n.length;
      for (paramInt = i1; paramInt < i2; paramInt++)
      {
        paramContext = this.n;
        paramContext[paramInt] = ((int)(paramContext[paramInt] * f1));
      }
    }
    this.u = paramAttributeSet.getDrawable(Q.CoordinatorLayout_statusBarBackground);
    paramAttributeSet.recycle();
    f();
    super.setOnHierarchyChangeListener(new d());
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    return paramInt1;
  }
  
  static b a(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    Object localObject1;
    if (paramString.startsWith("."))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(paramContext.getPackageName());
      ((StringBuilder)localObject1).append(paramString);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    else if (paramString.indexOf('.') >= 0)
    {
      localObject1 = paramString;
    }
    else
    {
      localObject1 = paramString;
      if (!TextUtils.isEmpty(a))
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(a);
        ((StringBuilder)localObject1).append('.');
        ((StringBuilder)localObject1).append(paramString);
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
    try
    {
      Object localObject2 = (Map)c.get();
      paramString = (String)localObject2;
      if (localObject2 == null)
      {
        paramString = new java/util/HashMap;
        paramString.<init>();
        c.set(paramString);
      }
      Constructor localConstructor = (Constructor)paramString.get(localObject1);
      localObject2 = localConstructor;
      if (localConstructor == null)
      {
        localObject2 = paramContext.getClassLoader().loadClass((String)localObject1).getConstructor(b);
        ((Constructor)localObject2).setAccessible(true);
        paramString.put(localObject1, localObject2);
      }
      paramContext = (b)((Constructor)localObject2).newInstance(new Object[] { paramContext, paramAttributeSet });
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramAttributeSet = new StringBuilder();
      paramAttributeSet.append("Could not inflate Behavior subclass ");
      paramAttributeSet.append((String)localObject1);
      throw new RuntimeException(paramAttributeSet.toString(), paramContext);
    }
  }
  
  private static void a(Rect paramRect)
  {
    paramRect.setEmpty();
    e.a(paramRect);
  }
  
  private void a(e parame, Rect paramRect, int paramInt1, int paramInt2)
  {
    int i1 = getWidth();
    int i2 = getHeight();
    i1 = Math.max(getPaddingLeft() + parame.leftMargin, Math.min(paramRect.left, i1 - getPaddingRight() - paramInt1 - parame.rightMargin));
    i2 = Math.max(getPaddingTop() + parame.topMargin, Math.min(paramRect.top, i2 - getPaddingBottom() - paramInt2 - parame.bottomMargin));
    paramRect.set(i1, i2, paramInt1 + i1, paramInt2 + i2);
  }
  
  private void a(View paramView, int paramInt1, Rect paramRect1, Rect paramRect2, e parame, int paramInt2, int paramInt3)
  {
    int i1 = f.a(c(parame.c), paramInt1);
    int i2 = f.a(d(parame.d), paramInt1);
    int i3 = i1 & 0x7;
    int i4 = i1 & 0x70;
    paramInt1 = i2 & 0x7;
    i2 &= 0x70;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 5) {
        paramInt1 = paramRect1.left;
      } else {
        paramInt1 = paramRect1.right;
      }
    }
    else {
      paramInt1 = paramRect1.left + paramRect1.width() / 2;
    }
    if (i2 != 16)
    {
      if (i2 != 80) {
        i2 = paramRect1.top;
      } else {
        i2 = paramRect1.bottom;
      }
    }
    else {
      i2 = paramRect1.top + paramRect1.height() / 2;
    }
    if (i3 != 1)
    {
      i1 = paramInt1;
      if (i3 != 5) {
        i1 = paramInt1 - paramInt2;
      }
    }
    else
    {
      i1 = paramInt1 - paramInt2 / 2;
    }
    if (i4 != 16)
    {
      paramInt1 = i2;
      if (i4 != 80) {
        paramInt1 = i2 - paramInt3;
      }
    }
    else
    {
      paramInt1 = i2 - paramInt3 / 2;
    }
    paramRect2.set(i1, paramInt1, paramInt2 + i1, paramInt3 + paramInt1);
  }
  
  private void a(View paramView, Rect paramRect, int paramInt)
  {
    if (!y.B(paramView)) {
      return;
    }
    if ((paramView.getWidth() > 0) && (paramView.getHeight() > 0))
    {
      e locale = (e)paramView.getLayoutParams();
      b localb = locale.d();
      Rect localRect1 = d();
      Rect localRect2 = d();
      localRect2.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
      if ((localb != null) && (localb.a(this, paramView, localRect1)))
      {
        if (!localRect2.contains(localRect1))
        {
          paramView = new StringBuilder();
          paramView.append("Rect should be within the child's bounds. Rect:");
          paramView.append(localRect1.toShortString());
          paramView.append(" | Bounds:");
          paramView.append(localRect2.toShortString());
          throw new IllegalArgumentException(paramView.toString());
        }
      }
      else {
        localRect1.set(localRect2);
      }
      a(localRect2);
      if (localRect1.isEmpty())
      {
        a(localRect1);
        return;
      }
      int i1 = f.a(locale.h, paramInt);
      if ((i1 & 0x30) == 48)
      {
        paramInt = localRect1.top - locale.topMargin - locale.j;
        i2 = paramRect.top;
        if (paramInt < i2)
        {
          f(paramView, i2 - paramInt);
          paramInt = 1;
          break label251;
        }
      }
      paramInt = 0;
      label251:
      int i2 = paramInt;
      int i4;
      if ((i1 & 0x50) == 80)
      {
        int i3 = getHeight() - localRect1.bottom - locale.bottomMargin + locale.j;
        i4 = paramRect.bottom;
        i2 = paramInt;
        if (i3 < i4)
        {
          f(paramView, i3 - i4);
          i2 = 1;
        }
      }
      if (i2 == 0) {
        f(paramView, 0);
      }
      if ((i1 & 0x3) == 3)
      {
        i2 = localRect1.left - locale.leftMargin - locale.i;
        paramInt = paramRect.left;
        if (i2 < paramInt)
        {
          e(paramView, paramInt - i2);
          paramInt = 1;
          break label382;
        }
      }
      paramInt = 0;
      label382:
      i2 = paramInt;
      if ((i1 & 0x5) == 5)
      {
        i4 = getWidth() - localRect1.right - locale.rightMargin + locale.i;
        i1 = paramRect.right;
        i2 = paramInt;
        if (i4 < i1)
        {
          e(paramView, i4 - i1);
          i2 = 1;
        }
      }
      if (i2 == 0) {
        e(paramView, 0);
      }
      a(localRect1);
    }
  }
  
  private void a(View paramView1, View paramView2, int paramInt)
  {
    Rect localRect1 = d();
    Rect localRect2 = d();
    try
    {
      a(paramView2, localRect1);
      a(paramView1, paramInt, localRect1, localRect2);
      paramView1.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
      return;
    }
    finally
    {
      a(localRect1);
      a(localRect2);
    }
  }
  
  private void a(List<View> paramList)
  {
    paramList.clear();
    boolean bool = isChildrenDrawingOrderEnabled();
    int i1 = getChildCount();
    for (int i2 = i1 - 1; i2 >= 0; i2--)
    {
      int i3;
      if (bool) {
        i3 = getChildDrawingOrder(i1, i2);
      } else {
        i3 = i2;
      }
      paramList.add(getChildAt(i3));
    }
    Comparator localComparator = d;
    if (localComparator != null) {
      Collections.sort(paramList, localComparator);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      b localb = ((e)localView.getLayoutParams()).d();
      if (localb != null)
      {
        long l1 = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        if (paramBoolean) {
          localb.a(this, localView, localMotionEvent);
        } else {
          localb.b(this, localView, localMotionEvent);
        }
        localMotionEvent.recycle();
      }
    }
    for (i2 = 0; i2 < i1; i2++) {
      ((e)getChildAt(i2).getLayoutParams()).h();
    }
    this.o = null;
    this.l = false;
  }
  
  private boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    int i1 = paramMotionEvent.getActionMasked();
    List localList = this.h;
    a(localList);
    int i2 = localList.size();
    Object localObject1 = null;
    int i3 = 0;
    boolean bool1 = false;
    int i4 = 0;
    boolean bool2;
    for (;;)
    {
      bool2 = bool1;
      if (i3 >= i2) {
        break;
      }
      View localView = (View)localList.get(i3);
      Object localObject2 = (e)localView.getLayoutParams();
      b localb = ((e)localObject2).d();
      int i5 = 1;
      if (((bool1) || (i4 != 0)) && (i1 != 0))
      {
        bool2 = bool1;
        i5 = i4;
        localObject2 = localObject1;
        if (localb != null)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            long l1 = SystemClock.uptimeMillis();
            localObject2 = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
          }
          if (paramInt != 0)
          {
            if (paramInt != 1)
            {
              bool2 = bool1;
              i5 = i4;
            }
            else
            {
              localb.b(this, localView, (MotionEvent)localObject2);
              bool2 = bool1;
              i5 = i4;
            }
          }
          else
          {
            localb.a(this, localView, (MotionEvent)localObject2);
            bool2 = bool1;
            i5 = i4;
          }
        }
      }
      else
      {
        bool2 = bool1;
        if (!bool1)
        {
          bool2 = bool1;
          if (localb != null)
          {
            if (paramInt != 0)
            {
              if (paramInt == 1) {
                bool1 = localb.b(this, localView, paramMotionEvent);
              }
            }
            else {
              bool1 = localb.a(this, localView, paramMotionEvent);
            }
            bool2 = bool1;
            if (bool1)
            {
              this.o = localView;
              bool2 = bool1;
            }
          }
        }
        bool1 = ((e)localObject2).b();
        boolean bool3 = ((e)localObject2).b(this, localView);
        if ((bool3) && (!bool1)) {
          i4 = i5;
        } else {
          i4 = 0;
        }
        if ((bool3) && (i4 == 0)) {
          break;
        }
        localObject2 = localObject1;
        i5 = i4;
      }
      i3++;
      bool1 = bool2;
      i4 = i5;
      localObject1 = localObject2;
    }
    localList.clear();
    return bool2;
  }
  
  private int b(int paramInt)
  {
    Object localObject = this.n;
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No keylines defined for ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" - attempted index lookup ");
      ((StringBuilder)localObject).append(paramInt);
      Log.e("CoordinatorLayout", ((StringBuilder)localObject).toString());
      return 0;
    }
    if ((paramInt >= 0) && (paramInt < localObject.length)) {
      return localObject[paramInt];
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Keyline index ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" out of range for ");
    ((StringBuilder)localObject).append(this);
    Log.e("CoordinatorLayout", ((StringBuilder)localObject).toString());
    return 0;
  }
  
  private N b(N paramN)
  {
    if (paramN.f()) {
      return paramN;
    }
    int i1 = 0;
    int i2 = getChildCount();
    N localN;
    for (;;)
    {
      localN = paramN;
      if (i1 >= i2) {
        break;
      }
      View localView = getChildAt(i1);
      localN = paramN;
      if (y.i(localView))
      {
        b localb = ((e)localView.getLayoutParams()).d();
        localN = paramN;
        if (localb != null)
        {
          paramN = localb.a(this, localView, paramN);
          localN = paramN;
          if (paramN.f())
          {
            localN = paramN;
            break;
          }
        }
      }
      i1++;
      paramN = localN;
    }
    return localN;
  }
  
  private void b(View paramView, int paramInt1, int paramInt2)
  {
    e locale = (e)paramView.getLayoutParams();
    int i1 = f.a(e(locale.c), paramInt2);
    int i2 = i1 & 0x7;
    int i3 = i1 & 0x70;
    int i4 = getWidth();
    int i5 = getHeight();
    int i6 = paramView.getMeasuredWidth();
    int i7 = paramView.getMeasuredHeight();
    i1 = paramInt1;
    if (paramInt2 == 1) {
      i1 = i4 - paramInt1;
    }
    paramInt1 = b(i1) - i6;
    paramInt2 = 0;
    if (i2 != 1)
    {
      if (i2 == 5) {
        paramInt1 += i6;
      }
    }
    else {
      paramInt1 += i6 / 2;
    }
    if (i3 != 16)
    {
      if (i3 == 80) {
        paramInt2 = i7 + 0;
      }
    }
    else {
      paramInt2 = 0 + i7 / 2;
    }
    paramInt1 = Math.max(getPaddingLeft() + locale.leftMargin, Math.min(paramInt1, i4 - getPaddingRight() - i6 - locale.rightMargin));
    paramInt2 = Math.max(getPaddingTop() + locale.topMargin, Math.min(paramInt2, i5 - getPaddingBottom() - i7 - locale.bottomMargin));
    paramView.layout(paramInt1, paramInt2, i6 + paramInt1, i7 + paramInt2);
  }
  
  private static int c(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt == 0) {
      i1 = 17;
    }
    return i1;
  }
  
  private static int d(int paramInt)
  {
    int i1 = paramInt;
    if ((paramInt & 0x7) == 0) {
      i1 = paramInt | 0x800003;
    }
    paramInt = i1;
    if ((i1 & 0x70) == 0) {
      paramInt = i1 | 0x30;
    }
    return paramInt;
  }
  
  private static Rect d()
  {
    Rect localRect1 = (Rect)e.a();
    Rect localRect2 = localRect1;
    if (localRect1 == null) {
      localRect2 = new Rect();
    }
    return localRect2;
  }
  
  private void d(View paramView, int paramInt)
  {
    e locale = (e)paramView.getLayoutParams();
    Rect localRect1 = d();
    localRect1.set(getPaddingLeft() + locale.leftMargin, getPaddingTop() + locale.topMargin, getWidth() - getPaddingRight() - locale.rightMargin, getHeight() - getPaddingBottom() - locale.bottomMargin);
    if ((this.s != null) && (y.i(this)) && (!y.i(paramView)))
    {
      localRect1.left += this.s.c();
      localRect1.top += this.s.e();
      localRect1.right -= this.s.d();
      localRect1.bottom -= this.s.b();
    }
    Rect localRect2 = d();
    f.a(d(locale.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect1, localRect2, paramInt);
    paramView.layout(localRect2.left, localRect2.top, localRect2.right, localRect2.bottom);
    a(localRect1);
    a(localRect2);
  }
  
  private static int e(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt == 0) {
      i1 = 8388661;
    }
    return i1;
  }
  
  private void e()
  {
    this.f.clear();
    this.g.a();
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView1 = getChildAt(i2);
      e locale = d(localView1);
      locale.a(this, localView1);
      this.g.a(localView1);
      for (int i3 = 0; i3 < i1; i3++) {
        if (i3 != i2)
        {
          View localView2 = getChildAt(i3);
          if (locale.a(this, localView1, localView2))
          {
            if (!this.g.b(localView2)) {
              this.g.a(localView2);
            }
            this.g.a(localView2, localView1);
          }
        }
      }
    }
    this.f.addAll(this.g.b());
    Collections.reverse(this.f);
  }
  
  private void e(View paramView, int paramInt)
  {
    e locale = (e)paramView.getLayoutParams();
    int i1 = locale.i;
    if (i1 != paramInt)
    {
      y.a(paramView, paramInt - i1);
      locale.i = paramInt;
    }
  }
  
  private boolean e(View paramView)
  {
    return this.g.e(paramView);
  }
  
  private void f()
  {
    if (Build.VERSION.SDK_INT < 21) {
      return;
    }
    if (y.i(this))
    {
      if (this.w == null) {
        this.w = new v(this);
      }
      y.a(this, this.w);
      setSystemUiVisibility(1280);
    }
    else
    {
      y.a(this, null);
    }
  }
  
  private void f(View paramView, int paramInt)
  {
    e locale = (e)paramView.getLayoutParams();
    int i1 = locale.j;
    if (i1 != paramInt)
    {
      y.b(paramView, paramInt - i1);
      locale.j = paramInt;
    }
  }
  
  final N a(N paramN)
  {
    N localN = paramN;
    if (!pd.a(this.s, paramN))
    {
      this.s = paramN;
      boolean bool1 = true;
      boolean bool2;
      if ((paramN != null) && (paramN.e() > 0)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      this.t = bool2;
      if ((!this.t) && (getBackground() == null)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      setWillNotDraw(bool2);
      localN = b(paramN);
      requestLayout();
    }
    return localN;
  }
  
  void a()
  {
    if (this.m)
    {
      if (this.q == null) {
        this.q = new f();
      }
      getViewTreeObserver().addOnPreDrawListener(this.q);
    }
    this.r = true;
  }
  
  final void a(int paramInt)
  {
    int i1 = y.l(this);
    int i2 = this.f.size();
    Rect localRect1 = d();
    Rect localRect2 = d();
    Rect localRect3 = d();
    for (int i3 = 0; i3 < i2; i3++)
    {
      View localView1 = (View)this.f.get(i3);
      Object localObject1 = (e)localView1.getLayoutParams();
      if ((paramInt != 0) || (localView1.getVisibility() != 8))
      {
        Object localObject2;
        for (int i4 = 0; i4 < i3; i4++)
        {
          localObject2 = (View)this.f.get(i4);
          if (((e)localObject1).l == localObject2) {
            b(localView1, i1);
          }
        }
        a(localView1, true, localRect2);
        if ((((e)localObject1).g != 0) && (!localRect2.isEmpty()))
        {
          i4 = f.a(((e)localObject1).g, i1);
          int i5 = i4 & 0x70;
          if (i5 != 48)
          {
            if (i5 == 80) {
              localRect1.bottom = Math.max(localRect1.bottom, getHeight() - localRect2.top);
            }
          }
          else {
            localRect1.top = Math.max(localRect1.top, localRect2.bottom);
          }
          i4 &= 0x7;
          if (i4 != 3)
          {
            if (i4 == 5) {
              localRect1.right = Math.max(localRect1.right, getWidth() - localRect2.left);
            }
          }
          else {
            localRect1.left = Math.max(localRect1.left, localRect2.right);
          }
        }
        if ((((e)localObject1).h != 0) && (localView1.getVisibility() == 0)) {
          a(localView1, localRect1, i1);
        }
        if (paramInt != 2)
        {
          b(localView1, localRect3);
          if (!localRect3.equals(localRect2)) {
            c(localView1, localRect2);
          }
        }
        else
        {
          for (i4 = i3 + 1; i4 < i2; i4++)
          {
            View localView2 = (View)this.f.get(i4);
            localObject2 = (e)localView2.getLayoutParams();
            localObject1 = ((e)localObject2).d();
            if ((localObject1 != null) && (((b)localObject1).a(this, localView2, localView1))) {
              if ((paramInt == 0) && (((e)localObject2).e()))
              {
                ((e)localObject2).g();
              }
              else
              {
                boolean bool;
                if (paramInt != 2)
                {
                  bool = ((b)localObject1).b(this, localView2, localView1);
                }
                else
                {
                  ((b)localObject1).c(this, localView2, localView1);
                  bool = true;
                }
                if (paramInt == 1) {
                  ((e)localObject2).a(bool);
                }
              }
            }
          }
        }
      }
    }
    a(localRect1);
    a(localRect2);
    a(localRect3);
  }
  
  public void a(View paramView)
  {
    List localList = this.g.c(paramView);
    if ((localList != null) && (!localList.isEmpty())) {
      for (int i1 = 0; i1 < localList.size(); i1++)
      {
        View localView = (View)localList.get(i1);
        b localb = ((e)localView.getLayoutParams()).d();
        if (localb != null) {
          localb.b(this, localView, paramView);
        }
      }
    }
  }
  
  public void a(View paramView, int paramInt)
  {
    this.x.a(paramView, paramInt);
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      e locale = (e)localView.getLayoutParams();
      if (locale.a(paramInt))
      {
        b localb = locale.d();
        if (localb != null) {
          localb.a(this, localView, paramView, paramInt);
        }
        locale.b(paramInt);
        locale.g();
      }
    }
    this.p = null;
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = getChildCount();
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() != 8)
      {
        Object localObject = (e)localView.getLayoutParams();
        if (((e)localObject).a(paramInt5))
        {
          localObject = ((e)localObject).d();
          if (localObject != null)
          {
            ((b)localObject).a(this, localView, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
            i2 = 1;
          }
        }
      }
    }
    if (i2 != 0) {
      a(1);
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    int i1 = getChildCount();
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i7;
    for (int i5 = 0; i3 < i1; i5 = i7)
    {
      View localView = getChildAt(i3);
      int i6;
      if (localView.getVisibility() == 8)
      {
        i6 = i4;
        i7 = i5;
      }
      else
      {
        Object localObject = (e)localView.getLayoutParams();
        if (!((e)localObject).a(paramInt3))
        {
          i6 = i4;
          i7 = i5;
        }
        else
        {
          localObject = ((e)localObject).d();
          i6 = i4;
          i7 = i5;
          if (localObject != null)
          {
            int[] arrayOfInt = this.j;
            arrayOfInt[1] = 0;
            arrayOfInt[0] = 0;
            ((b)localObject).a(this, localView, paramView, paramInt1, paramInt2, arrayOfInt, paramInt3);
            if (paramInt1 > 0) {
              i7 = Math.max(i4, this.j[0]);
            } else {
              i7 = Math.min(i4, this.j[0]);
            }
            if (paramInt2 > 0) {
              i5 = Math.max(i5, this.j[1]);
            } else {
              i5 = Math.min(i5, this.j[1]);
            }
            i6 = i7;
            i7 = i5;
            i2 = 1;
          }
        }
      }
      i3++;
      i4 = i6;
    }
    paramArrayOfInt[0] = i4;
    paramArrayOfInt[1] = i5;
    if (i2 != 0) {
      a(1);
    }
  }
  
  void a(View paramView, int paramInt, Rect paramRect1, Rect paramRect2)
  {
    e locale = (e)paramView.getLayoutParams();
    int i1 = paramView.getMeasuredWidth();
    int i2 = paramView.getMeasuredHeight();
    a(paramView, paramInt, paramRect1, paramRect2, locale, i1, i2);
    a(locale, paramRect2, i1, i2);
  }
  
  void a(View paramView, Rect paramRect)
  {
    I.a(this, paramView, paramRect);
  }
  
  void a(View paramView, boolean paramBoolean, Rect paramRect)
  {
    if ((!paramView.isLayoutRequested()) && (paramView.getVisibility() != 8))
    {
      if (paramBoolean) {
        a(paramView, paramRect);
      } else {
        paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
      }
      return;
    }
    paramRect.setEmpty();
  }
  
  public boolean a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = d();
    a(paramView, localRect);
    try
    {
      boolean bool = localRect.contains(paramInt1, paramInt2);
      return bool;
    }
    finally
    {
      a(localRect);
    }
  }
  
  public boolean a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool1 = false;
    while (i2 < i1)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() != 8)
      {
        e locale = (e)localView.getLayoutParams();
        b localb = locale.d();
        if (localb != null)
        {
          boolean bool2 = localb.b(this, localView, paramView1, paramView2, paramInt1, paramInt2);
          locale.a(paramInt2, bool2);
          bool1 |= bool2;
        }
        else
        {
          locale.a(paramInt2, false);
        }
      }
      i2++;
    }
    return bool1;
  }
  
  public List<View> b(View paramView)
  {
    paramView = this.g.d(paramView);
    this.i.clear();
    if (paramView != null) {
      this.i.addAll(paramView);
    }
    return this.i;
  }
  
  void b()
  {
    int i1 = getChildCount();
    int i2 = 0;
    int i4;
    for (int i3 = 0;; i3++)
    {
      i4 = i2;
      if (i3 >= i1) {
        break;
      }
      if (e(getChildAt(i3)))
      {
        i4 = 1;
        break;
      }
    }
    if (i4 != this.r) {
      if (i4 != 0) {
        a();
      } else {
        c();
      }
    }
  }
  
  void b(View paramView, int paramInt)
  {
    e locale = (e)paramView.getLayoutParams();
    if (locale.k != null)
    {
      Rect localRect1 = d();
      Rect localRect2 = d();
      Rect localRect3 = d();
      a(locale.k, localRect1);
      int i1 = 0;
      a(paramView, false, localRect2);
      int i2 = paramView.getMeasuredWidth();
      int i3 = paramView.getMeasuredHeight();
      a(paramView, paramInt, localRect1, localRect3, locale, i2, i3);
      if (localRect3.left == localRect2.left)
      {
        paramInt = i1;
        if (localRect3.top == localRect2.top) {}
      }
      else
      {
        paramInt = 1;
      }
      a(locale, localRect3, i2, i3);
      i1 = localRect3.left - localRect2.left;
      i2 = localRect3.top - localRect2.top;
      if (i1 != 0) {
        y.a(paramView, i1);
      }
      if (i2 != 0) {
        y.b(paramView, i2);
      }
      if (paramInt != 0)
      {
        b localb = locale.d();
        if (localb != null) {
          localb.b(this, paramView, locale.k);
        }
      }
      a(localRect1);
      a(localRect2);
      a(localRect3);
    }
  }
  
  void b(View paramView, Rect paramRect)
  {
    paramRect.set(((e)paramView.getLayoutParams()).f());
  }
  
  public void b(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    this.x.a(paramView1, paramView2, paramInt1, paramInt2);
    this.p = paramView2;
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      Object localObject = (e)localView.getLayoutParams();
      if (((e)localObject).a(paramInt2))
      {
        localObject = ((e)localObject).d();
        if (localObject != null) {
          ((b)localObject).a(this, localView, paramView1, paramView2, paramInt1, paramInt2);
        }
      }
    }
  }
  
  public List<View> c(View paramView)
  {
    paramView = this.g.c(paramView);
    this.i.clear();
    if (paramView != null) {
      this.i.addAll(paramView);
    }
    return this.i;
  }
  
  void c()
  {
    if ((this.m) && (this.q != null)) {
      getViewTreeObserver().removeOnPreDrawListener(this.q);
    }
    this.r = false;
  }
  
  public void c(View paramView, int paramInt)
  {
    e locale = (e)paramView.getLayoutParams();
    if (!locale.a())
    {
      View localView = locale.k;
      if (localView != null)
      {
        a(paramView, localView, paramInt);
      }
      else
      {
        int i1 = locale.e;
        if (i1 >= 0) {
          b(paramView, i1, paramInt);
        } else {
          d(paramView, paramInt);
        }
      }
      return;
    }
    throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
  }
  
  void c(View paramView, Rect paramRect)
  {
    ((e)paramView.getLayoutParams()).a(paramRect);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof e)) && (super.checkLayoutParams(paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  e d(View paramView)
  {
    e locale = (e)paramView.getLayoutParams();
    if (!locale.b) {
      if ((paramView instanceof a))
      {
        paramView = ((a)paramView).getBehavior();
        if (paramView == null) {
          Log.e("CoordinatorLayout", "Attached behavior class is null");
        }
        locale.a(paramView);
        locale.b = true;
      }
      else
      {
        Object localObject = paramView.getClass();
        c localc;
        for (paramView = null; localObject != null; paramView = localc)
        {
          localc = (c)((Class)localObject).getAnnotation(c.class);
          paramView = localc;
          if (localc != null) {
            break;
          }
          localObject = ((Class)localObject).getSuperclass();
        }
        if (paramView != null) {
          try
          {
            locale.a((b)paramView.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
          }
          catch (Exception localException)
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Default behavior class ");
            ((StringBuilder)localObject).append(paramView.value().getName());
            ((StringBuilder)localObject).append(" could not be instantiated. Did you forget");
            ((StringBuilder)localObject).append(" a default constructor?");
            Log.e("CoordinatorLayout", ((StringBuilder)localObject).toString(), localException);
          }
        }
        locale.b = true;
      }
    }
    return locale;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    e locale = (e)paramView.getLayoutParams();
    b localb = locale.a;
    if (localb != null)
    {
      float f1 = localb.c(this, paramView);
      if (f1 > 0.0F)
      {
        if (this.k == null) {
          this.k = new Paint();
        }
        this.k.setColor(locale.a.b(this, paramView));
        this.k.setAlpha(a(Math.round(f1 * 255.0F), 0, 255));
        int i1 = paramCanvas.save();
        if (paramView.isOpaque()) {
          paramCanvas.clipRect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom(), Region.Op.DIFFERENCE);
        }
        paramCanvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.k);
        paramCanvas.restoreToCount(i1);
      }
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable localDrawable = this.u;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localDrawable != null)
    {
      bool2 = bool1;
      if (localDrawable.isStateful()) {
        bool2 = false | localDrawable.setState(arrayOfInt);
      }
    }
    if (bool2) {
      invalidate();
    }
  }
  
  protected e generateDefaultLayoutParams()
  {
    return new e(-2, -2);
  }
  
  public e generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new e(getContext(), paramAttributeSet);
  }
  
  protected e generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof e)) {
      return new e((e)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new e((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new e(paramLayoutParams);
  }
  
  final List<View> getDependencySortedChildren()
  {
    e();
    return Collections.unmodifiableList(this.f);
  }
  
  public final N getLastWindowInsets()
  {
    return this.s;
  }
  
  public int getNestedScrollAxes()
  {
    return this.x.a();
  }
  
  public Drawable getStatusBarBackground()
  {
    return this.u;
  }
  
  protected int getSuggestedMinimumHeight()
  {
    return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
  }
  
  protected int getSuggestedMinimumWidth()
  {
    return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a(false);
    if (this.r)
    {
      if (this.q == null) {
        this.q = new f();
      }
      getViewTreeObserver().addOnPreDrawListener(this.q);
    }
    if ((this.s == null) && (y.i(this))) {
      y.F(this);
    }
    this.m = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a(false);
    if ((this.r) && (this.q != null)) {
      getViewTreeObserver().removeOnPreDrawListener(this.q);
    }
    View localView = this.p;
    if (localView != null) {
      onStopNestedScroll(localView);
    }
    this.m = false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.t) && (this.u != null))
    {
      N localN = this.s;
      int i1;
      if (localN != null) {
        i1 = localN.e();
      } else {
        i1 = 0;
      }
      if (i1 > 0)
      {
        this.u.setBounds(0, 0, getWidth(), i1);
        this.u.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 0) {
      a(true);
    }
    boolean bool = a(paramMotionEvent, 0);
    if ((i1 == 1) || (i1 == 3)) {
      a(true);
    }
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = y.l(this);
    paramInt3 = this.f.size();
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++)
    {
      View localView = (View)this.f.get(paramInt1);
      if (localView.getVisibility() != 8)
      {
        b localb = ((e)localView.getLayoutParams()).d();
        if ((localb == null) || (!localb.a(this, localView, paramInt2))) {
          c(localView, paramInt2);
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    e();
    b();
    int i1 = getPaddingLeft();
    int i2 = getPaddingTop();
    int i3 = getPaddingRight();
    int i4 = getPaddingBottom();
    int i5 = y.l(this);
    int i6;
    if (i5 == 1) {
      i6 = 1;
    } else {
      i6 = 0;
    }
    int i7 = View.MeasureSpec.getMode(paramInt1);
    int i8 = View.MeasureSpec.getSize(paramInt1);
    int i9 = View.MeasureSpec.getMode(paramInt2);
    int i10 = View.MeasureSpec.getSize(paramInt2);
    int i11 = getSuggestedMinimumWidth();
    int i12 = getSuggestedMinimumHeight();
    int i13;
    if ((this.s != null) && (y.i(this))) {
      i13 = 1;
    } else {
      i13 = 0;
    }
    int i14 = this.f.size();
    int i15 = 0;
    for (int i16 = 0; i16 < i14; i16++)
    {
      View localView = (View)this.f.get(i16);
      if (localView.getVisibility() != 8)
      {
        e locale = (e)localView.getLayoutParams();
        int i17 = locale.e;
        int i18;
        if ((i17 >= 0) && (i7 != 0))
        {
          i18 = b(i17);
          i17 = f.a(e(locale.c), i5) & 0x7;
          if (((i17 == 3) && (i6 == 0)) || ((i17 == 5) && (i6 != 0)))
          {
            i17 = Math.max(0, i8 - i3 - i18);
            break label294;
          }
          if (((i17 == 5) && (i6 == 0)) || ((i17 == 3) && (i6 != 0)))
          {
            i17 = Math.max(0, i18 - i1);
            break label294;
          }
        }
        i17 = 0;
        label294:
        int i19 = i12;
        if ((i13 != 0) && (!y.i(localView)))
        {
          int i20 = this.s.c();
          i12 = this.s.d();
          i18 = this.s.e();
          int i21 = this.s.b();
          i12 = View.MeasureSpec.makeMeasureSpec(i8 - (i20 + i12), i7);
          i21 = View.MeasureSpec.makeMeasureSpec(i10 - (i18 + i21), i9);
          i18 = i12;
          i12 = i21;
        }
        else
        {
          i18 = paramInt1;
          i12 = paramInt2;
        }
        b localb = locale.d();
        if (localb != null) {
          if (localb.a(this, localView, i18, i17, i12, 0)) {
            break label440;
          }
        }
        a(localView, i18, i17, i12, 0);
        label440:
        i11 = Math.max(i11, i1 + i3 + localView.getMeasuredWidth() + locale.leftMargin + locale.rightMargin);
        i12 = Math.max(i19, i2 + i4 + localView.getMeasuredHeight() + locale.topMargin + locale.bottomMargin);
        i15 = View.combineMeasuredStates(i15, localView.getMeasuredState());
      }
    }
    setMeasuredDimension(View.resolveSizeAndState(i11, paramInt1, 0xFF000000 & i15), View.resolveSizeAndState(i12, paramInt2, i15 << 16));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool2;
    for (boolean bool1 = false; i2 < i1; bool1 = bool2)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 8)
      {
        bool2 = bool1;
      }
      else
      {
        Object localObject = (e)localView.getLayoutParams();
        if (!((e)localObject).a(0))
        {
          bool2 = bool1;
        }
        else
        {
          localObject = ((e)localObject).d();
          bool2 = bool1;
          if (localObject != null) {
            bool2 = bool1 | ((b)localObject).a(this, localView, paramView, paramFloat1, paramFloat2, paramBoolean);
          }
        }
      }
      i2++;
    }
    if (bool1) {
      a(1);
    }
    return bool1;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool2;
    for (boolean bool1 = false; i2 < i1; bool1 = bool2)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 8)
      {
        bool2 = bool1;
      }
      else
      {
        Object localObject = (e)localView.getLayoutParams();
        if (!((e)localObject).a(0))
        {
          bool2 = bool1;
        }
        else
        {
          localObject = ((e)localObject).d();
          bool2 = bool1;
          if (localObject != null) {
            bool2 = bool1 | ((b)localObject).a(this, localView, paramView, paramFloat1, paramFloat2);
          }
        }
      }
      i2++;
    }
    return bool1;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    b(paramView1, paramView2, paramInt, 0);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof g))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (g)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.l());
    SparseArray localSparseArray = paramParcelable.c;
    int i1 = 0;
    int i2 = getChildCount();
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      int i3 = localView.getId();
      b localb = d(localView).d();
      if ((i3 != -1) && (localb != null))
      {
        paramParcelable = (Parcelable)localSparseArray.get(i3);
        if (paramParcelable != null) {
          localb.a(this, localView, paramParcelable);
        }
      }
      i1++;
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    g localg = new g(super.onSaveInstanceState());
    SparseArray localSparseArray = new SparseArray();
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = getChildAt(i2);
      int i3 = ((View)localObject).getId();
      b localb = ((e)((View)localObject).getLayoutParams()).d();
      if ((i3 != -1) && (localb != null))
      {
        localObject = localb.d(this, (View)localObject);
        if (localObject != null) {
          localSparseArray.append(i3, localObject);
        }
      }
    }
    localg.c = localSparseArray;
    return localg;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return a(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView)
  {
    a(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    boolean bool1;
    if (this.o == null)
    {
      bool1 = a(paramMotionEvent, 1);
      bool2 = bool1;
      if (!bool1) {
        break label76;
      }
    }
    else
    {
      bool1 = false;
    }
    b localb = ((e)this.o.getLayoutParams()).d();
    boolean bool2 = bool1;
    boolean bool3;
    if (localb != null)
    {
      bool3 = localb.b(this, this.o, paramMotionEvent);
      bool2 = bool1;
      bool1 = bool3;
    }
    else
    {
      label76:
      bool1 = false;
    }
    View localView = this.o;
    localb = null;
    if (localView == null)
    {
      bool3 = bool1 | super.onTouchEvent(paramMotionEvent);
      paramMotionEvent = localb;
    }
    else
    {
      bool3 = bool1;
      paramMotionEvent = localb;
      if (bool2)
      {
        long l1 = SystemClock.uptimeMillis();
        paramMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        super.onTouchEvent(paramMotionEvent);
        bool3 = bool1;
      }
    }
    if (paramMotionEvent != null) {
      paramMotionEvent.recycle();
    }
    if ((i1 == 1) || (i1 == 3)) {
      a(false);
    }
    return bool3;
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    b localb = ((e)paramView.getLayoutParams()).d();
    if ((localb != null) && (localb.a(this, paramView, paramRect, paramBoolean))) {
      return true;
    }
    return super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if ((paramBoolean) && (!this.l))
    {
      a(false);
      this.l = true;
    }
  }
  
  public void setFitsSystemWindows(boolean paramBoolean)
  {
    super.setFitsSystemWindows(paramBoolean);
    f();
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener)
  {
    this.v = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    Drawable localDrawable1 = this.u;
    if (localDrawable1 != paramDrawable)
    {
      Drawable localDrawable2 = null;
      if (localDrawable1 != null) {
        localDrawable1.setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable2 = paramDrawable.mutate();
      }
      this.u = localDrawable2;
      paramDrawable = this.u;
      if (paramDrawable != null)
      {
        if (paramDrawable.isStateful()) {
          this.u.setState(getDrawableState());
        }
        a.a(this.u, y.l(this));
        paramDrawable = this.u;
        boolean bool;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        }
        paramDrawable.setVisible(bool, false);
        this.u.setCallback(this);
      }
      y.E(this);
    }
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    setStatusBarBackground(new ColorDrawable(paramInt));
  }
  
  public void setStatusBarBackgroundResource(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = android.support.v4.content.c.c(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setStatusBarBackground(localDrawable);
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
    Drawable localDrawable = this.u;
    if ((localDrawable != null) && (localDrawable.isVisible() != bool)) {
      this.u.setVisible(bool, false);
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != this.u)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract CoordinatorLayout.b getBehavior();
  }
  
  public static abstract class b<V extends View>
  {
    public b() {}
    
    public b(Context paramContext, AttributeSet paramAttributeSet) {}
    
    public N a(CoordinatorLayout paramCoordinatorLayout, V paramV, N paramN)
    {
      return paramN;
    }
    
    public void a() {}
    
    public void a(CoordinatorLayout.e parame) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt)
    {
      if (paramInt == 0) {
        d(paramCoordinatorLayout, paramV, paramView);
      }
    }
    
    @Deprecated
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      if (paramInt5 == 0) {
        a(paramCoordinatorLayout, paramV, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    @Deprecated
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
    {
      if (paramInt3 == 0) {
        a(paramCoordinatorLayout, paramV, paramView, paramInt1, paramInt2, paramArrayOfInt);
      }
    }
    
    @Deprecated
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt1, int paramInt2)
    {
      if (paramInt2 == 0) {
        a(paramCoordinatorLayout, paramV, paramView1, paramView2, paramInt1);
      }
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      boolean bool;
      if (c(paramCoordinatorLayout, paramV) > 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, Rect paramRect)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, Rect paramRect, boolean paramBoolean)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return false;
    }
    
    public int b(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return -16777216;
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
    {
      return false;
    }
    
    @Deprecated
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt)
    {
      return false;
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt1, int paramInt2)
    {
      if (paramInt2 == 0) {
        return b(paramCoordinatorLayout, paramV, paramView1, paramView2, paramInt1);
      }
      return false;
    }
    
    public float c(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return 0.0F;
    }
    
    public void c(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView) {}
    
    public Parcelable d(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return View.BaseSavedState.EMPTY_STATE;
    }
    
    @Deprecated
    public void d(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView) {}
  }
  
  @Deprecated
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface c
  {
    Class<? extends CoordinatorLayout.b> value();
  }
  
  private class d
    implements ViewGroup.OnHierarchyChangeListener
  {
    d() {}
    
    public void onChildViewAdded(View paramView1, View paramView2)
    {
      ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = CoordinatorLayout.this.v;
      if (localOnHierarchyChangeListener != null) {
        localOnHierarchyChangeListener.onChildViewAdded(paramView1, paramView2);
      }
    }
    
    public void onChildViewRemoved(View paramView1, View paramView2)
    {
      CoordinatorLayout.this.a(2);
      ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = CoordinatorLayout.this.v;
      if (localOnHierarchyChangeListener != null) {
        localOnHierarchyChangeListener.onChildViewRemoved(paramView1, paramView2);
      }
    }
  }
  
  public static class e
    extends ViewGroup.MarginLayoutParams
  {
    CoordinatorLayout.b a;
    boolean b = false;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    int f = -1;
    public int g = 0;
    public int h = 0;
    int i;
    int j;
    View k;
    View l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    final Rect q = new Rect();
    Object r;
    
    public e(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    e(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, Q.CoordinatorLayout_Layout);
      this.c = localTypedArray.getInteger(Q.CoordinatorLayout_Layout_android_layout_gravity, 0);
      this.f = localTypedArray.getResourceId(Q.CoordinatorLayout_Layout_layout_anchor, -1);
      this.d = localTypedArray.getInteger(Q.CoordinatorLayout_Layout_layout_anchorGravity, 0);
      this.e = localTypedArray.getInteger(Q.CoordinatorLayout_Layout_layout_keyline, -1);
      this.g = localTypedArray.getInt(Q.CoordinatorLayout_Layout_layout_insetEdge, 0);
      this.h = localTypedArray.getInt(Q.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
      this.b = localTypedArray.hasValue(Q.CoordinatorLayout_Layout_layout_behavior);
      if (this.b) {
        this.a = CoordinatorLayout.a(paramContext, paramAttributeSet, localTypedArray.getString(Q.CoordinatorLayout_Layout_layout_behavior));
      }
      localTypedArray.recycle();
      paramContext = this.a;
      if (paramContext != null) {
        paramContext.a(this);
      }
    }
    
    public e(e parame)
    {
      super();
    }
    
    public e(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public e(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    private void a(View paramView, CoordinatorLayout paramCoordinatorLayout)
    {
      this.k = paramCoordinatorLayout.findViewById(this.f);
      View localView = this.k;
      if (localView != null)
      {
        if (localView == paramCoordinatorLayout)
        {
          if (paramCoordinatorLayout.isInEditMode())
          {
            this.l = null;
            this.k = null;
            return;
          }
          throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
        }
        for (localObject = localView.getParent(); (localObject != paramCoordinatorLayout) && (localObject != null); localObject = ((ViewParent)localObject).getParent())
        {
          if (localObject == paramView)
          {
            if (paramCoordinatorLayout.isInEditMode())
            {
              this.l = null;
              this.k = null;
              return;
            }
            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
          }
          if ((localObject instanceof View)) {
            localView = (View)localObject;
          }
        }
        this.l = localView;
        return;
      }
      if (paramCoordinatorLayout.isInEditMode())
      {
        this.l = null;
        this.k = null;
        return;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Could not find CoordinatorLayout descendant view with id ");
      ((StringBuilder)localObject).append(paramCoordinatorLayout.getResources().getResourceName(this.f));
      ((StringBuilder)localObject).append(" to anchor view ");
      ((StringBuilder)localObject).append(paramView);
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    
    private boolean a(View paramView, int paramInt)
    {
      int i1 = f.a(((e)paramView.getLayoutParams()).g, paramInt);
      boolean bool;
      if ((i1 != 0) && ((f.a(this.h, paramInt) & i1) == i1)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean b(View paramView, CoordinatorLayout paramCoordinatorLayout)
    {
      if (this.k.getId() != this.f) {
        return false;
      }
      View localView = this.k;
      ViewParent localViewParent = localView.getParent();
      while (localViewParent != paramCoordinatorLayout) {
        if ((localViewParent != null) && (localViewParent != paramView))
        {
          if ((localViewParent instanceof View)) {
            localView = (View)localViewParent;
          }
          localViewParent = localViewParent.getParent();
        }
        else
        {
          this.l = null;
          this.k = null;
          return false;
        }
      }
      this.l = localView;
      return true;
    }
    
    View a(CoordinatorLayout paramCoordinatorLayout, View paramView)
    {
      if (this.f == -1)
      {
        this.l = null;
        this.k = null;
        return null;
      }
      if ((this.k == null) || (!b(paramView, paramCoordinatorLayout))) {
        a(paramView, paramCoordinatorLayout);
      }
      return this.k;
    }
    
    void a(int paramInt, boolean paramBoolean)
    {
      if (paramInt != 0)
      {
        if (paramInt == 1) {
          this.o = paramBoolean;
        }
      }
      else {
        this.n = paramBoolean;
      }
    }
    
    void a(Rect paramRect)
    {
      this.q.set(paramRect);
    }
    
    public void a(CoordinatorLayout.b paramb)
    {
      CoordinatorLayout.b localb = this.a;
      if (localb != paramb)
      {
        if (localb != null) {
          localb.a();
        }
        this.a = paramb;
        this.r = null;
        this.b = true;
        if (paramb != null) {
          paramb.a(this);
        }
      }
    }
    
    void a(boolean paramBoolean)
    {
      this.p = paramBoolean;
    }
    
    boolean a()
    {
      boolean bool;
      if ((this.k == null) && (this.f != -1)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean a(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1) {
          return false;
        }
        return this.o;
      }
      return this.n;
    }
    
    boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      if ((paramView2 != this.l) && (!a(paramView2, y.l(paramCoordinatorLayout))))
      {
        CoordinatorLayout.b localb = this.a;
        if ((localb == null) || (!localb.a(paramCoordinatorLayout, paramView1, paramView2)))
        {
          bool = false;
          break label54;
        }
      }
      boolean bool = true;
      label54:
      return bool;
    }
    
    void b(int paramInt)
    {
      a(paramInt, false);
    }
    
    boolean b()
    {
      if (this.a == null) {
        this.m = false;
      }
      return this.m;
    }
    
    boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView)
    {
      boolean bool1 = this.m;
      if (bool1) {
        return true;
      }
      CoordinatorLayout.b localb = this.a;
      boolean bool2;
      if (localb != null) {
        bool2 = localb.a(paramCoordinatorLayout, paramView);
      } else {
        bool2 = false;
      }
      bool2 |= bool1;
      this.m = bool2;
      return bool2;
    }
    
    public int c()
    {
      return this.f;
    }
    
    public CoordinatorLayout.b d()
    {
      return this.a;
    }
    
    boolean e()
    {
      return this.p;
    }
    
    Rect f()
    {
      return this.q;
    }
    
    void g()
    {
      this.p = false;
    }
    
    void h()
    {
      this.m = false;
    }
  }
  
  class f
    implements ViewTreeObserver.OnPreDrawListener
  {
    f() {}
    
    public boolean onPreDraw()
    {
      CoordinatorLayout.this.a(0);
      return true;
    }
  }
  
  protected static class g
    extends android.support.v4.view.c
  {
    public static final Parcelable.Creator<g> CREATOR = new w();
    SparseArray<Parcelable> c;
    
    public g(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      int i = paramParcel.readInt();
      int[] arrayOfInt = new int[i];
      paramParcel.readIntArray(arrayOfInt);
      paramParcel = paramParcel.readParcelableArray(paramClassLoader);
      this.c = new SparseArray(i);
      for (int j = 0; j < i; j++) {
        this.c.append(arrayOfInt[j], paramParcel[j]);
      }
    }
    
    public g(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      Object localObject = this.c;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((SparseArray)localObject).size();
      } else {
        j = 0;
      }
      paramParcel.writeInt(j);
      int[] arrayOfInt = new int[j];
      localObject = new Parcelable[j];
      while (i < j)
      {
        arrayOfInt[i] = this.c.keyAt(i);
        localObject[i] = ((Parcelable)this.c.valueAt(i));
        i++;
      }
      paramParcel.writeIntArray(arrayOfInt);
      paramParcel.writeParcelableArray((Parcelable[])localObject, paramInt);
    }
  }
  
  static class h
    implements Comparator<View>
  {
    public int a(View paramView1, View paramView2)
    {
      float f1 = y.v(paramView1);
      float f2 = y.v(paramView2);
      if (f1 > f2) {
        return -1;
      }
      if (f1 < f2) {
        return 1;
      }
      return 0;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/CoordinatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */