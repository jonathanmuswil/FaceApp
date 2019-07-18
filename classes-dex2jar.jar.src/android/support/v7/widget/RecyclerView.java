package android.support.v7.widget;

import Pc;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.c;
import android.support.v4.view.k;
import android.support.v4.view.l;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import be;
import ce;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import td;
import xd;
import zd;
import zd.b;
import zd.c;

public class RecyclerView
  extends ViewGroup
  implements u, l
{
  private static final int[] a = { 16843830 };
  private static final int[] b = { 16842987 };
  static final boolean c;
  static final boolean d;
  static final boolean e;
  static final boolean f;
  private static final boolean g;
  private static final boolean h;
  private static final Class<?>[] i;
  static final Interpolator j = new Ea();
  private m A;
  private final int[] Aa;
  boolean B;
  private android.support.v4.view.n Ba;
  boolean C;
  private final int[] Ca;
  boolean D;
  final int[] Da;
  boolean E;
  private final int[] Ea;
  private int F = 0;
  final int[] Fa;
  boolean G;
  final List<x> Ga;
  boolean H;
  private Runnable Ha;
  private boolean I;
  private final Eb.b Ia;
  private int J;
  boolean K;
  private final AccessibilityManager L;
  private List<k> M;
  boolean N = false;
  boolean O = false;
  private int P = 0;
  private int Q = 0;
  private e R = new e();
  private EdgeEffect S;
  private EdgeEffect T;
  private EdgeEffect U;
  private EdgeEffect V;
  f W = new ea();
  private int aa = 0;
  private int ba = -1;
  private VelocityTracker ca;
  private int da;
  private int ea;
  private int fa;
  private int ga;
  private int ha;
  private l ia;
  private final int ja;
  private final r k = new r();
  private final int ka;
  final p l = new p();
  private float la = Float.MIN_VALUE;
  private s m;
  private float ma = Float.MIN_VALUE;
  i n;
  private boolean na;
  T o;
  final w oa;
  final Eb p = new Eb();
  na pa;
  boolean q;
  na.a qa;
  final Runnable r = new Ca(this);
  final u ra;
  final Rect s = new Rect();
  private n sa;
  private final Rect t = new Rect();
  private List<n> ta;
  final RectF u = new RectF();
  boolean ua;
  a v;
  boolean va;
  i w;
  private RecyclerView.f.b wa;
  q x;
  boolean xa;
  final ArrayList<h> y = new ArrayList();
  La ya;
  private final ArrayList<m> z = new ArrayList();
  private d za;
  
  static
  {
    int i1 = Build.VERSION.SDK_INT;
    boolean bool;
    if ((i1 != 18) && (i1 != 19) && (i1 != 20)) {
      bool = false;
    } else {
      bool = true;
    }
    c = bool;
    if (Build.VERSION.SDK_INT >= 23) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
    if (Build.VERSION.SDK_INT >= 16) {
      bool = true;
    } else {
      bool = false;
    }
    e = bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    f = bool;
    if (Build.VERSION.SDK_INT <= 15) {
      bool = true;
    } else {
      bool = false;
    }
    g = bool;
    if (Build.VERSION.SDK_INT <= 15) {
      bool = true;
    } else {
      bool = false;
    }
    h = bool;
    Class localClass = Integer.TYPE;
    i = new Class[] { Context.class, AttributeSet.class, localClass, localClass };
  }
  
  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    boolean bool1 = true;
    this.na = true;
    this.oa = new w();
    if (f) {
      localObject = new na.a();
    } else {
      localObject = null;
    }
    this.qa = ((na.a)localObject);
    this.ra = new u();
    this.ua = false;
    this.va = false;
    this.wa = new g();
    this.xa = false;
    this.Aa = new int[2];
    this.Ca = new int[2];
    this.Da = new int[2];
    this.Ea = new int[2];
    this.Fa = new int[2];
    this.Ga = new ArrayList();
    this.Ha = new Da(this);
    this.Ia = new Fa(this);
    if (paramAttributeSet != null)
    {
      localObject = paramContext.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
      this.q = ((TypedArray)localObject).getBoolean(0, true);
      ((TypedArray)localObject).recycle();
    }
    else
    {
      this.q = true;
    }
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    Object localObject = ViewConfiguration.get(paramContext);
    this.ha = ((ViewConfiguration)localObject).getScaledTouchSlop();
    this.la = z.a((ViewConfiguration)localObject, paramContext);
    this.ma = z.b((ViewConfiguration)localObject, paramContext);
    this.ja = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
    this.ka = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
    boolean bool2;
    if (getOverScrollMode() == 2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    setWillNotDraw(bool2);
    this.W.a(this.wa);
    l();
    H();
    G();
    if (y.j(this) == 0) {
      y.d(this, 1);
    }
    this.L = ((AccessibilityManager)getContext().getSystemService("accessibility"));
    setAccessibilityDelegateCompat(new La(this));
    if (paramAttributeSet != null)
    {
      localObject = paramContext.obtainStyledAttributes(paramAttributeSet, ce.RecyclerView, paramInt, 0);
      String str = ((TypedArray)localObject).getString(ce.RecyclerView_layoutManager);
      if (((TypedArray)localObject).getInt(ce.RecyclerView_android_descendantFocusability, -1) == -1) {
        setDescendantFocusability(262144);
      }
      this.D = ((TypedArray)localObject).getBoolean(ce.RecyclerView_fastScrollEnabled, false);
      if (this.D) {
        a((StateListDrawable)((TypedArray)localObject).getDrawable(ce.RecyclerView_fastScrollVerticalThumbDrawable), ((TypedArray)localObject).getDrawable(ce.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable)((TypedArray)localObject).getDrawable(ce.RecyclerView_fastScrollHorizontalThumbDrawable), ((TypedArray)localObject).getDrawable(ce.RecyclerView_fastScrollHorizontalTrackDrawable));
      }
      ((TypedArray)localObject).recycle();
      a(paramContext, str, paramAttributeSet, paramInt, 0);
      bool2 = bool1;
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a, paramInt, 0);
        bool2 = paramContext.getBoolean(0, true);
        paramContext.recycle();
      }
    }
    else
    {
      setDescendantFocusability(262144);
      bool2 = bool1;
    }
    setNestedScrollingEnabled(bool2);
  }
  
  private void A()
  {
    int i1 = this.J;
    this.J = 0;
    if ((i1 != 0) && (n()))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
      localAccessibilityEvent.setEventType(2048);
      xd.a(localAccessibilityEvent, i1);
      sendAccessibilityEventUnchecked(localAccessibilityEvent);
    }
  }
  
  private void B()
  {
    Object localObject = this.ra;
    boolean bool = true;
    ((u)localObject).a(1);
    a(this.ra);
    this.ra.j = false;
    x();
    this.p.a();
    r();
    J();
    O();
    localObject = this.ra;
    if ((!((u)localObject).k) || (!this.va)) {
      bool = false;
    }
    ((u)localObject).i = bool;
    this.va = false;
    this.ua = false;
    localObject = this.ra;
    ((u)localObject).h = ((u)localObject).l;
    ((u)localObject).f = this.v.a();
    a(this.Aa);
    int i1;
    int i2;
    x localx;
    if (this.ra.k)
    {
      i1 = this.o.a();
      for (i2 = 0; i2 < i1; i2++)
      {
        localx = i(this.o.c(i2));
        if ((!localx.x()) && ((!localx.n()) || (this.v.c())))
        {
          localObject = this.W.a(this.ra, localx, f.a(localx), localx.k());
          this.p.c(localx, (RecyclerView.f.c)localObject);
          if ((this.ra.i) && (localx.s()) && (!localx.p()) && (!localx.x()) && (!localx.n()))
          {
            long l1 = d(localx);
            this.p.a(l1, localx);
          }
        }
      }
    }
    if (this.ra.l)
    {
      w();
      localObject = this.ra;
      bool = ((u)localObject).g;
      ((u)localObject).g = false;
      this.w.e(this.l, (u)localObject);
      this.ra.g = bool;
      for (i2 = 0; i2 < this.o.a(); i2++)
      {
        localx = i(this.o.c(i2));
        if ((!localx.x()) && (!this.p.c(localx)))
        {
          int i3 = f.a(localx);
          bool = localx.b(8192);
          i1 = i3;
          if (!bool) {
            i1 = i3 | 0x1000;
          }
          localObject = this.W.a(this.ra, localx, i1, localx.k());
          if (bool) {
            a(localx, (RecyclerView.f.c)localObject);
          } else {
            this.p.a(localx, (RecyclerView.f.c)localObject);
          }
        }
      }
      a();
    }
    else
    {
      a();
    }
    s();
    c(false);
    this.ra.e = 2;
  }
  
  private void C()
  {
    x();
    r();
    this.ra.a(6);
    this.n.b();
    this.ra.f = this.v.a();
    u localu = this.ra;
    localu.d = 0;
    localu.h = false;
    this.w.e(this.l, localu);
    localu = this.ra;
    localu.g = false;
    this.m = null;
    boolean bool;
    if ((localu.k) && (this.W != null)) {
      bool = true;
    } else {
      bool = false;
    }
    localu.k = bool;
    this.ra.e = 4;
    s();
    c(false);
  }
  
  private void D()
  {
    this.ra.a(4);
    x();
    r();
    Object localObject = this.ra;
    ((u)localObject).e = 1;
    if (((u)localObject).k)
    {
      for (int i1 = this.o.a() - 1; i1 >= 0; i1--)
      {
        localObject = i(this.o.c(i1));
        if (!((x)localObject).x())
        {
          long l1 = d((x)localObject);
          RecyclerView.f.c localc1 = this.W.a(this.ra, (x)localObject);
          x localx = this.p.a(l1);
          if ((localx != null) && (!localx.x()))
          {
            boolean bool1 = this.p.b(localx);
            boolean bool2 = this.p.b((x)localObject);
            if ((bool1) && (localx == localObject))
            {
              this.p.b((x)localObject, localc1);
            }
            else
            {
              RecyclerView.f.c localc2 = this.p.f(localx);
              this.p.b((x)localObject, localc1);
              localc1 = this.p.e((x)localObject);
              if (localc2 == null) {
                a(l1, (x)localObject, localx);
              } else {
                a(localx, (x)localObject, localc2, localc1, bool1, bool2);
              }
            }
          }
          else
          {
            this.p.b((x)localObject, localc1);
          }
        }
      }
      this.p.a(this.Ia);
    }
    this.w.c(this.l);
    localObject = this.ra;
    ((u)localObject).c = ((u)localObject).f;
    this.N = false;
    this.O = false;
    ((u)localObject).k = false;
    ((u)localObject).l = false;
    this.w.h = false;
    localObject = this.l.b;
    if (localObject != null) {
      ((ArrayList)localObject).clear();
    }
    localObject = this.w;
    if (((i)localObject).n)
    {
      ((i)localObject).m = 0;
      ((i)localObject).n = false;
      this.l.j();
    }
    this.w.g(this.ra);
    s();
    c(false);
    this.p.a();
    localObject = this.Aa;
    if (k(localObject[0], localObject[1])) {
      d(0, 0);
    }
    K();
    M();
  }
  
  private View E()
  {
    int i1 = this.ra.m;
    if (i1 == -1) {
      i1 = 0;
    }
    int i2 = this.ra.a();
    x localx;
    for (int i3 = i1; i3 < i2; i3++)
    {
      localx = c(i3);
      if (localx == null) {
        break;
      }
      if (localx.b.hasFocusable()) {
        return localx.b;
      }
    }
    for (i1 = Math.min(i2, i1) - 1; i1 >= 0; i1--)
    {
      localx = c(i1);
      if (localx == null) {
        return null;
      }
      if (localx.b.hasFocusable()) {
        return localx.b;
      }
    }
    return null;
  }
  
  private boolean F()
  {
    int i1 = this.o.a();
    for (int i2 = 0; i2 < i1; i2++)
    {
      x localx = i(this.o.c(i2));
      if ((localx != null) && (!localx.x()) && (localx.s())) {
        return true;
      }
    }
    return false;
  }
  
  @SuppressLint({"InlinedApi"})
  private void G()
  {
    if (y.k(this) == 0) {
      y.e(this, 8);
    }
  }
  
  private void H()
  {
    this.o = new T(new Ga(this));
  }
  
  private boolean I()
  {
    boolean bool;
    if ((this.W != null) && (this.w.C())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void J()
  {
    if (this.N)
    {
      this.n.f();
      if (this.O) {
        this.w.d(this);
      }
    }
    if (I()) {
      this.n.e();
    } else {
      this.n.b();
    }
    boolean bool1 = this.ua;
    boolean bool2 = false;
    int i1;
    if ((!bool1) && (!this.va)) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    u localu = this.ra;
    if ((this.E) && (this.W != null) && ((this.N) || (i1 != 0) || (this.w.h)) && ((!this.N) || (this.v.c()))) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    localu.k = bool1;
    localu = this.ra;
    bool1 = bool2;
    if (localu.k)
    {
      bool1 = bool2;
      if (i1 != 0)
      {
        bool1 = bool2;
        if (!this.N)
        {
          bool1 = bool2;
          if (I()) {
            bool1 = true;
          }
        }
      }
    }
    localu.l = bool1;
  }
  
  private void K()
  {
    if ((this.na) && (this.v != null) && (hasFocus()) && (getDescendantFocusability() != 393216) && ((getDescendantFocusability() != 131072) || (!isFocused())))
    {
      Object localObject;
      if (!isFocused())
      {
        localObject = getFocusedChild();
        if ((h) && ((((View)localObject).getParent() == null) || (!((View)localObject).hasFocus())))
        {
          if (this.o.a() == 0) {
            requestFocus();
          }
        }
        else if (!this.o.c((View)localObject)) {
          return;
        }
      }
      long l1 = this.ra.n;
      View localView = null;
      if ((l1 != -1L) && (this.v.c())) {
        localObject = a(this.ra.n);
      } else {
        localObject = null;
      }
      if ((localObject != null) && (!this.o.c(((x)localObject).b)) && (((x)localObject).b.hasFocusable()))
      {
        localObject = ((x)localObject).b;
      }
      else
      {
        localObject = localView;
        if (this.o.a() > 0) {
          localObject = E();
        }
      }
      if (localObject != null)
      {
        int i1 = this.ra.o;
        if (i1 != -1L)
        {
          localView = ((View)localObject).findViewById(i1);
          if ((localView != null) && (localView.isFocusable())) {
            localObject = localView;
          }
        }
        ((View)localObject).requestFocus();
      }
    }
  }
  
  private void L()
  {
    EdgeEffect localEdgeEffect = this.S;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      bool1 = this.S.isFinished();
    }
    else
    {
      bool1 = false;
    }
    localEdgeEffect = this.T;
    boolean bool2 = bool1;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      bool2 = bool1 | this.T.isFinished();
    }
    localEdgeEffect = this.U;
    boolean bool1 = bool2;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      bool1 = bool2 | this.U.isFinished();
    }
    localEdgeEffect = this.V;
    bool2 = bool1;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      bool2 = bool1 | this.V.isFinished();
    }
    if (bool2) {
      y.E(this);
    }
  }
  
  private void M()
  {
    u localu = this.ra;
    localu.n = -1L;
    localu.m = -1;
    localu.o = -1;
  }
  
  private void N()
  {
    VelocityTracker localVelocityTracker = this.ca;
    if (localVelocityTracker != null) {
      localVelocityTracker.clear();
    }
    a(0);
    L();
  }
  
  private void O()
  {
    boolean bool = this.na;
    u localu = null;
    Object localObject;
    if ((bool) && (hasFocus()) && (this.v != null)) {
      localObject = getFocusedChild();
    } else {
      localObject = null;
    }
    if (localObject == null) {
      localObject = localu;
    } else {
      localObject = d((View)localObject);
    }
    if (localObject == null)
    {
      M();
    }
    else
    {
      localu = this.ra;
      long l1;
      if (this.v.c()) {
        l1 = ((x)localObject).g();
      } else {
        l1 = -1L;
      }
      localu.n = l1;
      localu = this.ra;
      int i1;
      if (this.N) {
        i1 = -1;
      } else if (((x)localObject).p()) {
        i1 = ((x)localObject).e;
      } else {
        i1 = ((x)localObject).f();
      }
      localu.m = i1;
      this.ra.o = n(((x)localObject).b);
    }
  }
  
  private void P()
  {
    this.oa.b();
    i locali = this.w;
    if (locali != null) {
      locali.B();
    }
  }
  
  private String a(Context paramContext, String paramString)
  {
    if (paramString.charAt(0) == '.')
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramContext.getPackageName());
      localStringBuilder.append(paramString);
      return localStringBuilder.toString();
    }
    if (paramString.contains(".")) {
      return paramString;
    }
    paramContext = new StringBuilder();
    paramContext.append(RecyclerView.class.getPackage().getName());
    paramContext.append('.');
    paramContext.append(paramString);
    return paramContext.toString();
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i1 = 1;
    if (paramFloat2 < 0.0F)
    {
      g();
      android.support.v4.widget.n.a(this.S, -paramFloat2 / getWidth(), 1.0F - paramFloat3 / getHeight());
    }
    for (;;)
    {
      i2 = 1;
      break label80;
      if (paramFloat2 <= 0.0F) {
        break;
      }
      h();
      android.support.v4.widget.n.a(this.U, paramFloat2 / getWidth(), paramFloat3 / getHeight());
    }
    int i2 = 0;
    label80:
    if (paramFloat4 < 0.0F)
    {
      i();
      android.support.v4.widget.n.a(this.T, -paramFloat4 / getHeight(), paramFloat1 / getWidth());
      i2 = i1;
    }
    else if (paramFloat4 > 0.0F)
    {
      f();
      android.support.v4.widget.n.a(this.V, paramFloat4 / getHeight(), 1.0F - paramFloat1 / getWidth());
      i2 = i1;
    }
    if ((i2 != 0) || (paramFloat2 != 0.0F) || (paramFloat4 != 0.0F)) {
      y.E(this);
    }
  }
  
  private void a(long paramLong, x paramx1, x paramx2)
  {
    int i1 = this.o.a();
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject = i(this.o.c(i2));
      if ((localObject != paramx1) && (d((x)localObject) == paramLong))
      {
        paramx2 = this.v;
        if ((paramx2 != null) && (paramx2.c()))
        {
          paramx2 = new StringBuilder();
          paramx2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
          paramx2.append(localObject);
          paramx2.append(" \n View Holder 2:");
          paramx2.append(paramx1);
          paramx2.append(j());
          throw new IllegalStateException(paramx2.toString());
        }
        paramx2 = new StringBuilder();
        paramx2.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
        paramx2.append(localObject);
        paramx2.append(" \n View Holder 2:");
        paramx2.append(paramx1);
        paramx2.append(j());
        throw new IllegalStateException(paramx2.toString());
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
    ((StringBuilder)localObject).append(paramx2);
    ((StringBuilder)localObject).append(" cannot be found but it is necessary for ");
    ((StringBuilder)localObject).append(paramx1);
    ((StringBuilder)localObject).append(j());
    Log.e("RecyclerView", ((StringBuilder)localObject).toString());
  }
  
  private void a(Context paramContext, String paramString, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      paramString = paramString.trim();
      if (!paramString.isEmpty())
      {
        String str = a(paramContext, paramString);
        try
        {
          if (isInEditMode()) {
            paramString = getClass().getClassLoader();
          } else {
            paramString = paramContext.getClassLoader();
          }
          Class localClass = paramString.loadClass(str).asSubclass(i.class);
          paramString = null;
          try
          {
            Constructor localConstructor = localClass.getConstructor(i);
            paramString = new Object[] { paramContext, paramAttributeSet, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) };
            paramContext = localConstructor;
          }
          catch (NoSuchMethodException localNoSuchMethodException) {}
          try
          {
            paramContext = localClass.getConstructor(new Class[0]);
            paramContext.setAccessible(true);
            setLayoutManager((i)paramContext.newInstance(paramString));
          }
          catch (NoSuchMethodException paramContext)
          {
            paramContext.initCause(localNoSuchMethodException);
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            paramString = new java/lang/StringBuilder;
            paramString.<init>();
            paramString.append(paramAttributeSet.getPositionDescription());
            paramString.append(": Error creating LayoutManager ");
            paramString.append(str);
            localIllegalStateException.<init>(paramString.toString(), paramContext);
            throw localIllegalStateException;
          }
          return;
        }
        catch (ClassCastException paramString)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Class is not a LayoutManager ");
          paramContext.append(str);
          throw new IllegalStateException(paramContext.toString(), paramString);
        }
        catch (IllegalAccessException paramString)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Cannot access non-public constructor ");
          paramContext.append(str);
          throw new IllegalStateException(paramContext.toString(), paramString);
        }
        catch (InstantiationException paramString)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Could not instantiate the LayoutManager: ");
          paramContext.append(str);
          throw new IllegalStateException(paramContext.toString(), paramString);
        }
        catch (InvocationTargetException paramString)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Could not instantiate the LayoutManager: ");
          paramContext.append(str);
          throw new IllegalStateException(paramContext.toString(), paramString);
        }
        catch (ClassNotFoundException paramString)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Unable to find LayoutManager ");
          paramContext.append(str);
          throw new IllegalStateException(paramContext.toString(), paramString);
        }
      }
    }
  }
  
  private void a(a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    a locala = this.v;
    if (locala != null)
    {
      locala.b(this.k);
      this.v.b(this);
    }
    if ((!paramBoolean1) || (paramBoolean2)) {
      u();
    }
    this.n.f();
    locala = this.v;
    this.v = parama;
    if (parama != null)
    {
      parama.a(this.k);
      parama.a(this);
    }
    parama = this.w;
    if (parama != null) {
      parama.a(locala, this.v);
    }
    this.l.a(locala, this.v, paramBoolean1);
    this.ra.g = true;
  }
  
  private void a(x paramx1, x paramx2, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramx1.a(false);
    if (paramBoolean1) {
      e(paramx1);
    }
    if (paramx1 != paramx2)
    {
      if (paramBoolean2) {
        e(paramx2);
      }
      paramx1.i = paramx2;
      e(paramx1);
      this.l.c(paramx1);
      paramx2.a(false);
      paramx2.j = paramx1;
    }
    if (this.W.a(paramx1, paramx2, paramc1, paramc2)) {
      t();
    }
  }
  
  static void a(View paramView, Rect paramRect)
  {
    j localj = (j)paramView.getLayoutParams();
    Rect localRect = localj.b;
    paramRect.set(paramView.getLeft() - localRect.left - localj.leftMargin, paramView.getTop() - localRect.top - localj.topMargin, paramView.getRight() + localRect.right + localj.rightMargin, paramView.getBottom() + localRect.bottom + localj.bottomMargin);
  }
  
  private void a(View paramView1, View paramView2)
  {
    if (paramView2 != null) {
      localObject = paramView2;
    } else {
      localObject = paramView1;
    }
    this.s.set(0, 0, ((View)localObject).getWidth(), ((View)localObject).getHeight());
    Object localObject = ((View)localObject).getLayoutParams();
    if ((localObject instanceof j))
    {
      localObject = (j)localObject;
      if (!((j)localObject).c)
      {
        localObject = ((j)localObject).b;
        localRect = this.s;
        localRect.left -= ((Rect)localObject).left;
        localRect.right += ((Rect)localObject).right;
        localRect.top -= ((Rect)localObject).top;
        localRect.bottom += ((Rect)localObject).bottom;
      }
    }
    if (paramView2 != null)
    {
      offsetDescendantRectToMyCoords(paramView2, this.s);
      offsetRectIntoDescendantCoords(paramView1, this.s);
    }
    localObject = this.w;
    Rect localRect = this.s;
    boolean bool1 = this.E;
    boolean bool2;
    if (paramView2 == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    ((i)localObject).a(this, paramView1, localRect, bool1 ^ true, bool2);
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int i1 = this.o.a();
    if (i1 == 0)
    {
      paramArrayOfInt[0] = -1;
      paramArrayOfInt[1] = -1;
      return;
    }
    int i2 = 0;
    int i3 = Integer.MAX_VALUE;
    int i5;
    for (int i4 = Integer.MIN_VALUE; i2 < i1; i4 = i5)
    {
      x localx = i(this.o.c(i2));
      if (localx.x())
      {
        i5 = i4;
      }
      else
      {
        int i6 = localx.i();
        int i7 = i3;
        if (i6 < i3) {
          i7 = i6;
        }
        i3 = i7;
        i5 = i4;
        if (i6 > i4)
        {
          i5 = i6;
          i3 = i7;
        }
      }
      i2++;
    }
    paramArrayOfInt[0] = i3;
    paramArrayOfInt[1] = i4;
  }
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    m localm = this.A;
    if (localm != null) {
      if (i1 == 0)
      {
        this.A = null;
      }
      else
      {
        localm.a(this, paramMotionEvent);
        if ((i1 == 3) || (i1 == 1)) {
          this.A = null;
        }
        return true;
      }
    }
    if (i1 != 0)
    {
      int i2 = this.z.size();
      for (i1 = 0; i1 < i2; i1++)
      {
        localm = (m)this.z.get(i1);
        if (localm.b(this, paramMotionEvent))
        {
          this.A = localm;
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean a(View paramView1, View paramView2, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = bool5;
    if (paramView2 != null) {
      if (paramView2 == this)
      {
        bool7 = bool5;
      }
      else
      {
        if (c(paramView2) == null) {
          return false;
        }
        if (paramView1 == null) {
          return true;
        }
        if (c(paramView1) == null) {
          return true;
        }
        this.s.set(0, 0, paramView1.getWidth(), paramView1.getHeight());
        this.t.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
        offsetDescendantRectToMyCoords(paramView1, this.s);
        offsetDescendantRectToMyCoords(paramView2, this.t);
        int i1 = this.w.j();
        int i2 = -1;
        int i3;
        if (i1 == 1) {
          i3 = -1;
        } else {
          i3 = 1;
        }
        paramView1 = this.s;
        i1 = paramView1.left;
        int i4 = this.t.left;
        if (((i1 < i4) || (paramView1.right <= i4)) && (this.s.right < this.t.right))
        {
          i1 = 1;
        }
        else
        {
          paramView1 = this.s;
          i4 = paramView1.right;
          i1 = this.t.right;
          if (((i4 > i1) || (paramView1.left >= i1)) && (this.s.left > this.t.left)) {
            i1 = -1;
          } else {
            i1 = 0;
          }
        }
        paramView1 = this.s;
        int i5 = paramView1.top;
        i4 = this.t.top;
        if (((i5 < i4) || (paramView1.bottom <= i4)) && (this.s.bottom < this.t.bottom))
        {
          i2 = 1;
        }
        else
        {
          paramView1 = this.s;
          i5 = paramView1.bottom;
          i4 = this.t.bottom;
          if (((i5 <= i4) && (paramView1.top < i4)) || (this.s.top <= this.t.top)) {
            i2 = 0;
          }
        }
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 17)
            {
              if (paramInt != 33)
              {
                if (paramInt != 66)
                {
                  if (paramInt == 130)
                  {
                    bool7 = bool6;
                    if (i2 > 0) {
                      bool7 = true;
                    }
                    return bool7;
                  }
                  paramView1 = new StringBuilder();
                  paramView1.append("Invalid direction: ");
                  paramView1.append(paramInt);
                  paramView1.append(j());
                  throw new IllegalArgumentException(paramView1.toString());
                }
                bool7 = bool1;
                if (i1 > 0) {
                  bool7 = true;
                }
                return bool7;
              }
              bool7 = bool2;
              if (i2 < 0) {
                bool7 = true;
              }
              return bool7;
            }
            bool7 = bool3;
            if (i1 < 0) {
              bool7 = true;
            }
            return bool7;
          }
          if (i2 <= 0)
          {
            bool7 = bool4;
            if (i2 == 0)
            {
              bool7 = bool4;
              if (i1 * i3 < 0) {}
            }
          }
          else
          {
            bool7 = true;
          }
          return bool7;
        }
        if (i2 >= 0)
        {
          bool7 = bool5;
          if (i2 == 0)
          {
            bool7 = bool5;
            if (i1 * i3 > 0) {}
          }
        }
        else
        {
          bool7 = true;
        }
      }
    }
    return bool7;
  }
  
  static void b(x paramx)
  {
    Object localObject = paramx.c;
    if (localObject != null)
    {
      localObject = (View)((WeakReference)localObject).get();
      while (localObject != null)
      {
        if (localObject == paramx.b) {
          return;
        }
        localObject = ((View)localObject).getParent();
        if ((localObject instanceof View)) {
          localObject = (View)localObject;
        } else {
          localObject = null;
        }
      }
      paramx.c = null;
    }
  }
  
  private boolean b(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 0)) {
      this.A = null;
    }
    int i2 = this.z.size();
    for (int i3 = 0; i3 < i2; i3++)
    {
      m localm = (m)this.z.get(i3);
      if ((localm.b(this, paramMotionEvent)) && (i1 != 3))
      {
        this.A = localm;
        return true;
      }
    }
    return false;
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i1) == this.ba)
    {
      if (i1 == 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      this.ba = paramMotionEvent.getPointerId(i1);
      int i2 = (int)(paramMotionEvent.getX(i1) + 0.5F);
      this.fa = i2;
      this.da = i2;
      i1 = (int)(paramMotionEvent.getY(i1) + 0.5F);
      this.ga = i1;
      this.ea = i1;
    }
  }
  
  static RecyclerView e(View paramView)
  {
    if (!(paramView instanceof ViewGroup)) {
      return null;
    }
    if ((paramView instanceof RecyclerView)) {
      return (RecyclerView)paramView;
    }
    ViewGroup localViewGroup = (ViewGroup)paramView;
    int i1 = localViewGroup.getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      paramView = e(localViewGroup.getChildAt(i2));
      if (paramView != null) {
        return paramView;
      }
    }
    return null;
  }
  
  private void e(x paramx)
  {
    View localView = paramx.b;
    int i1;
    if (localView.getParent() == this) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    this.l.c(h(localView));
    if (paramx.r()) {
      this.o.a(localView, -1, localView.getLayoutParams(), true);
    } else if (i1 == 0) {
      this.o.a(localView, true);
    } else {
      this.o.a(localView);
    }
  }
  
  private android.support.v4.view.n getScrollingChildHelper()
  {
    if (this.Ba == null) {
      this.Ba = new android.support.v4.view.n(this);
    }
    return this.Ba;
  }
  
  static x i(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return ((j)paramView.getLayoutParams()).a;
  }
  
  private boolean k(int paramInt1, int paramInt2)
  {
    a(this.Aa);
    int[] arrayOfInt = this.Aa;
    boolean bool = false;
    if ((arrayOfInt[0] != paramInt1) || (arrayOfInt[1] != paramInt2)) {
      bool = true;
    }
    return bool;
  }
  
  private int n(View paramView)
  {
    int i1 = paramView.getId();
    while ((!paramView.isFocused()) && ((paramView instanceof ViewGroup)) && (paramView.hasFocus()))
    {
      View localView = ((ViewGroup)paramView).getFocusedChild();
      paramView = localView;
      if (localView.getId() != -1)
      {
        i1 = localView.getId();
        paramView = localView;
      }
    }
    return i1;
  }
  
  private void z()
  {
    N();
    setScrollState(0);
  }
  
  x a(int paramInt, boolean paramBoolean)
  {
    int i1 = this.o.b();
    Object localObject1 = null;
    int i2 = 0;
    while (i2 < i1)
    {
      x localx = i(this.o.d(i2));
      Object localObject2 = localObject1;
      if (localx != null)
      {
        localObject2 = localObject1;
        if (!localx.p())
        {
          if (paramBoolean)
          {
            if (localx.d != paramInt)
            {
              localObject2 = localObject1;
              break label116;
            }
          }
          else if (localx.i() != paramInt)
          {
            localObject2 = localObject1;
            break label116;
          }
          if (this.o.c(localx.b)) {
            localObject2 = localx;
          } else {
            return localx;
          }
        }
      }
      label116:
      i2++;
      localObject1 = localObject2;
    }
    return (x)localObject1;
  }
  
  public x a(long paramLong)
  {
    a locala = this.v;
    x localx = null;
    Object localObject1 = null;
    Object localObject2 = localx;
    if (locala != null) {
      if (!locala.c())
      {
        localObject2 = localx;
      }
      else
      {
        int i1 = this.o.b();
        int i2 = 0;
        for (;;)
        {
          localObject2 = localObject1;
          if (i2 >= i1) {
            break;
          }
          localx = i(this.o.d(i2));
          localObject2 = localObject1;
          if (localx != null)
          {
            localObject2 = localObject1;
            if (!localx.p())
            {
              localObject2 = localObject1;
              if (localx.g() == paramLong) {
                if (this.o.c(localx.b)) {
                  localObject2 = localx;
                } else {
                  return localx;
                }
              }
            }
          }
          i2++;
          localObject1 = localObject2;
        }
      }
    }
    return (x)localObject2;
  }
  
  void a()
  {
    int i1 = this.o.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      x localx = i(this.o.d(i2));
      if (!localx.x()) {
        localx.a();
      }
    }
    this.l.b();
  }
  
  public void a(int paramInt)
  {
    getScrollingChildHelper().c(paramInt);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      g();
      this.S.onAbsorb(-paramInt1);
    }
    else if (paramInt1 > 0)
    {
      h();
      this.U.onAbsorb(paramInt1);
    }
    if (paramInt2 < 0)
    {
      i();
      this.T.onAbsorb(-paramInt2);
    }
    else if (paramInt2 > 0)
    {
      f();
      this.V.onAbsorb(paramInt2);
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      y.E(this);
    }
  }
  
  public void a(int paramInt1, int paramInt2, Interpolator paramInterpolator)
  {
    i locali = this.w;
    if (locali == null)
    {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    if (this.H) {
      return;
    }
    if (!locali.a()) {
      paramInt1 = 0;
    }
    if (!this.w.b()) {
      paramInt2 = 0;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      this.oa.a(paramInt1, paramInt2, paramInterpolator);
    }
  }
  
  void a(int paramInt1, int paramInt2, Object paramObject)
  {
    int i1 = this.o.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = this.o.d(i2);
      x localx = i(localView);
      if ((localx != null) && (!localx.x()))
      {
        int i3 = localx.d;
        if ((i3 >= paramInt1) && (i3 < paramInt1 + paramInt2))
        {
          localx.a(2);
          localx.a(paramObject);
          ((j)localView.getLayoutParams()).c = true;
        }
      }
    }
    this.l.c(paramInt1, paramInt2);
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = this.o.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      x localx = i(this.o.d(i2));
      if ((localx != null) && (!localx.x()))
      {
        int i3 = localx.d;
        if (i3 >= paramInt1 + paramInt2)
        {
          localx.a(-paramInt2, paramBoolean);
          this.ra.g = true;
        }
        else if (i3 >= paramInt1)
        {
          localx.a(paramInt1 - 1, -paramInt2, paramBoolean);
          this.ra.g = true;
        }
      }
    }
    this.l.a(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }
  
  void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    x();
    r();
    Pc.a("RV Scroll");
    a(this.ra);
    if (paramInt1 != 0) {
      paramInt1 = this.w.a(paramInt1, this.l, this.ra);
    } else {
      paramInt1 = 0;
    }
    if (paramInt2 != 0) {
      paramInt2 = this.w.b(paramInt2, this.l, this.ra);
    } else {
      paramInt2 = 0;
    }
    Pc.a();
    v();
    s();
    c(false);
    if (paramArrayOfInt != null)
    {
      paramArrayOfInt[0] = paramInt1;
      paramArrayOfInt[1] = paramInt2;
    }
  }
  
  void a(StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2)
  {
    if ((paramStateListDrawable1 != null) && (paramDrawable1 != null) && (paramStateListDrawable2 != null) && (paramDrawable2 != null))
    {
      Resources localResources = getContext().getResources();
      new ja(this, paramStateListDrawable1, paramDrawable1, paramStateListDrawable2, paramDrawable2, localResources.getDimensionPixelSize(be.fastscroll_default_thickness), localResources.getDimensionPixelSize(be.fastscroll_minimum_range), localResources.getDimensionPixelOffset(be.fastscroll_margin));
      return;
    }
    paramStateListDrawable1 = new StringBuilder();
    paramStateListDrawable1.append("Trying to set fast scroller without both required drawables.");
    paramStateListDrawable1.append(j());
    throw new IllegalArgumentException(paramStateListDrawable1.toString());
  }
  
  public void a(h paramh)
  {
    a(paramh, -1);
  }
  
  public void a(h paramh, int paramInt)
  {
    i locali = this.w;
    if (locali != null) {
      locali.a("Cannot add item decoration during a scroll  or layout");
    }
    if (this.y.isEmpty()) {
      setWillNotDraw(false);
    }
    if (paramInt < 0) {
      this.y.add(paramh);
    } else {
      this.y.add(paramInt, paramh);
    }
    p();
    requestLayout();
  }
  
  public void a(m paramm)
  {
    this.z.add(paramm);
  }
  
  public void a(n paramn)
  {
    if (this.ta == null) {
      this.ta = new ArrayList();
    }
    this.ta.add(paramn);
  }
  
  final void a(u paramu)
  {
    if (getScrollState() == 2)
    {
      OverScroller localOverScroller = this.oa.c;
      paramu.p = (localOverScroller.getFinalX() - localOverScroller.getCurrX());
      paramu.q = (localOverScroller.getFinalY() - localOverScroller.getCurrY());
    }
    else
    {
      paramu.p = 0;
      paramu.q = 0;
    }
  }
  
  void a(x paramx, RecyclerView.f.c paramc)
  {
    paramx.a(0, 8192);
    if ((this.ra.i) && (paramx.s()) && (!paramx.p()) && (!paramx.x()))
    {
      long l1 = d(paramx);
      this.p.a(l1, paramx);
    }
    this.p.c(paramx, paramc);
  }
  
  void a(x paramx, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    paramx.a(false);
    if (this.W.a(paramx, paramc1, paramc2)) {
      t();
    }
  }
  
  void a(View paramView)
  {
    Object localObject = i(paramView);
    k(paramView);
    a locala = this.v;
    if ((locala != null) && (localObject != null)) {
      locala.b((x)localObject);
    }
    localObject = this.M;
    if (localObject != null) {
      for (int i1 = ((List)localObject).size() - 1; i1 >= 0; i1--) {
        ((k)this.M.get(i1)).b(paramView);
      }
    }
  }
  
  void a(String paramString)
  {
    if (o())
    {
      if (paramString == null)
      {
        paramString = new StringBuilder();
        paramString.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
        paramString.append(j());
        throw new IllegalStateException(paramString.toString());
      }
      throw new IllegalStateException(paramString);
    }
    if (this.Q > 0)
    {
      paramString = new StringBuilder();
      paramString.append("");
      paramString.append(j());
      Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(paramString.toString()));
    }
  }
  
  void a(boolean paramBoolean)
  {
    this.P -= 1;
    if (this.P < 1)
    {
      this.P = 0;
      if (paramBoolean)
      {
        A();
        e();
      }
    }
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
  }
  
  boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    c();
    Object localObject = this.v;
    boolean bool = false;
    int i1;
    int i2;
    int i3;
    int i4;
    if (localObject != null)
    {
      a(paramInt1, paramInt2, this.Fa);
      localObject = this.Fa;
      i1 = localObject[0];
      i2 = localObject[1];
      i3 = i2;
      i4 = i1;
      i1 = paramInt1 - i1;
      i2 = paramInt2 - i2;
    }
    else
    {
      i3 = 0;
      i1 = 0;
      i2 = 0;
      i4 = 0;
    }
    if (!this.y.isEmpty()) {
      invalidate();
    }
    if (a(i4, i3, i1, i2, this.Ca, 0))
    {
      paramInt1 = this.fa;
      localObject = this.Ca;
      this.fa = (paramInt1 - localObject[0]);
      this.ga -= localObject[1];
      if (paramMotionEvent != null) {
        paramMotionEvent.offsetLocation(localObject[0], localObject[1]);
      }
      localObject = this.Ea;
      paramInt1 = localObject[0];
      paramMotionEvent = this.Ca;
      localObject[0] = (paramInt1 + paramMotionEvent[0]);
      localObject[1] += paramMotionEvent[1];
    }
    else if (getOverScrollMode() != 2)
    {
      if ((paramMotionEvent != null) && (!k.a(paramMotionEvent, 8194))) {
        a(paramMotionEvent.getX(), i1, paramMotionEvent.getY(), i2);
      }
      b(paramInt1, paramInt2);
    }
    if (i4 == 0) {
      if (i3 == 0) {
        break label274;
      }
    }
    d(i4, i3);
    label274:
    if (!awakenScrollBars()) {
      invalidate();
    }
    if ((i4 != 0) || (i3 != 0)) {
      bool = true;
    }
    return bool;
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  boolean a(x paramx)
  {
    f localf = this.W;
    boolean bool;
    if ((localf != null) && (!localf.a(paramx, paramx.k()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  boolean a(x paramx, int paramInt)
  {
    if (o())
    {
      paramx.r = paramInt;
      this.Ga.add(paramx);
      return false;
    }
    y.d(paramx.b, paramInt);
    return true;
  }
  
  boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    if (o())
    {
      int i1;
      if (paramAccessibilityEvent != null) {
        i1 = xd.a(paramAccessibilityEvent);
      } else {
        i1 = 0;
      }
      int i2 = i1;
      if (i1 == 0) {
        i2 = 0;
      }
      this.J = (i2 | this.J);
      return true;
    }
    return false;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    i locali = this.w;
    if ((locali == null) || (!locali.a(this, paramArrayList, paramInt1, paramInt2))) {
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
    }
  }
  
  public void b()
  {
    List localList = this.ta;
    if (localList != null) {
      localList.clear();
    }
  }
  
  void b(int paramInt)
  {
    Object localObject = this.w;
    if (localObject != null) {
      ((i)localObject).g(paramInt);
    }
    i(paramInt);
    localObject = this.sa;
    if (localObject != null) {
      ((n)localObject).a(this, paramInt);
    }
    localObject = this.ta;
    if (localObject != null) {
      for (int i1 = ((List)localObject).size() - 1; i1 >= 0; i1--) {
        ((n)this.ta.get(i1)).a(this, paramInt);
      }
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    EdgeEffect localEdgeEffect = this.S;
    if ((localEdgeEffect != null) && (!localEdgeEffect.isFinished()) && (paramInt1 > 0))
    {
      this.S.onRelease();
      bool1 = this.S.isFinished();
    }
    else
    {
      bool1 = false;
    }
    localEdgeEffect = this.U;
    boolean bool2 = bool1;
    if (localEdgeEffect != null)
    {
      bool2 = bool1;
      if (!localEdgeEffect.isFinished())
      {
        bool2 = bool1;
        if (paramInt1 < 0)
        {
          this.U.onRelease();
          bool2 = bool1 | this.U.isFinished();
        }
      }
    }
    localEdgeEffect = this.T;
    boolean bool1 = bool2;
    if (localEdgeEffect != null)
    {
      bool1 = bool2;
      if (!localEdgeEffect.isFinished())
      {
        bool1 = bool2;
        if (paramInt2 > 0)
        {
          this.T.onRelease();
          bool1 = bool2 | this.T.isFinished();
        }
      }
    }
    localEdgeEffect = this.V;
    bool2 = bool1;
    if (localEdgeEffect != null)
    {
      bool2 = bool1;
      if (!localEdgeEffect.isFinished())
      {
        bool2 = bool1;
        if (paramInt2 < 0)
        {
          this.V.onRelease();
          bool2 = bool1 | this.V.isFinished();
        }
      }
    }
    if (bool2) {
      y.E(this);
    }
  }
  
  public void b(h paramh)
  {
    i locali = this.w;
    if (locali != null) {
      locali.a("Cannot remove item decoration during a scroll  or layout");
    }
    this.y.remove(paramh);
    if (this.y.isEmpty())
    {
      boolean bool;
      if (getOverScrollMode() == 2) {
        bool = true;
      } else {
        bool = false;
      }
      setWillNotDraw(bool);
    }
    p();
    requestLayout();
  }
  
  public void b(m paramm)
  {
    this.z.remove(paramm);
    if (this.A == paramm) {
      this.A = null;
    }
  }
  
  public void b(n paramn)
  {
    List localList = this.ta;
    if (localList != null) {
      localList.remove(paramn);
    }
  }
  
  void b(x paramx, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    e(paramx);
    paramx.a(false);
    if (this.W.b(paramx, paramc1, paramc2)) {
      t();
    }
  }
  
  void b(View paramView)
  {
    Object localObject = i(paramView);
    l(paramView);
    a locala = this.v;
    if ((locala != null) && (localObject != null)) {
      locala.c((x)localObject);
    }
    localObject = this.M;
    if (localObject != null) {
      for (int i1 = ((List)localObject).size() - 1; i1 >= 0; i1--) {
        ((k)this.M.get(i1)).a(paramView);
      }
    }
  }
  
  void b(boolean paramBoolean)
  {
    this.O = (paramBoolean | this.O);
    this.N = true;
    q();
  }
  
  int c(x paramx)
  {
    if ((!paramx.b(524)) && (paramx.m())) {
      return this.n.a(paramx.d);
    }
    return -1;
  }
  
  public x c(int paramInt)
  {
    boolean bool = this.N;
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    int i1 = this.o.b();
    int i2 = 0;
    while (i2 < i1)
    {
      x localx = i(this.o.d(i2));
      Object localObject2 = localObject1;
      if (localx != null)
      {
        localObject2 = localObject1;
        if (!localx.p())
        {
          localObject2 = localObject1;
          if (c(localx) == paramInt) {
            if (this.o.c(localx.b)) {
              localObject2 = localx;
            } else {
              return localx;
            }
          }
        }
      }
      i2++;
      localObject1 = localObject2;
    }
    return (x)localObject1;
  }
  
  public View c(View paramView)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (localViewParent != this) && ((localViewParent instanceof View)); localViewParent = paramView.getParent()) {
      paramView = (View)localViewParent;
    }
    if (localViewParent != this) {
      paramView = null;
    }
    return paramView;
  }
  
  void c()
  {
    if ((this.E) && (!this.N))
    {
      if (!this.n.c()) {
        return;
      }
      if ((this.n.c(4)) && (!this.n.c(11)))
      {
        Pc.a("RV PartialInvalidate");
        x();
        r();
        this.n.e();
        if (!this.G) {
          if (F()) {
            d();
          } else {
            this.n.a();
          }
        }
        c(true);
        s();
        Pc.a();
      }
      else if (this.n.c())
      {
        Pc.a("RV FullInvalidate");
        d();
        Pc.a();
      }
      return;
    }
    Pc.a("RV FullInvalidate");
    d();
    Pc.a();
  }
  
  void c(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(i.a(paramInt1, getPaddingLeft() + getPaddingRight(), y.n(this)), i.a(paramInt2, getPaddingTop() + getPaddingBottom(), y.m(this)));
  }
  
  void c(boolean paramBoolean)
  {
    if (this.F < 1) {
      this.F = 1;
    }
    if ((!paramBoolean) && (!this.H)) {
      this.G = false;
    }
    if (this.F == 1)
    {
      if ((paramBoolean) && (this.G) && (!this.H) && (this.w != null) && (this.v != null)) {
        d();
      }
      if (!this.H) {
        this.G = false;
      }
    }
    this.F -= 1;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof j)) && (this.w.a((j)paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int computeHorizontalScrollExtent()
  {
    i locali = this.w;
    int i1 = 0;
    if (locali == null) {
      return 0;
    }
    if (locali.a()) {
      i1 = this.w.a(this.ra);
    }
    return i1;
  }
  
  public int computeHorizontalScrollOffset()
  {
    i locali = this.w;
    int i1 = 0;
    if (locali == null) {
      return 0;
    }
    if (locali.a()) {
      i1 = this.w.b(this.ra);
    }
    return i1;
  }
  
  public int computeHorizontalScrollRange()
  {
    i locali = this.w;
    int i1 = 0;
    if (locali == null) {
      return 0;
    }
    if (locali.a()) {
      i1 = this.w.c(this.ra);
    }
    return i1;
  }
  
  public int computeVerticalScrollExtent()
  {
    i locali = this.w;
    int i1 = 0;
    if (locali == null) {
      return 0;
    }
    if (locali.b()) {
      i1 = this.w.d(this.ra);
    }
    return i1;
  }
  
  public int computeVerticalScrollOffset()
  {
    i locali = this.w;
    int i1 = 0;
    if (locali == null) {
      return 0;
    }
    if (locali.b()) {
      i1 = this.w.e(this.ra);
    }
    return i1;
  }
  
  public int computeVerticalScrollRange()
  {
    i locali = this.w;
    int i1 = 0;
    if (locali == null) {
      return 0;
    }
    if (locali.b()) {
      i1 = this.w.f(this.ra);
    }
    return i1;
  }
  
  long d(x paramx)
  {
    long l1;
    if (this.v.c()) {
      l1 = paramx.g();
    } else {
      l1 = paramx.d;
    }
    return l1;
  }
  
  public h d(int paramInt)
  {
    int i1 = getItemDecorationCount();
    if ((paramInt >= 0) && (paramInt < i1)) {
      return (h)this.y.get(paramInt);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is an invalid index for size ");
    localStringBuilder.append(i1);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public x d(View paramView)
  {
    paramView = c(paramView);
    if (paramView == null) {
      paramView = null;
    } else {
      paramView = h(paramView);
    }
    return paramView;
  }
  
  void d()
  {
    if (this.v == null)
    {
      Log.e("RecyclerView", "No adapter attached; skipping layout");
      return;
    }
    if (this.w == null)
    {
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
      return;
    }
    u localu = this.ra;
    localu.j = false;
    if (localu.e == 1)
    {
      B();
      this.w.e(this);
      C();
    }
    else if ((!this.n.d()) && (this.w.q() == getWidth()) && (this.w.h() == getHeight()))
    {
      this.w.e(this);
    }
    else
    {
      this.w.e(this);
      C();
    }
    D();
  }
  
  void d(int paramInt1, int paramInt2)
  {
    this.Q += 1;
    int i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    h(paramInt1, paramInt2);
    Object localObject = this.sa;
    if (localObject != null) {
      ((n)localObject).a(this, paramInt1, paramInt2);
    }
    localObject = this.ta;
    if (localObject != null) {
      for (i2 = ((List)localObject).size() - 1; i2 >= 0; i2--) {
        ((n)this.ta.get(i2)).a(this, paramInt1, paramInt2);
      }
    }
    this.Q -= 1;
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = this.y.size();
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++) {
      ((h)this.y.get(i3)).b(paramCanvas, this, this.ra);
    }
    EdgeEffect localEdgeEffect = this.S;
    int i4;
    if ((localEdgeEffect != null) && (!localEdgeEffect.isFinished()))
    {
      i4 = paramCanvas.save();
      if (this.q) {
        i3 = getPaddingBottom();
      } else {
        i3 = 0;
      }
      paramCanvas.rotate(270.0F);
      paramCanvas.translate(-getHeight() + i3, 0.0F);
      localEdgeEffect = this.S;
      if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      paramCanvas.restoreToCount(i4);
    }
    else
    {
      i1 = 0;
    }
    localEdgeEffect = this.T;
    i3 = i1;
    if (localEdgeEffect != null)
    {
      i3 = i1;
      if (!localEdgeEffect.isFinished())
      {
        i4 = paramCanvas.save();
        if (this.q) {
          paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        }
        localEdgeEffect = this.T;
        if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        i3 = i1 | i3;
        paramCanvas.restoreToCount(i4);
      }
    }
    localEdgeEffect = this.U;
    i1 = i3;
    if (localEdgeEffect != null)
    {
      i1 = i3;
      if (!localEdgeEffect.isFinished())
      {
        i4 = paramCanvas.save();
        int i5 = getWidth();
        if (this.q) {
          i1 = getPaddingTop();
        } else {
          i1 = 0;
        }
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-i1, -i5);
        localEdgeEffect = this.U;
        if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        i1 = i3 | i1;
        paramCanvas.restoreToCount(i4);
      }
    }
    localEdgeEffect = this.V;
    if ((localEdgeEffect != null) && (!localEdgeEffect.isFinished()))
    {
      i4 = paramCanvas.save();
      paramCanvas.rotate(180.0F);
      if (this.q) {
        paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
      } else {
        paramCanvas.translate(-getWidth(), -getHeight());
      }
      localEdgeEffect = this.V;
      i3 = i2;
      if (localEdgeEffect != null)
      {
        i3 = i2;
        if (localEdgeEffect.draw(paramCanvas)) {
          i3 = 1;
        }
      }
      i3 |= i1;
      paramCanvas.restoreToCount(i4);
    }
    else
    {
      i3 = i1;
    }
    i1 = i3;
    if (i3 == 0)
    {
      i1 = i3;
      if (this.W != null)
      {
        i1 = i3;
        if (this.y.size() > 0)
        {
          i1 = i3;
          if (this.W.g()) {
            i1 = 1;
          }
        }
      }
    }
    if (i1 != 0) {
      y.E(this);
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  void e()
  {
    for (int i1 = this.Ga.size() - 1; i1 >= 0; i1--)
    {
      x localx = (x)this.Ga.get(i1);
      if ((localx.b.getParent() == this) && (!localx.x()))
      {
        int i2 = localx.r;
        if (i2 != -1)
        {
          y.d(localx.b, i2);
          localx.r = -1;
        }
      }
    }
    this.Ga.clear();
  }
  
  public boolean e(int paramInt)
  {
    return getScrollingChildHelper().a(paramInt);
  }
  
  public boolean e(int paramInt1, int paramInt2)
  {
    Object localObject = this.w;
    int i1 = 0;
    if (localObject == null)
    {
      Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return false;
    }
    if (this.H) {
      return false;
    }
    boolean bool1 = ((i)localObject).a();
    boolean bool2 = this.w.b();
    int i2;
    if (bool1)
    {
      i2 = paramInt1;
      if (Math.abs(paramInt1) >= this.ja) {}
    }
    else
    {
      i2 = 0;
    }
    int i3;
    if (bool2)
    {
      i3 = paramInt2;
      if (Math.abs(paramInt2) >= this.ja) {}
    }
    else
    {
      i3 = 0;
    }
    if ((i2 == 0) && (i3 == 0)) {
      return false;
    }
    float f1 = i2;
    float f2 = i3;
    if (!dispatchNestedPreFling(f1, f2))
    {
      boolean bool3;
      if ((!bool1) && (!bool2)) {
        bool3 = false;
      } else {
        bool3 = true;
      }
      dispatchNestedFling(f1, f2, bool3);
      localObject = this.ia;
      if ((localObject != null) && (((l)localObject).a(i2, i3))) {
        return true;
      }
      if (bool3)
      {
        paramInt1 = i1;
        if (bool1) {
          paramInt1 = 1;
        }
        paramInt2 = paramInt1;
        if (bool2) {
          paramInt2 = paramInt1 | 0x2;
        }
        j(paramInt2, 1);
        paramInt1 = this.ka;
        paramInt1 = Math.max(-paramInt1, Math.min(i2, paramInt1));
        paramInt2 = this.ka;
        paramInt2 = Math.max(-paramInt2, Math.min(i3, paramInt2));
        this.oa.a(paramInt1, paramInt2);
        return true;
      }
    }
    return false;
  }
  
  public int f(View paramView)
  {
    paramView = i(paramView);
    int i1;
    if (paramView != null) {
      i1 = paramView.f();
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  void f()
  {
    if (this.V != null) {
      return;
    }
    this.V = this.R.a(this, 3);
    if (this.q) {
      this.V.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
    } else {
      this.V.setSize(getMeasuredWidth(), getMeasuredHeight());
    }
  }
  
  void f(int paramInt)
  {
    i locali = this.w;
    if (locali == null) {
      return;
    }
    locali.i(paramInt);
    awakenScrollBars();
  }
  
  void f(int paramInt1, int paramInt2)
  {
    int i1 = this.o.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      x localx = i(this.o.d(i2));
      if ((localx != null) && (!localx.x()) && (localx.d >= paramInt1))
      {
        localx.a(paramInt2, false);
        this.ra.g = true;
      }
    }
    this.l.a(paramInt1, paramInt2);
    requestLayout();
  }
  
  public View focusSearch(View paramView, int paramInt)
  {
    Object localObject = this.w.d(paramView, paramInt);
    if (localObject != null) {
      return (View)localObject;
    }
    int i1;
    if ((this.v != null) && (this.w != null) && (!o()) && (!this.H)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    localObject = FocusFinder.getInstance();
    if ((i1 != 0) && ((paramInt == 2) || (paramInt == 1)))
    {
      int i3;
      if (this.w.b())
      {
        if (paramInt == 2) {
          i2 = 130;
        } else {
          i2 = 33;
        }
        if (((FocusFinder)localObject).findNextFocus(this, paramView, i2) == null) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        i1 = i3;
        if (g)
        {
          paramInt = i2;
          i1 = i3;
        }
      }
      else
      {
        i1 = 0;
      }
      int i4 = i1;
      int i2 = paramInt;
      if (i1 == 0)
      {
        i4 = i1;
        i2 = paramInt;
        if (this.w.a())
        {
          if (this.w.j() == 1) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if (paramInt == 2) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if ((i1 ^ i2) != 0) {
            i1 = 66;
          } else {
            i1 = 17;
          }
          if (((FocusFinder)localObject).findNextFocus(this, paramView, i1) == null) {
            i3 = 1;
          } else {
            i3 = 0;
          }
          i4 = i3;
          i2 = paramInt;
          if (g)
          {
            i2 = i1;
            i4 = i3;
          }
        }
      }
      if (i4 != 0)
      {
        c();
        if (c(paramView) == null) {
          return null;
        }
        x();
        this.w.a(paramView, i2, this.l, this.ra);
        c(false);
      }
      localObject = ((FocusFinder)localObject).findNextFocus(this, paramView, i2);
      paramInt = i2;
    }
    else
    {
      localObject = ((FocusFinder)localObject).findNextFocus(this, paramView, paramInt);
      if ((localObject == null) && (i1 != 0))
      {
        c();
        if (c(paramView) == null) {
          return null;
        }
        x();
        localObject = this.w.a(paramView, paramInt, this.l, this.ra);
        c(false);
      }
    }
    if ((localObject != null) && (!((View)localObject).hasFocusable()))
    {
      if (getFocusedChild() == null) {
        return super.focusSearch(paramView, paramInt);
      }
      a((View)localObject, null);
      return paramView;
    }
    if (!a(paramView, (View)localObject, paramInt)) {
      localObject = super.focusSearch(paramView, paramInt);
    }
    return (View)localObject;
  }
  
  public int g(View paramView)
  {
    paramView = i(paramView);
    int i1;
    if (paramView != null) {
      i1 = paramView.i();
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  void g()
  {
    if (this.S != null) {
      return;
    }
    this.S = this.R.a(this, 0);
    if (this.q) {
      this.S.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    } else {
      this.S.setSize(getMeasuredHeight(), getMeasuredWidth());
    }
  }
  
  public void g(int paramInt)
  {
    int i1 = this.o.a();
    for (int i2 = 0; i2 < i1; i2++) {
      this.o.c(i2).offsetLeftAndRight(paramInt);
    }
  }
  
  void g(int paramInt1, int paramInt2)
  {
    int i1 = this.o.b();
    int i2;
    int i3;
    int i4;
    if (paramInt1 < paramInt2)
    {
      i2 = paramInt1;
      i3 = paramInt2;
      i4 = -1;
    }
    else
    {
      i3 = paramInt1;
      i2 = paramInt2;
      i4 = 1;
    }
    for (int i5 = 0; i5 < i1; i5++)
    {
      x localx = i(this.o.d(i5));
      if (localx != null)
      {
        int i6 = localx.d;
        if ((i6 >= i2) && (i6 <= i3))
        {
          if (i6 == paramInt1) {
            localx.a(paramInt2 - paramInt1, false);
          } else {
            localx.a(i4, false);
          }
          this.ra.g = true;
        }
      }
    }
    this.l.b(paramInt1, paramInt2);
    requestLayout();
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    Object localObject = this.w;
    if (localObject != null) {
      return ((i)localObject).c();
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("RecyclerView has no LayoutManager");
    ((StringBuilder)localObject).append(j());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    i locali = this.w;
    if (locali != null) {
      return locali.a(getContext(), paramAttributeSet);
    }
    paramAttributeSet = new StringBuilder();
    paramAttributeSet.append("RecyclerView has no LayoutManager");
    paramAttributeSet.append(j());
    throw new IllegalStateException(paramAttributeSet.toString());
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    i locali = this.w;
    if (locali != null) {
      return locali.a(paramLayoutParams);
    }
    paramLayoutParams = new StringBuilder();
    paramLayoutParams.append("RecyclerView has no LayoutManager");
    paramLayoutParams.append(j());
    throw new IllegalStateException(paramLayoutParams.toString());
  }
  
  public a getAdapter()
  {
    return this.v;
  }
  
  public int getBaseline()
  {
    i locali = this.w;
    if (locali != null) {
      return locali.d();
    }
    return super.getBaseline();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    d locald = this.za;
    if (locald == null) {
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    }
    return locald.a(paramInt1, paramInt2);
  }
  
  public boolean getClipToPadding()
  {
    return this.q;
  }
  
  public La getCompatAccessibilityDelegate()
  {
    return this.ya;
  }
  
  public e getEdgeEffectFactory()
  {
    return this.R;
  }
  
  public f getItemAnimator()
  {
    return this.W;
  }
  
  public int getItemDecorationCount()
  {
    return this.y.size();
  }
  
  public i getLayoutManager()
  {
    return this.w;
  }
  
  public int getMaxFlingVelocity()
  {
    return this.ka;
  }
  
  public int getMinFlingVelocity()
  {
    return this.ja;
  }
  
  long getNanoTime()
  {
    if (f) {
      return System.nanoTime();
    }
    return 0L;
  }
  
  public l getOnFlingListener()
  {
    return this.ia;
  }
  
  public boolean getPreserveFocusAfterLayout()
  {
    return this.na;
  }
  
  public o getRecycledViewPool()
  {
    return this.l.d();
  }
  
  public int getScrollState()
  {
    return this.aa;
  }
  
  public x h(View paramView)
  {
    Object localObject = paramView.getParent();
    if ((localObject != null) && (localObject != this))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("View ");
      ((StringBuilder)localObject).append(paramView);
      ((StringBuilder)localObject).append(" is not a direct child of ");
      ((StringBuilder)localObject).append(this);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    return i(paramView);
  }
  
  void h()
  {
    if (this.U != null) {
      return;
    }
    this.U = this.R.a(this, 2);
    if (this.q) {
      this.U.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    } else {
      this.U.setSize(getMeasuredHeight(), getMeasuredWidth());
    }
  }
  
  public void h(int paramInt)
  {
    int i1 = this.o.a();
    for (int i2 = 0; i2 < i1; i2++) {
      this.o.c(i2).offsetTopAndBottom(paramInt);
    }
  }
  
  public void h(int paramInt1, int paramInt2) {}
  
  public boolean hasNestedScrollingParent()
  {
    return getScrollingChildHelper().a();
  }
  
  void i()
  {
    if (this.T != null) {
      return;
    }
    this.T = this.R.a(this, 1);
    if (this.q) {
      this.T.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
    } else {
      this.T.setSize(getMeasuredWidth(), getMeasuredHeight());
    }
  }
  
  public void i(int paramInt) {}
  
  public void i(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, null);
  }
  
  public boolean isAttachedToWindow()
  {
    return this.B;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return getScrollingChildHelper().b();
  }
  
  Rect j(View paramView)
  {
    j localj = (j)paramView.getLayoutParams();
    if (!localj.c) {
      return localj.b;
    }
    if ((this.ra.d()) && ((localj.c()) || (localj.e()))) {
      return localj.b;
    }
    Rect localRect1 = localj.b;
    localRect1.set(0, 0, 0, 0);
    int i1 = this.y.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      this.s.set(0, 0, 0, 0);
      ((h)this.y.get(i2)).a(this.s, paramView, this, this.ra);
      int i3 = localRect1.left;
      Rect localRect2 = this.s;
      localRect1.left = (i3 + localRect2.left);
      localRect1.top += localRect2.top;
      localRect1.right += localRect2.right;
      localRect1.bottom += localRect2.bottom;
    }
    localj.c = false;
    return localRect1;
  }
  
  String j()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" ");
    localStringBuilder.append(super.toString());
    localStringBuilder.append(", adapter:");
    localStringBuilder.append(this.v);
    localStringBuilder.append(", layout:");
    localStringBuilder.append(this.w);
    localStringBuilder.append(", context:");
    localStringBuilder.append(getContext());
    return localStringBuilder.toString();
  }
  
  public void j(int paramInt)
  {
    int i1 = getItemDecorationCount();
    if ((paramInt >= 0) && (paramInt < i1))
    {
      b(d(paramInt));
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is an invalid index for size ");
    localStringBuilder.append(i1);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public boolean j(int paramInt1, int paramInt2)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2);
  }
  
  public void k(int paramInt)
  {
    if (this.H) {
      return;
    }
    i locali = this.w;
    if (locali == null)
    {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    locali.a(this, this.ra, paramInt);
  }
  
  public void k(View paramView) {}
  
  public boolean k()
  {
    boolean bool;
    if ((this.E) && (!this.N) && (!this.n.c())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  void l()
  {
    this.n = new i(new Ha(this));
  }
  
  public void l(View paramView) {}
  
  void m()
  {
    this.V = null;
    this.T = null;
    this.U = null;
    this.S = null;
  }
  
  boolean m(View paramView)
  {
    x();
    boolean bool = this.o.e(paramView);
    if (bool)
    {
      paramView = i(paramView);
      this.l.c(paramView);
      this.l.b(paramView);
    }
    c(bool ^ true);
    return bool;
  }
  
  boolean n()
  {
    AccessibilityManager localAccessibilityManager = this.L;
    boolean bool;
    if ((localAccessibilityManager != null) && (localAccessibilityManager.isEnabled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean o()
  {
    boolean bool;
    if (this.P > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.P = 0;
    boolean bool = true;
    this.B = true;
    if ((!this.E) || (isLayoutRequested())) {
      bool = false;
    }
    this.E = bool;
    Object localObject = this.w;
    if (localObject != null) {
      ((i)localObject).a(this);
    }
    this.xa = false;
    if (f)
    {
      this.pa = ((na)na.a.get());
      if (this.pa == null)
      {
        this.pa = new na();
        localObject = y.g(this);
        float f1;
        if ((!isInEditMode()) && (localObject != null))
        {
          f1 = ((Display)localObject).getRefreshRate();
          if (f1 >= 30.0F) {}
        }
        else
        {
          f1 = 60.0F;
        }
        localObject = this.pa;
        ((na)localObject).e = ((1.0E9F / f1));
        na.a.set(localObject);
      }
      this.pa.a(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = this.W;
    if (localObject != null) {
      ((f)localObject).b();
    }
    y();
    this.B = false;
    localObject = this.w;
    if (localObject != null) {
      ((i)localObject).a(this, this.l);
    }
    this.Ga.clear();
    removeCallbacks(this.Ha);
    this.p.b();
    if (f)
    {
      localObject = this.pa;
      if (localObject != null)
      {
        ((na)localObject).b(this);
        this.pa = null;
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = this.y.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((h)this.y.get(i2)).a(paramCanvas, this, this.ra);
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (this.w == null) {
      return false;
    }
    if (this.H) {
      return false;
    }
    if (paramMotionEvent.getAction() == 8)
    {
      float f2;
      if ((paramMotionEvent.getSource() & 0x2) != 0)
      {
        if (this.w.b()) {
          f1 = -paramMotionEvent.getAxisValue(9);
        } else {
          f1 = 0.0F;
        }
        f2 = f1;
        if (this.w.a())
        {
          float f3 = paramMotionEvent.getAxisValue(10);
          f2 = f1;
          f1 = f3;
          break label140;
        }
      }
      else
      {
        if ((paramMotionEvent.getSource() & 0x400000) != 0)
        {
          f1 = paramMotionEvent.getAxisValue(26);
          if (this.w.b())
          {
            f2 = -f1;
            break label138;
          }
          if (this.w.a())
          {
            f2 = 0.0F;
            break label140;
          }
        }
        f2 = 0.0F;
      }
      label138:
      float f1 = 0.0F;
      label140:
      if ((f2 != 0.0F) || (f1 != 0.0F)) {
        a((int)(f1 * this.la), (int)(f2 * this.ma), paramMotionEvent);
      }
    }
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.H;
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (b(paramMotionEvent))
    {
      z();
      return true;
    }
    i locali = this.w;
    if (locali == null) {
      return false;
    }
    boolean bool3 = locali.a();
    bool1 = this.w.b();
    if (this.ca == null) {
      this.ca = VelocityTracker.obtain();
    }
    this.ca.addMovement(paramMotionEvent);
    int i1 = paramMotionEvent.getActionMasked();
    int i2 = paramMotionEvent.getActionIndex();
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 5)
            {
              if (i1 == 6) {
                c(paramMotionEvent);
              }
            }
            else
            {
              this.ba = paramMotionEvent.getPointerId(i2);
              i1 = (int)(paramMotionEvent.getX(i2) + 0.5F);
              this.fa = i1;
              this.da = i1;
              i2 = (int)(paramMotionEvent.getY(i2) + 0.5F);
              this.ga = i2;
              this.ea = i2;
            }
          }
          else {
            z();
          }
        }
        else
        {
          i1 = paramMotionEvent.findPointerIndex(this.ba);
          if (i1 < 0)
          {
            paramMotionEvent = new StringBuilder();
            paramMotionEvent.append("Error processing scroll; pointer index for id ");
            paramMotionEvent.append(this.ba);
            paramMotionEvent.append(" not found. Did any MotionEvents get skipped?");
            Log.e("RecyclerView", paramMotionEvent.toString());
            return false;
          }
          i2 = (int)(paramMotionEvent.getX(i1) + 0.5F);
          int i3 = (int)(paramMotionEvent.getY(i1) + 0.5F);
          if (this.aa != 1)
          {
            i1 = this.da;
            int i4 = this.ea;
            if ((bool3) && (Math.abs(i2 - i1) > this.ha))
            {
              this.fa = i2;
              i2 = 1;
            }
            else
            {
              i2 = 0;
            }
            i1 = i2;
            if (bool1)
            {
              i1 = i2;
              if (Math.abs(i3 - i4) > this.ha)
              {
                this.ga = i3;
                i1 = 1;
              }
            }
            if (i1 != 0) {
              setScrollState(1);
            }
          }
        }
      }
      else
      {
        this.ca.clear();
        a(0);
      }
    }
    else
    {
      if (this.I) {
        this.I = false;
      }
      this.ba = paramMotionEvent.getPointerId(0);
      i2 = (int)(paramMotionEvent.getX() + 0.5F);
      this.fa = i2;
      this.da = i2;
      i2 = (int)(paramMotionEvent.getY() + 0.5F);
      this.ga = i2;
      this.ea = i2;
      if (this.aa == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
      }
      paramMotionEvent = this.Ea;
      paramMotionEvent[1] = 0;
      paramMotionEvent[0] = 0;
      if (bool3) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      i1 = i2;
      if (bool1) {
        i1 = i2 | 0x2;
      }
      j(i1, 0);
    }
    if (this.aa == 1) {
      bool2 = true;
    }
    return bool2;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Pc.a("RV OnLayout");
    d();
    Pc.a();
    this.E = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = this.w;
    if (localObject == null)
    {
      c(paramInt1, paramInt2);
      return;
    }
    boolean bool = ((i)localObject).u();
    int i1 = 0;
    if (bool)
    {
      int i2 = View.MeasureSpec.getMode(paramInt1);
      int i3 = View.MeasureSpec.getMode(paramInt2);
      this.w.a(this.l, this.ra, paramInt1, paramInt2);
      int i4 = i1;
      if (i2 == 1073741824)
      {
        i4 = i1;
        if (i3 == 1073741824) {
          i4 = 1;
        }
      }
      if ((i4 == 0) && (this.v != null))
      {
        if (this.ra.e == 1) {
          B();
        }
        this.w.b(paramInt1, paramInt2);
        this.ra.j = true;
        C();
        this.w.d(paramInt1, paramInt2);
        if (!this.w.A()) {
          return;
        }
        this.w.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        this.ra.j = true;
        C();
        this.w.d(paramInt1, paramInt2);
      }
    }
    else
    {
      if (this.C)
      {
        this.w.a(this.l, this.ra, paramInt1, paramInt2);
        return;
      }
      if (this.K)
      {
        x();
        r();
        J();
        s();
        localObject = this.ra;
        if (((u)localObject).l)
        {
          ((u)localObject).h = true;
        }
        else
        {
          this.n.b();
          this.ra.h = false;
        }
        this.K = false;
        c(false);
      }
      else if (this.ra.l)
      {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        return;
      }
      localObject = this.v;
      if (localObject != null) {
        this.ra.f = ((a)localObject).a();
      } else {
        this.ra.f = 0;
      }
      x();
      this.w.a(this.l, this.ra, paramInt1, paramInt2);
      c(false);
      this.ra.h = false;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    if (o()) {
      return false;
    }
    return super.onRequestFocusInDescendants(paramInt, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof s))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    this.m = ((s)paramParcelable);
    super.onRestoreInstanceState(this.m.l());
    i locali = this.w;
    if (locali != null)
    {
      paramParcelable = this.m.c;
      if (paramParcelable != null) {
        locali.a(paramParcelable);
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    s locals = new s(super.onSaveInstanceState());
    Object localObject = this.m;
    if (localObject != null)
    {
      locals.a((s)localObject);
    }
    else
    {
      localObject = this.w;
      if (localObject != null) {
        locals.c = ((i)localObject).x();
      } else {
        locals.c = null;
      }
    }
    return locals;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      m();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.H;
    int i1 = 0;
    if ((!bool1) && (!this.I))
    {
      if (a(paramMotionEvent))
      {
        z();
        return true;
      }
      Object localObject = this.w;
      if (localObject == null) {
        return false;
      }
      boolean bool2 = ((i)localObject).a();
      bool1 = this.w.b();
      if (this.ca == null) {
        this.ca = VelocityTracker.obtain();
      }
      localObject = MotionEvent.obtain(paramMotionEvent);
      int i2 = paramMotionEvent.getActionMasked();
      int i3 = paramMotionEvent.getActionIndex();
      if (i2 == 0)
      {
        arrayOfInt = this.Ea;
        arrayOfInt[1] = 0;
        arrayOfInt[0] = 0;
      }
      int[] arrayOfInt = this.Ea;
      ((MotionEvent)localObject).offsetLocation(arrayOfInt[0], arrayOfInt[1]);
      if (i2 != 0)
      {
        if (i2 != 1)
        {
          if (i2 != 2)
          {
            if (i2 != 3)
            {
              if (i2 != 5)
              {
                if (i2 != 6)
                {
                  i3 = i1;
                }
                else
                {
                  c(paramMotionEvent);
                  i3 = i1;
                }
              }
              else
              {
                this.ba = paramMotionEvent.getPointerId(i3);
                i2 = (int)(paramMotionEvent.getX(i3) + 0.5F);
                this.fa = i2;
                this.da = i2;
                i3 = (int)(paramMotionEvent.getY(i3) + 0.5F);
                this.ga = i3;
                this.ea = i3;
                i3 = i1;
              }
            }
            else
            {
              z();
              i3 = i1;
            }
          }
          else
          {
            i3 = paramMotionEvent.findPointerIndex(this.ba);
            if (i3 < 0)
            {
              paramMotionEvent = new StringBuilder();
              paramMotionEvent.append("Error processing scroll; pointer index for id ");
              paramMotionEvent.append(this.ba);
              paramMotionEvent.append(" not found. Did any MotionEvents get skipped?");
              Log.e("RecyclerView", paramMotionEvent.toString());
              return false;
            }
            int i4 = (int)(paramMotionEvent.getX(i3) + 0.5F);
            int i5 = (int)(paramMotionEvent.getY(i3) + 0.5F);
            int i6 = this.fa - i4;
            int i7 = this.ga - i5;
            i2 = i6;
            i3 = i7;
            if (a(i6, i7, this.Da, this.Ca, 0))
            {
              paramMotionEvent = this.Da;
              i2 = i6 - paramMotionEvent[0];
              i3 = i7 - paramMotionEvent[1];
              paramMotionEvent = this.Ca;
              ((MotionEvent)localObject).offsetLocation(paramMotionEvent[0], paramMotionEvent[1]);
              arrayOfInt = this.Ea;
              i7 = arrayOfInt[0];
              paramMotionEvent = this.Ca;
              arrayOfInt[0] = (i7 + paramMotionEvent[0]);
              arrayOfInt[1] += paramMotionEvent[1];
            }
            i6 = i2;
            i7 = i3;
            if (this.aa != 1)
            {
              if (bool2)
              {
                i6 = Math.abs(i2);
                i7 = this.ha;
                if (i6 > i7)
                {
                  if (i2 > 0) {
                    i2 -= i7;
                  } else {
                    i2 += i7;
                  }
                  i7 = 1;
                  break label549;
                }
              }
              i7 = 0;
              label549:
              int i8 = i7;
              int i9 = i3;
              if (bool1)
              {
                i6 = Math.abs(i3);
                int i10 = this.ha;
                i8 = i7;
                i9 = i3;
                if (i6 > i10)
                {
                  if (i3 > 0) {
                    i9 = i3 - i10;
                  } else {
                    i9 = i3 + i10;
                  }
                  i8 = 1;
                }
              }
              i6 = i2;
              i7 = i9;
              if (i8 != 0)
              {
                setScrollState(1);
                i7 = i9;
                i6 = i2;
              }
            }
            i3 = i1;
            if (this.aa == 1)
            {
              paramMotionEvent = this.Ca;
              this.fa = (i4 - paramMotionEvent[0]);
              this.ga = (i5 - paramMotionEvent[1]);
              if (bool2) {
                i3 = i6;
              } else {
                i3 = 0;
              }
              if (bool1) {
                i2 = i7;
              } else {
                i2 = 0;
              }
              if (a(i3, i2, (MotionEvent)localObject)) {
                getParent().requestDisallowInterceptTouchEvent(true);
              }
              i3 = i1;
              if (this.pa != null) {
                if (i6 == 0)
                {
                  i3 = i1;
                  if (i7 == 0) {}
                }
                else
                {
                  this.pa.a(this, i6, i7);
                  i3 = i1;
                }
              }
            }
          }
        }
        else
        {
          this.ca.addMovement((MotionEvent)localObject);
          this.ca.computeCurrentVelocity(1000, this.ka);
          float f1;
          if (bool2) {
            f1 = -this.ca.getXVelocity(this.ba);
          } else {
            f1 = 0.0F;
          }
          float f2;
          if (bool1) {
            f2 = -this.ca.getYVelocity(this.ba);
          } else {
            f2 = 0.0F;
          }
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!e((int)f1, (int)f2))) {
            setScrollState(0);
          }
          N();
          i3 = 1;
        }
      }
      else
      {
        this.ba = paramMotionEvent.getPointerId(0);
        i3 = (int)(paramMotionEvent.getX() + 0.5F);
        this.fa = i3;
        this.da = i3;
        i3 = (int)(paramMotionEvent.getY() + 0.5F);
        this.ga = i3;
        this.ea = i3;
        if (bool2) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        i2 = i3;
        if (bool1) {
          i2 = i3 | 0x2;
        }
        j(i2, 0);
        i3 = i1;
      }
      if (i3 == 0) {
        this.ca.addMovement((MotionEvent)localObject);
      }
      ((MotionEvent)localObject).recycle();
      return true;
    }
    return false;
  }
  
  void p()
  {
    int i1 = this.o.b();
    for (int i2 = 0; i2 < i1; i2++) {
      ((j)this.o.d(i2).getLayoutParams()).c = true;
    }
    this.l.g();
  }
  
  void q()
  {
    int i1 = this.o.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      x localx = i(this.o.d(i2));
      if ((localx != null) && (!localx.x())) {
        localx.a(6);
      }
    }
    p();
    this.l.h();
  }
  
  void r()
  {
    this.P += 1;
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    x localx = i(paramView);
    if (localx != null) {
      if (localx.r())
      {
        localx.d();
      }
      else if (!localx.x())
      {
        paramView = new StringBuilder();
        paramView.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
        paramView.append(localx);
        paramView.append(j());
        throw new IllegalArgumentException(paramView.toString());
      }
    }
    paramView.clearAnimation();
    b(paramView);
    super.removeDetachedView(paramView, paramBoolean);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if ((!this.w.a(this, this.ra, paramView1, paramView2)) && (paramView2 != null)) {
      a(paramView1, paramView2);
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return this.w.a(this, paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i1 = this.z.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((m)this.z.get(i2)).a(paramBoolean);
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if ((this.F == 0) && (!this.H)) {
      super.requestLayout();
    } else {
      this.G = true;
    }
  }
  
  void s()
  {
    a(true);
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    i locali = this.w;
    if (locali == null)
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    if (this.H) {
      return;
    }
    boolean bool1 = locali.a();
    boolean bool2 = this.w.b();
    if ((bool1) || (bool2))
    {
      if (!bool1) {
        paramInt1 = 0;
      }
      if (!bool2) {
        paramInt2 = 0;
      }
      a(paramInt1, paramInt2, null);
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    if (a(paramAccessibilityEvent)) {
      return;
    }
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(La paramLa)
  {
    this.ya = paramLa;
    y.a(this, this.ya);
  }
  
  public void setAdapter(a parama)
  {
    setLayoutFrozen(false);
    a(parama, false, true);
    b(false);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(d paramd)
  {
    if (paramd == this.za) {
      return;
    }
    this.za = paramd;
    boolean bool;
    if (this.za != null) {
      bool = true;
    } else {
      bool = false;
    }
    setChildrenDrawingOrderEnabled(bool);
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.q) {
      m();
    }
    this.q = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.E) {
      requestLayout();
    }
  }
  
  public void setEdgeEffectFactory(e parame)
  {
    td.a(parame);
    this.R = parame;
    m();
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }
  
  public void setItemAnimator(f paramf)
  {
    f localf = this.W;
    if (localf != null)
    {
      localf.b();
      this.W.a(null);
    }
    this.W = paramf;
    paramf = this.W;
    if (paramf != null) {
      paramf.a(this.wa);
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    this.l.f(paramInt);
  }
  
  public void setLayoutFrozen(boolean paramBoolean)
  {
    if (paramBoolean != this.H)
    {
      a("Do not setLayoutFrozen in layout or scroll");
      if (!paramBoolean)
      {
        this.H = false;
        if ((this.G) && (this.w != null) && (this.v != null)) {
          requestLayout();
        }
        this.G = false;
      }
      else
      {
        long l1 = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
        this.H = true;
        this.I = true;
        y();
      }
    }
  }
  
  public void setLayoutManager(i parami)
  {
    if (parami == this.w) {
      return;
    }
    y();
    Object localObject;
    if (this.w != null)
    {
      localObject = this.W;
      if (localObject != null) {
        ((f)localObject).b();
      }
      this.w.b(this.l);
      this.w.c(this.l);
      this.l.a();
      if (this.B) {
        this.w.a(this, this.l);
      }
      this.w.f(null);
      this.w = null;
    }
    else
    {
      this.l.a();
    }
    this.o.c();
    this.w = parami;
    if (parami != null) {
      if (parami.b == null)
      {
        this.w.f(this);
        if (this.B) {
          this.w.a(this);
        }
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("LayoutManager ");
        ((StringBuilder)localObject).append(parami);
        ((StringBuilder)localObject).append(" is already attached to a RecyclerView:");
        ((StringBuilder)localObject).append(parami.b.j());
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
    }
    this.l.j();
    requestLayout();
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    getScrollingChildHelper().a(paramBoolean);
  }
  
  public void setOnFlingListener(l paraml)
  {
    this.ia = paraml;
  }
  
  @Deprecated
  public void setOnScrollListener(n paramn)
  {
    this.sa = paramn;
  }
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean)
  {
    this.na = paramBoolean;
  }
  
  public void setRecycledViewPool(o paramo)
  {
    this.l.a(paramo);
  }
  
  public void setRecyclerListener(q paramq)
  {
    this.x = paramq;
  }
  
  void setScrollState(int paramInt)
  {
    if (paramInt == this.aa) {
      return;
    }
    this.aa = paramInt;
    if (paramInt != 2) {
      P();
    }
    b(paramInt);
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    if (paramInt != 0) {
      if (paramInt != 1)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("setScrollingTouchSlop(): bad argument constant ");
        localStringBuilder.append(paramInt);
        localStringBuilder.append("; using default value");
        Log.w("RecyclerView", localStringBuilder.toString());
      }
      else
      {
        this.ha = localViewConfiguration.getScaledPagingTouchSlop();
        return;
      }
    }
    this.ha = localViewConfiguration.getScaledTouchSlop();
  }
  
  public void setViewCacheExtension(v paramv)
  {
    this.l.a(paramv);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return getScrollingChildHelper().b(paramInt);
  }
  
  public void stopNestedScroll()
  {
    getScrollingChildHelper().c();
  }
  
  void t()
  {
    if ((!this.xa) && (this.B))
    {
      y.a(this, this.Ha);
      this.xa = true;
    }
  }
  
  void u()
  {
    Object localObject = this.W;
    if (localObject != null) {
      ((f)localObject).b();
    }
    localObject = this.w;
    if (localObject != null)
    {
      ((i)localObject).b(this.l);
      this.w.c(this.l);
    }
    this.l.a();
  }
  
  void v()
  {
    int i1 = this.o.a();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = this.o.c(i2);
      Object localObject = h(localView);
      if (localObject != null)
      {
        localObject = ((x)localObject).j;
        if (localObject != null)
        {
          localObject = ((x)localObject).b;
          int i3 = localView.getLeft();
          int i4 = localView.getTop();
          if ((i3 != ((View)localObject).getLeft()) || (i4 != ((View)localObject).getTop())) {
            ((View)localObject).layout(i3, i4, ((View)localObject).getWidth() + i3, ((View)localObject).getHeight() + i4);
          }
        }
      }
    }
  }
  
  void w()
  {
    int i1 = this.o.b();
    for (int i2 = 0; i2 < i1; i2++)
    {
      x localx = i(this.o.d(i2));
      if (!localx.x()) {
        localx.v();
      }
    }
  }
  
  void x()
  {
    this.F += 1;
    if ((this.F == 1) && (!this.H)) {
      this.G = false;
    }
  }
  
  public void y()
  {
    setScrollState(0);
    P();
  }
  
  public static abstract class a<VH extends RecyclerView.x>
  {
    private final RecyclerView.b a = new RecyclerView.b();
    private boolean b = false;
    
    public abstract int a();
    
    public long a(int paramInt)
    {
      return -1L;
    }
    
    public final VH a(ViewGroup paramViewGroup, int paramInt)
    {
      try
      {
        Pc.a("RV CreateView");
        paramViewGroup = b(paramViewGroup, paramInt);
        if (paramViewGroup.b.getParent() == null)
        {
          paramViewGroup.g = paramInt;
          return paramViewGroup;
        }
        paramViewGroup = new java/lang/IllegalStateException;
        paramViewGroup.<init>("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        throw paramViewGroup;
      }
      finally
      {
        Pc.a();
      }
    }
    
    public final void a(int paramInt1, int paramInt2)
    {
      this.a.a(paramInt1, paramInt2);
    }
    
    public final void a(int paramInt1, int paramInt2, Object paramObject)
    {
      this.a.a(paramInt1, paramInt2, paramObject);
    }
    
    public void a(RecyclerView.c paramc)
    {
      this.a.registerObserver(paramc);
    }
    
    public final void a(VH paramVH, int paramInt)
    {
      paramVH.d = paramInt;
      if (c()) {
        paramVH.f = a(paramInt);
      }
      paramVH.a(1, 519);
      Pc.a("RV OnBindView");
      a(paramVH, paramInt, paramVH.k());
      paramVH.b();
      paramVH = paramVH.b.getLayoutParams();
      if ((paramVH instanceof RecyclerView.j)) {
        ((RecyclerView.j)paramVH).c = true;
      }
      Pc.a();
    }
    
    public void a(VH paramVH, int paramInt, List<Object> paramList)
    {
      b(paramVH, paramInt);
    }
    
    public void a(RecyclerView paramRecyclerView) {}
    
    public void a(boolean paramBoolean)
    {
      if (!b())
      {
        this.b = paramBoolean;
        return;
      }
      throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
    
    public boolean a(VH paramVH)
    {
      return false;
    }
    
    public int b(int paramInt)
    {
      return 0;
    }
    
    public abstract VH b(ViewGroup paramViewGroup, int paramInt);
    
    public final void b(int paramInt1, int paramInt2)
    {
      this.a.c(paramInt1, paramInt2);
    }
    
    public void b(RecyclerView.c paramc)
    {
      this.a.unregisterObserver(paramc);
    }
    
    public void b(VH paramVH) {}
    
    public abstract void b(VH paramVH, int paramInt);
    
    public void b(RecyclerView paramRecyclerView) {}
    
    public final boolean b()
    {
      return this.a.a();
    }
    
    public final void c(int paramInt)
    {
      this.a.b(paramInt, 1);
    }
    
    public final void c(int paramInt1, int paramInt2)
    {
      this.a.d(paramInt1, paramInt2);
    }
    
    public void c(VH paramVH) {}
    
    public final boolean c()
    {
      return this.b;
    }
    
    public final void d()
    {
      this.a.b();
    }
    
    public void d(VH paramVH) {}
  }
  
  static class b
    extends Observable<RecyclerView.c>
  {
    public void a(int paramInt1, int paramInt2)
    {
      for (int i = this.mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.c)this.mObservers.get(i)).a(paramInt1, paramInt2, 1);
      }
    }
    
    public void a(int paramInt1, int paramInt2, Object paramObject)
    {
      for (int i = this.mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.c)this.mObservers.get(i)).a(paramInt1, paramInt2, paramObject);
      }
    }
    
    public boolean a()
    {
      return this.mObservers.isEmpty() ^ true;
    }
    
    public void b()
    {
      for (int i = this.mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.c)this.mObservers.get(i)).a();
      }
    }
    
    public void b(int paramInt1, int paramInt2)
    {
      a(paramInt1, paramInt2, null);
    }
    
    public void c(int paramInt1, int paramInt2)
    {
      for (int i = this.mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.c)this.mObservers.get(i)).b(paramInt1, paramInt2);
      }
    }
    
    public void d(int paramInt1, int paramInt2)
    {
      for (int i = this.mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.c)this.mObservers.get(i)).c(paramInt1, paramInt2);
      }
    }
  }
  
  public static abstract class c
  {
    public void a() {}
    
    public void a(int paramInt1, int paramInt2) {}
    
    public void a(int paramInt1, int paramInt2, int paramInt3) {}
    
    public void a(int paramInt1, int paramInt2, Object paramObject)
    {
      a(paramInt1, paramInt2);
    }
    
    public void b(int paramInt1, int paramInt2) {}
    
    public void c(int paramInt1, int paramInt2) {}
  }
  
  public static abstract interface d
  {
    public abstract int a(int paramInt1, int paramInt2);
  }
  
  public static class e
  {
    protected EdgeEffect a(RecyclerView paramRecyclerView, int paramInt)
    {
      return new EdgeEffect(paramRecyclerView.getContext());
    }
  }
  
  public static abstract class f
  {
    private b a = null;
    private ArrayList<a> b = new ArrayList();
    private long c = 120L;
    private long d = 120L;
    private long e = 250L;
    private long f = 250L;
    
    static int a(RecyclerView.x paramx)
    {
      int i = paramx.k & 0xE;
      if (paramx.n()) {
        return 4;
      }
      int j = i;
      if ((i & 0x4) == 0)
      {
        int k = paramx.j();
        int m = paramx.f();
        j = i;
        if (k != -1)
        {
          j = i;
          if (m != -1)
          {
            j = i;
            if (k != m) {
              j = i | 0x800;
            }
          }
        }
      }
      return j;
    }
    
    public c a(RecyclerView.u paramu, RecyclerView.x paramx)
    {
      paramu = h();
      paramu.a(paramx);
      return paramu;
    }
    
    public c a(RecyclerView.u paramu, RecyclerView.x paramx, int paramInt, List<Object> paramList)
    {
      paramu = h();
      paramu.a(paramx);
      return paramu;
    }
    
    public final void a()
    {
      int i = this.b.size();
      for (int j = 0; j < i; j++) {
        ((a)this.b.get(j)).a();
      }
      this.b.clear();
    }
    
    public void a(long paramLong)
    {
      this.c = paramLong;
    }
    
    void a(b paramb)
    {
      this.a = paramb;
    }
    
    public abstract boolean a(RecyclerView.x paramx, c paramc1, c paramc2);
    
    public abstract boolean a(RecyclerView.x paramx1, RecyclerView.x paramx2, c paramc1, c paramc2);
    
    public boolean a(RecyclerView.x paramx, List<Object> paramList)
    {
      return b(paramx);
    }
    
    public abstract void b();
    
    public void b(long paramLong)
    {
      this.f = paramLong;
    }
    
    public abstract boolean b(RecyclerView.x paramx);
    
    public abstract boolean b(RecyclerView.x paramx, c paramc1, c paramc2);
    
    public long c()
    {
      return this.c;
    }
    
    public void c(long paramLong)
    {
      this.e = paramLong;
    }
    
    public final void c(RecyclerView.x paramx)
    {
      e(paramx);
      b localb = this.a;
      if (localb != null) {
        localb.a(paramx);
      }
    }
    
    public abstract boolean c(RecyclerView.x paramx, c paramc1, c paramc2);
    
    public long d()
    {
      return this.f;
    }
    
    public void d(long paramLong)
    {
      this.d = paramLong;
    }
    
    public abstract void d(RecyclerView.x paramx);
    
    public long e()
    {
      return this.e;
    }
    
    public void e(RecyclerView.x paramx) {}
    
    public long f()
    {
      return this.d;
    }
    
    public abstract boolean g();
    
    public c h()
    {
      return new c();
    }
    
    public abstract void i();
    
    public static abstract interface a
    {
      public abstract void a();
    }
    
    static abstract interface b
    {
      public abstract void a(RecyclerView.x paramx);
    }
    
    public static class c
    {
      public int a;
      public int b;
      public int c;
      public int d;
      
      public c a(RecyclerView.x paramx)
      {
        a(paramx, 0);
        return this;
      }
      
      public c a(RecyclerView.x paramx, int paramInt)
      {
        paramx = paramx.b;
        this.a = paramx.getLeft();
        this.b = paramx.getTop();
        this.c = paramx.getRight();
        this.d = paramx.getBottom();
        return this;
      }
    }
  }
  
  private class g
    implements RecyclerView.f.b
  {
    g() {}
    
    public void a(RecyclerView.x paramx)
    {
      paramx.a(true);
      if ((paramx.i != null) && (paramx.j == null)) {
        paramx.i = null;
      }
      paramx.j = null;
      if ((!paramx.w()) && (!RecyclerView.this.m(paramx.b)) && (paramx.r())) {
        RecyclerView.this.removeDetachedView(paramx.b, false);
      }
    }
  }
  
  public static abstract class h
  {
    @Deprecated
    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
    
    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.u paramu)
    {
      a(paramCanvas, paramRecyclerView);
    }
    
    @Deprecated
    public void a(Rect paramRect, int paramInt, RecyclerView paramRecyclerView)
    {
      paramRect.set(0, 0, 0, 0);
    }
    
    public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.u paramu)
    {
      a(paramRect, ((RecyclerView.j)paramView.getLayoutParams()).b(), paramRecyclerView);
    }
    
    @Deprecated
    public void b(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
    
    public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.u paramu)
    {
      b(paramCanvas, paramRecyclerView);
    }
  }
  
  public static abstract class i
  {
    T a;
    RecyclerView b;
    private final Db.b c = new Ia(this);
    private final Db.b d = new Ja(this);
    Db e = new Db(this.c);
    Db f = new Db(this.d);
    RecyclerView.t g;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    private boolean k = true;
    private boolean l = true;
    int m;
    boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    
    public static int a(int paramInt1, int paramInt2, int paramInt3)
    {
      int i1 = View.MeasureSpec.getMode(paramInt1);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      if (i1 != Integer.MIN_VALUE)
      {
        if (i1 != 1073741824) {
          paramInt1 = Math.max(paramInt2, paramInt3);
        }
        return paramInt1;
      }
      return Math.min(paramInt1, Math.max(paramInt2, paramInt3));
    }
    
    public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      int i1 = 0;
      int i2 = Math.max(0, paramInt1 - paramInt3);
      if (paramBoolean)
      {
        if (paramInt4 < 0)
        {
          if (paramInt4 != -1) {
            break label120;
          }
          if ((paramInt2 != Integer.MIN_VALUE) && ((paramInt2 == 0) || (paramInt2 != 1073741824)))
          {
            paramInt2 = 0;
            paramInt1 = 0;
          }
          else
          {
            paramInt1 = i2;
          }
          paramInt3 = paramInt1;
          paramInt1 = paramInt2;
          break label125;
        }
      }
      else {
        if (paramInt4 < 0) {
          break label74;
        }
      }
      paramInt3 = paramInt4;
      paramInt1 = 1073741824;
      break label125;
      label74:
      if (paramInt4 == -1)
      {
        paramInt1 = paramInt2;
        paramInt3 = i2;
      }
      else if (paramInt4 == -2)
      {
        if (paramInt2 != Integer.MIN_VALUE)
        {
          paramInt3 = i2;
          paramInt1 = i1;
          if (paramInt2 != 1073741824) {}
        }
        else
        {
          paramInt1 = Integer.MIN_VALUE;
          paramInt3 = i2;
        }
      }
      else
      {
        label120:
        paramInt3 = 0;
        paramInt1 = i1;
      }
      label125:
      return View.MeasureSpec.makeMeasureSpec(paramInt3, paramInt1);
    }
    
    public static b a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
    {
      b localb = new b();
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ce.RecyclerView, paramInt1, paramInt2);
      localb.a = paramContext.getInt(ce.RecyclerView_android_orientation, 1);
      localb.b = paramContext.getInt(ce.RecyclerView_spanCount, 1);
      localb.c = paramContext.getBoolean(ce.RecyclerView_reverseLayout, false);
      localb.d = paramContext.getBoolean(ce.RecyclerView_stackFromEnd, false);
      paramContext.recycle();
      return localb;
    }
    
    private void a(int paramInt, View paramView)
    {
      this.a.a(paramInt);
    }
    
    private void a(RecyclerView.p paramp, int paramInt, View paramView)
    {
      RecyclerView.x localx = RecyclerView.i(paramView);
      if (localx.x()) {
        return;
      }
      if ((localx.n()) && (!localx.p()) && (!this.b.v.c()))
      {
        h(paramInt);
        paramp.b(localx);
      }
      else
      {
        b(paramInt);
        paramp.c(paramView);
        this.b.p.d(localx);
      }
    }
    
    private void a(View paramView, int paramInt, boolean paramBoolean)
    {
      RecyclerView.x localx = RecyclerView.i(paramView);
      if ((!paramBoolean) && (!localx.p())) {
        this.b.p.g(localx);
      } else {
        this.b.p.a(localx);
      }
      Object localObject = (RecyclerView.j)paramView.getLayoutParams();
      if ((!localx.z()) && (!localx.q()))
      {
        if (paramView.getParent() == this.b)
        {
          int i1 = this.a.b(paramView);
          int i2 = paramInt;
          if (paramInt == -1) {
            i2 = this.a.a();
          }
          if (i1 != -1)
          {
            if (i1 != i2) {
              this.b.w.a(i1, i2);
            }
          }
          else
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
            ((StringBuilder)localObject).append(this.b.indexOfChild(paramView));
            ((StringBuilder)localObject).append(this.b.j());
            throw new IllegalStateException(((StringBuilder)localObject).toString());
          }
        }
        else
        {
          this.a.a(paramView, paramInt, false);
          ((RecyclerView.j)localObject).c = true;
          RecyclerView.t localt = this.g;
          if ((localt != null) && (localt.e())) {
            this.g.b(paramView);
          }
        }
      }
      else
      {
        if (localx.q()) {
          localx.y();
        } else {
          localx.c();
        }
        this.a.a(paramView, paramInt, paramView.getLayoutParams(), false);
      }
      if (((RecyclerView.j)localObject).d)
      {
        localx.b.invalidate();
        ((RecyclerView.j)localObject).d = false;
      }
    }
    
    private static boolean b(int paramInt1, int paramInt2, int paramInt3)
    {
      int i1 = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      boolean bool1 = false;
      boolean bool2 = false;
      if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {
        return false;
      }
      if (i1 != Integer.MIN_VALUE)
      {
        if (i1 != 0)
        {
          if (i1 != 1073741824) {
            return false;
          }
          if (paramInt2 == paramInt1) {
            bool2 = true;
          }
          return bool2;
        }
        return true;
      }
      bool2 = bool1;
      if (paramInt2 >= paramInt1) {
        bool2 = true;
      }
      return bool2;
    }
    
    private int[] b(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
    {
      int i1 = n();
      int i2 = p();
      int i3 = q();
      int i4 = o();
      int i5 = h();
      int i6 = m();
      int i7 = paramView.getLeft() + paramRect.left - paramView.getScrollX();
      int i8 = paramView.getTop() + paramRect.top - paramView.getScrollY();
      int i9 = paramRect.width();
      int i10 = paramRect.height();
      int i11 = i7 - i1;
      i1 = Math.min(0, i11);
      int i12 = i8 - i2;
      i2 = Math.min(0, i12);
      i9 = i9 + i7 - (i3 - i4);
      i3 = Math.max(0, i9);
      i10 = Math.max(0, i10 + i8 - (i5 - i6));
      if (j() == 1)
      {
        if (i3 != 0) {
          i1 = i3;
        } else {
          i1 = Math.max(i1, i9);
        }
      }
      else if (i1 == 0) {
        i1 = Math.min(i11, i3);
      }
      if (i2 == 0) {
        i2 = Math.min(i12, i10);
      }
      return new int[] { i1, i2 };
    }
    
    private boolean d(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
      View localView = paramRecyclerView.getFocusedChild();
      if (localView == null) {
        return false;
      }
      int i1 = n();
      int i2 = p();
      int i3 = q();
      int i4 = o();
      int i5 = h();
      int i6 = m();
      paramRecyclerView = this.b.s;
      b(localView, paramRecyclerView);
      return (paramRecyclerView.left - paramInt1 < i3 - i4) && (paramRecyclerView.right - paramInt1 > i1) && (paramRecyclerView.top - paramInt2 < i5 - i6) && (paramRecyclerView.bottom - paramInt2 > i2);
    }
    
    boolean A()
    {
      return false;
    }
    
    void B()
    {
      RecyclerView.t localt = this.g;
      if (localt != null) {
        localt.h();
      }
    }
    
    public boolean C()
    {
      return false;
    }
    
    public int a(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
    {
      return 0;
    }
    
    public int a(RecyclerView.p paramp, RecyclerView.u paramu)
    {
      paramp = this.b;
      int i1 = 1;
      int i2 = i1;
      if (paramp != null) {
        if (paramp.v == null)
        {
          i2 = i1;
        }
        else
        {
          i2 = i1;
          if (a()) {
            i2 = this.b.v.a();
          }
        }
      }
      return i2;
    }
    
    public int a(RecyclerView.u paramu)
    {
      return 0;
    }
    
    public RecyclerView.j a(Context paramContext, AttributeSet paramAttributeSet)
    {
      return new RecyclerView.j(paramContext, paramAttributeSet);
    }
    
    public RecyclerView.j a(ViewGroup.LayoutParams paramLayoutParams)
    {
      if ((paramLayoutParams instanceof RecyclerView.j)) {
        return new RecyclerView.j((RecyclerView.j)paramLayoutParams);
      }
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
        return new RecyclerView.j((ViewGroup.MarginLayoutParams)paramLayoutParams);
      }
      return new RecyclerView.j(paramLayoutParams);
    }
    
    public View a(View paramView, int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
    {
      return null;
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      Object localObject = d(paramInt1);
      if (localObject != null)
      {
        b(paramInt1);
        c((View)localObject, paramInt2);
        return;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Cannot move a child from non-existing index:");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append(this.b.toString());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    
    public void a(int paramInt1, int paramInt2, RecyclerView.u paramu, a parama) {}
    
    public void a(int paramInt, a parama) {}
    
    public void a(int paramInt, RecyclerView.p paramp)
    {
      View localView = d(paramInt);
      h(paramInt);
      paramp.b(localView);
    }
    
    public void a(Rect paramRect, int paramInt1, int paramInt2)
    {
      int i1 = paramRect.width();
      int i2 = n();
      int i3 = o();
      int i4 = paramRect.height();
      int i5 = p();
      int i6 = m();
      c(a(paramInt1, i1 + i2 + i3, l()), a(paramInt2, i4 + i5 + i6, k()));
    }
    
    public void a(Parcelable paramParcelable) {}
    
    public void a(RecyclerView.a parama1, RecyclerView.a parama2) {}
    
    public void a(RecyclerView.p paramp)
    {
      for (int i1 = e() - 1; i1 >= 0; i1--) {
        a(paramp, i1, d(i1));
      }
    }
    
    public void a(RecyclerView.p paramp, RecyclerView.u paramu, int paramInt1, int paramInt2)
    {
      this.b.c(paramInt1, paramInt2);
    }
    
    public void a(RecyclerView.p paramp, RecyclerView.u paramu, View paramView, zd paramzd)
    {
      int i1;
      if (b()) {
        i1 = l(paramView);
      } else {
        i1 = 0;
      }
      int i2;
      if (a()) {
        i2 = l(paramView);
      } else {
        i2 = 0;
      }
      paramzd.b(zd.c.a(i1, 1, i2, 1, false, false));
    }
    
    public void a(RecyclerView.p paramp, RecyclerView.u paramu, AccessibilityEvent paramAccessibilityEvent)
    {
      paramp = this.b;
      if ((paramp != null) && (paramAccessibilityEvent != null))
      {
        boolean bool1 = true;
        boolean bool2 = bool1;
        if (!paramp.canScrollVertically(1))
        {
          bool2 = bool1;
          if (!this.b.canScrollVertically(-1))
          {
            bool2 = bool1;
            if (!this.b.canScrollHorizontally(-1)) {
              if (this.b.canScrollHorizontally(1)) {
                bool2 = bool1;
              } else {
                bool2 = false;
              }
            }
          }
        }
        paramAccessibilityEvent.setScrollable(bool2);
        paramp = this.b.v;
        if (paramp != null) {
          paramAccessibilityEvent.setItemCount(paramp.a());
        }
      }
    }
    
    public void a(RecyclerView.p paramp, RecyclerView.u paramu, zd paramzd)
    {
      if ((this.b.canScrollVertically(-1)) || (this.b.canScrollHorizontally(-1)))
      {
        paramzd.a(8192);
        paramzd.k(true);
      }
      if ((this.b.canScrollVertically(1)) || (this.b.canScrollHorizontally(1)))
      {
        paramzd.a(4096);
        paramzd.k(true);
      }
      paramzd.a(zd.b.a(b(paramp, paramu), a(paramp, paramu), d(paramp, paramu), c(paramp, paramu)));
    }
    
    void a(RecyclerView.t paramt)
    {
      if (this.g == paramt) {
        this.g = null;
      }
    }
    
    void a(RecyclerView paramRecyclerView)
    {
      this.i = true;
      b(paramRecyclerView);
    }
    
    public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
    
    public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
    {
      c(paramRecyclerView, paramInt1, paramInt2);
    }
    
    void a(RecyclerView paramRecyclerView, RecyclerView.p paramp)
    {
      this.i = false;
      b(paramRecyclerView, paramp);
    }
    
    public void a(RecyclerView paramRecyclerView, RecyclerView.u paramu, int paramInt)
    {
      Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }
    
    public void a(View paramView)
    {
      a(paramView, -1);
    }
    
    public void a(View paramView, int paramInt)
    {
      a(paramView, paramInt, true);
    }
    
    public void a(View paramView, int paramInt1, int paramInt2)
    {
      RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
      Rect localRect = this.b.j(paramView);
      int i1 = localRect.left;
      int i2 = localRect.right;
      int i3 = localRect.top;
      int i4 = localRect.bottom;
      paramInt1 = a(q(), r(), n() + o() + localj.leftMargin + localj.rightMargin + (paramInt1 + (i1 + i2)), localj.width, a());
      paramInt2 = a(h(), i(), p() + m() + localj.topMargin + localj.bottomMargin + (paramInt2 + (i3 + i4)), localj.height, b());
      if (a(paramView, paramInt1, paramInt2, localj)) {
        paramView.measure(paramInt1, paramInt2);
      }
    }
    
    public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      RecyclerView.j localj = (RecyclerView.j)paramView.getLayoutParams();
      Rect localRect = localj.b;
      paramView.layout(paramInt1 + localRect.left + localj.leftMargin, paramInt2 + localRect.top + localj.topMargin, paramInt3 - localRect.right - localj.rightMargin, paramInt4 - localRect.bottom - localj.bottomMargin);
    }
    
    public void a(View paramView, int paramInt, RecyclerView.j paramj)
    {
      RecyclerView.x localx = RecyclerView.i(paramView);
      if (localx.p()) {
        this.b.p.a(localx);
      } else {
        this.b.p.g(localx);
      }
      this.a.a(paramView, paramInt, paramj, localx.p());
    }
    
    public void a(View paramView, Rect paramRect)
    {
      RecyclerView localRecyclerView = this.b;
      if (localRecyclerView == null)
      {
        paramRect.set(0, 0, 0, 0);
        return;
      }
      paramRect.set(localRecyclerView.j(paramView));
    }
    
    public void a(View paramView, RecyclerView.p paramp)
    {
      o(paramView);
      paramp.b(paramView);
    }
    
    void a(View paramView, zd paramzd)
    {
      Object localObject = RecyclerView.i(paramView);
      if ((localObject != null) && (!((RecyclerView.x)localObject).p()) && (!this.a.c(((RecyclerView.x)localObject).b)))
      {
        localObject = this.b;
        a(((RecyclerView)localObject).l, ((RecyclerView)localObject).ra, paramView, paramzd);
      }
    }
    
    public void a(View paramView, boolean paramBoolean, Rect paramRect)
    {
      Object localObject;
      if (paramBoolean)
      {
        localObject = ((RecyclerView.j)paramView.getLayoutParams()).b;
        paramRect.set(-((Rect)localObject).left, -((Rect)localObject).top, paramView.getWidth() + ((Rect)localObject).right, paramView.getHeight() + ((Rect)localObject).bottom);
      }
      else
      {
        paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
      }
      if (this.b != null)
      {
        Matrix localMatrix = paramView.getMatrix();
        if ((localMatrix != null) && (!localMatrix.isIdentity()))
        {
          localObject = this.b.u;
          ((RectF)localObject).set(paramRect);
          localMatrix.mapRect((RectF)localObject);
          paramRect.set((int)Math.floor(((RectF)localObject).left), (int)Math.floor(((RectF)localObject).top), (int)Math.ceil(((RectF)localObject).right), (int)Math.ceil(((RectF)localObject).bottom));
        }
      }
      paramRect.offset(paramView.getLeft(), paramView.getTop());
    }
    
    public void a(AccessibilityEvent paramAccessibilityEvent)
    {
      RecyclerView localRecyclerView = this.b;
      a(localRecyclerView.l, localRecyclerView.ra, paramAccessibilityEvent);
    }
    
    public void a(String paramString)
    {
      RecyclerView localRecyclerView = this.b;
      if (localRecyclerView != null) {
        localRecyclerView.a(paramString);
      }
    }
    
    void a(zd paramzd)
    {
      RecyclerView localRecyclerView = this.b;
      a(localRecyclerView.l, localRecyclerView.ra, paramzd);
    }
    
    public boolean a()
    {
      return false;
    }
    
    boolean a(int paramInt, Bundle paramBundle)
    {
      RecyclerView localRecyclerView = this.b;
      return a(localRecyclerView.l, localRecyclerView.ra, paramInt, paramBundle);
    }
    
    public boolean a(RecyclerView.j paramj)
    {
      boolean bool;
      if (paramj != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean a(RecyclerView.p paramp, RecyclerView.u paramu, int paramInt, Bundle paramBundle)
    {
      paramp = this.b;
      if (paramp == null) {
        return false;
      }
      if (paramInt != 4096) {
        if (paramInt != 8192) {
          paramInt = 0;
        }
      }
      int i2;
      do
      {
        do
        {
          i1 = 0;
          break;
          if (paramp.canScrollVertically(-1)) {
            i2 = -(h() - p() - m());
          } else {
            i2 = 0;
          }
          paramInt = i2;
        } while (!this.b.canScrollHorizontally(-1));
        i1 = -(q() - n() - o());
        paramInt = i2;
        break;
        if (paramp.canScrollVertically(1)) {
          i2 = h() - p() - m();
        } else {
          i2 = 0;
        }
        paramInt = i2;
      } while (!this.b.canScrollHorizontally(1));
      int i1 = q() - n() - o();
      paramInt = i2;
      if ((paramInt == 0) && (i1 == 0)) {
        return false;
      }
      this.b.i(i1, paramInt);
      return true;
    }
    
    public boolean a(RecyclerView.p paramp, RecyclerView.u paramu, View paramView, int paramInt, Bundle paramBundle)
    {
      return false;
    }
    
    public boolean a(RecyclerView paramRecyclerView, RecyclerView.u paramu, View paramView1, View paramView2)
    {
      return a(paramRecyclerView, paramView1, paramView2);
    }
    
    public boolean a(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
    {
      return a(paramRecyclerView, paramView, paramRect, paramBoolean, false);
    }
    
    public boolean a(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
    {
      paramView = b(paramRecyclerView, paramView, paramRect, paramBoolean1);
      int i1 = paramView[0];
      int i2 = paramView[1];
      if (((paramBoolean2) && (!d(paramRecyclerView, i1, i2))) || ((i1 == 0) && (i2 == 0))) {
        return false;
      }
      if (paramBoolean1) {
        paramRecyclerView.scrollBy(i1, i2);
      } else {
        paramRecyclerView.i(i1, i2);
      }
      return true;
    }
    
    @Deprecated
    public boolean a(RecyclerView paramRecyclerView, View paramView1, View paramView2)
    {
      boolean bool;
      if ((!w()) && (!paramRecyclerView.o())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean a(RecyclerView paramRecyclerView, ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
    {
      return false;
    }
    
    boolean a(View paramView, int paramInt1, int paramInt2, RecyclerView.j paramj)
    {
      boolean bool;
      if ((!paramView.isLayoutRequested()) && (this.k) && (b(paramView.getWidth(), paramInt1, paramj.width)) && (b(paramView.getHeight(), paramInt2, paramj.height))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    boolean a(View paramView, int paramInt, Bundle paramBundle)
    {
      RecyclerView localRecyclerView = this.b;
      return a(localRecyclerView.l, localRecyclerView.ra, paramView, paramInt, paramBundle);
    }
    
    public boolean a(View paramView, boolean paramBoolean1, boolean paramBoolean2)
    {
      if ((this.e.a(paramView, 24579)) && (this.f.a(paramView, 24579))) {
        paramBoolean2 = true;
      } else {
        paramBoolean2 = false;
      }
      if (paramBoolean1) {
        return paramBoolean2;
      }
      return paramBoolean2 ^ true;
    }
    
    public boolean a(Runnable paramRunnable)
    {
      RecyclerView localRecyclerView = this.b;
      if (localRecyclerView != null) {
        return localRecyclerView.removeCallbacks(paramRunnable);
      }
      return false;
    }
    
    public int b(int paramInt, RecyclerView.p paramp, RecyclerView.u paramu)
    {
      return 0;
    }
    
    public int b(RecyclerView.p paramp, RecyclerView.u paramu)
    {
      paramp = this.b;
      int i1 = 1;
      int i2 = i1;
      if (paramp != null) {
        if (paramp.v == null)
        {
          i2 = i1;
        }
        else
        {
          i2 = i1;
          if (b()) {
            i2 = this.b.v.a();
          }
        }
      }
      return i2;
    }
    
    public int b(RecyclerView.u paramu)
    {
      return 0;
    }
    
    public void b(int paramInt)
    {
      a(paramInt, d(paramInt));
    }
    
    void b(int paramInt1, int paramInt2)
    {
      this.q = View.MeasureSpec.getSize(paramInt1);
      this.o = View.MeasureSpec.getMode(paramInt1);
      if ((this.o == 0) && (!RecyclerView.d)) {
        this.q = 0;
      }
      this.r = View.MeasureSpec.getSize(paramInt2);
      this.p = View.MeasureSpec.getMode(paramInt2);
      if ((this.p == 0) && (!RecyclerView.d)) {
        this.r = 0;
      }
    }
    
    public void b(RecyclerView.p paramp)
    {
      for (int i1 = e() - 1; i1 >= 0; i1--) {
        if (!RecyclerView.i(d(i1)).x()) {
          a(i1, paramp);
        }
      }
    }
    
    public void b(RecyclerView.t paramt)
    {
      RecyclerView.t localt = this.g;
      if ((localt != null) && (paramt != localt) && (localt.e())) {
        this.g.h();
      }
      this.g = paramt;
      this.g.a(this.b, this);
    }
    
    public void b(RecyclerView paramRecyclerView) {}
    
    public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
    
    public void b(RecyclerView paramRecyclerView, RecyclerView.p paramp)
    {
      c(paramRecyclerView);
    }
    
    public void b(View paramView)
    {
      b(paramView, -1);
    }
    
    public void b(View paramView, int paramInt)
    {
      a(paramView, paramInt, false);
    }
    
    public void b(View paramView, Rect paramRect)
    {
      RecyclerView.a(paramView, paramRect);
    }
    
    public boolean b()
    {
      return false;
    }
    
    boolean b(View paramView, int paramInt1, int paramInt2, RecyclerView.j paramj)
    {
      boolean bool;
      if ((this.k) && (b(paramView.getMeasuredWidth(), paramInt1, paramj.width)) && (b(paramView.getMeasuredHeight(), paramInt2, paramj.height))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public int c(RecyclerView.p paramp, RecyclerView.u paramu)
    {
      return 0;
    }
    
    public int c(RecyclerView.u paramu)
    {
      return 0;
    }
    
    public abstract RecyclerView.j c();
    
    public View c(int paramInt)
    {
      int i1 = e();
      for (int i2 = 0; i2 < i1; i2++)
      {
        View localView = d(i2);
        RecyclerView.x localx = RecyclerView.i(localView);
        if ((localx != null) && (localx.i() == paramInt) && (!localx.x()) && ((this.b.ra.d()) || (!localx.p()))) {
          return localView;
        }
      }
      return null;
    }
    
    public View c(View paramView)
    {
      RecyclerView localRecyclerView = this.b;
      if (localRecyclerView == null) {
        return null;
      }
      paramView = localRecyclerView.c(paramView);
      if (paramView == null) {
        return null;
      }
      if (this.a.c(paramView)) {
        return null;
      }
      return paramView;
    }
    
    public void c(int paramInt1, int paramInt2)
    {
      RecyclerView.a(this.b, paramInt1, paramInt2);
    }
    
    void c(RecyclerView.p paramp)
    {
      int i1 = paramp.e();
      for (int i2 = i1 - 1; i2 >= 0; i2--)
      {
        View localView = paramp.c(i2);
        RecyclerView.x localx = RecyclerView.i(localView);
        if (!localx.x())
        {
          localx.a(false);
          if (localx.r()) {
            this.b.removeDetachedView(localView, false);
          }
          RecyclerView.f localf = this.b.W;
          if (localf != null) {
            localf.d(localx);
          }
          localx.a(true);
          paramp.a(localView);
        }
      }
      paramp.c();
      if (i1 > 0) {
        this.b.invalidate();
      }
    }
    
    @Deprecated
    public void c(RecyclerView paramRecyclerView) {}
    
    public void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
    
    public void c(View paramView, int paramInt)
    {
      a(paramView, paramInt, (RecyclerView.j)paramView.getLayoutParams());
    }
    
    public int d()
    {
      return -1;
    }
    
    public int d(RecyclerView.u paramu)
    {
      return 0;
    }
    
    public int d(View paramView)
    {
      return ((RecyclerView.j)paramView.getLayoutParams()).b.bottom;
    }
    
    public View d(int paramInt)
    {
      Object localObject = this.a;
      if (localObject != null) {
        localObject = ((T)localObject).c(paramInt);
      } else {
        localObject = null;
      }
      return (View)localObject;
    }
    
    public View d(View paramView, int paramInt)
    {
      return null;
    }
    
    void d(int paramInt1, int paramInt2)
    {
      int i1 = e();
      if (i1 == 0)
      {
        this.b.c(paramInt1, paramInt2);
        return;
      }
      int i2 = 0;
      int i3 = Integer.MAX_VALUE;
      int i4 = Integer.MAX_VALUE;
      int i5 = Integer.MIN_VALUE;
      int i9;
      for (int i6 = Integer.MIN_VALUE; i2 < i1; i6 = i9)
      {
        View localView = d(i2);
        Rect localRect = this.b.s;
        b(localView, localRect);
        int i7 = localRect.left;
        int i8 = i3;
        if (i7 < i3) {
          i8 = i7;
        }
        i3 = localRect.right;
        i7 = i5;
        if (i3 > i5) {
          i7 = i3;
        }
        i3 = localRect.top;
        i5 = i4;
        if (i3 < i4) {
          i5 = i3;
        }
        i4 = localRect.bottom;
        i9 = i6;
        if (i4 > i6) {
          i9 = i4;
        }
        i2++;
        i4 = i5;
        i3 = i8;
        i5 = i7;
      }
      this.b.s.set(i3, i4, i5, i6);
      a(this.b.s, paramInt1, paramInt2);
    }
    
    public void d(RecyclerView paramRecyclerView) {}
    
    public boolean d(RecyclerView.p paramp, RecyclerView.u paramu)
    {
      return false;
    }
    
    public int e()
    {
      T localT = this.a;
      int i1;
      if (localT != null) {
        i1 = localT.a();
      } else {
        i1 = 0;
      }
      return i1;
    }
    
    public int e(RecyclerView.u paramu)
    {
      return 0;
    }
    
    public int e(View paramView)
    {
      return paramView.getBottom() + d(paramView);
    }
    
    public void e(int paramInt)
    {
      RecyclerView localRecyclerView = this.b;
      if (localRecyclerView != null) {
        localRecyclerView.g(paramInt);
      }
    }
    
    public void e(RecyclerView.p paramp, RecyclerView.u paramu)
    {
      Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }
    
    void e(RecyclerView paramRecyclerView)
    {
      b(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
    }
    
    public int f(RecyclerView.u paramu)
    {
      return 0;
    }
    
    public int f(View paramView)
    {
      return paramView.getLeft() - k(paramView);
    }
    
    public void f(int paramInt)
    {
      RecyclerView localRecyclerView = this.b;
      if (localRecyclerView != null) {
        localRecyclerView.h(paramInt);
      }
    }
    
    void f(RecyclerView paramRecyclerView)
    {
      if (paramRecyclerView == null)
      {
        this.b = null;
        this.a = null;
        this.q = 0;
        this.r = 0;
      }
      else
      {
        this.b = paramRecyclerView;
        this.a = paramRecyclerView.o;
        this.q = paramRecyclerView.getWidth();
        this.r = paramRecyclerView.getHeight();
      }
      this.o = 1073741824;
      this.p = 1073741824;
    }
    
    public boolean f()
    {
      RecyclerView localRecyclerView = this.b;
      boolean bool;
      if ((localRecyclerView != null) && (localRecyclerView.q)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int g(View paramView)
    {
      Rect localRect = ((RecyclerView.j)paramView.getLayoutParams()).b;
      return paramView.getMeasuredHeight() + localRect.top + localRect.bottom;
    }
    
    public View g()
    {
      Object localObject = this.b;
      if (localObject == null) {
        return null;
      }
      localObject = ((ViewGroup)localObject).getFocusedChild();
      if ((localObject != null) && (!this.a.c((View)localObject))) {
        return (View)localObject;
      }
      return null;
    }
    
    public void g(int paramInt) {}
    
    public void g(RecyclerView.u paramu) {}
    
    public int h()
    {
      return this.r;
    }
    
    public int h(View paramView)
    {
      Rect localRect = ((RecyclerView.j)paramView.getLayoutParams()).b;
      return paramView.getMeasuredWidth() + localRect.left + localRect.right;
    }
    
    public void h(int paramInt)
    {
      if (d(paramInt) != null) {
        this.a.e(paramInt);
      }
    }
    
    public int i()
    {
      return this.p;
    }
    
    public int i(View paramView)
    {
      return paramView.getRight() + m(paramView);
    }
    
    public void i(int paramInt) {}
    
    public int j()
    {
      return y.l(this.b);
    }
    
    public int j(View paramView)
    {
      return paramView.getTop() - n(paramView);
    }
    
    public int k()
    {
      return y.m(this.b);
    }
    
    public int k(View paramView)
    {
      return ((RecyclerView.j)paramView.getLayoutParams()).b.left;
    }
    
    public int l()
    {
      return y.n(this.b);
    }
    
    public int l(View paramView)
    {
      return ((RecyclerView.j)paramView.getLayoutParams()).b();
    }
    
    public int m()
    {
      RecyclerView localRecyclerView = this.b;
      int i1;
      if (localRecyclerView != null) {
        i1 = localRecyclerView.getPaddingBottom();
      } else {
        i1 = 0;
      }
      return i1;
    }
    
    public int m(View paramView)
    {
      return ((RecyclerView.j)paramView.getLayoutParams()).b.right;
    }
    
    public int n()
    {
      RecyclerView localRecyclerView = this.b;
      int i1;
      if (localRecyclerView != null) {
        i1 = localRecyclerView.getPaddingLeft();
      } else {
        i1 = 0;
      }
      return i1;
    }
    
    public int n(View paramView)
    {
      return ((RecyclerView.j)paramView.getLayoutParams()).b.top;
    }
    
    public int o()
    {
      RecyclerView localRecyclerView = this.b;
      int i1;
      if (localRecyclerView != null) {
        i1 = localRecyclerView.getPaddingRight();
      } else {
        i1 = 0;
      }
      return i1;
    }
    
    public void o(View paramView)
    {
      this.a.d(paramView);
    }
    
    public int p()
    {
      RecyclerView localRecyclerView = this.b;
      int i1;
      if (localRecyclerView != null) {
        i1 = localRecyclerView.getPaddingTop();
      } else {
        i1 = 0;
      }
      return i1;
    }
    
    public int q()
    {
      return this.q;
    }
    
    public int r()
    {
      return this.o;
    }
    
    boolean s()
    {
      int i1 = e();
      for (int i2 = 0; i2 < i1; i2++)
      {
        ViewGroup.LayoutParams localLayoutParams = d(i2).getLayoutParams();
        if ((localLayoutParams.width < 0) && (localLayoutParams.height < 0)) {
          return true;
        }
      }
      return false;
    }
    
    public boolean t()
    {
      return this.i;
    }
    
    public boolean u()
    {
      return this.j;
    }
    
    public final boolean v()
    {
      return this.l;
    }
    
    public boolean w()
    {
      RecyclerView.t localt = this.g;
      boolean bool;
      if ((localt != null) && (localt.e())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Parcelable x()
    {
      return null;
    }
    
    public void y()
    {
      RecyclerView localRecyclerView = this.b;
      if (localRecyclerView != null) {
        localRecyclerView.requestLayout();
      }
    }
    
    public void z()
    {
      this.h = true;
    }
    
    public static abstract interface a
    {
      public abstract void a(int paramInt1, int paramInt2);
    }
    
    public static class b
    {
      public int a;
      public int b;
      public boolean c;
      public boolean d;
    }
  }
  
  public static class j
    extends ViewGroup.MarginLayoutParams
  {
    RecyclerView.x a;
    final Rect b = new Rect();
    boolean c = true;
    boolean d = false;
    
    public j(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public j(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public j(j paramj)
    {
      super();
    }
    
    public j(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public j(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public int a()
    {
      return this.a.f();
    }
    
    public int b()
    {
      return this.a.i();
    }
    
    public boolean c()
    {
      return this.a.s();
    }
    
    public boolean d()
    {
      return this.a.p();
    }
    
    public boolean e()
    {
      return this.a.n();
    }
  }
  
  public static abstract interface k
  {
    public abstract void a(View paramView);
    
    public abstract void b(View paramView);
  }
  
  public static abstract class l
  {
    public abstract boolean a(int paramInt1, int paramInt2);
  }
  
  public static abstract interface m
  {
    public abstract void a(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent);
    
    public abstract void a(boolean paramBoolean);
    
    public abstract boolean b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent);
  }
  
  public static abstract class n
  {
    public void a(RecyclerView paramRecyclerView, int paramInt) {}
    
    public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  }
  
  public static class o
  {
    SparseArray<a> a = new SparseArray();
    private int b = 0;
    
    private a b(int paramInt)
    {
      a locala1 = (a)this.a.get(paramInt);
      a locala2 = locala1;
      if (locala1 == null)
      {
        locala2 = new a();
        this.a.put(paramInt, locala2);
      }
      return locala2;
    }
    
    long a(long paramLong1, long paramLong2)
    {
      if (paramLong1 == 0L) {
        return paramLong2;
      }
      return paramLong1 / 4L * 3L + paramLong2 / 4L;
    }
    
    public RecyclerView.x a(int paramInt)
    {
      Object localObject = (a)this.a.get(paramInt);
      if ((localObject != null) && (!((a)localObject).a.isEmpty()))
      {
        localObject = ((a)localObject).a;
        return (RecyclerView.x)((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1);
      }
      return null;
    }
    
    void a()
    {
      this.b += 1;
    }
    
    void a(int paramInt, long paramLong)
    {
      a locala = b(paramInt);
      locala.d = a(locala.d, paramLong);
    }
    
    void a(RecyclerView.a parama1, RecyclerView.a parama2, boolean paramBoolean)
    {
      if (parama1 != null) {
        c();
      }
      if ((!paramBoolean) && (this.b == 0)) {
        b();
      }
      if (parama2 != null) {
        a();
      }
    }
    
    public void a(RecyclerView.x paramx)
    {
      int i = paramx.h();
      ArrayList localArrayList = b(i).a;
      if (((a)this.a.get(i)).b <= localArrayList.size()) {
        return;
      }
      paramx.u();
      localArrayList.add(paramx);
    }
    
    boolean a(int paramInt, long paramLong1, long paramLong2)
    {
      long l = b(paramInt).d;
      boolean bool;
      if ((l != 0L) && (paramLong1 + l >= paramLong2)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void b()
    {
      for (int i = 0; i < this.a.size(); i++) {
        ((a)this.a.valueAt(i)).a.clear();
      }
    }
    
    void b(int paramInt, long paramLong)
    {
      a locala = b(paramInt);
      locala.c = a(locala.c, paramLong);
    }
    
    boolean b(int paramInt, long paramLong1, long paramLong2)
    {
      long l = b(paramInt).c;
      boolean bool;
      if ((l != 0L) && (paramLong1 + l >= paramLong2)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    void c()
    {
      this.b -= 1;
    }
    
    static class a
    {
      final ArrayList<RecyclerView.x> a = new ArrayList();
      int b = 5;
      long c = 0L;
      long d = 0L;
    }
  }
  
  public final class p
  {
    final ArrayList<RecyclerView.x> a = new ArrayList();
    ArrayList<RecyclerView.x> b = null;
    final ArrayList<RecyclerView.x> c = new ArrayList();
    private final List<RecyclerView.x> d = Collections.unmodifiableList(this.a);
    private int e = 2;
    int f = 2;
    RecyclerView.o g;
    private RecyclerView.v h;
    
    public p() {}
    
    private void a(ViewGroup paramViewGroup, boolean paramBoolean)
    {
      for (int j = paramViewGroup.getChildCount() - 1; j >= 0; j--)
      {
        View localView = paramViewGroup.getChildAt(j);
        if ((localView instanceof ViewGroup)) {
          a((ViewGroup)localView, true);
        }
      }
      if (!paramBoolean) {
        return;
      }
      if (paramViewGroup.getVisibility() == 4)
      {
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(4);
      }
      else
      {
        j = paramViewGroup.getVisibility();
        paramViewGroup.setVisibility(4);
        paramViewGroup.setVisibility(j);
      }
    }
    
    private boolean a(RecyclerView.x paramx, int paramInt1, int paramInt2, long paramLong)
    {
      paramx.s = RecyclerView.this;
      int j = paramx.h();
      long l = RecyclerView.this.getNanoTime();
      if ((paramLong != Long.MAX_VALUE) && (!this.g.a(j, l, paramLong))) {
        return false;
      }
      RecyclerView.this.v.a(paramx, paramInt1);
      paramLong = RecyclerView.this.getNanoTime();
      this.g.a(paramx.h(), paramLong - l);
      e(paramx);
      if (RecyclerView.this.ra.d()) {
        paramx.h = paramInt2;
      }
      return true;
    }
    
    private void e(RecyclerView.x paramx)
    {
      if (RecyclerView.this.n())
      {
        View localView = paramx.b;
        if (y.j(localView) == 0) {
          y.d(localView, 1);
        }
        if (!y.w(localView))
        {
          paramx.a(16384);
          y.a(localView, RecyclerView.this.ya.b());
        }
      }
    }
    
    private void f(RecyclerView.x paramx)
    {
      paramx = paramx.b;
      if ((paramx instanceof ViewGroup)) {
        a((ViewGroup)paramx, false);
      }
    }
    
    public int a(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt < RecyclerView.this.ra.a()))
      {
        if (!RecyclerView.this.ra.d()) {
          return paramInt;
        }
        return RecyclerView.this.n.b(paramInt);
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("invalid position ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(". State ");
      localStringBuilder.append("item count is ");
      localStringBuilder.append(RecyclerView.this.ra.a());
      localStringBuilder.append(RecyclerView.this.j());
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    
    RecyclerView.x a(int paramInt, boolean paramBoolean)
    {
      int j = this.a.size();
      int k = 0;
      RecyclerView.x localx;
      for (int m = 0; m < j; m++)
      {
        localx = (RecyclerView.x)this.a.get(m);
        if ((!localx.z()) && (localx.i() == paramInt) && (!localx.n()) && ((RecyclerView.this.ra.h) || (!localx.p())))
        {
          localx.a(32);
          return localx;
        }
      }
      if (!paramBoolean)
      {
        Object localObject = RecyclerView.this.o.b(paramInt);
        if (localObject != null)
        {
          localx = RecyclerView.i((View)localObject);
          RecyclerView.this.o.f((View)localObject);
          paramInt = RecyclerView.this.o.b((View)localObject);
          if (paramInt != -1)
          {
            RecyclerView.this.o.a(paramInt);
            c((View)localObject);
            localx.a(8224);
            return localx;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("layout index should not be -1 after unhiding a view:");
          ((StringBuilder)localObject).append(localx);
          ((StringBuilder)localObject).append(RecyclerView.this.j());
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
      }
      j = this.c.size();
      for (m = k; m < j; m++)
      {
        localx = (RecyclerView.x)this.c.get(m);
        if ((!localx.n()) && (localx.i() == paramInt))
        {
          if (!paramBoolean) {
            this.c.remove(m);
          }
          return localx;
        }
      }
      return null;
    }
    
    RecyclerView.x a(int paramInt, boolean paramBoolean, long paramLong)
    {
      if ((paramInt >= 0) && (paramInt < RecyclerView.this.ra.a()))
      {
        boolean bool1 = RecyclerView.this.ra.d();
        boolean bool2 = true;
        if (bool1)
        {
          localObject1 = b(paramInt);
          localObject2 = localObject1;
          if (localObject1 != null)
          {
            j = 1;
            break label70;
          }
        }
        else
        {
          localObject2 = null;
        }
        int j = 0;
        Object localObject1 = localObject2;
        label70:
        localObject2 = localObject1;
        int k = j;
        if (localObject1 == null)
        {
          localObject1 = a(paramInt, paramBoolean);
          localObject2 = localObject1;
          k = j;
          if (localObject1 != null) {
            if (!d((RecyclerView.x)localObject1))
            {
              if (!paramBoolean)
              {
                ((RecyclerView.x)localObject1).a(4);
                if (((RecyclerView.x)localObject1).q())
                {
                  RecyclerView.this.removeDetachedView(((RecyclerView.x)localObject1).b, false);
                  ((RecyclerView.x)localObject1).y();
                }
                else if (((RecyclerView.x)localObject1).z())
                {
                  ((RecyclerView.x)localObject1).c();
                }
                b((RecyclerView.x)localObject1);
              }
              localObject2 = null;
              k = j;
            }
            else
            {
              k = 1;
              localObject2 = localObject1;
            }
          }
        }
        Object localObject3 = localObject2;
        int m = k;
        if (localObject2 == null)
        {
          m = RecyclerView.this.n.b(paramInt);
          if ((m >= 0) && (m < RecyclerView.this.v.a()))
          {
            int n = RecyclerView.this.v.b(m);
            localObject1 = localObject2;
            j = k;
            if (RecyclerView.this.v.c())
            {
              localObject2 = a(RecyclerView.this.v.a(m), n, paramBoolean);
              localObject1 = localObject2;
              j = k;
              if (localObject2 != null)
              {
                ((RecyclerView.x)localObject2).d = m;
                j = 1;
                localObject1 = localObject2;
              }
            }
            localObject2 = localObject1;
            if (localObject1 == null)
            {
              localObject3 = this.h;
              localObject2 = localObject1;
              if (localObject3 != null)
              {
                localObject3 = ((RecyclerView.v)localObject3).a(this, paramInt, n);
                localObject2 = localObject1;
                if (localObject3 != null)
                {
                  localObject2 = RecyclerView.this.h((View)localObject3);
                  if (localObject2 != null)
                  {
                    if (((RecyclerView.x)localObject2).x())
                    {
                      localObject2 = new StringBuilder();
                      ((StringBuilder)localObject2).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                      ((StringBuilder)localObject2).append(RecyclerView.this.j());
                      throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
                    }
                  }
                  else
                  {
                    localObject2 = new StringBuilder();
                    ((StringBuilder)localObject2).append("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    ((StringBuilder)localObject2).append(RecyclerView.this.j());
                    throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
                  }
                }
              }
            }
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject2 = d().a(n);
              localObject1 = localObject2;
              if (localObject2 != null)
              {
                ((RecyclerView.x)localObject2).u();
                localObject1 = localObject2;
                if (RecyclerView.c)
                {
                  f((RecyclerView.x)localObject2);
                  localObject1 = localObject2;
                }
              }
            }
            localObject3 = localObject1;
            m = j;
            if (localObject1 == null)
            {
              long l1 = RecyclerView.this.getNanoTime();
              if ((paramLong != Long.MAX_VALUE) && (!this.g.b(n, l1, paramLong))) {
                return null;
              }
              localObject2 = RecyclerView.this;
              localObject1 = ((RecyclerView)localObject2).v.a((ViewGroup)localObject2, n);
              if (RecyclerView.f)
              {
                localObject2 = RecyclerView.e(((RecyclerView.x)localObject1).b);
                if (localObject2 != null) {
                  ((RecyclerView.x)localObject1).c = new WeakReference(localObject2);
                }
              }
              long l2 = RecyclerView.this.getNanoTime();
              this.g.b(n, l2 - l1);
              break label768;
            }
          }
          else
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Inconsistency detected. Invalid item position ");
            ((StringBuilder)localObject2).append(paramInt);
            ((StringBuilder)localObject2).append("(offset:");
            ((StringBuilder)localObject2).append(m);
            ((StringBuilder)localObject2).append(").");
            ((StringBuilder)localObject2).append("state:");
            ((StringBuilder)localObject2).append(RecyclerView.this.ra.a());
            ((StringBuilder)localObject2).append(RecyclerView.this.j());
            throw new IndexOutOfBoundsException(((StringBuilder)localObject2).toString());
          }
        }
        localObject1 = localObject3;
        j = m;
        label768:
        if ((j != 0) && (!RecyclerView.this.ra.d()) && (((RecyclerView.x)localObject1).b(8192)))
        {
          ((RecyclerView.x)localObject1).a(0, 8192);
          if (RecyclerView.this.ra.k)
          {
            k = RecyclerView.f.a((RecyclerView.x)localObject1);
            localObject2 = RecyclerView.this;
            localObject2 = ((RecyclerView)localObject2).W.a(((RecyclerView)localObject2).ra, (RecyclerView.x)localObject1, k | 0x1000, ((RecyclerView.x)localObject1).k());
            RecyclerView.this.a((RecyclerView.x)localObject1, (RecyclerView.f.c)localObject2);
          }
        }
        if ((RecyclerView.this.ra.d()) && (((RecyclerView.x)localObject1).m())) {
          ((RecyclerView.x)localObject1).h = paramInt;
        } else {
          if ((!((RecyclerView.x)localObject1).m()) || (((RecyclerView.x)localObject1).t()) || (((RecyclerView.x)localObject1).n())) {
            break label933;
          }
        }
        paramBoolean = false;
        break label953;
        label933:
        paramBoolean = a((RecyclerView.x)localObject1, RecyclerView.this.n.b(paramInt), paramInt, paramLong);
        label953:
        localObject2 = ((RecyclerView.x)localObject1).b.getLayoutParams();
        if (localObject2 == null)
        {
          localObject2 = (RecyclerView.j)RecyclerView.this.generateDefaultLayoutParams();
          ((RecyclerView.x)localObject1).b.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        else if (!RecyclerView.this.checkLayoutParams((ViewGroup.LayoutParams)localObject2))
        {
          localObject2 = (RecyclerView.j)RecyclerView.this.generateLayoutParams((ViewGroup.LayoutParams)localObject2);
          ((RecyclerView.x)localObject1).b.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        else
        {
          localObject2 = (RecyclerView.j)localObject2;
        }
        ((RecyclerView.j)localObject2).a = ((RecyclerView.x)localObject1);
        if ((j != 0) && (paramBoolean)) {
          paramBoolean = bool2;
        } else {
          paramBoolean = false;
        }
        ((RecyclerView.j)localObject2).d = paramBoolean;
        return (RecyclerView.x)localObject1;
      }
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Invalid item position ");
      ((StringBuilder)localObject2).append(paramInt);
      ((StringBuilder)localObject2).append("(");
      ((StringBuilder)localObject2).append(paramInt);
      ((StringBuilder)localObject2).append("). Item count:");
      ((StringBuilder)localObject2).append(RecyclerView.this.ra.a());
      ((StringBuilder)localObject2).append(RecyclerView.this.j());
      throw new IndexOutOfBoundsException(((StringBuilder)localObject2).toString());
    }
    
    RecyclerView.x a(long paramLong, int paramInt, boolean paramBoolean)
    {
      RecyclerView.x localx;
      for (int j = this.a.size() - 1; j >= 0; j--)
      {
        localx = (RecyclerView.x)this.a.get(j);
        if ((localx.g() == paramLong) && (!localx.z()))
        {
          if (paramInt == localx.h())
          {
            localx.a(32);
            if ((localx.p()) && (!RecyclerView.this.ra.d())) {
              localx.a(2, 14);
            }
            return localx;
          }
          if (!paramBoolean)
          {
            this.a.remove(j);
            RecyclerView.this.removeDetachedView(localx.b, false);
            a(localx.b);
          }
        }
      }
      for (j = this.c.size() - 1; j >= 0; j--)
      {
        localx = (RecyclerView.x)this.c.get(j);
        if (localx.g() == paramLong)
        {
          if (paramInt == localx.h())
          {
            if (!paramBoolean) {
              this.c.remove(j);
            }
            return localx;
          }
          if (!paramBoolean)
          {
            e(j);
            return null;
          }
        }
      }
      return null;
    }
    
    public void a()
    {
      this.a.clear();
      i();
    }
    
    void a(int paramInt1, int paramInt2)
    {
      int j = this.c.size();
      for (int k = 0; k < j; k++)
      {
        RecyclerView.x localx = (RecyclerView.x)this.c.get(k);
        if ((localx != null) && (localx.d >= paramInt1)) {
          localx.a(paramInt2, true);
        }
      }
    }
    
    void a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      for (int j = this.c.size() - 1; j >= 0; j--)
      {
        RecyclerView.x localx = (RecyclerView.x)this.c.get(j);
        if (localx != null)
        {
          int k = localx.d;
          if (k >= paramInt1 + paramInt2)
          {
            localx.a(-paramInt2, paramBoolean);
          }
          else if (k >= paramInt1)
          {
            localx.a(8);
            e(j);
          }
        }
      }
    }
    
    void a(RecyclerView.a parama1, RecyclerView.a parama2, boolean paramBoolean)
    {
      a();
      d().a(parama1, parama2, paramBoolean);
    }
    
    void a(RecyclerView.o paramo)
    {
      RecyclerView.o localo = this.g;
      if (localo != null) {
        localo.c();
      }
      this.g = paramo;
      if ((this.g != null) && (RecyclerView.this.getAdapter() != null)) {
        this.g.a();
      }
    }
    
    void a(RecyclerView.v paramv)
    {
      this.h = paramv;
    }
    
    void a(RecyclerView.x paramx)
    {
      Object localObject = RecyclerView.this.x;
      if (localObject != null) {
        ((RecyclerView.q)localObject).a(paramx);
      }
      localObject = RecyclerView.this.v;
      if (localObject != null) {
        ((RecyclerView.a)localObject).d(paramx);
      }
      localObject = RecyclerView.this;
      if (((RecyclerView)localObject).ra != null) {
        ((RecyclerView)localObject).p.h(paramx);
      }
    }
    
    void a(RecyclerView.x paramx, boolean paramBoolean)
    {
      RecyclerView.b(paramx);
      if (paramx.b(16384))
      {
        paramx.a(0, 16384);
        y.a(paramx.b, null);
      }
      if (paramBoolean) {
        a(paramx);
      }
      paramx.s = null;
      d().a(paramx);
    }
    
    void a(View paramView)
    {
      paramView = RecyclerView.i(paramView);
      paramView.o = null;
      paramView.p = false;
      paramView.c();
      b(paramView);
    }
    
    RecyclerView.x b(int paramInt)
    {
      Object localObject = this.b;
      if (localObject != null)
      {
        int j = ((ArrayList)localObject).size();
        if (j != 0)
        {
          int k = 0;
          for (int m = 0; m < j; m++)
          {
            localObject = (RecyclerView.x)this.b.get(m);
            if ((!((RecyclerView.x)localObject).z()) && (((RecyclerView.x)localObject).i() == paramInt))
            {
              ((RecyclerView.x)localObject).a(32);
              return (RecyclerView.x)localObject;
            }
          }
          if (RecyclerView.this.v.c())
          {
            paramInt = RecyclerView.this.n.b(paramInt);
            if ((paramInt > 0) && (paramInt < RecyclerView.this.v.a()))
            {
              long l = RecyclerView.this.v.a(paramInt);
              for (paramInt = k; paramInt < j; paramInt++)
              {
                localObject = (RecyclerView.x)this.b.get(paramInt);
                if ((!((RecyclerView.x)localObject).z()) && (((RecyclerView.x)localObject).g() == l))
                {
                  ((RecyclerView.x)localObject).a(32);
                  return (RecyclerView.x)localObject;
                }
              }
            }
          }
        }
      }
      return null;
    }
    
    View b(int paramInt, boolean paramBoolean)
    {
      return a(paramInt, paramBoolean, Long.MAX_VALUE).b;
    }
    
    void b()
    {
      int j = this.c.size();
      int k = 0;
      for (int m = 0; m < j; m++) {
        ((RecyclerView.x)this.c.get(m)).a();
      }
      j = this.a.size();
      for (m = 0; m < j; m++) {
        ((RecyclerView.x)this.a.get(m)).a();
      }
      ArrayList localArrayList = this.b;
      if (localArrayList != null)
      {
        j = localArrayList.size();
        for (m = k; m < j; m++) {
          ((RecyclerView.x)this.b.get(m)).a();
        }
      }
    }
    
    void b(int paramInt1, int paramInt2)
    {
      int j;
      int k;
      int m;
      if (paramInt1 < paramInt2)
      {
        j = paramInt1;
        k = paramInt2;
        m = -1;
      }
      else
      {
        k = paramInt1;
        j = paramInt2;
        m = 1;
      }
      int n = this.c.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        RecyclerView.x localx = (RecyclerView.x)this.c.get(i1);
        if (localx != null)
        {
          int i2 = localx.d;
          if ((i2 >= j) && (i2 <= k)) {
            if (i2 == paramInt1) {
              localx.a(paramInt2 - paramInt1, false);
            } else {
              localx.a(m, false);
            }
          }
        }
      }
    }
    
    void b(RecyclerView.x paramx)
    {
      boolean bool1 = paramx.q();
      boolean bool2 = false;
      int j = 0;
      if ((!bool1) && (paramx.b.getParent() == null))
      {
        if (!paramx.r())
        {
          if (!paramx.x())
          {
            bool2 = paramx.e();
            localObject = RecyclerView.this.v;
            int k;
            if ((localObject != null) && (bool2) && (((RecyclerView.a)localObject).a(paramx))) {
              k = 1;
            } else {
              k = 0;
            }
            int m;
            if ((k == 0) && (!paramx.o()))
            {
              m = 0;
            }
            else
            {
              if ((this.f > 0) && (!paramx.b(526)))
              {
                m = this.c.size();
                k = m;
                if (m >= this.f)
                {
                  k = m;
                  if (m > 0)
                  {
                    e(0);
                    k = m - 1;
                  }
                }
                m = k;
                if (RecyclerView.f)
                {
                  m = k;
                  if (k > 0)
                  {
                    m = k;
                    if (!RecyclerView.this.qa.a(paramx.d))
                    {
                      k--;
                      while (k >= 0)
                      {
                        m = ((RecyclerView.x)this.c.get(k)).d;
                        if (!RecyclerView.this.qa.a(m)) {
                          break;
                        }
                        k--;
                      }
                      m = k + 1;
                    }
                  }
                }
                this.c.add(m, paramx);
                k = 1;
              }
              else
              {
                k = 0;
              }
              m = k;
              if (k == 0)
              {
                a(paramx, true);
                j = 1;
                m = k;
              }
            }
            RecyclerView.this.p.h(paramx);
            if ((m == 0) && (j == 0) && (bool2)) {
              paramx.s = null;
            }
            return;
          }
          paramx = new StringBuilder();
          paramx.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
          paramx.append(RecyclerView.this.j());
          throw new IllegalArgumentException(paramx.toString());
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
        ((StringBuilder)localObject).append(paramx);
        ((StringBuilder)localObject).append(RecyclerView.this.j());
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Scrapped or attached views may not be recycled. isScrap:");
      ((StringBuilder)localObject).append(paramx.q());
      ((StringBuilder)localObject).append(" isAttached:");
      if (paramx.b.getParent() != null) {
        bool2 = true;
      }
      ((StringBuilder)localObject).append(bool2);
      ((StringBuilder)localObject).append(RecyclerView.this.j());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    
    public void b(View paramView)
    {
      RecyclerView.x localx = RecyclerView.i(paramView);
      if (localx.r()) {
        RecyclerView.this.removeDetachedView(paramView, false);
      }
      if (localx.q()) {
        localx.y();
      } else if (localx.z()) {
        localx.c();
      }
      b(localx);
    }
    
    View c(int paramInt)
    {
      return ((RecyclerView.x)this.a.get(paramInt)).b;
    }
    
    void c()
    {
      this.a.clear();
      ArrayList localArrayList = this.b;
      if (localArrayList != null) {
        localArrayList.clear();
      }
    }
    
    void c(int paramInt1, int paramInt2)
    {
      for (int j = this.c.size() - 1; j >= 0; j--)
      {
        RecyclerView.x localx = (RecyclerView.x)this.c.get(j);
        if (localx != null)
        {
          int k = localx.d;
          if ((k >= paramInt1) && (k < paramInt2 + paramInt1))
          {
            localx.a(2);
            e(j);
          }
        }
      }
    }
    
    void c(RecyclerView.x paramx)
    {
      if (paramx.p) {
        this.b.remove(paramx);
      } else {
        this.a.remove(paramx);
      }
      paramx.o = null;
      paramx.p = false;
      paramx.c();
    }
    
    void c(View paramView)
    {
      paramView = RecyclerView.i(paramView);
      if ((!paramView.b(12)) && (paramView.s()) && (!RecyclerView.this.a(paramView)))
      {
        if (this.b == null) {
          this.b = new ArrayList();
        }
        paramView.a(this, true);
        this.b.add(paramView);
      }
      else
      {
        if ((paramView.n()) && (!paramView.p()) && (!RecyclerView.this.v.c()))
        {
          paramView = new StringBuilder();
          paramView.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
          paramView.append(RecyclerView.this.j());
          throw new IllegalArgumentException(paramView.toString());
        }
        paramView.a(this, false);
        this.a.add(paramView);
      }
    }
    
    RecyclerView.o d()
    {
      if (this.g == null) {
        this.g = new RecyclerView.o();
      }
      return this.g;
    }
    
    public View d(int paramInt)
    {
      return b(paramInt, false);
    }
    
    boolean d(RecyclerView.x paramx)
    {
      if (paramx.p()) {
        return RecyclerView.this.ra.d();
      }
      int j = paramx.d;
      if ((j >= 0) && (j < RecyclerView.this.v.a()))
      {
        boolean bool1 = RecyclerView.this.ra.d();
        boolean bool2 = false;
        if ((!bool1) && (RecyclerView.this.v.b(paramx.d) != paramx.h())) {
          return false;
        }
        if (RecyclerView.this.v.c())
        {
          if (paramx.g() == RecyclerView.this.v.a(paramx.d)) {
            bool2 = true;
          }
          return bool2;
        }
        return true;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Inconsistency detected. Invalid view holder adapter position");
      localStringBuilder.append(paramx);
      localStringBuilder.append(RecyclerView.this.j());
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    
    int e()
    {
      return this.a.size();
    }
    
    void e(int paramInt)
    {
      a((RecyclerView.x)this.c.get(paramInt), true);
      this.c.remove(paramInt);
    }
    
    public List<RecyclerView.x> f()
    {
      return this.d;
    }
    
    public void f(int paramInt)
    {
      this.e = paramInt;
      j();
    }
    
    void g()
    {
      int j = this.c.size();
      for (int k = 0; k < j; k++)
      {
        RecyclerView.j localj = (RecyclerView.j)((RecyclerView.x)this.c.get(k)).b.getLayoutParams();
        if (localj != null) {
          localj.c = true;
        }
      }
    }
    
    void h()
    {
      int j = this.c.size();
      for (int k = 0; k < j; k++)
      {
        localObject = (RecyclerView.x)this.c.get(k);
        if (localObject != null)
        {
          ((RecyclerView.x)localObject).a(6);
          ((RecyclerView.x)localObject).a(null);
        }
      }
      Object localObject = RecyclerView.this.v;
      if ((localObject == null) || (!((RecyclerView.a)localObject).c())) {
        i();
      }
    }
    
    void i()
    {
      for (int j = this.c.size() - 1; j >= 0; j--) {
        e(j);
      }
      this.c.clear();
      if (RecyclerView.f) {
        RecyclerView.this.qa.a();
      }
    }
    
    void j()
    {
      RecyclerView.i locali = RecyclerView.this.w;
      if (locali != null) {
        j = locali.m;
      } else {
        j = 0;
      }
      this.f = (this.e + j);
      for (int j = this.c.size() - 1; (j >= 0) && (this.c.size() > this.f); j--) {
        e(j);
      }
    }
  }
  
  public static abstract interface q
  {
    public abstract void a(RecyclerView.x paramx);
  }
  
  private class r
    extends RecyclerView.c
  {
    r() {}
    
    public void a()
    {
      RecyclerView.this.a(null);
      RecyclerView localRecyclerView = RecyclerView.this;
      localRecyclerView.ra.g = true;
      localRecyclerView.b(true);
      if (!RecyclerView.this.n.c()) {
        RecyclerView.this.requestLayout();
      }
    }
    
    public void a(int paramInt1, int paramInt2, int paramInt3)
    {
      RecyclerView.this.a(null);
      if (RecyclerView.this.n.a(paramInt1, paramInt2, paramInt3)) {
        b();
      }
    }
    
    public void a(int paramInt1, int paramInt2, Object paramObject)
    {
      RecyclerView.this.a(null);
      if (RecyclerView.this.n.a(paramInt1, paramInt2, paramObject)) {
        b();
      }
    }
    
    void b()
    {
      if (RecyclerView.e)
      {
        localRecyclerView = RecyclerView.this;
        if ((localRecyclerView.C) && (localRecyclerView.B))
        {
          y.a(localRecyclerView, localRecyclerView.r);
          return;
        }
      }
      RecyclerView localRecyclerView = RecyclerView.this;
      localRecyclerView.K = true;
      localRecyclerView.requestLayout();
    }
    
    public void b(int paramInt1, int paramInt2)
    {
      RecyclerView.this.a(null);
      if (RecyclerView.this.n.b(paramInt1, paramInt2)) {
        b();
      }
    }
    
    public void c(int paramInt1, int paramInt2)
    {
      RecyclerView.this.a(null);
      if (RecyclerView.this.n.c(paramInt1, paramInt2)) {
        b();
      }
    }
  }
  
  public static class s
    extends c
  {
    public static final Parcelable.Creator<s> CREATOR = new Ka();
    Parcelable c;
    
    s(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      if (paramClassLoader == null) {
        paramClassLoader = RecyclerView.i.class.getClassLoader();
      }
      this.c = paramParcel.readParcelable(paramClassLoader);
    }
    
    s(Parcelable paramParcelable)
    {
      super();
    }
    
    void a(s params)
    {
      this.c = params.c;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeParcelable(this.c, 0);
    }
  }
  
  public static abstract class t
  {
    private int a = -1;
    private RecyclerView b;
    private RecyclerView.i c;
    private boolean d;
    private boolean e;
    private View f;
    private final a g = new a(0, 0);
    private boolean h;
    
    public int a()
    {
      return this.b.w.e();
    }
    
    public int a(View paramView)
    {
      return this.b.g(paramView);
    }
    
    public PointF a(int paramInt)
    {
      Object localObject = b();
      if ((localObject instanceof b)) {
        return ((b)localObject).a(paramInt);
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
      ((StringBuilder)localObject).append(b.class.getCanonicalName());
      Log.w("RecyclerView", ((StringBuilder)localObject).toString());
      return null;
    }
    
    void a(int paramInt1, int paramInt2)
    {
      RecyclerView localRecyclerView = this.b;
      if ((!this.e) || (this.a == -1) || (localRecyclerView == null)) {
        h();
      }
      if ((this.d) && (this.f == null) && (this.c != null))
      {
        localObject = a(this.a);
        if ((localObject != null) && ((((PointF)localObject).x != 0.0F) || (((PointF)localObject).y != 0.0F))) {
          localRecyclerView.a((int)Math.signum(((PointF)localObject).x), (int)Math.signum(((PointF)localObject).y), null);
        }
      }
      this.d = false;
      Object localObject = this.f;
      if (localObject != null) {
        if (a((View)localObject) == this.a)
        {
          a(this.f, localRecyclerView.ra, this.g);
          this.g.a(localRecyclerView);
          h();
        }
        else
        {
          Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
          this.f = null;
        }
      }
      if (this.e)
      {
        a(paramInt1, paramInt2, localRecyclerView.ra, this.g);
        boolean bool = this.g.a();
        this.g.a(localRecyclerView);
        if (bool) {
          if (this.e)
          {
            this.d = true;
            localRecyclerView.oa.a();
          }
          else
          {
            h();
          }
        }
      }
    }
    
    protected abstract void a(int paramInt1, int paramInt2, RecyclerView.u paramu, a parama);
    
    protected void a(PointF paramPointF)
    {
      float f1 = paramPointF.x;
      float f2 = paramPointF.y;
      f2 = (float)Math.sqrt(f1 * f1 + f2 * f2);
      paramPointF.x /= f2;
      paramPointF.y /= f2;
    }
    
    void a(RecyclerView paramRecyclerView, RecyclerView.i parami)
    {
      if (this.h)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("An instance of ");
        localStringBuilder.append(getClass().getSimpleName());
        localStringBuilder.append(" was started ");
        localStringBuilder.append("more than once. Each instance of");
        localStringBuilder.append(getClass().getSimpleName());
        localStringBuilder.append(" ");
        localStringBuilder.append("is intended to only be used once. You should create a new instance for ");
        localStringBuilder.append("each use.");
        Log.w("RecyclerView", localStringBuilder.toString());
      }
      this.b = paramRecyclerView;
      this.c = parami;
      int i = this.a;
      if (i != -1)
      {
        this.b.ra.a = i;
        this.e = true;
        this.d = true;
        this.f = b(c());
        f();
        this.b.oa.a();
        this.h = true;
        return;
      }
      throw new IllegalArgumentException("Invalid target position");
    }
    
    protected abstract void a(View paramView, RecyclerView.u paramu, a parama);
    
    public RecyclerView.i b()
    {
      return this.c;
    }
    
    public View b(int paramInt)
    {
      return this.b.w.c(paramInt);
    }
    
    protected void b(View paramView)
    {
      if (a(paramView) == c()) {
        this.f = paramView;
      }
    }
    
    public int c()
    {
      return this.a;
    }
    
    public void c(int paramInt)
    {
      this.a = paramInt;
    }
    
    public boolean d()
    {
      return this.d;
    }
    
    public boolean e()
    {
      return this.e;
    }
    
    protected abstract void f();
    
    protected abstract void g();
    
    protected final void h()
    {
      if (!this.e) {
        return;
      }
      this.e = false;
      g();
      this.b.ra.a = -1;
      this.f = null;
      this.a = -1;
      this.d = false;
      this.c.a(this);
      this.c = null;
      this.b = null;
    }
    
    public static class a
    {
      private int a;
      private int b;
      private int c;
      private int d = -1;
      private Interpolator e;
      private boolean f = false;
      private int g = 0;
      
      public a(int paramInt1, int paramInt2)
      {
        this(paramInt1, paramInt2, Integer.MIN_VALUE, null);
      }
      
      public a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
      {
        this.a = paramInt1;
        this.b = paramInt2;
        this.c = paramInt3;
        this.e = paramInterpolator;
      }
      
      private void b()
      {
        if ((this.e != null) && (this.c < 1)) {
          throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        if (this.c >= 1) {
          return;
        }
        throw new IllegalStateException("Scroll duration must be a positive number");
      }
      
      public void a(int paramInt)
      {
        this.d = paramInt;
      }
      
      public void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
      {
        this.a = paramInt1;
        this.b = paramInt2;
        this.c = paramInt3;
        this.e = paramInterpolator;
        this.f = true;
      }
      
      void a(RecyclerView paramRecyclerView)
      {
        int i = this.d;
        if (i >= 0)
        {
          this.d = -1;
          paramRecyclerView.f(i);
          this.f = false;
          return;
        }
        if (this.f)
        {
          b();
          Interpolator localInterpolator = this.e;
          if (localInterpolator == null)
          {
            i = this.c;
            if (i == Integer.MIN_VALUE) {
              paramRecyclerView.oa.b(this.a, this.b);
            } else {
              paramRecyclerView.oa.a(this.a, this.b, i);
            }
          }
          else
          {
            paramRecyclerView.oa.a(this.a, this.b, this.c, localInterpolator);
          }
          this.g += 1;
          if (this.g > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
          }
          this.f = false;
        }
        else
        {
          this.g = 0;
        }
      }
      
      boolean a()
      {
        boolean bool;
        if (this.d >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
    }
    
    public static abstract interface b
    {
      public abstract PointF a(int paramInt);
    }
  }
  
  public static class u
  {
    int a = -1;
    private SparseArray<Object> b;
    int c = 0;
    int d = 0;
    int e = 1;
    int f = 0;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    boolean l = false;
    int m;
    long n;
    int o;
    int p;
    int q;
    
    public int a()
    {
      int i1;
      if (this.h) {
        i1 = this.c - this.d;
      } else {
        i1 = this.f;
      }
      return i1;
    }
    
    void a(int paramInt)
    {
      if ((this.e & paramInt) != 0) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Layout state should be one of ");
      localStringBuilder.append(Integer.toBinaryString(paramInt));
      localStringBuilder.append(" but it is ");
      localStringBuilder.append(Integer.toBinaryString(this.e));
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    void a(RecyclerView.a parama)
    {
      this.e = 1;
      this.f = parama.a();
      this.h = false;
      this.i = false;
      this.j = false;
    }
    
    public int b()
    {
      return this.a;
    }
    
    public boolean c()
    {
      boolean bool;
      if (this.a != -1) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean d()
    {
      return this.h;
    }
    
    public boolean e()
    {
      return this.l;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("State{mTargetPosition=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", mData=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", mItemCount=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", mIsMeasuring=");
      localStringBuilder.append(this.j);
      localStringBuilder.append(", mPreviousLayoutItemCount=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", mStructureChanged=");
      localStringBuilder.append(this.g);
      localStringBuilder.append(", mInPreLayout=");
      localStringBuilder.append(this.h);
      localStringBuilder.append(", mRunSimpleAnimations=");
      localStringBuilder.append(this.k);
      localStringBuilder.append(", mRunPredictiveAnimations=");
      localStringBuilder.append(this.l);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class v
  {
    public abstract View a(RecyclerView.p paramp, int paramInt1, int paramInt2);
  }
  
  class w
    implements Runnable
  {
    private int a;
    private int b;
    OverScroller c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.j);
    Interpolator d = RecyclerView.j;
    private boolean e = false;
    private boolean f = false;
    
    w() {}
    
    private float a(float paramFloat)
    {
      return (float)Math.sin((paramFloat - 0.5F) * 0.47123894F);
    }
    
    private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      int i = Math.abs(paramInt1);
      int j = Math.abs(paramInt2);
      int k;
      if (i > j) {
        k = 1;
      } else {
        k = 0;
      }
      paramInt3 = (int)Math.sqrt(paramInt3 * paramInt3 + paramInt4 * paramInt4);
      paramInt2 = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
      if (k != 0) {
        paramInt1 = RecyclerView.this.getWidth();
      } else {
        paramInt1 = RecyclerView.this.getHeight();
      }
      paramInt4 = paramInt1 / 2;
      float f1 = paramInt2;
      float f2 = paramInt1;
      float f3 = Math.min(1.0F, f1 * 1.0F / f2);
      f1 = paramInt4;
      f3 = a(f3);
      if (paramInt3 > 0)
      {
        paramInt1 = Math.round(Math.abs((f1 + f3 * f1) / paramInt3) * 1000.0F) * 4;
      }
      else
      {
        if (k != 0) {
          paramInt1 = i;
        } else {
          paramInt1 = j;
        }
        paramInt1 = (int)((paramInt1 / f2 + 1.0F) * 300.0F);
      }
      return Math.min(paramInt1, 2000);
    }
    
    private void c()
    {
      this.f = false;
      this.e = true;
    }
    
    private void d()
    {
      this.e = false;
      if (this.f) {
        a();
      }
    }
    
    void a()
    {
      if (this.e)
      {
        this.f = true;
      }
      else
      {
        RecyclerView.this.removeCallbacks(this);
        y.a(RecyclerView.this, this);
      }
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      RecyclerView.this.setScrollState(2);
      this.b = 0;
      this.a = 0;
      this.c.fling(0, 0, paramInt1, paramInt2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
      a();
    }
    
    public void a(int paramInt1, int paramInt2, int paramInt3)
    {
      a(paramInt1, paramInt2, paramInt3, RecyclerView.j);
    }
    
    public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      a(paramInt1, paramInt2, b(paramInt1, paramInt2, paramInt3, paramInt4));
    }
    
    public void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
    {
      if (this.d != paramInterpolator)
      {
        this.d = paramInterpolator;
        this.c = new OverScroller(RecyclerView.this.getContext(), paramInterpolator);
      }
      RecyclerView.this.setScrollState(2);
      this.b = 0;
      this.a = 0;
      this.c.startScroll(0, 0, paramInt1, paramInt2, paramInt3);
      if (Build.VERSION.SDK_INT < 23) {
        this.c.computeScrollOffset();
      }
      a();
    }
    
    public void a(int paramInt1, int paramInt2, Interpolator paramInterpolator)
    {
      int i = b(paramInt1, paramInt2, 0, 0);
      Interpolator localInterpolator = paramInterpolator;
      if (paramInterpolator == null) {
        localInterpolator = RecyclerView.j;
      }
      a(paramInt1, paramInt2, i, localInterpolator);
    }
    
    public void b()
    {
      RecyclerView.this.removeCallbacks(this);
      this.c.abortAnimation();
    }
    
    public void b(int paramInt1, int paramInt2)
    {
      a(paramInt1, paramInt2, 0, 0);
    }
    
    public void run()
    {
      if (RecyclerView.this.w == null)
      {
        b();
        return;
      }
      c();
      RecyclerView.this.c();
      Object localObject1 = this.c;
      RecyclerView.t localt = RecyclerView.this.w.g;
      if (((OverScroller)localObject1).computeScrollOffset())
      {
        Object localObject2 = RecyclerView.this.Da;
        int i = ((OverScroller)localObject1).getCurrX();
        int j = ((OverScroller)localObject1).getCurrY();
        int k = i - this.a;
        int m = j - this.b;
        this.a = i;
        this.b = j;
        int n = k;
        int i1 = m;
        if (RecyclerView.this.a(k, m, (int[])localObject2, null, 1))
        {
          n = k - localObject2[0];
          i1 = m - localObject2[1];
        }
        localObject2 = RecyclerView.this;
        int i4;
        int i5;
        int i6;
        int i7;
        if (((RecyclerView)localObject2).v != null)
        {
          ((RecyclerView)localObject2).a(n, i1, ((RecyclerView)localObject2).Fa);
          localObject2 = RecyclerView.this.Fa;
          m = localObject2[0];
          int i2 = localObject2[1];
          int i3 = n - m;
          k = i1 - i2;
          i4 = i2;
          i5 = m;
          i6 = i3;
          i7 = k;
          if (localt != null)
          {
            i4 = i2;
            i5 = m;
            i6 = i3;
            i7 = k;
            if (!localt.d())
            {
              i4 = i2;
              i5 = m;
              i6 = i3;
              i7 = k;
              if (localt.e())
              {
                i5 = RecyclerView.this.ra.a();
                if (i5 == 0)
                {
                  localt.h();
                  i4 = i2;
                  i5 = m;
                  i6 = i3;
                  i7 = k;
                }
                else if (localt.c() >= i5)
                {
                  localt.c(i5 - 1);
                  localt.a(n - i3, i1 - k);
                  i4 = i2;
                  i5 = m;
                  i6 = i3;
                  i7 = k;
                }
                else
                {
                  localt.a(n - i3, i1 - k);
                  i4 = i2;
                  i5 = m;
                  i6 = i3;
                  i7 = k;
                }
              }
            }
          }
        }
        else
        {
          i4 = 0;
          i5 = 0;
          i6 = 0;
          i7 = 0;
        }
        if (!RecyclerView.this.y.isEmpty()) {
          RecyclerView.this.invalidate();
        }
        if (RecyclerView.this.getOverScrollMode() != 2) {
          RecyclerView.this.b(n, i1);
        }
        if ((!RecyclerView.this.a(i5, i4, i6, i7, null, 1)) && ((i6 != 0) || (i7 != 0)))
        {
          k = (int)((OverScroller)localObject1).getCurrVelocity();
          if (i6 != i)
          {
            if (i6 < 0)
            {
              m = -k;
              break label511;
            }
            if (i6 > 0)
            {
              m = k;
              break label511;
            }
          }
          m = 0;
          label511:
          if (i7 != j)
          {
            if (i7 < 0) {
              k = -k;
            } else if (i7 > 0) {}
          }
          else {
            k = 0;
          }
          if (RecyclerView.this.getOverScrollMode() != 2) {
            RecyclerView.this.a(m, k);
          }
          if (((m != 0) || (i6 == i) || (((OverScroller)localObject1).getFinalX() == 0)) && ((k != 0) || (i7 == j) || (((OverScroller)localObject1).getFinalY() == 0))) {
            ((OverScroller)localObject1).abortAnimation();
          }
        }
        if ((i5 != 0) || (i4 != 0)) {
          RecyclerView.this.d(i5, i4);
        }
        if (!RecyclerView.a(RecyclerView.this)) {
          RecyclerView.this.invalidate();
        }
        if ((i1 != 0) && (RecyclerView.this.w.b()) && (i4 == i1)) {
          m = 1;
        } else {
          m = 0;
        }
        if ((n != 0) && (RecyclerView.this.w.a()) && (i5 == n)) {
          k = 1;
        } else {
          k = 0;
        }
        if (((n != 0) || (i1 != 0)) && (k == 0) && (m == 0)) {
          m = 0;
        } else {
          m = 1;
        }
        if ((!((OverScroller)localObject1).isFinished()) && ((m != 0) || (RecyclerView.this.e(1))))
        {
          a();
          localObject2 = RecyclerView.this;
          localObject1 = ((RecyclerView)localObject2).pa;
          if (localObject1 != null) {
            ((na)localObject1).a((RecyclerView)localObject2, n, i1);
          }
        }
        else
        {
          RecyclerView.this.setScrollState(0);
          if (RecyclerView.f) {
            RecyclerView.this.qa.a();
          }
          RecyclerView.this.a(1);
        }
      }
      if (localt != null)
      {
        if (localt.d()) {
          localt.a(0, 0);
        }
        if (!this.f) {
          localt.h();
        }
      }
      d();
    }
  }
  
  public static abstract class x
  {
    private static final List<Object> a = ;
    public final View b;
    WeakReference<RecyclerView> c;
    int d = -1;
    int e = -1;
    long f = -1L;
    int g = -1;
    int h = -1;
    x i = null;
    x j = null;
    int k;
    List<Object> l = null;
    List<Object> m = null;
    private int n = 0;
    RecyclerView.p o = null;
    boolean p = false;
    private int q = 0;
    int r = -1;
    RecyclerView s;
    
    public x(View paramView)
    {
      if (paramView != null)
      {
        this.b = paramView;
        return;
      }
      throw new IllegalArgumentException("itemView may not be null");
    }
    
    private void A()
    {
      if (this.l == null)
      {
        this.l = new ArrayList();
        this.m = Collections.unmodifiableList(this.l);
      }
    }
    
    void a()
    {
      this.e = -1;
      this.h = -1;
    }
    
    void a(int paramInt)
    {
      this.k = (paramInt | this.k);
    }
    
    void a(int paramInt1, int paramInt2)
    {
      this.k = (paramInt1 & paramInt2 | this.k & paramInt2);
    }
    
    void a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      a(8);
      a(paramInt2, paramBoolean);
      this.d = paramInt1;
    }
    
    void a(int paramInt, boolean paramBoolean)
    {
      if (this.e == -1) {
        this.e = this.d;
      }
      if (this.h == -1) {
        this.h = this.d;
      }
      if (paramBoolean) {
        this.h += paramInt;
      }
      this.d += paramInt;
      if (this.b.getLayoutParams() != null) {
        ((RecyclerView.j)this.b.getLayoutParams()).c = true;
      }
    }
    
    void a(RecyclerView.p paramp, boolean paramBoolean)
    {
      this.o = paramp;
      this.p = paramBoolean;
    }
    
    void a(RecyclerView paramRecyclerView)
    {
      int i1 = this.r;
      if (i1 != -1) {
        this.q = i1;
      } else {
        this.q = y.j(this.b);
      }
      paramRecyclerView.a(this, 4);
    }
    
    void a(Object paramObject)
    {
      if (paramObject == null)
      {
        a(1024);
      }
      else if ((0x400 & this.k) == 0)
      {
        A();
        this.l.add(paramObject);
      }
    }
    
    public final void a(boolean paramBoolean)
    {
      if (paramBoolean) {
        i1 = this.n - 1;
      } else {
        i1 = this.n + 1;
      }
      this.n = i1;
      int i1 = this.n;
      if (i1 < 0)
      {
        this.n = 0;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
        localStringBuilder.append(this);
        Log.e("View", localStringBuilder.toString());
      }
      else if ((!paramBoolean) && (i1 == 1))
      {
        this.k |= 0x10;
      }
      else if ((paramBoolean) && (this.n == 0))
      {
        this.k &= 0xFFFFFFEF;
      }
    }
    
    void b()
    {
      List localList = this.l;
      if (localList != null) {
        localList.clear();
      }
      this.k &= 0xFBFF;
    }
    
    void b(RecyclerView paramRecyclerView)
    {
      paramRecyclerView.a(this, this.q);
      this.q = 0;
    }
    
    boolean b(int paramInt)
    {
      boolean bool;
      if ((paramInt & this.k) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    void c()
    {
      this.k &= 0xFFFFFFDF;
    }
    
    void d()
    {
      this.k &= 0xFEFF;
    }
    
    boolean e()
    {
      boolean bool;
      if (((this.k & 0x10) == 0) && (y.z(this.b))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int f()
    {
      RecyclerView localRecyclerView = this.s;
      if (localRecyclerView == null) {
        return -1;
      }
      return localRecyclerView.c(this);
    }
    
    public final long g()
    {
      return this.f;
    }
    
    public final int h()
    {
      return this.g;
    }
    
    public final int i()
    {
      int i1 = this.h;
      int i2 = i1;
      if (i1 == -1) {
        i2 = this.d;
      }
      return i2;
    }
    
    public final int j()
    {
      return this.e;
    }
    
    List<Object> k()
    {
      if ((this.k & 0x400) == 0)
      {
        List localList = this.l;
        if ((localList != null) && (localList.size() != 0)) {
          return this.m;
        }
        return a;
      }
      return a;
    }
    
    boolean l()
    {
      boolean bool;
      if (((this.k & 0x200) == 0) && (!n())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    boolean m()
    {
      int i1 = this.k;
      boolean bool = true;
      if ((i1 & 0x1) == 0) {
        bool = false;
      }
      return bool;
    }
    
    boolean n()
    {
      boolean bool;
      if ((this.k & 0x4) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean o()
    {
      boolean bool;
      if (((this.k & 0x10) == 0) && (!y.z(this.b))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean p()
    {
      boolean bool;
      if ((this.k & 0x8) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean q()
    {
      boolean bool;
      if (this.o != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean r()
    {
      boolean bool;
      if ((this.k & 0x100) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean s()
    {
      boolean bool;
      if ((this.k & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean t()
    {
      boolean bool;
      if ((this.k & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public String toString()
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("ViewHolder{");
      ((StringBuilder)localObject).append(Integer.toHexString(hashCode()));
      ((StringBuilder)localObject).append(" position=");
      ((StringBuilder)localObject).append(this.d);
      ((StringBuilder)localObject).append(" id=");
      ((StringBuilder)localObject).append(this.f);
      ((StringBuilder)localObject).append(", oldPos=");
      ((StringBuilder)localObject).append(this.e);
      ((StringBuilder)localObject).append(", pLpos:");
      ((StringBuilder)localObject).append(this.h);
      StringBuilder localStringBuilder = new StringBuilder(((StringBuilder)localObject).toString());
      if (q())
      {
        localStringBuilder.append(" scrap ");
        if (this.p) {
          localObject = "[changeScrap]";
        } else {
          localObject = "[attachedScrap]";
        }
        localStringBuilder.append((String)localObject);
      }
      if (n()) {
        localStringBuilder.append(" invalid");
      }
      if (!m()) {
        localStringBuilder.append(" unbound");
      }
      if (t()) {
        localStringBuilder.append(" update");
      }
      if (p()) {
        localStringBuilder.append(" removed");
      }
      if (x()) {
        localStringBuilder.append(" ignored");
      }
      if (r()) {
        localStringBuilder.append(" tmpDetached");
      }
      if (!o())
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(" not recyclable(");
        ((StringBuilder)localObject).append(this.n);
        ((StringBuilder)localObject).append(")");
        localStringBuilder.append(((StringBuilder)localObject).toString());
      }
      if (l()) {
        localStringBuilder.append(" undefined adapter position");
      }
      if (this.b.getParent() == null) {
        localStringBuilder.append(" no parent");
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    void u()
    {
      this.k = 0;
      this.d = -1;
      this.e = -1;
      this.f = -1L;
      this.h = -1;
      this.n = 0;
      this.i = null;
      this.j = null;
      b();
      this.q = 0;
      this.r = -1;
      RecyclerView.b(this);
    }
    
    void v()
    {
      if (this.e == -1) {
        this.e = this.d;
      }
    }
    
    boolean w()
    {
      boolean bool;
      if ((this.k & 0x10) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean x()
    {
      boolean bool;
      if ((this.k & 0x80) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    void y()
    {
      this.o.c(this);
    }
    
    boolean z()
    {
      boolean bool;
      if ((this.k & 0x20) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */