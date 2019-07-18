package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.v;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class z
{
  private final HashSet<String> a = new HashSet();
  private final Bundle b = new Bundle();
  private final HashMap<Class<? extends v>, v> c = new HashMap();
  private final HashSet<String> d = new HashSet();
  private final Bundle e = new Bundle();
  private final HashSet<String> f = new HashSet();
  private Date g;
  private String h;
  private int i = -1;
  private Location j;
  private boolean k = false;
  private String l;
  private String m;
  private int n = -1;
  private boolean o;
  private int p = -1;
  private String q;
  
  @Deprecated
  public final void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public final void a(Location paramLocation)
  {
    this.j = paramLocation;
  }
  
  public final void a(Class<? extends j> paramClass, Bundle paramBundle)
  {
    this.b.putBundle(paramClass.getName(), paramBundle);
  }
  
  public final void a(String paramString)
  {
    this.a.add(paramString);
  }
  
  @Deprecated
  public final void a(Date paramDate)
  {
    this.g = paramDate;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public final void b(String paramString)
  {
    this.d.add(paramString);
  }
  
  @Deprecated
  public final void b(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public final void c(String paramString)
  {
    this.d.remove(paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */