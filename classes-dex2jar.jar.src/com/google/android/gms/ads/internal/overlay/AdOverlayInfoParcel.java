package com.google.android.gms.ads.internal.overlay;

import Hq.a;
import Iq;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.h;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.Yl;
import com.google.android.gms.internal.ads.kea;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.sp;
import com.google.android.gms.internal.ads.yh;
import fq;
import hq;

@yh
public final class AdOverlayInfoParcel
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new n();
  public final c a;
  public final kea b;
  public final o c;
  public final sp d;
  public final qc e;
  public final String f;
  public final boolean g;
  public final String h;
  public final u i;
  public final int j;
  public final int k;
  public final String l;
  public final Yl m;
  public final String n;
  public final h o;
  public final oc p;
  
  AdOverlayInfoParcel(c paramc, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt1, int paramInt2, String paramString3, Yl paramYl, String paramString4, h paramh, IBinder paramIBinder6)
  {
    this.a = paramc;
    this.b = ((kea)Iq.J(Hq.a.a(paramIBinder1)));
    this.c = ((o)Iq.J(Hq.a.a(paramIBinder2)));
    this.d = ((sp)Iq.J(Hq.a.a(paramIBinder3)));
    this.p = ((oc)Iq.J(Hq.a.a(paramIBinder6)));
    this.e = ((qc)Iq.J(Hq.a.a(paramIBinder4)));
    this.f = paramString1;
    this.g = paramBoolean;
    this.h = paramString2;
    this.i = ((u)Iq.J(Hq.a.a(paramIBinder5)));
    this.j = paramInt1;
    this.k = paramInt2;
    this.l = paramString3;
    this.m = paramYl;
    this.n = paramString4;
    this.o = paramh;
  }
  
  public AdOverlayInfoParcel(c paramc, kea paramkea, o paramo, u paramu, Yl paramYl)
  {
    this.a = paramc;
    this.b = paramkea;
    this.c = paramo;
    this.d = null;
    this.p = null;
    this.e = null;
    this.f = null;
    this.g = false;
    this.h = null;
    this.i = paramu;
    this.j = -1;
    this.k = 4;
    this.l = null;
    this.m = paramYl;
    this.n = null;
    this.o = null;
  }
  
  public AdOverlayInfoParcel(kea paramkea, o paramo, u paramu, sp paramsp, int paramInt, Yl paramYl, String paramString, h paramh)
  {
    this.a = null;
    this.b = null;
    this.c = paramo;
    this.d = paramsp;
    this.p = null;
    this.e = null;
    this.f = null;
    this.g = false;
    this.h = null;
    this.i = null;
    this.j = paramInt;
    this.k = 1;
    this.l = null;
    this.m = paramYl;
    this.n = paramString;
    this.o = paramh;
  }
  
  public AdOverlayInfoParcel(kea paramkea, o paramo, u paramu, sp paramsp, boolean paramBoolean, int paramInt, Yl paramYl)
  {
    this.a = null;
    this.b = paramkea;
    this.c = paramo;
    this.d = paramsp;
    this.p = null;
    this.e = null;
    this.f = null;
    this.g = paramBoolean;
    this.h = null;
    this.i = paramu;
    this.j = paramInt;
    this.k = 2;
    this.l = null;
    this.m = paramYl;
    this.n = null;
    this.o = null;
  }
  
  public AdOverlayInfoParcel(kea paramkea, o paramo, oc paramoc, qc paramqc, u paramu, sp paramsp, boolean paramBoolean, int paramInt, String paramString, Yl paramYl)
  {
    this.a = null;
    this.b = paramkea;
    this.c = paramo;
    this.d = paramsp;
    this.p = paramoc;
    this.e = paramqc;
    this.f = null;
    this.g = paramBoolean;
    this.h = null;
    this.i = paramu;
    this.j = paramInt;
    this.k = 3;
    this.l = paramString;
    this.m = paramYl;
    this.n = null;
    this.o = null;
  }
  
  public AdOverlayInfoParcel(kea paramkea, o paramo, oc paramoc, qc paramqc, u paramu, sp paramsp, boolean paramBoolean, int paramInt, String paramString1, String paramString2, Yl paramYl)
  {
    this.a = null;
    this.b = paramkea;
    this.c = paramo;
    this.d = paramsp;
    this.p = paramoc;
    this.e = paramqc;
    this.f = paramString2;
    this.g = paramBoolean;
    this.h = paramString1;
    this.i = paramu;
    this.j = paramInt;
    this.k = 3;
    this.l = null;
    this.m = paramYl;
    this.n = null;
    this.o = null;
  }
  
  public static AdOverlayInfoParcel a(Intent paramIntent)
  {
    try
    {
      paramIntent = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      paramIntent.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
      paramIntent = (AdOverlayInfoParcel)paramIntent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      return paramIntent;
    }
    catch (Exception paramIntent) {}
    return null;
  }
  
  public static void a(Intent paramIntent, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", paramAdOverlayInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, paramInt, false);
    hq.a(paramParcel, 3, Iq.a(this.b).asBinder(), false);
    hq.a(paramParcel, 4, Iq.a(this.c).asBinder(), false);
    hq.a(paramParcel, 5, Iq.a(this.d).asBinder(), false);
    hq.a(paramParcel, 6, Iq.a(this.e).asBinder(), false);
    hq.a(paramParcel, 7, this.f, false);
    hq.a(paramParcel, 8, this.g);
    hq.a(paramParcel, 9, this.h, false);
    hq.a(paramParcel, 10, Iq.a(this.i).asBinder(), false);
    hq.a(paramParcel, 11, this.j);
    hq.a(paramParcel, 12, this.k);
    hq.a(paramParcel, 13, this.l, false);
    hq.a(paramParcel, 14, this.m, paramInt, false);
    hq.a(paramParcel, 16, this.n, false);
    hq.a(paramParcel, 17, this.o, paramInt, false);
    hq.a(paramParcel, 18, Iq.a(this.p).asBinder(), false);
    hq.a(paramParcel, i1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */