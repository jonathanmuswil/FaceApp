package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class ay
  implements Gy
{
  private final Context a;
  private final Hy b;
  private final JSONObject c;
  private final qA d;
  private final xy e;
  private final hP f;
  private final Uu g;
  private final Ju h;
  private final dL i;
  private final Yl j;
  private final mL k;
  private final gs l;
  private final Vy m;
  private final e n;
  private final Cw o;
  private final yM p;
  private boolean q = false;
  private boolean r;
  private boolean s = false;
  private boolean t = false;
  private Point u = new Point();
  private Point v = new Point();
  private long w = 0L;
  private long x = 0L;
  private g y;
  
  public ay(Context paramContext, Hy paramHy, JSONObject paramJSONObject, qA paramqA, xy paramxy, hP paramhP, Uu paramUu, Ju paramJu, dL paramdL, Yl paramYl, mL parammL, gs paramgs, Vy paramVy, e parame, Cw paramCw, yM paramyM)
  {
    this.a = paramContext;
    this.b = paramHy;
    this.c = paramJSONObject;
    this.d = paramqA;
    this.e = paramxy;
    this.f = paramhP;
    this.g = paramUu;
    this.h = paramJu;
    this.i = paramdL;
    this.j = paramYl;
    this.k = parammL;
    this.l = paramgs;
    this.m = paramVy;
    this.n = parame;
    this.o = paramCw;
    this.p = paramyM;
  }
  
  private final int a(int paramInt)
  {
    return Kea.a().b(this.a, paramInt);
  }
  
  private final JSONObject a(Rect paramRect)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("width", a(paramRect.right - paramRect.left));
    localJSONObject.put("height", a(paramRect.bottom - paramRect.top));
    localJSONObject.put("x", a(paramRect.left));
    localJSONObject.put("y", a(paramRect.top));
    localJSONObject.put("relative_to", "self");
    return localJSONObject;
  }
  
  private final JSONObject a(Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, View paramView)
  {
    Object localObject1 = "ad_view";
    Object localObject2 = "relative_to";
    JSONObject localJSONObject1 = new JSONObject();
    if ((paramMap1 != null) && (paramView != null))
    {
      int[] arrayOfInt1 = f(paramView);
      Iterator localIterator = paramMap1.entrySet().iterator();
      paramMap1 = (Map<String, WeakReference<View>>)localObject2;
      paramView = (View)localObject1;
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localObject2 = (View)((WeakReference)localEntry.getValue()).get();
        if (localObject2 != null)
        {
          int[] arrayOfInt2 = f((View)localObject2);
          JSONObject localJSONObject2 = new JSONObject();
          localObject1 = new JSONObject();
          try
          {
            ((JSONObject)localObject1).put("width", a(((View)localObject2).getMeasuredWidth()));
            ((JSONObject)localObject1).put("height", a(((View)localObject2).getMeasuredHeight()));
            ((JSONObject)localObject1).put("x", a(arrayOfInt2[0] - arrayOfInt1[0]));
            ((JSONObject)localObject1).put("y", a(arrayOfInt2[1] - arrayOfInt1[1]));
            ((JSONObject)localObject1).put(paramMap1, paramView);
            localJSONObject2.put("frame", localObject1);
            localObject1 = new android/graphics/Rect;
            ((Rect)localObject1).<init>();
            if (((View)localObject2).getLocalVisibleRect((Rect)localObject1))
            {
              localObject1 = a((Rect)localObject1);
            }
            else
            {
              localObject1 = new org/json/JSONObject;
              ((JSONObject)localObject1).<init>();
              ((JSONObject)localObject1).put("width", 0);
              ((JSONObject)localObject1).put("height", 0);
              ((JSONObject)localObject1).put("x", a(arrayOfInt2[0] - arrayOfInt1[0]));
              ((JSONObject)localObject1).put("y", a(arrayOfInt2[1] - arrayOfInt1[1]));
              ((JSONObject)localObject1).put(paramMap1, paramView);
            }
            localJSONObject2.put("visible_bounds", localObject1);
            double d1;
            if ((localObject2 instanceof TextView))
            {
              localObject1 = (TextView)localObject2;
              localJSONObject2.put("text_color", ((TextView)localObject1).getCurrentTextColor());
              float f1 = ((TextView)localObject1).getTextSize();
              d1 = f1;
            }
            boolean bool;
            Tl.d("Unable to get asset views information");
          }
          catch (JSONException localJSONException1)
          {
            try
            {
              localJSONObject2.put("font_size", d1);
              localJSONObject2.put("text", ((TextView)localObject1).getText());
              if ((paramMap2 != null) && (paramMap2.containsKey(localEntry.getKey())) && (((View)localObject2).isClickable())) {
                bool = true;
              } else {
                bool = false;
              }
              localJSONObject2.put("is_clickable", bool);
              localJSONObject1.put((String)localEntry.getKey(), localJSONObject2);
            }
            catch (JSONException localJSONException2)
            {
              for (;;) {}
            }
            localJSONException1 = localJSONException1;
          }
        }
      }
    }
    return localJSONObject1;
  }
  
  private final void a(View paramView, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, JSONObject paramJSONObject4, String paramString, JSONObject paramJSONObject5, JSONObject paramJSONObject6, boolean paramBoolean1, boolean paramBoolean2)
  {
    t.a("performClick must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("ad", this.c);
      localJSONObject.put("asset_view_signal", paramJSONObject2);
      localJSONObject.put("ad_view_signal", paramJSONObject1);
      localJSONObject.put("click_signal", paramJSONObject5);
      localJSONObject.put("scroll_view_signal", paramJSONObject3);
      localJSONObject.put("lock_screen_signal", paramJSONObject4);
      paramJSONObject1 = this.b.b(this.e.e());
      boolean bool1 = false;
      boolean bool2;
      if (paramJSONObject1 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      localJSONObject.put("has_custom_click_handler", bool2);
      localJSONObject.put("provided_signals", paramJSONObject6);
      paramJSONObject1 = new org/json/JSONObject;
      paramJSONObject1.<init>();
      paramJSONObject1.put("asset_id", paramString);
      paramJSONObject1.put("template", this.e.n());
      paramJSONObject1.put("view_aware_api_used", paramBoolean1);
      if ((this.k.i != null) && (this.k.i.g)) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      }
      paramJSONObject1.put("custom_mute_requested", paramBoolean1);
      if ((!this.e.i().isEmpty()) && (this.e.p() != null)) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      }
      paramJSONObject1.put("custom_mute_enabled", paramBoolean1);
      if ((this.m.i() != null) && (this.c.optBoolean("custom_one_point_five_click_enabled", false))) {
        paramJSONObject1.put("custom_one_point_five_click_eligible", true);
      }
      paramJSONObject1.put("timestamp", this.n.a());
      if ((this.t) && (d())) {
        paramJSONObject1.put("custom_click_gesture_eligible", true);
      }
      if (paramBoolean2) {
        paramJSONObject1.put("is_custom_click_gesture", true);
      }
      paramBoolean1 = bool1;
      if (this.b.b(this.e.e()) != null) {
        paramBoolean1 = true;
      }
      paramJSONObject1.put("has_custom_click_handler", paramBoolean1);
      paramJSONObject1.put("click_signals", e(paramView));
      localJSONObject.put("click", paramJSONObject1);
      paramView = new org/json/JSONObject;
      paramView.<init>();
      long l1 = this.n.a();
      paramView.put("time_from_last_touch_down", l1 - this.w);
      paramView.put("time_from_last_touch", l1 - this.x);
      localJSONObject.put("touch_signal", paramView);
      dm.a(this.d.a("google.afma.nativeAds.handleClick", localJSONObject), "Error during performing handleClick");
      return;
    }
    catch (JSONException paramView)
    {
      Tl.b("Unable to create click JSON.", paramView);
    }
  }
  
  private final boolean a(JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, JSONObject paramJSONObject4, JSONObject paramJSONObject5)
  {
    t.a("recordImpression must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("ad", this.c);
      localJSONObject.put("asset_view_signal", paramJSONObject2);
      localJSONObject.put("ad_view_signal", paramJSONObject1);
      localJSONObject.put("scroll_view_signal", paramJSONObject3);
      localJSONObject.put("lock_screen_signal", paramJSONObject4);
      localJSONObject.put("provided_signals", paramJSONObject5);
      paramJSONObject1 = this.d;
      paramJSONObject2 = new com/google/android/gms/internal/ads/cy;
      paramJSONObject2.<init>(this, null);
      paramJSONObject1.a("/logScionEvent", paramJSONObject2);
      paramJSONObject2 = this.d;
      paramJSONObject1 = new com/google/android/gms/internal/ads/dy;
      paramJSONObject1.<init>(this, null);
      paramJSONObject2.a("/nativeImpression", paramJSONObject1);
      dm.a(this.d.a("google.afma.nativeAds.handleImpression", localJSONObject), "Error during performing handleImpression");
      boolean bool = this.q;
      if ((!bool) && (this.i.z != null)) {
        this.q = (bool | k.m().b(this.a, this.j.a, this.i.z.toString(), this.k.f));
      }
      return true;
    }
    catch (JSONException paramJSONObject1)
    {
      Tl.b("Unable to create impression JSON.", paramJSONObject1);
    }
    return false;
  }
  
  private final String b(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    if ((paramMap != null) && (paramView != null))
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        if (paramView.equals((View)((WeakReference)paramMap.getValue()).get())) {
          return (String)paramMap.getKey();
        }
      }
    }
    int i1 = this.e.n();
    if (i1 != 1)
    {
      if (i1 != 2)
      {
        if (i1 != 3)
        {
          if (i1 != 6) {
            return null;
          }
          return "3099";
        }
        return null;
      }
      return "2099";
    }
    return "1099";
  }
  
  private final JSONObject b(View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    try
    {
      int[] arrayOfInt = f(paramView);
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      ((JSONObject)localObject).put("width", a(paramView.getMeasuredWidth()));
      ((JSONObject)localObject).put("height", a(paramView.getMeasuredHeight()));
      ((JSONObject)localObject).put("x", a(arrayOfInt[0]));
      ((JSONObject)localObject).put("y", a(arrayOfInt[1]));
      ((JSONObject)localObject).put("relative_to", "window");
      localJSONObject.put("frame", localObject);
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      if (paramView.getGlobalVisibleRect((Rect)localObject))
      {
        localObject = a((Rect)localObject);
      }
      else
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        ((JSONObject)localObject).put("width", 0);
        ((JSONObject)localObject).put("height", 0);
        ((JSONObject)localObject).put("x", a(arrayOfInt[0]));
        ((JSONObject)localObject).put("y", a(arrayOfInt[1]));
        ((JSONObject)localObject).put("relative_to", "window");
      }
      localJSONObject.put("visible_bounds", localObject);
    }
    catch (Exception localException)
    {
      Tl.d("Unable to get native ad view bounding box");
    }
    ga localga = ra.Ye;
    if (((Boolean)Kea.e().a(localga)).booleanValue())
    {
      paramView = paramView.getParent();
      if (paramView == null) {}
    }
    try
    {
      try
      {
        paramView = (String)paramView.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(paramView, new Object[0]);
      }
      catch (InvocationTargetException paramView)
      {
        Tl.b("Cannot access method getTemplateTypeName: ", paramView);
      }
      catch (IllegalAccessException paramView)
      {
        Tl.b("Cannot access method getTemplateTypeName: ", paramView);
      }
      catch (SecurityException paramView)
      {
        Tl.b("Cannot access method getTemplateTypeName: ", paramView);
      }
    }
    catch (NoSuchMethodException paramView)
    {
      int i1;
      for (;;) {}
    }
    paramView = "";
    i1 = -1;
    try
    {
      int i2 = paramView.hashCode();
      if (i2 != -2066603854)
      {
        if ((i2 == 2019754500) && (paramView.equals("medium_template"))) {
          i1 = 1;
        }
      }
      else
      {
        boolean bool = paramView.equals("small_template");
        if (bool) {
          i1 = 0;
        }
      }
      if (i1 != 0)
      {
        if (i1 != 1) {
          localJSONObject.put("native_template_type", 0);
        } else {
          localJSONObject.put("native_template_type", 2);
        }
      }
      else {
        localJSONObject.put("native_template_type", 1);
      }
    }
    catch (JSONException paramView)
    {
      Tl.b("Could not log native template signal to JSON", paramView);
    }
    return localJSONObject;
  }
  
  private final boolean b(String paramString)
  {
    JSONObject localJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
    return (localJSONObject != null) && (localJSONObject.optBoolean(paramString, false));
  }
  
  private static JSONObject c(View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    try
    {
      k.c();
      boolean bool;
      if (vk.d(paramView) != -1) {
        bool = true;
      } else {
        bool = false;
      }
      localJSONObject.put("contained_in_scroll_view", bool);
    }
    catch (Exception paramView)
    {
      for (;;) {}
    }
    return localJSONObject;
  }
  
  private final JSONObject c(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      try
      {
        localJSONObject.put("click_point", e());
        localJSONObject.put("asset_id", paramString);
        paramString = localJSONObject;
      }
      catch (Exception localException1)
      {
        paramString = localJSONObject;
      }
      Tl.b("Error occurred while grabbing click signals.", localException2);
    }
    catch (Exception localException2)
    {
      paramString = null;
    }
    return paramString;
  }
  
  private final JSONObject d(View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    try
    {
      k.c();
      localJSONObject.put("can_show_on_lock_screen", vk.c(paramView));
      k.c();
      localJSONObject.put("is_keyguard_locked", vk.i(this.a));
    }
    catch (JSONException paramView)
    {
      Tl.d("Unable to get lock screen information");
    }
    return localJSONObject;
  }
  
  private final boolean d()
  {
    return this.c.optBoolean("allow_custom_click_gesture", false);
  }
  
  private final String e(View paramView)
  {
    try
    {
      JSONObject localJSONObject = this.c.optJSONObject("tracking_urls_and_actions");
      Object localObject = localJSONObject;
      if (localJSONObject == null)
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
      }
      localObject = ((JSONObject)localObject).optString("click_string");
      paramView = this.f.a().a(this.a, (String)localObject, paramView);
      return paramView;
    }
    catch (Exception paramView)
    {
      Tl.b("Exception obtaining click signals", paramView);
    }
    return null;
  }
  
  private final JSONObject e()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("x", a(this.u.x));
      localJSONObject.put("y", a(this.u.y));
      localJSONObject.put("start_x", a(this.v.x));
      localJSONObject.put("start_y", a(this.v.y));
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      Tl.b("Error occurred while putting signals into JSON object.", localJSONException);
    }
    return null;
  }
  
  private static int[] f(View paramView)
  {
    int[] arrayOfInt = new int[2];
    if (paramView != null) {
      paramView.getLocationOnScreen(arrayOfInt);
    }
    return arrayOfInt;
  }
  
  public final void D()
  {
    if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
      return;
    }
    this.m.h();
  }
  
  public final void H()
  {
    this.t = true;
  }
  
  public final void a()
  {
    t.a("recordDownloadedImpression must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("ad", this.c);
      dm.a(this.d.a("google.afma.nativeAds.handleDownloadedImpression", localJSONObject), "Error during performing handleDownloadedImpression");
      return;
    }
    catch (JSONException localJSONException)
    {
      Tl.b("", localJSONException);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      Tl.a("Touch event data is null. No touch event is reported.");
      return;
    }
    if (!b("touch_reporting"))
    {
      Tl.b("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
      return;
    }
    int i1 = (int)paramBundle.getFloat("x");
    int i2 = (int)paramBundle.getFloat("y");
    int i3 = paramBundle.getInt("duration_ms");
    this.f.a().a(i1, i2, i3);
  }
  
  public final void a(View paramView)
  {
    if (!this.c.optBoolean("custom_one_point_five_click_enabled", false))
    {
      Tl.d("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
      return;
    }
    Vy localVy = this.m;
    if (paramView != null)
    {
      paramView.setOnClickListener(localVy);
      paramView.setClickable(true);
      localVy.g = new WeakReference(paramView);
    }
  }
  
  public final void a(View paramView1, MotionEvent paramMotionEvent, View paramView2)
  {
    paramView1 = f(paramView2);
    this.u = new Point((int)paramMotionEvent.getRawX() - paramView1[0], (int)paramMotionEvent.getRawY() - paramView1[1]);
    long l1 = this.n.a();
    this.x = l1;
    if (paramMotionEvent.getAction() == 0)
    {
      this.w = l1;
      this.v = this.u;
    }
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramView1 = this.u;
    paramMotionEvent.setLocation(paramView1.x, paramView1.y);
    this.f.a(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  public final void a(View paramView1, View paramView2, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean)
  {
    paramMap2 = a(paramMap1, paramMap2, paramView2);
    JSONObject localJSONObject1 = b(paramView2);
    JSONObject localJSONObject2 = c(paramView2);
    paramView2 = d(paramView2);
    paramMap1 = b(paramView1, paramMap1);
    a(paramView1, localJSONObject1, paramMap2, localJSONObject2, paramView2, paramMap1, c(paramMap1), null, paramBoolean, false);
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    this.u = new Point();
    this.v = new Point();
    this.o.b(paramView);
    this.r = false;
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2)
  {
    paramMap1 = a(paramMap1, paramMap2, paramView);
    a(b(paramView), paramMap1, c(paramView), d(paramView), null);
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    this.u = new Point();
    this.v = new Point();
    if (!this.r)
    {
      this.o.a(paramView);
      this.r = true;
    }
    paramView.setOnTouchListener(paramOnTouchListener);
    paramView.setClickable(true);
    paramView.setOnClickListener(paramOnClickListener);
    this.l.a(this);
    if (paramMap1 != null)
    {
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        paramView = (View)((WeakReference)((Map.Entry)paramMap1.next()).getValue()).get();
        if (paramView != null)
        {
          paramView.setOnTouchListener(paramOnTouchListener);
          paramView.setClickable(true);
          paramView.setOnClickListener(paramOnClickListener);
        }
      }
    }
    if (paramMap2 != null)
    {
      paramMap1 = paramMap2.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        paramView = (View)((WeakReference)((Map.Entry)paramMap1.next()).getValue()).get();
        if (paramView != null)
        {
          paramView.setOnTouchListener(paramOnTouchListener);
          paramView.setClickable(false);
        }
      }
    }
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean)
  {
    if (!this.t)
    {
      Tl.a("Custom click reporting failed. enableCustomClickGesture is not set.");
      return;
    }
    if (!d())
    {
      Tl.a("Custom click reporting failed. Ad unit id not whitelisted.");
      return;
    }
    JSONObject localJSONObject1 = a(paramMap1, paramMap2, paramView);
    paramMap2 = b(paramView);
    JSONObject localJSONObject2 = c(paramView);
    JSONObject localJSONObject3 = d(paramView);
    paramMap1 = b(null, paramMap1);
    a(paramView, paramMap2, localJSONObject1, localJSONObject2, localJSONObject3, paramMap1, c(paramMap1), null, paramBoolean, true);
  }
  
  public final void a(ac paramac)
  {
    if (!this.c.optBoolean("custom_one_point_five_click_enabled", false))
    {
      Tl.d("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
      return;
    }
    this.m.a(paramac);
  }
  
  public final void a(g paramg)
  {
    this.y = paramg;
  }
  
  public final void a(j paramj)
  {
    try
    {
      if (this.s) {
        return;
      }
      if ((paramj == null) && (this.e.p() != null))
      {
        this.s = true;
        this.p.a(this.e.p().Ia());
        c();
        return;
      }
      this.s = true;
      this.p.a(paramj.Ia());
      c();
      return;
    }
    catch (RemoteException paramj)
    {
      Tl.d("#007 Could not call remote method.", paramj);
    }
  }
  
  public final void a(String paramString)
  {
    a(null, null, null, null, null, paramString, null, null, false, false);
  }
  
  public final void b()
  {
    a(null, null, null, null, null);
  }
  
  public final void b(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      Tl.a("Click data is null. No click is reported.");
      return;
    }
    if (!b("click_reporting"))
    {
      Tl.b("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
      return;
    }
    Object localObject = paramBundle.getBundle("click_signal");
    if (localObject != null) {
      localObject = ((Bundle)localObject).getString("asset_id");
    } else {
      localObject = null;
    }
    a(null, null, null, null, null, (String)localObject, null, k.c().a(paramBundle, null), false, false);
  }
  
  public final void c()
  {
    try
    {
      if (this.y != null) {
        this.y.Ea();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final boolean c(Bundle paramBundle)
  {
    if (!b("impression_reporting"))
    {
      Tl.b("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
      return false;
    }
    return a(null, null, null, null, k.c().a(paramBundle, null));
  }
  
  public final void destroy()
  {
    this.d.a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */