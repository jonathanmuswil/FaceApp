package com.google.firebase.perf.metrics;

import Iv;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.e;
import com.google.firebase.perf.internal.h;
import com.google.firebase.perf.internal.u;
import com.google.firebase.perf.internal.w;
import com.google.firebase.perf.internal.x;
import java.lang.ref.WeakReference;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import wv;
import yv;

public class Trace
  extends com.google.firebase.perf.internal.f
  implements Parcelable, e
{
  @Keep
  public static final Parcelable.Creator<Trace> CREATOR = new c();
  private static final Map<String, Trace> a = new ConcurrentHashMap();
  private static final Parcelable.Creator<Trace> b = new d();
  private final Trace c;
  private final GaugeManager d;
  private final String e;
  private final List<x> f;
  private final List<Trace> g;
  private final Map<String, a> h;
  private final wv i;
  private final h j;
  private final Map<String, String> k;
  private Iv l;
  private Iv m;
  private final WeakReference<e> n = new WeakReference(this);
  
  private Trace(Parcel paramParcel, boolean paramBoolean)
  {
    super(locala);
    this.c = ((Trace)paramParcel.readParcelable(Trace.class.getClassLoader()));
    this.e = paramParcel.readString();
    this.g = new ArrayList();
    paramParcel.readList(this.g, Trace.class.getClassLoader());
    this.h = new ConcurrentHashMap();
    this.k = new ConcurrentHashMap();
    paramParcel.readMap(this.h, a.class.getClassLoader());
    this.l = ((Iv)paramParcel.readParcelable(Iv.class.getClassLoader()));
    this.m = ((Iv)paramParcel.readParcelable(Iv.class.getClassLoader()));
    this.f = new ArrayList();
    paramParcel.readList(this.f, x.class.getClassLoader());
    if (paramBoolean)
    {
      this.j = null;
      this.i = null;
      this.d = null;
      return;
    }
    this.j = h.a();
    this.i = new wv();
    this.d = GaugeManager.zzbe();
  }
  
  public Trace(String paramString, h paramh, wv paramwv, com.google.firebase.perf.internal.a parama)
  {
    this(paramString, paramh, paramwv, parama, GaugeManager.zzbe());
  }
  
  private Trace(String paramString, h paramh, wv paramwv, com.google.firebase.perf.internal.a parama, GaugeManager paramGaugeManager)
  {
    super(parama);
    this.c = null;
    this.e = paramString.trim();
    this.g = new ArrayList();
    this.h = new ConcurrentHashMap();
    this.k = new ConcurrentHashMap();
    this.i = paramwv;
    this.j = paramh;
    this.f = new ArrayList();
    this.d = paramGaugeManager;
  }
  
  private final a a(String paramString)
  {
    a locala1 = (a)this.h.get(paramString);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new a(paramString);
      this.h.put(paramString, locala2);
    }
    return locala2;
  }
  
  private final void a(String paramString, long paramLong, int paramInt)
  {
    String str = u.a(paramString, paramInt);
    if (str != null)
    {
      paramInt = e.a[(paramInt - 1)];
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          Log.e("FirebasePerformance", String.format("Cannot increment metric %s. Metric name is invalid.(%s)", new Object[] { paramString, str }));
        }
        return;
      }
      Log.e("FirebasePerformance", String.format("Cannot increment counter %s. Counter name is invalid.(%s)", new Object[] { paramString, str }));
      return;
    }
    if (!r())
    {
      paramInt = e.a[(paramInt - 1)];
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          Log.w("FirebasePerformance", String.format("Cannot increment metric '%s' for trace '%s' because it's not started", new Object[] { paramString, this.e }));
        }
        return;
      }
      Log.w("FirebasePerformance", String.format("Cannot increment counter '%s' for trace '%s' because it's not started", new Object[] { paramString, this.e }));
      return;
    }
    if (s())
    {
      paramInt = e.a[(paramInt - 1)];
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          Log.w("FirebasePerformance", String.format("Cannot increment metric '%s' for trace '%s' because it's been stopped", new Object[] { paramString, this.e }));
        }
        return;
      }
      Log.w("FirebasePerformance", String.format("Cannot increment counter '%s' for trace '%s' because it's been stopped", new Object[] { paramString, this.e }));
      return;
    }
    a(paramString.trim()).a(paramLong);
  }
  
  private final boolean r()
  {
    return this.l != null;
  }
  
  private final boolean s()
  {
    return this.m != null;
  }
  
  public final void a(x paramx)
  {
    if ((r()) && (!s())) {
      this.f.add(paramx);
    }
  }
  
  @Keep
  public int describeContents()
  {
    return 0;
  }
  
  protected void finalize()
    throws Throwable
  {
    try
    {
      int i1;
      if ((r()) && (!s())) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0)
      {
        Log.w("FirebasePerformance", String.format("Trace '%s' is started but not stopped when it is destructed!", new Object[] { this.e }));
        zzc(1);
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  @Keep
  public String getAttribute(String paramString)
  {
    return (String)this.k.get(paramString);
  }
  
  @Keep
  public Map<String, String> getAttributes()
  {
    return new HashMap(this.k);
  }
  
  @Keep
  public long getLongMetric(String paramString)
  {
    if (paramString != null) {
      paramString = (a)this.h.get(paramString.trim());
    } else {
      paramString = null;
    }
    if (paramString == null) {
      return 0L;
    }
    return paramString.l();
  }
  
  @Deprecated
  @Keep
  public void incrementCounter(String paramString)
  {
    incrementCounter(paramString, 1L);
  }
  
  @Deprecated
  @Keep
  public void incrementCounter(String paramString, long paramLong)
  {
    a(paramString, paramLong, w.a);
  }
  
  @Keep
  public void incrementMetric(String paramString, long paramLong)
  {
    a(paramString, paramLong, w.b);
  }
  
  final String l()
  {
    return this.e;
  }
  
  final Map<String, a> m()
  {
    return this.h;
  }
  
  final Iv n()
  {
    return this.l;
  }
  
  final Iv o()
  {
    return this.m;
  }
  
  final List<Trace> p()
  {
    return this.g;
  }
  
  @Keep
  public void putAttribute(String paramString1, String paramString2)
  {
    int i1 = 0;
    String str1 = paramString1;
    String str2 = paramString2;
    try
    {
      paramString1 = paramString1.trim();
      str1 = paramString1;
      str2 = paramString2;
      paramString2 = paramString2.trim();
      str1 = paramString1;
      str2 = paramString2;
      Object localObject;
      if (!s())
      {
        str1 = paramString1;
        str2 = paramString2;
        if (!this.k.containsKey(paramString1))
        {
          str1 = paramString1;
          str2 = paramString2;
          if (this.k.size() >= 5)
          {
            str1 = paramString1;
            str2 = paramString2;
            localObject = new java/lang/IllegalArgumentException;
            str1 = paramString1;
            str2 = paramString2;
            ((IllegalArgumentException)localObject).<init>(String.format(Locale.US, "Exceeds max limit of number of attributes - %d", new Object[] { Integer.valueOf(5) }));
            str1 = paramString1;
            str2 = paramString2;
            throw ((Throwable)localObject);
          }
        }
        str1 = paramString1;
        str2 = paramString2;
        localObject = new java/util/AbstractMap$SimpleEntry;
        str1 = paramString1;
        str2 = paramString2;
        ((AbstractMap.SimpleEntry)localObject).<init>(paramString1, paramString2);
        str1 = paramString1;
        str2 = paramString2;
        localObject = u.a((Map.Entry)localObject);
        if (localObject == null)
        {
          i1 = 1;
        }
        else
        {
          str1 = paramString1;
          str2 = paramString2;
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          str1 = paramString1;
          str2 = paramString2;
          localIllegalArgumentException.<init>((String)localObject);
          str1 = paramString1;
          str2 = paramString2;
          throw localIllegalArgumentException;
        }
      }
      else
      {
        str1 = paramString1;
        str2 = paramString2;
        localObject = new java/lang/IllegalArgumentException;
        str1 = paramString1;
        str2 = paramString2;
        ((IllegalArgumentException)localObject).<init>(String.format(Locale.US, "Trace %s has been stopped", new Object[] { this.e }));
        str1 = paramString1;
        str2 = paramString2;
        throw ((Throwable)localObject);
      }
    }
    catch (Exception paramString1)
    {
      Log.e("FirebasePerformance", String.format("Can not set attribute %s with value %s (%s)", new Object[] { str1, str2, paramString1.getMessage() }));
      paramString2 = str2;
      paramString1 = str1;
      if (i1 != 0) {
        this.k.put(paramString1, paramString2);
      }
    }
  }
  
  @Keep
  public void putMetric(String paramString, long paramLong)
  {
    String str = u.a(paramString, w.b);
    if (str != null)
    {
      Log.e("FirebasePerformance", String.format("Cannot set value for metric %s. Metric name is invalid.(%s)", new Object[] { paramString, str }));
      return;
    }
    if (!r())
    {
      Log.w("FirebasePerformance", String.format("Cannot set value for metric '%s' for trace '%s' because it's not started", new Object[] { paramString, this.e }));
      return;
    }
    if (s())
    {
      Log.w("FirebasePerformance", String.format("Cannot set value for metric '%s' for trace '%s' because it's been stopped", new Object[] { paramString, this.e }));
      return;
    }
    a(paramString.trim()).b(paramLong);
  }
  
  public final List<x> q()
  {
    return this.f;
  }
  
  @Keep
  public void removeAttribute(String paramString)
  {
    if (s())
    {
      Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
      return;
    }
    this.k.remove(paramString);
  }
  
  @Keep
  public void start()
  {
    String str = this.e;
    if (str == null)
    {
      localObject = "Trace name must not be null";
    }
    else if (str.length() > 100)
    {
      localObject = String.format(Locale.US, "Trace name must not exceed %d characters", new Object[] { Integer.valueOf(100) });
    }
    else
    {
      if (str.startsWith("_"))
      {
        localObject = yv.values();
        int i1 = localObject.length;
        for (int i2 = 0; i2 < i1; i2++) {
          if (localObject[i2].toString().equals(str)) {
            break label113;
          }
        }
        if (!str.startsWith("_st_"))
        {
          localObject = "Trace name must not start with '_'";
          break label115;
        }
      }
      label113:
      localObject = null;
    }
    label115:
    if (localObject != null)
    {
      Log.e("FirebasePerformance", String.format("Cannot start trace %s. Trace name is invalid.(%s)", new Object[] { this.e, localObject }));
      return;
    }
    if (this.l != null)
    {
      Log.e("FirebasePerformance", String.format("Trace '%s' has already started, should not start again!", new Object[] { this.e }));
      return;
    }
    zzao();
    Object localObject = SessionManager.zzcl().zzcm();
    SessionManager.zzcl().zzc(this.n);
    this.f.add(localObject);
    this.l = new Iv();
    Log.i("FirebasePerformance", String.format("Session ID - %s", new Object[] { ((x)localObject).n() }));
    if (((x)localObject).o()) {
      this.d.zzbg();
    }
  }
  
  @Keep
  public void stop()
  {
    if (!r())
    {
      Log.e("FirebasePerformance", String.format("Trace '%s' has not been started so unable to stop!", new Object[] { this.e }));
      return;
    }
    if (s())
    {
      Log.e("FirebasePerformance", String.format("Trace '%s' has already stopped, should not stop again!", new Object[] { this.e }));
      return;
    }
    SessionManager.zzcl().zzd(this.n);
    zzap();
    this.m = new Iv();
    if (this.c == null)
    {
      Iv localIv = this.m;
      Object localObject;
      if (!this.g.isEmpty())
      {
        int i1 = this.g.size();
        localObject = (Trace)this.g.get(i1 - 1);
        if (((Trace)localObject).m == null) {
          ((Trace)localObject).m = localIv;
        }
      }
      if (!this.e.isEmpty())
      {
        localObject = this.j;
        if (localObject != null)
        {
          ((h)localObject).a(new f(this).a(), zzal());
          if (SessionManager.zzcl().zzcm().o()) {
            this.d.zzbg();
          }
        }
      }
      else
      {
        Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
      }
    }
  }
  
  @Keep
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.c, 0);
    paramParcel.writeString(this.e);
    paramParcel.writeList(this.g);
    paramParcel.writeMap(this.h);
    paramParcel.writeParcelable(this.l, 0);
    paramParcel.writeParcelable(this.m, 0);
    paramParcel.writeList(this.f);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/metrics/Trace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */