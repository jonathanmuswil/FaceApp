package android.support.v4.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class y
{
  private static final AtomicInteger a = new AtomicInteger(1);
  private static Field b;
  private static boolean c;
  private static Field d;
  private static boolean e;
  private static WeakHashMap<View, String> f;
  private static WeakHashMap<View, J> g = null;
  private static Field h;
  private static boolean i = false;
  private static ThreadLocal<Rect> j;
  
  public static boolean A(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramView.isAttachedToWindow();
    }
    boolean bool;
    if (paramView.getWindowToken() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean B(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramView.isLaidOut();
    }
    boolean bool;
    if ((paramView.getWidth() > 0) && (paramView.getHeight() > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean C(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramView.isNestedScrollingEnabled();
    }
    if ((paramView instanceof m)) {
      return ((m)paramView).isNestedScrollingEnabled();
    }
    return false;
  }
  
  public static boolean D(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return paramView.isPaddingRelative();
    }
    return false;
  }
  
  public static void E(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postInvalidateOnAnimation();
    } else {
      paramView.postInvalidate();
    }
  }
  
  public static void F(View paramView)
  {
    int k = Build.VERSION.SDK_INT;
    if (k >= 20) {
      paramView.requestApplyInsets();
    } else if (k >= 16) {
      paramView.requestFitSystemWindows();
    }
  }
  
  public static void G(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.stopNestedScroll();
    } else if ((paramView instanceof m)) {
      ((m)paramView).stopNestedScroll();
    }
  }
  
  private static void H(View paramView)
  {
    float f1 = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f1);
    paramView.setTranslationY(f1);
  }
  
  private static Rect a()
  {
    if (j == null) {
      j = new ThreadLocal();
    }
    Rect localRect1 = (Rect)j.get();
    Rect localRect2 = localRect1;
    if (localRect1 == null)
    {
      localRect2 = new Rect();
      j.set(localRect2);
    }
    localRect2.setEmpty();
    return localRect2;
  }
  
  public static J a(View paramView)
  {
    if (g == null) {
      g = new WeakHashMap();
    }
    J localJ1 = (J)g.get(paramView);
    J localJ2 = localJ1;
    if (localJ1 == null)
    {
      localJ2 = new J(paramView);
      g.put(paramView, localJ2);
    }
    return localJ2;
  }
  
  public static N a(View paramView, N paramN)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramN = (WindowInsets)N.a(paramN);
      WindowInsets localWindowInsets = paramView.dispatchApplyWindowInsets(paramN);
      paramView = paramN;
      if (localWindowInsets != paramN) {
        paramView = new WindowInsets(localWindowInsets);
      }
      return N.a(paramView);
    }
    return paramN;
  }
  
  @Deprecated
  public static void a(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }
  
  public static void a(View paramView, int paramInt)
  {
    int k = Build.VERSION.SDK_INT;
    if (k >= 23)
    {
      paramView.offsetLeftAndRight(paramInt);
    }
    else if (k >= 21)
    {
      Rect localRect = a();
      k = 0;
      ViewParent localViewParent = paramView.getParent();
      boolean bool;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        bool = localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()) ^ true;
      }
      g(paramView, paramInt);
      if ((bool) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
        ((View)localViewParent).invalidate(localRect);
      }
    }
    else
    {
      g(paramView, paramInt);
    }
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      paramView.setScrollIndicators(paramInt1, paramInt2);
    }
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramView.setBackgroundTintList(paramColorStateList);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramColorStateList = paramView.getBackground();
        int k;
        if ((paramView.getBackgroundTintList() == null) && (paramView.getBackgroundTintMode() == null)) {
          k = 0;
        } else {
          k = 1;
        }
        if ((paramColorStateList != null) && (k != 0))
        {
          if (paramColorStateList.isStateful()) {
            paramColorStateList.setState(paramView.getDrawableState());
          }
          paramView.setBackground(paramColorStateList);
        }
      }
    }
    else if ((paramView instanceof w))
    {
      ((w)paramView).setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramView.setBackgroundTintMode(paramMode);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramMode = paramView.getBackground();
        int k;
        if ((paramView.getBackgroundTintList() == null) && (paramView.getBackgroundTintMode() == null)) {
          k = 0;
        } else {
          k = 1;
        }
        if ((paramMode != null) && (k != 0))
        {
          if (paramMode.isStateful()) {
            paramMode.setState(paramView.getDrawableState());
          }
          paramView.setBackground(paramMode);
        }
      }
    }
    else if ((paramView instanceof w))
    {
      ((w)paramView).setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public static void a(View paramView, Rect paramRect)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      paramView.setClipBounds(paramRect);
    }
  }
  
  public static void a(View paramView, Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.setBackground(paramDrawable);
    } else {
      paramView.setBackgroundDrawable(paramDrawable);
    }
  }
  
  public static void a(View paramView, d paramd)
  {
    if (paramd == null) {
      paramd = null;
    } else {
      paramd = paramd.a();
    }
    paramView.setAccessibilityDelegate(paramd);
  }
  
  public static void a(View paramView, r paramr)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      if (paramr == null)
      {
        paramView.setOnApplyWindowInsetsListener(null);
        return;
      }
      paramView.setOnApplyWindowInsetsListener(new x(paramr));
    }
  }
  
  public static void a(View paramView, t paramt)
  {
    if (Build.VERSION.SDK_INT >= 24)
    {
      if (paramt != null) {
        paramt = paramt.a();
      } else {
        paramt = null;
      }
      paramView.setPointerIcon((PointerIcon)paramt);
    }
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postOnAnimation(paramRunnable);
    } else {
      paramView.postDelayed(paramRunnable, ValueAnimator.getFrameDelay());
    }
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
    } else {
      paramView.postDelayed(paramRunnable, ValueAnimator.getFrameDelay() + paramLong);
    }
  }
  
  public static void a(View paramView, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramView.setTransitionName(paramString);
    }
    else
    {
      if (f == null) {
        f = new WeakHashMap();
      }
      f.put(paramView, paramString);
    }
  }
  
  @Deprecated
  public static void a(View paramView, boolean paramBoolean)
  {
    paramView.setFitsSystemWindows(paramBoolean);
  }
  
  static boolean a(View paramView, KeyEvent paramKeyEvent)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return false;
    }
    return b.a(paramView).a(paramView, paramKeyEvent);
  }
  
  public static int b(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramView.getAccessibilityLiveRegion();
    }
    return 0;
  }
  
  public static N b(View paramView, N paramN)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramN = (WindowInsets)N.a(paramN);
      WindowInsets localWindowInsets = paramView.onApplyWindowInsets(paramN);
      paramView = paramN;
      if (localWindowInsets != paramN) {
        paramView = new WindowInsets(localWindowInsets);
      }
      return N.a(paramView);
    }
    return paramN;
  }
  
  public static void b(View paramView, float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.setElevation(paramFloat);
    }
  }
  
  public static void b(View paramView, int paramInt)
  {
    int k = Build.VERSION.SDK_INT;
    if (k >= 23)
    {
      paramView.offsetTopAndBottom(paramInt);
    }
    else if (k >= 21)
    {
      Rect localRect = a();
      k = 0;
      ViewParent localViewParent = paramView.getParent();
      boolean bool;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        bool = localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()) ^ true;
      }
      h(paramView, paramInt);
      if ((bool) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
        ((View)localViewParent).invalidate(localRect);
      }
    }
    else
    {
      h(paramView, paramInt);
    }
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.setHasTransientState(paramBoolean);
    }
  }
  
  static boolean b(View paramView, KeyEvent paramKeyEvent)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return false;
    }
    return b.a(paramView).a(paramKeyEvent);
  }
  
  @Deprecated
  public static float c(View paramView)
  {
    return paramView.getAlpha();
  }
  
  @Deprecated
  public static void c(View paramView, float paramFloat)
  {
    paramView.setPivotX(paramFloat);
  }
  
  public static void c(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramView.setAccessibilityLiveRegion(paramInt);
    }
  }
  
  public static ColorStateList d(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramView.getBackgroundTintList();
    }
    if ((paramView instanceof w)) {
      paramView = ((w)paramView).getSupportBackgroundTintList();
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  @Deprecated
  public static void d(View paramView, float paramFloat)
  {
    paramView.setPivotY(paramFloat);
  }
  
  public static void d(View paramView, int paramInt)
  {
    int k = Build.VERSION.SDK_INT;
    if (k >= 19)
    {
      paramView.setImportantForAccessibility(paramInt);
    }
    else if (k >= 16)
    {
      k = paramInt;
      if (paramInt == 4) {
        k = 2;
      }
      paramView.setImportantForAccessibility(k);
    }
  }
  
  public static PorterDuff.Mode e(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramView.getBackgroundTintMode();
    }
    if ((paramView instanceof w)) {
      paramView = ((w)paramView).getSupportBackgroundTintMode();
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  @Deprecated
  public static void e(View paramView, float paramFloat)
  {
    paramView.setRotation(paramFloat);
  }
  
  public static void e(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      paramView.setImportantForAutofill(paramInt);
    }
  }
  
  public static Rect f(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return paramView.getClipBounds();
    }
    return null;
  }
  
  @Deprecated
  public static void f(View paramView, float paramFloat)
  {
    paramView.setRotationX(paramFloat);
  }
  
  public static void f(View paramView, int paramInt)
  {
    if ((paramView instanceof l)) {
      ((l)paramView).a(paramInt);
    } else if (paramInt == 0) {
      G(paramView);
    }
  }
  
  public static Display g(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return paramView.getDisplay();
    }
    if (A(paramView)) {
      return ((WindowManager)paramView.getContext().getSystemService("window")).getDefaultDisplay();
    }
    return null;
  }
  
  @Deprecated
  public static void g(View paramView, float paramFloat)
  {
    paramView.setRotationY(paramFloat);
  }
  
  private static void g(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    if (paramView.getVisibility() == 0)
    {
      H(paramView);
      paramView = paramView.getParent();
      if ((paramView instanceof View)) {
        H((View)paramView);
      }
    }
  }
  
  public static float h(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramView.getElevation();
    }
    return 0.0F;
  }
  
  @Deprecated
  public static void h(View paramView, float paramFloat)
  {
    paramView.setScaleX(paramFloat);
  }
  
  private static void h(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    if (paramView.getVisibility() == 0)
    {
      H(paramView);
      paramView = paramView.getParent();
      if ((paramView instanceof View)) {
        H((View)paramView);
      }
    }
  }
  
  @Deprecated
  public static void i(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }
  
  public static boolean i(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramView.getFitsSystemWindows();
    }
    return false;
  }
  
  public static int j(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramView.getImportantForAccessibility();
    }
    return 0;
  }
  
  @Deprecated
  public static void j(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }
  
  @SuppressLint({"InlinedApi"})
  public static int k(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramView.getImportantForAutofill();
    }
    return 0;
  }
  
  @Deprecated
  public static void k(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }
  
  public static int l(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return paramView.getLayoutDirection();
    }
    return 0;
  }
  
  public static int m(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramView.getMinimumHeight();
    }
    if (!e) {}
    try
    {
      d = View.class.getDeclaredField("mMinHeight");
      d.setAccessible(true);
      e = true;
      Field localField = d;
      if (localField != null) {}
      try
      {
        int k = ((Integer)localField.get(paramView)).intValue();
        return k;
      }
      catch (Exception paramView)
      {
        for (;;) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  public static int n(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramView.getMinimumWidth();
    }
    if (!c) {}
    try
    {
      b = View.class.getDeclaredField("mMinWidth");
      b.setAccessible(true);
      c = true;
      Field localField = b;
      if (localField != null) {}
      try
      {
        int k = ((Integer)localField.get(paramView)).intValue();
        return k;
      }
      catch (Exception paramView)
      {
        for (;;) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  public static int o(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return paramView.getPaddingEnd();
    }
    return paramView.getPaddingRight();
  }
  
  public static int p(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return paramView.getPaddingStart();
    }
    return paramView.getPaddingLeft();
  }
  
  public static ViewParent q(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramView.getParentForAccessibility();
    }
    return paramView.getParent();
  }
  
  public static String r(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramView.getTransitionName();
    }
    WeakHashMap localWeakHashMap = f;
    if (localWeakHashMap == null) {
      return null;
    }
    return (String)localWeakHashMap.get(paramView);
  }
  
  @Deprecated
  public static float s(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  @Deprecated
  public static float t(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public static int u(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramView.getWindowSystemUiVisibility();
    }
    return 0;
  }
  
  public static float v(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramView.getZ();
    }
    return 0.0F;
  }
  
  public static boolean w(View paramView)
  {
    boolean bool1 = i;
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (h == null) {
      try
      {
        h = View.class.getDeclaredField("mAccessibilityDelegate");
        h.setAccessible(true);
      }
      catch (Throwable paramView)
      {
        i = true;
        return false;
      }
    }
    try
    {
      paramView = h.get(paramView);
      if (paramView != null) {
        bool2 = true;
      }
      return bool2;
    }
    catch (Throwable paramView)
    {
      i = true;
    }
    return false;
  }
  
  public static boolean x(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 15) {
      return paramView.hasOnClickListeners();
    }
    return false;
  }
  
  public static boolean y(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramView.hasOverlappingRendering();
    }
    return true;
  }
  
  public static boolean z(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return paramView.hasTransientState();
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract boolean onUnhandledKeyEvent(View paramView, KeyEvent paramKeyEvent);
  }
  
  static class b
  {
    private static final ArrayList<WeakReference<View>> a = new ArrayList();
    private WeakHashMap<View, Boolean> b = null;
    private SparseArray<WeakReference<View>> c = null;
    private WeakReference<KeyEvent> d = null;
    
    static b a(View paramView)
    {
      b localb1 = (b)paramView.getTag(j.tag_unhandled_key_event_manager);
      b localb2 = localb1;
      if (localb1 == null)
      {
        localb2 = new b();
        paramView.setTag(j.tag_unhandled_key_event_manager, localb2);
      }
      return localb2;
    }
    
    private SparseArray<WeakReference<View>> a()
    {
      if (this.c == null) {
        this.c = new SparseArray();
      }
      return this.c;
    }
    
    private View b(View paramView, KeyEvent paramKeyEvent)
    {
      Object localObject = this.b;
      if ((localObject != null) && (((WeakHashMap)localObject).containsKey(paramView)))
      {
        if ((paramView instanceof ViewGroup))
        {
          ViewGroup localViewGroup = (ViewGroup)paramView;
          for (int i = localViewGroup.getChildCount() - 1; i >= 0; i--)
          {
            localObject = b(localViewGroup.getChildAt(i), paramKeyEvent);
            if (localObject != null) {
              return (View)localObject;
            }
          }
        }
        if (c(paramView, paramKeyEvent)) {
          return paramView;
        }
      }
      return null;
    }
    
    private void b()
    {
      Object localObject1 = this.b;
      if (localObject1 != null) {
        ((WeakHashMap)localObject1).clear();
      }
      if (a.isEmpty()) {
        return;
      }
      synchronized (a)
      {
        if (this.b == null)
        {
          localObject1 = new java/util/WeakHashMap;
          ((WeakHashMap)localObject1).<init>();
          this.b = ((WeakHashMap)localObject1);
        }
        for (int i = a.size() - 1; i >= 0; i--)
        {
          localObject1 = (View)((WeakReference)a.get(i)).get();
          if (localObject1 == null)
          {
            a.remove(i);
          }
          else
          {
            this.b.put(localObject1, Boolean.TRUE);
            for (localObject1 = ((View)localObject1).getParent(); (localObject1 instanceof View); localObject1 = ((ViewParent)localObject1).getParent()) {
              this.b.put((View)localObject1, Boolean.TRUE);
            }
          }
        }
        return;
      }
    }
    
    private boolean c(View paramView, KeyEvent paramKeyEvent)
    {
      ArrayList localArrayList = (ArrayList)paramView.getTag(j.tag_unhandled_key_listeners);
      if (localArrayList != null) {
        for (int i = localArrayList.size() - 1; i >= 0; i--) {
          if (((y.a)localArrayList.get(i)).onUnhandledKeyEvent(paramView, paramKeyEvent)) {
            return true;
          }
        }
      }
      return false;
    }
    
    boolean a(KeyEvent paramKeyEvent)
    {
      Object localObject1 = this.d;
      if ((localObject1 != null) && (((WeakReference)localObject1).get() == paramKeyEvent)) {
        return false;
      }
      this.d = new WeakReference(paramKeyEvent);
      Object localObject2 = null;
      SparseArray localSparseArray = a();
      localObject1 = localObject2;
      if (paramKeyEvent.getAction() == 1)
      {
        int i = localSparseArray.indexOfKey(paramKeyEvent.getKeyCode());
        localObject1 = localObject2;
        if (i >= 0)
        {
          localObject1 = (WeakReference)localSparseArray.valueAt(i);
          localSparseArray.removeAt(i);
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = (WeakReference)localSparseArray.get(paramKeyEvent.getKeyCode());
      }
      if (localObject2 != null)
      {
        localObject1 = (View)((WeakReference)localObject2).get();
        if ((localObject1 != null) && (y.A((View)localObject1))) {
          c((View)localObject1, paramKeyEvent);
        }
        return true;
      }
      return false;
    }
    
    boolean a(View paramView, KeyEvent paramKeyEvent)
    {
      if (paramKeyEvent.getAction() == 0) {
        b();
      }
      paramView = b(paramView, paramKeyEvent);
      if (paramKeyEvent.getAction() == 0)
      {
        int i = paramKeyEvent.getKeyCode();
        if ((paramView != null) && (!KeyEvent.isModifierKey(i))) {
          a().put(i, new WeakReference(paramView));
        }
      }
      boolean bool;
      if (paramView != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */