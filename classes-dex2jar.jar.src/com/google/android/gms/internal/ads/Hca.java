package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@yh
@TargetApi(14)
public final class hca
  implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private static final long a;
  private final Context b;
  private Application c;
  private final WindowManager d;
  private final PowerManager e;
  private final KeyguardManager f;
  private BroadcastReceiver g;
  private WeakReference<ViewTreeObserver> h;
  private WeakReference<View> i;
  private nca j;
  private xl k = new xl(a);
  private boolean l = false;
  private int m = -1;
  private final HashSet<mca> n = new HashSet();
  private final DisplayMetrics o;
  private final Rect p;
  
  static
  {
    ga localga = ra.Ob;
    a = ((Long)Kea.e().a(localga)).longValue();
  }
  
  public hca(Context paramContext, View paramView)
  {
    this.b = paramContext.getApplicationContext();
    this.d = ((WindowManager)paramContext.getSystemService("window"));
    this.e = ((PowerManager)this.b.getSystemService("power"));
    this.f = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    Context localContext = this.b;
    if ((localContext instanceof Application))
    {
      this.c = ((Application)localContext);
      this.j = new nca((Application)localContext, this);
    }
    this.o = paramContext.getResources().getDisplayMetrics();
    this.p = new Rect();
    this.p.right = this.d.getDefaultDisplay().getWidth();
    this.p.bottom = this.d.getDefaultDisplay().getHeight();
    paramContext = this.i;
    if (paramContext != null) {
      paramContext = (View)paramContext.get();
    } else {
      paramContext = null;
    }
    if (paramContext != null)
    {
      paramContext.removeOnAttachStateChangeListener(this);
      b(paramContext);
    }
    this.i = new WeakReference(paramView);
    if (paramView != null)
    {
      if (k.e().a(paramView)) {
        a(paramView);
      }
      paramView.addOnAttachStateChangeListener(this);
    }
  }
  
  private final Rect a(Rect paramRect)
  {
    return new Rect(b(paramRect.left), b(paramRect.top), b(paramRect.right), b(paramRect.bottom));
  }
  
  private final void a(int paramInt)
  {
    if (this.n.size() == 0) {
      return;
    }
    Object localObject1 = this.i;
    if (localObject1 == null) {
      return;
    }
    View localView = (View)((WeakReference)localObject1).get();
    int i1;
    if (paramInt == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2;
    if (localView == null) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    Object localObject2 = new Rect();
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    Rect localRect3 = new Rect();
    localObject1 = new int[2];
    int[] arrayOfInt = new int[2];
    boolean bool1;
    boolean bool2;
    if (localView != null)
    {
      bool1 = localView.getGlobalVisibleRect(localRect1);
      bool2 = localView.getLocalVisibleRect(localRect2);
      localView.getHitRect(localRect3);
      try
      {
        localView.getLocationOnScreen((int[])localObject1);
        localView.getLocationInWindow(arrayOfInt);
      }
      catch (Exception localException)
      {
        Tl.b("Failure getting view location.", localException);
      }
      ((Rect)localObject2).left = localObject1[0];
      ((Rect)localObject2).top = localObject1[1];
      ((Rect)localObject2).right = (((Rect)localObject2).left + localView.getWidth());
      ((Rect)localObject2).bottom = (((Rect)localObject2).top + localView.getHeight());
    }
    else
    {
      bool1 = false;
      bool2 = false;
    }
    localObject1 = ra.Rb;
    if ((((Boolean)Kea.e().a((ga)localObject1)).booleanValue()) && (localView != null)) {
      localObject1 = c(localView);
    } else {
      localObject1 = Collections.emptyList();
    }
    int i3;
    if (localView != null) {
      i3 = localView.getWindowVisibility();
    } else {
      i3 = 8;
    }
    int i4 = this.m;
    if (i4 != -1) {
      i3 = i4;
    }
    boolean bool3;
    if ((i2 == 0) && (k.c().a(localView, this.e, this.f)) && (bool1) && (bool2) && (i3 == 0)) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    if ((i1 != 0) && (!this.k.a()) && (bool3 == this.l)) {
      return;
    }
    if ((!bool3) && (!this.l) && (paramInt == 1)) {
      return;
    }
    long l1 = k.j().b();
    boolean bool4 = this.e.isScreenOn();
    boolean bool5;
    if ((localView != null) && (k.e().a(localView))) {
      bool5 = true;
    } else {
      bool5 = false;
    }
    if (localView != null) {
      paramInt = localView.getWindowVisibility();
    } else {
      paramInt = 8;
    }
    localObject2 = new lca(l1, bool4, bool5, paramInt, a(this.p), a((Rect)localObject2), a(localRect1), bool1, a(localRect2), bool2, a(localRect3), this.o.density, bool3, (List)localObject1);
    localObject1 = this.n.iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((mca)((Iterator)localObject1).next()).a((lca)localObject2);
    }
    this.l = bool3;
  }
  
  private final void a(Activity paramActivity, int paramInt)
  {
    if (this.i == null) {
      return;
    }
    paramActivity = paramActivity.getWindow();
    if (paramActivity == null) {
      return;
    }
    View localView = paramActivity.peekDecorView();
    paramActivity = (View)this.i.get();
    if ((paramActivity != null) && (localView != null) && (paramActivity.getRootView() == localView.getRootView())) {
      this.m = paramInt;
    }
  }
  
  private final void a(View paramView)
  {
    paramView = paramView.getViewTreeObserver();
    if (paramView.isAlive())
    {
      this.h = new WeakReference(paramView);
      paramView.addOnScrollChangedListener(this);
      paramView.addOnGlobalLayoutListener(this);
    }
    if (this.g == null)
    {
      paramView = new IntentFilter();
      paramView.addAction("android.intent.action.SCREEN_ON");
      paramView.addAction("android.intent.action.SCREEN_OFF");
      paramView.addAction("android.intent.action.USER_PRESENT");
      this.g = new kca(this);
      k.x().a(this.b, this.g, paramView);
    }
    paramView = this.c;
    if (paramView != null) {
      try
      {
        paramView.registerActivityLifecycleCallbacks(this.j);
        return;
      }
      catch (Exception paramView)
      {
        Tl.b("Error registering activity lifecycle callbacks.", paramView);
      }
    }
  }
  
  private final int b(int paramInt)
  {
    float f1 = this.o.density;
    return (int)(paramInt / f1);
  }
  
  private final void b()
  {
    k.c();
    vk.a.post(new ica(this));
  }
  
  private final void b(View paramView)
  {
    try
    {
      if (this.h != null)
      {
        ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)this.h.get();
        if ((localViewTreeObserver != null) && (localViewTreeObserver.isAlive()))
        {
          localViewTreeObserver.removeOnScrollChangedListener(this);
          localViewTreeObserver.removeGlobalOnLayoutListener(this);
        }
        this.h = null;
      }
    }
    catch (Exception localException)
    {
      Tl.b("Error while unregistering listeners from the last ViewTreeObserver.", localException);
    }
    try
    {
      paramView = paramView.getViewTreeObserver();
      if (paramView.isAlive())
      {
        paramView.removeOnScrollChangedListener(this);
        paramView.removeGlobalOnLayoutListener(this);
      }
    }
    catch (Exception paramView)
    {
      Tl.b("Error while unregistering listeners from the ViewTreeObserver.", paramView);
    }
    if (this.g != null)
    {
      try
      {
        k.x().a(this.b, this.g);
      }
      catch (Exception paramView)
      {
        k.g().a(paramView, "ActiveViewUnit.stopScreenStatusMonitoring");
      }
      catch (IllegalStateException paramView)
      {
        Tl.b("Failed trying to unregister the receiver", paramView);
      }
      this.g = null;
    }
    paramView = this.c;
    if (paramView != null) {
      try
      {
        paramView.unregisterActivityLifecycleCallbacks(this.j);
        return;
      }
      catch (Exception paramView)
      {
        Tl.b("Error registering activity lifecycle callbacks.", paramView);
      }
    }
  }
  
  private final List<Rect> c(View paramView)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      for (paramView = paramView.getParent(); (paramView instanceof View); paramView = paramView.getParent())
      {
        View localView = (View)paramView;
        Rect localRect = new android/graphics/Rect;
        localRect.<init>();
        boolean bool;
        if (Build.VERSION.SDK_INT >= 16) {
          bool = localView.isScrollContainer();
        } else if ((!(localView instanceof ScrollView)) && (!(localView instanceof ListView))) {
          bool = false;
        } else {
          bool = true;
        }
        if ((bool) && (localView.getGlobalVisibleRect(localRect))) {
          localArrayList.add(a(localRect));
        }
      }
      return localArrayList;
    }
    catch (Exception paramView)
    {
      k.g().a(paramView, "PositionWatcher.getParentScrollViewRects");
    }
    return Collections.emptyList();
  }
  
  public final void a()
  {
    this.k.a(a);
  }
  
  public final void a(long paramLong)
  {
    this.k.a(paramLong);
  }
  
  public final void a(mca parammca)
  {
    this.n.add(parammca);
    a(3);
  }
  
  public final void b(mca parammca)
  {
    this.n.remove(parammca);
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity, 0);
    a(3);
    b();
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a(3);
    b();
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(paramActivity, 4);
    a(3);
    b();
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(paramActivity, 0);
    a(3);
    b();
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    a(3);
    b();
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(paramActivity, 0);
    a(3);
    b();
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a(3);
    b();
  }
  
  public final void onGlobalLayout()
  {
    a(2);
    b();
  }
  
  public final void onScrollChanged()
  {
    a(1);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    this.m = -1;
    a(paramView);
    a(3);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    this.m = -1;
    a(3);
    b();
    b(paramView);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */