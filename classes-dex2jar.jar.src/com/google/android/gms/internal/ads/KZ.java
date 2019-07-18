package com.google.android.gms.internal.ads;

import Iq;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public final class kz
  implements Gy
{
  private final xf a;
  private final Af b;
  private final Df c;
  private final Uu d;
  private final Ju e;
  private final Context f;
  private final dL g;
  private final Yl h;
  private final mL i;
  private boolean j = false;
  private boolean k = false;
  
  public kz(xf paramxf, Af paramAf, Df paramDf, Uu paramUu, Ju paramJu, Context paramContext, dL paramdL, Yl paramYl, mL parammL)
  {
    this.a = paramxf;
    this.b = paramAf;
    this.c = paramDf;
    this.d = paramUu;
    this.e = paramJu;
    this.f = paramContext;
    this.g = paramdL;
    this.h = paramYl;
    this.i = parammL;
  }
  
  private static HashMap<String, View> a(Map<String, WeakReference<View>> paramMap)
  {
    HashMap localHashMap = new HashMap();
    if (paramMap == null) {
      return localHashMap;
    }
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        View localView = (View)((WeakReference)localEntry.getValue()).get();
        if (localView != null) {
          localHashMap.put((String)localEntry.getKey(), localView);
        }
      }
      return localHashMap;
    }
    finally {}
  }
  
  private final void b(View paramView)
  {
    try
    {
      if ((this.c != null) && (!this.c.ga()))
      {
        this.c.b(Iq.a(paramView));
        this.e.l();
        return;
      }
      if ((this.a != null) && (!this.a.ga()))
      {
        this.a.b(Iq.a(paramView));
        this.e.l();
        return;
      }
      if ((this.b != null) && (!this.b.ga()))
      {
        this.b.b(Iq.a(paramView));
        this.e.l();
      }
      return;
    }
    catch (RemoteException paramView)
    {
      Tl.c("Failed to call handleClick", paramView);
    }
  }
  
  public final void D() {}
  
  public final void H()
  {
    this.k = true;
  }
  
  public final void a() {}
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(View paramView) {}
  
  public final void a(View paramView1, MotionEvent paramMotionEvent, View paramView2) {}
  
  public final void a(View paramView1, View paramView2, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean)
  {
    if ((this.k) && (this.g.D)) {
      return;
    }
    b(paramView1);
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    try
    {
      paramView = Iq.a(paramView);
      if (this.c != null)
      {
        this.c.a(paramView);
        return;
      }
      if (this.a != null)
      {
        this.a.a(paramView);
        return;
      }
      if (this.b != null) {
        this.b.a(paramView);
      }
      return;
    }
    catch (RemoteException paramView)
    {
      Tl.c("Failed to call untrackView", paramView);
    }
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2)
  {
    try
    {
      if ((!this.j) && (this.g.z != null)) {
        this.j |= k.m().b(this.f, this.h.a, this.g.z.toString(), this.i.f);
      }
      if ((this.c != null) && (!this.c.U()))
      {
        this.c.A();
        this.d.K();
        return;
      }
      if ((this.a != null) && (!this.a.U()))
      {
        this.a.A();
        this.d.K();
        return;
      }
      if ((this.b != null) && (!this.b.U()))
      {
        this.b.A();
        this.d.K();
      }
      return;
    }
    catch (RemoteException paramView)
    {
      Tl.c("Failed to call recordImpression", paramView);
    }
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    try
    {
      paramView = Iq.a(paramView);
      paramMap1 = a(paramMap1);
      paramMap2 = a(paramMap2);
      if (this.c != null)
      {
        this.c.a(paramView, Iq.a(paramMap1), Iq.a(paramMap2));
        return;
      }
      if (this.a != null)
      {
        this.a.a(paramView, Iq.a(paramMap1), Iq.a(paramMap2));
        this.a.e(paramView);
        return;
      }
      if (this.b != null)
      {
        this.b.a(paramView, Iq.a(paramMap1), Iq.a(paramMap2));
        this.b.e(paramView);
      }
      return;
    }
    catch (RemoteException paramView)
    {
      Tl.c("Failed to call trackView", paramView);
    }
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, boolean paramBoolean)
  {
    if (!this.k)
    {
      Tl.d("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
      return;
    }
    if (!this.g.D)
    {
      Tl.d("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
      return;
    }
    b(paramView);
  }
  
  public final void a(ac paramac) {}
  
  public final void a(g paramg)
  {
    Tl.d("Mute This Ad is not supported for 3rd party ads");
  }
  
  public final void a(j paramj)
  {
    Tl.d("Mute This Ad is not supported for 3rd party ads");
  }
  
  public final void a(String paramString) {}
  
  public final void b() {}
  
  public final void b(Bundle paramBundle) {}
  
  public final void c()
  {
    Tl.d("Mute This Ad is not supported for 3rd party ads");
  }
  
  public final boolean c(Bundle paramBundle)
  {
    return false;
  }
  
  public final void destroy() {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */