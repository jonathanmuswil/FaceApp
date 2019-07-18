package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.util.m;

@yh
public final class yca
{
  private final Object a = new Object();
  private zca b = null;
  private boolean c = false;
  
  public final Activity a()
  {
    synchronized (this.a)
    {
      if (!m.a()) {
        return null;
      }
      if (this.b != null)
      {
        Activity localActivity = this.b.a();
        return localActivity;
      }
      return null;
    }
  }
  
  public final void a(Context paramContext)
  {
    synchronized (this.a)
    {
      if (!this.c)
      {
        if (!m.a()) {
          return;
        }
        Application localApplication = null;
        Context localContext = paramContext.getApplicationContext();
        Object localObject2 = localContext;
        if (localContext == null) {
          localObject2 = paramContext;
        }
        if ((localObject2 instanceof Application)) {
          localApplication = (Application)localObject2;
        }
        if (localApplication == null)
        {
          Tl.d("Can not cast Context to Application");
          return;
        }
        if (this.b == null)
        {
          localObject2 = new com/google/android/gms/internal/ads/zca;
          ((zca)localObject2).<init>();
          this.b = ((zca)localObject2);
        }
        this.b.a(localApplication, paramContext);
        this.c = true;
      }
      return;
    }
  }
  
  public final void a(Bca paramBca)
  {
    synchronized (this.a)
    {
      if (!m.a()) {
        return;
      }
      if (this.b == null)
      {
        zca localzca = new com/google/android/gms/internal/ads/zca;
        localzca.<init>();
        this.b = localzca;
      }
      this.b.a(paramBca);
      return;
    }
  }
  
  public final Context b()
  {
    synchronized (this.a)
    {
      if (!m.a()) {
        return null;
      }
      if (this.b != null)
      {
        Context localContext = this.b.b();
        return localContext;
      }
      return null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */