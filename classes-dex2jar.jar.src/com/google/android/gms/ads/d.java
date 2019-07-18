package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.internal.ads.y;
import com.google.android.gms.internal.ads.z;
import java.util.Date;

public final class d
{
  private final y a;
  
  private d(a parama)
  {
    this.a = new y(a.a(parama));
  }
  
  public final y a()
  {
    return this.a;
  }
  
  public static final class a
  {
    private final z a = new z();
    
    public a()
    {
      this.a.b("B3EEABB8EE11C2BE770B684D95219ECB");
    }
    
    @Deprecated
    public final a a(int paramInt)
    {
      this.a.a(paramInt);
      return this;
    }
    
    public final a a(Location paramLocation)
    {
      this.a.a(paramLocation);
      return this;
    }
    
    public final a a(Class<? extends j> paramClass, Bundle paramBundle)
    {
      this.a.a(paramClass, paramBundle);
      if ((paramClass.equals(AdMobAdapter.class)) && (paramBundle.getBoolean("_emulatorLiveAds"))) {
        this.a.c("B3EEABB8EE11C2BE770B684D95219ECB");
      }
      return this;
    }
    
    public final a a(String paramString)
    {
      this.a.a(paramString);
      return this;
    }
    
    @Deprecated
    public final a a(Date paramDate)
    {
      this.a.a(paramDate);
      return this;
    }
    
    @Deprecated
    public final a a(boolean paramBoolean)
    {
      this.a.b(paramBoolean);
      return this;
    }
    
    public final d a()
    {
      return new d(this, null);
    }
    
    public final a b(String paramString)
    {
      this.a.b(paramString);
      return this;
    }
    
    public final a b(boolean paramBoolean)
    {
      this.a.a(paramBoolean);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */