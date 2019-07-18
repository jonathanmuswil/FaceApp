package com.google.android.gms.ads.internal;

import Hq;
import Iq;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.r;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.overlay.y;
import com.google.android.gms.ads.internal.overlay.z;
import com.google.android.gms.internal.ads.Eq;
import com.google.android.gms.internal.ads.Ny;
import com.google.android.gms.internal.ads.Oy;
import com.google.android.gms.internal.ads.P;
import com.google.android.gms.internal.ads.Pi;
import com.google.android.gms.internal.ads.Xea;
import com.google.android.gms.internal.ads.bH;
import com.google.android.gms.internal.ads.bfa;
import com.google.android.gms.internal.ads.ch;
import com.google.android.gms.internal.ads.gH;
import com.google.android.gms.internal.ads.kb;
import com.google.android.gms.internal.ads.lf;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.nfa;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.rH;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.sfa;
import com.google.android.gms.internal.ads.tH;
import com.google.android.gms.internal.ads.xH;
import com.google.android.gms.internal.ads.xea;
import java.util.HashMap;

public class ClientApi2
  extends nfa
{
  public final Xea a(Hq paramHq, String paramString, lf paramlf, int paramInt)
  {
    paramHq = (Context)Iq.J(paramHq);
    return new bH(Eq.a(paramHq, paramlf, paramInt), paramHq, paramString);
  }
  
  public final bfa a(Hq paramHq, xea paramxea, String paramString, int paramInt)
  {
    return new P();
  }
  
  public final bfa a(Hq paramHq, xea paramxea, String paramString, lf paramlf, int paramInt)
  {
    paramHq = (Context)Iq.J(paramHq);
    return new gH(Eq.a(paramHq, paramlf, paramInt), paramHq, paramxea, paramString);
  }
  
  public final ri a(Hq paramHq, lf paramlf, int paramInt)
  {
    paramHq = (Context)Iq.J(paramHq);
    return new xH(Eq.a(paramHq, paramlf, paramInt), paramHq);
  }
  
  public final Pi b(Hq paramHq, String paramString, lf paramlf, int paramInt)
  {
    paramHq = (Context)Iq.J(paramHq);
    return new tH(Eq.a(paramHq, paramlf, paramInt), paramHq, paramString);
  }
  
  public final bfa b(Hq paramHq, xea paramxea, String paramString, lf paramlf, int paramInt)
  {
    paramHq = (Context)Iq.J(paramHq);
    return new rH(Eq.a(paramHq, paramlf, paramInt), paramHq, paramxea, paramString);
  }
  
  public final kb b(Hq paramHq1, Hq paramHq2)
  {
    return new Oy((FrameLayout)Iq.J(paramHq1), (FrameLayout)Iq.J(paramHq2));
  }
  
  public final ob b(Hq paramHq1, Hq paramHq2, Hq paramHq3)
  {
    return new Ny((View)Iq.J(paramHq1), (HashMap)Iq.J(paramHq2), (HashMap)Iq.J(paramHq3));
  }
  
  public final sfa d(Hq paramHq, int paramInt)
  {
    return Eq.a((Context)Iq.J(paramHq), paramInt).e();
  }
  
  public final ch f(Hq paramHq)
  {
    paramHq = (Activity)Iq.J(paramHq);
    AdOverlayInfoParcel localAdOverlayInfoParcel = AdOverlayInfoParcel.a(paramHq.getIntent());
    if (localAdOverlayInfoParcel == null) {
      return new s(paramHq);
    }
    int i = localAdOverlayInfoParcel.k;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return new s(paramHq);
          }
          return new t(paramHq, localAdOverlayInfoParcel);
        }
        return new z(paramHq);
      }
      return new y(paramHq);
    }
    return new r(paramHq);
  }
  
  public final mh m(Hq paramHq)
  {
    return null;
  }
  
  public final sfa s(Hq paramHq)
  {
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/ClientApi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */