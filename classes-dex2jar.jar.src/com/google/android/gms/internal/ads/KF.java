package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.v;
import java.lang.reflect.Constructor;
import java.util.Map;

@yh
public final class kf
  extends mf
{
  private static final zg a = new zg();
  private Map<Class<? extends v>, v> b;
  
  private final of A(String paramString)
    throws RemoteException
  {
    try
    {
      Tl.a("Reflection failed, retrying using direct instantiation");
      Object localObject;
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
      {
        localObject = new com/google/ads/mediation/admob/AdMobAdapter;
        ((AdMobAdapter)localObject).<init>();
        return new If((f)localObject);
      }
      if ("com.google.ads.mediation.AdUrlAdapter".equals(paramString))
      {
        localObject = new com/google/ads/mediation/AdUrlAdapter;
        ((AdUrlAdapter)localObject).<init>();
        return new If((f)localObject);
      }
      if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
      {
        localObject = new com/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
        ((com.google.android.gms.ads.mediation.customevent.CustomEventAdapter)localObject).<init>();
        return new If((f)localObject);
      }
      if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
      {
        localObject = new com/google/ads/mediation/customevent/CustomEventAdapter;
        ((com.google.ads.mediation.customevent.CustomEventAdapter)localObject).<init>();
        localObject = new Qf((MediationAdapter)localObject, (c)this.b.get(((com.google.ads.mediation.customevent.CustomEventAdapter)localObject).getAdditionalParametersType()));
        return (of)localObject;
      }
    }
    catch (Throwable localThrowable)
    {
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 43);
      localStringBuilder.append("Could not instantiate mediation adapter: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(". ");
      Tl.c(localStringBuilder.toString(), localThrowable);
      throw new RemoteException();
    }
  }
  
  private final <NetworkExtrasT extends NetworkExtras, ServerParametersT extends MediationServerParameters> of z(String paramString)
    throws RemoteException
  {
    try
    {
      Object localObject = Class.forName(paramString, false, kf.class.getClassLoader());
      if (MediationAdapter.class.isAssignableFrom((Class)localObject))
      {
        localObject = (MediationAdapter)((Class)localObject).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        return new Qf((MediationAdapter)localObject, (NetworkExtras)this.b.get(((MediationAdapter)localObject).getAdditionalParametersType()));
      }
      if (f.class.isAssignableFrom((Class)localObject)) {
        return new If((f)((Class)localObject).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      }
      if (com.google.android.gms.ads.mediation.a.class.isAssignableFrom((Class)localObject)) {
        return new If((com.google.android.gms.ads.mediation.a)((Class)localObject).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      }
      int i = String.valueOf(paramString).length();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>(i + 64);
      ((StringBuilder)localObject).append("Could not instantiate mediation adapter: ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" (not a valid adapter).");
      Tl.d(((StringBuilder)localObject).toString());
      localObject = new android/os/RemoteException;
      ((RemoteException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    catch (Throwable localThrowable) {}
    return A(paramString);
  }
  
  public final void a(Map<Class<? extends v>, v> paramMap)
  {
    this.b = paramMap;
  }
  
  public final sg m(String paramString)
    throws RemoteException
  {
    return zg.a(paramString);
  }
  
  public final of v(String paramString)
    throws RemoteException
  {
    return z(paramString);
  }
  
  public final boolean y(String paramString)
    throws RemoteException
  {
    try
    {
      boolean bool = com.google.android.gms.ads.mediation.customevent.a.class.isAssignableFrom(Class.forName(paramString, false, kf.class.getClassLoader()));
      return bool;
    }
    catch (Throwable localThrowable)
    {
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 80);
      localStringBuilder.append("Could not load custom event implementation class: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(", assuming old implementation.");
      Tl.d(localStringBuilder.toString());
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */