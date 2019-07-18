package android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.d;
import android.support.v4.view.f;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import zd;
import zd.a;

public class DrawerLayout
  extends ViewGroup
{
  private static final int[] a;
  static final int[] b;
  static final boolean c;
  private static final boolean d;
  private float A;
  private Drawable B;
  private Drawable C;
  private Drawable D;
  private CharSequence E;
  private CharSequence F;
  private Object G;
  private boolean H;
  private Drawable I = null;
  private Drawable J = null;
  private Drawable K = null;
  private Drawable L = null;
  private final ArrayList<View> M;
  private Rect N;
  private Matrix O;
  private final b e = new b();
  private float f;
  private int g;
  private int h = -1728053248;
  private float i;
  private Paint j = new Paint();
  private final H k;
  private final H l;
  private final f m;
  private final f n;
  private int o;
  private boolean p;
  private boolean q = true;
  private int r = 3;
  private int s = 3;
  private int t = 3;
  private int u = 3;
  private boolean v;
  private boolean w;
  private c x;
  private List<c> y;
  private float z;
  
  static
  {
    boolean bool1 = true;
    a = new int[] { 16843828 };
    b = new int[] { 16842931 };
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 19) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    c = bool2;
    if (Build.VERSION.SDK_INT >= 21) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    d = bool2;
  }
  
  public DrawerLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.g = ((int)(64.0F * f1 + 0.5F));
    float f2 = 400.0F * f1;
    this.m = new f(3);
    this.n = new f(5);
    this.k = H.a(this, 1.0F, this.m);
    this.k.d(1);
    this.k.a(f2);
    this.m.a(this.k);
    this.l = H.a(this, 1.0F, this.n);
    this.l.d(2);
    this.l.a(f2);
    this.n.a(this.l);
    setFocusableInTouchMode(true);
    y.d(this, 1);
    y.a(this, new a());
    setMotionEventSplittingEnabled(false);
    if (y.i(this))
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        setOnApplyWindowInsetsListener(new k(this));
        setSystemUiVisibility(1280);
        paramContext = paramContext.obtainStyledAttributes(a);
      }
      try
      {
        this.B = paramContext.getDrawable(0);
        paramContext.recycle();
      }
      finally
      {
        paramContext.recycle();
      }
    }
    this.f = (f1 * 10.0F);
    this.M = new ArrayList();
  }
  
  private boolean a(float paramFloat1, float paramFloat2, View paramView)
  {
    if (this.N == null) {
      this.N = new Rect();
    }
    paramView.getHitRect(this.N);
    return this.N.contains((int)paramFloat1, (int)paramFloat2);
  }
  
  private boolean a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable != null) && (a.f(paramDrawable)))
    {
      a.a(paramDrawable, paramInt);
      return true;
    }
    return false;
  }
  
  private boolean a(MotionEvent paramMotionEvent, View paramView)
  {
    boolean bool;
    if (!paramView.getMatrix().isIdentity())
    {
      paramMotionEvent = b(paramMotionEvent, paramView);
      bool = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      paramMotionEvent.recycle();
    }
    else
    {
      float f1 = getScrollX() - paramView.getLeft();
      float f2 = getScrollY() - paramView.getTop();
      paramMotionEvent.offsetLocation(f1, f2);
      bool = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      paramMotionEvent.offsetLocation(-f1, -f2);
    }
    return bool;
  }
  
  private MotionEvent b(MotionEvent paramMotionEvent, View paramView)
  {
    float f1 = getScrollX() - paramView.getLeft();
    float f2 = getScrollY() - paramView.getTop();
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.offsetLocation(f1, f2);
    paramView = paramView.getMatrix();
    if (!paramView.isIdentity())
    {
      if (this.O == null) {
        this.O = new Matrix();
      }
      paramView.invert(this.O);
      paramMotionEvent.transform(this.O);
    }
    return paramMotionEvent;
  }
  
  private void c(View paramView, boolean paramBoolean)
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (((!paramBoolean) && (!j(localView))) || ((paramBoolean) && (localView == paramView))) {
        y.d(localView, 1);
      } else {
        y.d(localView, 4);
      }
    }
  }
  
  static String e(int paramInt)
  {
    if ((paramInt & 0x3) == 3) {
      return "LEFT";
    }
    if ((paramInt & 0x5) == 5) {
      return "RIGHT";
    }
    return Integer.toHexString(paramInt);
  }
  
  private boolean e()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((d)getChildAt(i2).getLayoutParams()).c) {
        return true;
      }
    }
    return false;
  }
  
  private boolean f()
  {
    boolean bool;
    if (d() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private Drawable g()
  {
    int i1 = y.l(this);
    Drawable localDrawable;
    if (i1 == 0)
    {
      localDrawable = this.I;
      if (localDrawable != null)
      {
        a(localDrawable, i1);
        return this.I;
      }
    }
    else
    {
      localDrawable = this.J;
      if (localDrawable != null)
      {
        a(localDrawable, i1);
        return this.J;
      }
    }
    return this.K;
  }
  
  static boolean g(View paramView)
  {
    boolean bool;
    if ((y.j(paramView) != 4) && (y.j(paramView) != 2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private Drawable h()
  {
    int i1 = y.l(this);
    Drawable localDrawable;
    if (i1 == 0)
    {
      localDrawable = this.J;
      if (localDrawable != null)
      {
        a(localDrawable, i1);
        return this.J;
      }
    }
    else
    {
      localDrawable = this.I;
      if (localDrawable != null)
      {
        a(localDrawable, i1);
        return this.I;
      }
    }
    return this.L;
  }
  
  private void i()
  {
    if (d) {
      return;
    }
    this.C = g();
    this.D = h();
  }
  
  private static boolean m(View paramView)
  {
    paramView = paramView.getBackground();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramView != null)
    {
      bool2 = bool1;
      if (paramView.getOpacity() == -1) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  void a()
  {
    if (!this.w)
    {
      long l1 = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
      int i1 = getChildCount();
      for (int i2 = 0; i2 < i1; i2++) {
        getChildAt(i2).dispatchTouchEvent(localMotionEvent);
      }
      localMotionEvent.recycle();
      this.w = true;
    }
  }
  
  public void a(int paramInt)
  {
    a(paramInt, true);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = f.a(paramInt2, y.l(this));
    if (paramInt2 != 3)
    {
      if (paramInt2 != 5)
      {
        if (paramInt2 != 8388611)
        {
          if (paramInt2 == 8388613) {
            this.u = paramInt1;
          }
        }
        else {
          this.t = paramInt1;
        }
      }
      else {
        this.s = paramInt1;
      }
    }
    else {
      this.r = paramInt1;
    }
    Object localObject;
    if (paramInt1 != 0)
    {
      if (i1 == 3) {
        localObject = this.k;
      } else {
        localObject = this.l;
      }
      ((H)localObject).a();
    }
    if (paramInt1 != 1)
    {
      if (paramInt1 == 2)
      {
        localObject = b(i1);
        if (localObject != null) {
          l((View)localObject);
        }
      }
    }
    else
    {
      localObject = b(i1);
      if (localObject != null) {
        a((View)localObject);
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, View paramView)
  {
    int i1 = this.k.e();
    int i2 = this.l.e();
    int i3 = 2;
    if ((i1 != 1) && (i2 != 1))
    {
      paramInt1 = i3;
      if (i1 != 2) {
        if (i2 == 2) {
          paramInt1 = i3;
        } else {
          paramInt1 = 0;
        }
      }
    }
    else
    {
      paramInt1 = 1;
    }
    if ((paramView != null) && (paramInt2 == 0))
    {
      float f1 = ((d)paramView.getLayoutParams()).b;
      if (f1 == 0.0F) {
        b(paramView);
      } else if (f1 == 1.0F) {
        c(paramView);
      }
    }
    if (paramInt1 != this.o)
    {
      this.o = paramInt1;
      paramView = this.y;
      if (paramView != null) {
        for (paramInt2 = paramView.size() - 1; paramInt2 >= 0; paramInt2--) {
          ((c)this.y.get(paramInt2)).a(paramInt1);
        }
      }
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    Object localObject = b(paramInt);
    if (localObject != null)
    {
      a((View)localObject, paramBoolean);
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No drawer view found with gravity ");
    ((StringBuilder)localObject).append(e(paramInt));
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public void a(c paramc)
  {
    if (paramc == null) {
      return;
    }
    if (this.y == null) {
      this.y = new ArrayList();
    }
    this.y.add(paramc);
  }
  
  public void a(View paramView)
  {
    a(paramView, true);
  }
  
  void a(View paramView, float paramFloat)
  {
    List localList = this.y;
    if (localList != null) {
      for (int i1 = localList.size() - 1; i1 >= 0; i1--) {
        ((c)this.y.get(i1)).a(paramView, paramFloat);
      }
    }
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    if (j(paramView))
    {
      localObject = (d)paramView.getLayoutParams();
      if (this.q)
      {
        ((d)localObject).b = 0.0F;
        ((d)localObject).d = 0;
      }
      else if (paramBoolean)
      {
        ((d)localObject).d |= 0x4;
        if (a(paramView, 3)) {
          this.k.b(paramView, -paramView.getWidth(), paramView.getTop());
        } else {
          this.l.b(paramView, getWidth(), paramView.getTop());
        }
      }
      else
      {
        b(paramView, 0.0F);
        a(((d)localObject).a, 0, paramView);
        paramView.setVisibility(4);
      }
      invalidate();
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("View ");
    ((StringBuilder)localObject).append(paramView);
    ((StringBuilder)localObject).append(" is not a sliding drawer");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public void a(Object paramObject, boolean paramBoolean)
  {
    this.G = paramObject;
    this.H = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    setWillNotDraw(paramBoolean);
    requestLayout();
  }
  
  void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    int i4;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      View localView = getChildAt(i2);
      d locald = (d)localView.getLayoutParams();
      i4 = i3;
      if (j(localView)) {
        if ((paramBoolean) && (!locald.c))
        {
          i4 = i3;
        }
        else
        {
          i4 = localView.getWidth();
          boolean bool;
          if (a(localView, 3)) {
            bool = this.k.b(localView, -i4, localView.getTop());
          } else {
            bool = this.l.b(localView, getWidth(), localView.getTop());
          }
          i4 = i3 | bool;
          locald.c = false;
        }
      }
      i2++;
    }
    this.m.b();
    this.n.b();
    if (i3 != 0) {
      invalidate();
    }
  }
  
  boolean a(View paramView, int paramInt)
  {
    boolean bool;
    if ((e(paramView) & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    if (getDescendantFocusability() == 393216) {
      return;
    }
    int i1 = getChildCount();
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    View localView;
    while (i3 < i1)
    {
      localView = getChildAt(i3);
      if (j(localView))
      {
        if (i(localView))
        {
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          i4 = 1;
        }
      }
      else {
        this.M.add(localView);
      }
      i3++;
    }
    if (i4 == 0)
    {
      i4 = this.M.size();
      for (i3 = i2; i3 < i4; i3++)
      {
        localView = (View)this.M.get(i3);
        if (localView.getVisibility() == 0) {
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
    }
    this.M.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((c() == null) && (!j(paramView))) {
      y.d(paramView, 1);
    } else {
      y.d(paramView, 4);
    }
    if (!c) {
      y.a(paramView, this.e);
    }
  }
  
  View b(int paramInt)
  {
    int i1 = f.a(paramInt, y.l(this));
    int i2 = getChildCount();
    for (paramInt = 0; paramInt < i2; paramInt++)
    {
      View localView = getChildAt(paramInt);
      if ((e(localView) & 0x7) == (i1 & 0x7)) {
        return localView;
      }
    }
    return null;
  }
  
  public void b()
  {
    a(false);
  }
  
  public void b(c paramc)
  {
    if (paramc == null) {
      return;
    }
    List localList = this.y;
    if (localList == null) {
      return;
    }
    localList.remove(paramc);
  }
  
  void b(View paramView)
  {
    Object localObject = (d)paramView.getLayoutParams();
    if ((((d)localObject).d & 0x1) == 1)
    {
      ((d)localObject).d = 0;
      localObject = this.y;
      if (localObject != null) {
        for (int i1 = ((List)localObject).size() - 1; i1 >= 0; i1--) {
          ((c)this.y.get(i1)).b(paramView);
        }
      }
      c(paramView, false);
      if (hasWindowFocus())
      {
        paramView = getRootView();
        if (paramView != null) {
          paramView.sendAccessibilityEvent(32);
        }
      }
    }
  }
  
  void b(View paramView, float paramFloat)
  {
    float f1 = f(paramView);
    float f2 = paramView.getWidth();
    int i1 = (int)(f1 * f2);
    i1 = (int)(f2 * paramFloat) - i1;
    if (!a(paramView, 3)) {
      i1 = -i1;
    }
    paramView.offsetLeftAndRight(i1);
    c(paramView, paramFloat);
  }
  
  public void b(View paramView, boolean paramBoolean)
  {
    if (j(paramView))
    {
      localObject = (d)paramView.getLayoutParams();
      if (this.q)
      {
        ((d)localObject).b = 1.0F;
        ((d)localObject).d = 1;
        c(paramView, true);
      }
      else if (paramBoolean)
      {
        ((d)localObject).d |= 0x2;
        if (a(paramView, 3)) {
          this.k.b(paramView, 0, paramView.getTop());
        } else {
          this.l.b(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
        }
      }
      else
      {
        b(paramView, 1.0F);
        a(((d)localObject).a, 0, paramView);
        paramView.setVisibility(0);
      }
      invalidate();
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("View ");
    ((StringBuilder)localObject).append(paramView);
    ((StringBuilder)localObject).append(" is not a sliding drawer");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public int c(int paramInt)
  {
    int i1 = y.l(this);
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 8388611)
        {
          if (paramInt == 8388613)
          {
            paramInt = this.u;
            if (paramInt != 3) {
              return paramInt;
            }
            if (i1 == 0) {
              paramInt = this.s;
            } else {
              paramInt = this.r;
            }
            if (paramInt != 3) {
              return paramInt;
            }
          }
        }
        else
        {
          paramInt = this.t;
          if (paramInt != 3) {
            return paramInt;
          }
          if (i1 == 0) {
            paramInt = this.r;
          } else {
            paramInt = this.s;
          }
          if (paramInt != 3) {
            return paramInt;
          }
        }
      }
      else
      {
        paramInt = this.s;
        if (paramInt != 3) {
          return paramInt;
        }
        if (i1 == 0) {
          paramInt = this.u;
        } else {
          paramInt = this.t;
        }
        if (paramInt != 3) {
          return paramInt;
        }
      }
    }
    else
    {
      paramInt = this.r;
      if (paramInt != 3) {
        return paramInt;
      }
      if (i1 == 0) {
        paramInt = this.t;
      } else {
        paramInt = this.u;
      }
      if (paramInt != 3) {
        return paramInt;
      }
    }
    return 0;
  }
  
  View c()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if ((((d)localView.getLayoutParams()).d & 0x1) == 1) {
        return localView;
      }
    }
    return null;
  }
  
  void c(View paramView)
  {
    Object localObject = (d)paramView.getLayoutParams();
    if ((((d)localObject).d & 0x1) == 0)
    {
      ((d)localObject).d = 1;
      localObject = this.y;
      if (localObject != null) {
        for (int i1 = ((List)localObject).size() - 1; i1 >= 0; i1--) {
          ((c)this.y.get(i1)).a(paramView);
        }
      }
      c(paramView, true);
      if (hasWindowFocus()) {
        sendAccessibilityEvent(32);
      }
    }
  }
  
  void c(View paramView, float paramFloat)
  {
    d locald = (d)paramView.getLayoutParams();
    if (paramFloat == locald.b) {
      return;
    }
    locald.b = paramFloat;
    a(paramView, paramFloat);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof d)) && (super.checkLayoutParams(paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void computeScroll()
  {
    int i1 = getChildCount();
    float f1 = 0.0F;
    for (int i2 = 0; i2 < i1; i2++) {
      f1 = Math.max(f1, ((d)getChildAt(i2).getLayoutParams()).b);
    }
    this.i = f1;
    boolean bool1 = this.k.a(true);
    boolean bool2 = this.l.a(true);
    if ((bool1) || (bool2)) {
      y.E(this);
    }
  }
  
  public int d(View paramView)
  {
    if (j(paramView)) {
      return c(((d)paramView.getLayoutParams()).a);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  View d()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if ((j(localView)) && (k(localView))) {
        return localView;
      }
    }
    return null;
  }
  
  public CharSequence d(int paramInt)
  {
    paramInt = f.a(paramInt, y.l(this));
    if (paramInt == 3) {
      return this.E;
    }
    if (paramInt == 5) {
      return this.F;
    }
    return null;
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (((paramMotionEvent.getSource() & 0x2) != 0) && (paramMotionEvent.getAction() != 10) && (this.i > 0.0F))
    {
      int i1 = getChildCount();
      if (i1 != 0)
      {
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        i1--;
        while (i1 >= 0)
        {
          View localView = getChildAt(i1);
          if ((a(f1, f2, localView)) && (!h(localView)) && (a(paramMotionEvent, localView))) {
            return true;
          }
          i1--;
        }
      }
      return false;
    }
    return super.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = h(paramView);
    int i2 = getWidth();
    int i3 = paramCanvas.save();
    int i4 = 0;
    int i6;
    int i8;
    if (bool1)
    {
      int i5 = getChildCount();
      i6 = 0;
      i4 = 0;
      while (i6 < i5)
      {
        View localView = getChildAt(i6);
        int i7 = i4;
        i8 = i2;
        if (localView != paramView)
        {
          i7 = i4;
          i8 = i2;
          if (localView.getVisibility() == 0)
          {
            i7 = i4;
            i8 = i2;
            if (m(localView))
            {
              i7 = i4;
              i8 = i2;
              if (j(localView)) {
                if (localView.getHeight() < i1)
                {
                  i7 = i4;
                  i8 = i2;
                }
                else
                {
                  int i9;
                  if (a(localView, 3))
                  {
                    i9 = localView.getRight();
                    i7 = i4;
                    i8 = i2;
                    if (i9 > i4)
                    {
                      i7 = i9;
                      i8 = i2;
                    }
                  }
                  else
                  {
                    i9 = localView.getLeft();
                    i7 = i4;
                    i8 = i2;
                    if (i9 < i2)
                    {
                      i8 = i9;
                      i7 = i4;
                    }
                  }
                }
              }
            }
          }
        }
        i6++;
        i4 = i7;
        i2 = i8;
      }
      paramCanvas.clipRect(i4, 0, i2, getHeight());
    }
    boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(i3);
    float f1 = this.i;
    if ((f1 > 0.0F) && (bool1))
    {
      i8 = this.h;
      i6 = (int)(((0xFF000000 & i8) >>> 24) * f1);
      this.j.setColor(i8 & 0xFFFFFF | i6 << 24);
      paramCanvas.drawRect(i4, 0.0F, i2, getHeight(), this.j);
    }
    else if ((this.C != null) && (a(paramView, 3)))
    {
      i4 = this.C.getIntrinsicWidth();
      i6 = paramView.getRight();
      i2 = this.k.c();
      f1 = Math.max(0.0F, Math.min(i6 / i2, 1.0F));
      this.C.setBounds(i6, paramView.getTop(), i4 + i6, paramView.getBottom());
      this.C.setAlpha((int)(f1 * 255.0F));
      this.C.draw(paramCanvas);
    }
    else if ((this.D != null) && (a(paramView, 5)))
    {
      i6 = this.D.getIntrinsicWidth();
      i2 = paramView.getLeft();
      i8 = getWidth();
      i4 = this.l.c();
      f1 = Math.max(0.0F, Math.min((i8 - i2) / i4, 1.0F));
      this.D.setBounds(i2 - i6, paramView.getTop(), i2, paramView.getBottom());
      this.D.setAlpha((int)(f1 * 255.0F));
      this.D.draw(paramCanvas);
    }
    return bool2;
  }
  
  int e(View paramView)
  {
    return f.a(((d)paramView.getLayoutParams()).a, y.l(this));
  }
  
  float f(View paramView)
  {
    return ((d)paramView.getLayoutParams()).b;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new d(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new d(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof d)) {
      paramLayoutParams = new d((d)paramLayoutParams);
    } else if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      paramLayoutParams = new d((ViewGroup.MarginLayoutParams)paramLayoutParams);
    } else {
      paramLayoutParams = new d(paramLayoutParams);
    }
    return paramLayoutParams;
  }
  
  public float getDrawerElevation()
  {
    if (d) {
      return this.f;
    }
    return 0.0F;
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.B;
  }
  
  boolean h(View paramView)
  {
    boolean bool;
    if (((d)paramView.getLayoutParams()).a == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i(View paramView)
  {
    if (j(paramView))
    {
      int i1 = ((d)paramView.getLayoutParams()).d;
      boolean bool = true;
      if ((i1 & 0x1) != 1) {
        bool = false;
      }
      return bool;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  boolean j(View paramView)
  {
    int i1 = f.a(((d)paramView.getLayoutParams()).a, y.l(paramView));
    if ((i1 & 0x3) != 0) {
      return true;
    }
    return (i1 & 0x5) != 0;
  }
  
  public boolean k(View paramView)
  {
    if (j(paramView))
    {
      boolean bool;
      if (((d)paramView.getLayoutParams()).b > 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void l(View paramView)
  {
    b(paramView, true);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.q = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.q = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.H) && (this.B != null))
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        Object localObject = this.G;
        if (localObject != null)
        {
          i1 = ((WindowInsets)localObject).getSystemWindowInsetTop();
          break label49;
        }
      }
      int i1 = 0;
      label49:
      if (i1 > 0)
      {
        this.B.setBounds(0, 0, getWidth(), i1);
        this.B.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    boolean bool1 = this.k.b(paramMotionEvent);
    boolean bool2 = this.l.b(paramMotionEvent);
    boolean bool3 = true;
    if (i1 != 0)
    {
      if (i1 != 1) {
        if (i1 != 2)
        {
          if (i1 != 3) {
            break label92;
          }
        }
        else
        {
          if (!this.k.a(3)) {
            break label92;
          }
          this.m.b();
          this.n.b();
          break label92;
        }
      }
      a(true);
      this.v = false;
      this.w = false;
      label92:
      i1 = 0;
    }
    else
    {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.z = f1;
      this.A = f2;
      if (this.i > 0.0F)
      {
        paramMotionEvent = this.k.b((int)f1, (int)f2);
        if ((paramMotionEvent != null) && (h(paramMotionEvent)))
        {
          i1 = 1;
          break label163;
        }
      }
      i1 = 0;
      label163:
      this.v = false;
      this.w = false;
    }
    boolean bool4 = bool3;
    if (!(bool1 | bool2))
    {
      bool4 = bool3;
      if (i1 == 0)
      {
        bool4 = bool3;
        if (!e()) {
          if (this.w) {
            bool4 = bool3;
          } else {
            bool4 = false;
          }
        }
      }
    }
    return bool4;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (f()))
    {
      paramKeyEvent.startTracking();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = d();
      if ((paramKeyEvent != null) && (d(paramKeyEvent) == 0)) {
        b();
      }
      boolean bool;
      if (paramKeyEvent != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.p = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    for (paramInt3 = 0; paramInt3 < i2; paramInt3++)
    {
      View localView = getChildAt(paramInt3);
      if (localView.getVisibility() != 8)
      {
        d locald = (d)localView.getLayoutParams();
        if (h(localView))
        {
          paramInt1 = locald.leftMargin;
          localView.layout(paramInt1, locald.topMargin, localView.getMeasuredWidth() + paramInt1, locald.topMargin + localView.getMeasuredHeight());
        }
        else
        {
          int i3 = localView.getMeasuredWidth();
          int i4 = localView.getMeasuredHeight();
          float f1;
          int i5;
          if (a(localView, 3))
          {
            paramInt1 = -i3;
            f1 = i3;
            i5 = paramInt1 + (int)(locald.b * f1);
            f1 = (i3 + i5) / f1;
          }
          else
          {
            f1 = i3;
            i5 = i1 - (int)(locald.b * f1);
            f1 = (i1 - i5) / f1;
          }
          int i6;
          if (f1 != locald.b) {
            i6 = 1;
          } else {
            i6 = 0;
          }
          paramInt1 = locald.a & 0x70;
          if (paramInt1 != 16)
          {
            if (paramInt1 != 80)
            {
              paramInt1 = locald.topMargin;
              localView.layout(i5, paramInt1, i3 + i5, i4 + paramInt1);
            }
            else
            {
              paramInt1 = paramInt4 - paramInt2;
              localView.layout(i5, paramInt1 - locald.bottomMargin - localView.getMeasuredHeight(), i3 + i5, paramInt1 - locald.bottomMargin);
            }
          }
          else
          {
            int i7 = paramInt4 - paramInt2;
            int i8 = (i7 - i4) / 2;
            paramInt1 = locald.topMargin;
            if (i8 >= paramInt1)
            {
              int i9 = locald.bottomMargin;
              paramInt1 = i8;
              if (i8 + i4 > i7 - i9) {
                paramInt1 = i7 - i9 - i4;
              }
            }
            localView.layout(i5, paramInt1, i3 + i5, i4 + paramInt1);
          }
          if (i6 != 0) {
            c(localView, f1);
          }
          if (locald.b > 0.0F) {
            paramInt1 = 0;
          } else {
            paramInt1 = 4;
          }
          if (localView.getVisibility() != paramInt1) {
            localView.setVisibility(paramInt1);
          }
        }
      }
    }
    this.p = false;
    this.q = false;
  }
  
  @SuppressLint({"WrongConstant"})
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5;
    int i6;
    if (i1 == 1073741824)
    {
      i5 = i3;
      i6 = i4;
      if (i2 == 1073741824) {}
    }
    else
    {
      if (!isInEditMode()) {
        break label811;
      }
      if ((i1 != Integer.MIN_VALUE) && (i1 == 0)) {
        i3 = 300;
      }
      if (i2 == Integer.MIN_VALUE)
      {
        i5 = i3;
        i6 = i4;
      }
      else
      {
        i5 = i3;
        i6 = i4;
        if (i2 == 0)
        {
          i6 = 300;
          i5 = i3;
        }
      }
    }
    setMeasuredDimension(i5, i6);
    if ((this.G != null) && (y.i(this))) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i7 = y.l(this);
    int i8 = getChildCount();
    i1 = 0;
    i4 = 0;
    i3 = 0;
    while (i1 < i8)
    {
      View localView = getChildAt(i1);
      d locald;
      int i9;
      Object localObject;
      if (localView.getVisibility() != 8)
      {
        locald = (d)localView.getLayoutParams();
        if (i2 != 0)
        {
          i9 = f.a(locald.a, i7);
          WindowInsets localWindowInsets;
          if (y.i(localView))
          {
            if (Build.VERSION.SDK_INT >= 21)
            {
              localWindowInsets = (WindowInsets)this.G;
              if (i9 == 3)
              {
                localObject = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
              }
              else
              {
                localObject = localWindowInsets;
                if (i9 == 5) {
                  localObject = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
                }
              }
              localView.dispatchApplyWindowInsets((WindowInsets)localObject);
            }
          }
          else if (Build.VERSION.SDK_INT >= 21)
          {
            localWindowInsets = (WindowInsets)this.G;
            if (i9 == 3)
            {
              localObject = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
            }
            else
            {
              localObject = localWindowInsets;
              if (i9 == 5) {
                localObject = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
              }
            }
            locald.leftMargin = ((WindowInsets)localObject).getSystemWindowInsetLeft();
            locald.topMargin = ((WindowInsets)localObject).getSystemWindowInsetTop();
            locald.rightMargin = ((WindowInsets)localObject).getSystemWindowInsetRight();
            locald.bottomMargin = ((WindowInsets)localObject).getSystemWindowInsetBottom();
          }
        }
        if (h(localView)) {
          localView.measure(View.MeasureSpec.makeMeasureSpec(i5 - locald.leftMargin - locald.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i6 - locald.topMargin - locald.bottomMargin, 1073741824));
        }
      }
      else
      {
        break label731;
      }
      if (j(localView))
      {
        if (d)
        {
          float f1 = y.h(localView);
          float f2 = this.f;
          if (f1 != f2) {
            y.b(localView, f2);
          }
        }
        int i10 = e(localView) & 0x7;
        if (i10 == 3) {
          i9 = 1;
        } else {
          i9 = 0;
        }
        if (((i9 != 0) && (i4 != 0)) || ((i9 == 0) && (i3 != 0)))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Child drawer has absolute gravity ");
          ((StringBuilder)localObject).append(e(i10));
          ((StringBuilder)localObject).append(" but this ");
          ((StringBuilder)localObject).append("DrawerLayout");
          ((StringBuilder)localObject).append(" already has a ");
          ((StringBuilder)localObject).append("drawer view along that edge");
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
        if (i9 != 0) {
          i4 = 1;
        } else {
          i3 = 1;
        }
        localView.measure(ViewGroup.getChildMeasureSpec(paramInt1, this.g + locald.leftMargin + locald.rightMargin, locald.width), ViewGroup.getChildMeasureSpec(paramInt2, locald.topMargin + locald.bottomMargin, locald.height));
        label731:
        i1++;
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Child ");
        ((StringBuilder)localObject).append(localView);
        ((StringBuilder)localObject).append(" at index ");
        ((StringBuilder)localObject).append(i1);
        ((StringBuilder)localObject).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
        ((StringBuilder)localObject).append("Gravity.RIGHT or Gravity.NO_GRAVITY");
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
    }
    return;
    label811:
    throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof e))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (e)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.l());
    int i1 = paramParcelable.c;
    if (i1 != 0)
    {
      View localView = b(i1);
      if (localView != null) {
        l(localView);
      }
    }
    i1 = paramParcelable.d;
    if (i1 != 3) {
      a(i1, 3);
    }
    i1 = paramParcelable.e;
    if (i1 != 3) {
      a(i1, 5);
    }
    i1 = paramParcelable.f;
    if (i1 != 3) {
      a(i1, 8388611);
    }
    i1 = paramParcelable.g;
    if (i1 != 3) {
      a(i1, 8388613);
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    i();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    e locale = new e(super.onSaveInstanceState());
    int i1 = getChildCount();
    int i2 = 0;
    while (i2 < i1)
    {
      d locald = (d)getChildAt(i2).getLayoutParams();
      int i3 = locald.d;
      int i4 = 1;
      if (i3 == 1) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if (locald.d != 2) {
        i4 = 0;
      }
      if ((i3 == 0) && (i4 == 0)) {
        i2++;
      } else {
        locale.c = locald.a;
      }
    }
    locale.d = this.r;
    locale.e = this.s;
    locale.f = this.t;
    locale.g = this.u;
    return locale;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.k.a(paramMotionEvent);
    this.l.a(paramMotionEvent);
    int i1 = paramMotionEvent.getAction() & 0xFF;
    float f1;
    float f2;
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 == 3)
        {
          a(true);
          this.v = false;
          this.w = false;
        }
      }
      else
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        paramMotionEvent = this.k.b((int)f1, (int)f2);
        if ((paramMotionEvent != null) && (h(paramMotionEvent)))
        {
          f1 -= this.z;
          f2 -= this.A;
          i1 = this.k.d();
          if (f1 * f1 + f2 * f2 < i1 * i1)
          {
            paramMotionEvent = c();
            if ((paramMotionEvent != null) && (d(paramMotionEvent) != 2))
            {
              bool = false;
              break label167;
            }
          }
        }
        boolean bool = true;
        label167:
        a(bool);
        this.v = false;
      }
    }
    else
    {
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      this.z = f2;
      this.A = f1;
      this.v = false;
      this.w = false;
    }
    return true;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.v = paramBoolean;
    if (paramBoolean) {
      a(true);
    }
  }
  
  public void requestLayout()
  {
    if (!this.p) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    this.f = paramFloat;
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (j(localView)) {
        y.b(localView, this.f);
      }
    }
  }
  
  @Deprecated
  public void setDrawerListener(c paramc)
  {
    c localc = this.x;
    if (localc != null) {
      b(localc);
    }
    if (paramc != null) {
      a(paramc);
    }
    this.x = paramc;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt)
  {
    this.h = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = android.support.v4.content.c.c(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    this.B = localDrawable;
    invalidate();
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.B = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    this.B = new ColorDrawable(paramInt);
    invalidate();
  }
  
  class a
    extends d
  {
    private final Rect c = new Rect();
    
    a() {}
    
    private void a(zd paramzd, ViewGroup paramViewGroup)
    {
      int i = paramViewGroup.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = paramViewGroup.getChildAt(j);
        if (DrawerLayout.g(localView)) {
          paramzd.a(localView);
        }
      }
    }
    
    private void a(zd paramzd1, zd paramzd2)
    {
      Rect localRect = this.c;
      paramzd2.a(localRect);
      paramzd1.c(localRect);
      paramzd2.b(localRect);
      paramzd1.d(localRect);
      paramzd1.n(paramzd2.s());
      paramzd1.e(paramzd2.e());
      paramzd1.a(paramzd2.b());
      paramzd1.b(paramzd2.c());
      paramzd1.g(paramzd2.l());
      paramzd1.d(paramzd2.k());
      paramzd1.h(paramzd2.m());
      paramzd1.i(paramzd2.n());
      paramzd1.a(paramzd2.h());
      paramzd1.l(paramzd2.r());
      paramzd1.j(paramzd2.o());
      paramzd1.a(paramzd2.a());
    }
    
    public void a(View paramView, zd paramzd)
    {
      if (DrawerLayout.c)
      {
        super.a(paramView, paramzd);
      }
      else
      {
        zd localzd = zd.a(paramzd);
        super.a(paramView, localzd);
        paramzd.c(paramView);
        ViewParent localViewParent = y.q(paramView);
        if ((localViewParent instanceof View)) {
          paramzd.b((View)localViewParent);
        }
        a(paramzd, localzd);
        localzd.t();
        a(paramzd, (ViewGroup)paramView);
      }
      paramzd.a(DrawerLayout.class.getName());
      paramzd.h(false);
      paramzd.i(false);
      paramzd.a(zd.a.a);
      paramzd.a(zd.a.b);
    }
    
    public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramView = paramAccessibilityEvent.getText();
        paramAccessibilityEvent = DrawerLayout.this.d();
        if (paramAccessibilityEvent != null)
        {
          int i = DrawerLayout.this.e(paramAccessibilityEvent);
          paramAccessibilityEvent = DrawerLayout.this.d(i);
          if (paramAccessibilityEvent != null) {
            paramView.add(paramAccessibilityEvent);
          }
        }
        return true;
      }
      return super.a(paramView, paramAccessibilityEvent);
    }
    
    public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if ((!DrawerLayout.c) && (!DrawerLayout.g(paramView))) {
        return false;
      }
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    
    public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.b(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
    }
  }
  
  static final class b
    extends d
  {
    public void a(View paramView, zd paramzd)
    {
      super.a(paramView, paramzd);
      if (!DrawerLayout.g(paramView)) {
        paramzd.b(null);
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt);
    
    public abstract void a(View paramView);
    
    public abstract void a(View paramView, float paramFloat);
    
    public abstract void b(View paramView);
  }
  
  public static class d
    extends ViewGroup.MarginLayoutParams
  {
    public int a = 0;
    float b;
    boolean c;
    int d;
    
    public d(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public d(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.b);
      this.a = paramContext.getInt(0, 0);
      paramContext.recycle();
    }
    
    public d(d paramd)
    {
      super();
      this.a = paramd.a;
    }
    
    public d(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public d(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  protected static class e
    extends android.support.v4.view.c
  {
    public static final Parcelable.Creator<e> CREATOR = new l();
    int c = 0;
    int d;
    int e;
    int f;
    int g;
    
    public e(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.c = paramParcel.readInt();
      this.d = paramParcel.readInt();
      this.e = paramParcel.readInt();
      this.f = paramParcel.readInt();
      this.g = paramParcel.readInt();
    }
    
    public e(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.c);
      paramParcel.writeInt(this.d);
      paramParcel.writeInt(this.e);
      paramParcel.writeInt(this.f);
      paramParcel.writeInt(this.g);
    }
  }
  
  private class f
    extends H.a
  {
    private final int a;
    private H b;
    private final Runnable c = new m(this);
    
    f(int paramInt)
    {
      this.a = paramInt;
    }
    
    private void c()
    {
      int i = this.a;
      int j = 3;
      if (i == 3) {
        j = 5;
      }
      View localView = DrawerLayout.this.b(j);
      if (localView != null) {
        DrawerLayout.this.a(localView);
      }
    }
    
    public int a(View paramView)
    {
      int i;
      if (DrawerLayout.this.j(paramView)) {
        i = paramView.getWidth();
      } else {
        i = 0;
      }
      return i;
    }
    
    public int a(View paramView, int paramInt1, int paramInt2)
    {
      if (DrawerLayout.this.a(paramView, 3)) {
        return Math.max(-paramView.getWidth(), Math.min(paramInt1, 0));
      }
      paramInt2 = DrawerLayout.this.getWidth();
      return Math.max(paramInt2 - paramView.getWidth(), Math.min(paramInt1, paramInt2));
    }
    
    void a()
    {
      int i = this.b.c();
      int j = this.a;
      int k = 0;
      if (j == 3) {
        j = 1;
      } else {
        j = 0;
      }
      View localView;
      if (j != 0)
      {
        localView = DrawerLayout.this.b(3);
        if (localView != null) {
          k = -localView.getWidth();
        }
        k += i;
      }
      else
      {
        localView = DrawerLayout.this.b(5);
        k = DrawerLayout.this.getWidth() - i;
      }
      if ((localView != null) && (((j != 0) && (localView.getLeft() < k)) || ((j == 0) && (localView.getLeft() > k) && (DrawerLayout.this.d(localView) == 0))))
      {
        DrawerLayout.d locald = (DrawerLayout.d)localView.getLayoutParams();
        this.b.b(localView, k, localView.getTop());
        locald.c = true;
        DrawerLayout.this.invalidate();
        c();
        DrawerLayout.this.a();
      }
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      View localView;
      if ((paramInt1 & 0x1) == 1) {
        localView = DrawerLayout.this.b(3);
      } else {
        localView = DrawerLayout.this.b(5);
      }
      if ((localView != null) && (DrawerLayout.this.d(localView) == 0)) {
        this.b.a(localView, paramInt2);
      }
    }
    
    public void a(H paramH)
    {
      this.b = paramH;
    }
    
    public void a(View paramView, float paramFloat1, float paramFloat2)
    {
      paramFloat2 = DrawerLayout.this.f(paramView);
      int i = paramView.getWidth();
      int j;
      if (DrawerLayout.this.a(paramView, 3))
      {
        boolean bool = paramFloat1 < 0.0F;
        if ((!bool) && ((bool) || (paramFloat2 <= 0.5F))) {
          j = -i;
        } else {
          j = 0;
        }
      }
      else
      {
        int k = DrawerLayout.this.getWidth();
        if (paramFloat1 >= 0.0F)
        {
          j = k;
          if (paramFloat1 == 0.0F)
          {
            j = k;
            if (paramFloat2 <= 0.5F) {}
          }
        }
        else
        {
          j = k - i;
        }
      }
      this.b.d(j, paramView.getTop());
      DrawerLayout.this.invalidate();
    }
    
    public void a(View paramView, int paramInt)
    {
      ((DrawerLayout.d)paramView.getLayoutParams()).c = false;
      c();
    }
    
    public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramInt2 = paramView.getWidth();
      float f;
      if (DrawerLayout.this.a(paramView, 3)) {
        f = paramInt1 + paramInt2;
      } else {
        f = DrawerLayout.this.getWidth() - paramInt1;
      }
      f /= paramInt2;
      DrawerLayout.this.c(paramView, f);
      if (f == 0.0F) {
        paramInt1 = 4;
      } else {
        paramInt1 = 0;
      }
      paramView.setVisibility(paramInt1);
      DrawerLayout.this.invalidate();
    }
    
    public int b(View paramView, int paramInt1, int paramInt2)
    {
      return paramView.getTop();
    }
    
    public void b()
    {
      DrawerLayout.this.removeCallbacks(this.c);
    }
    
    public void b(int paramInt1, int paramInt2)
    {
      DrawerLayout.this.postDelayed(this.c, 160L);
    }
    
    public boolean b(int paramInt)
    {
      return false;
    }
    
    public boolean b(View paramView, int paramInt)
    {
      boolean bool;
      if ((DrawerLayout.this.j(paramView)) && (DrawerLayout.this.a(paramView, this.a)) && (DrawerLayout.this.d(paramView) == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void c(int paramInt)
    {
      DrawerLayout.this.a(this.a, paramInt, this.b.b());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/DrawerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */