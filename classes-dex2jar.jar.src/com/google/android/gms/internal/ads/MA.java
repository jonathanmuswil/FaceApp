package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@yh
public final class ma
{
  private final Collection<ga<?>> a = new ArrayList();
  private final Collection<ga<String>> b = new ArrayList();
  private final Collection<ga<String>> c = new ArrayList();
  
  public final List<String> a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (ga)localIterator.next();
      localObject = (String)Kea.e().a((ga)localObject);
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public final void a(SharedPreferences.Editor paramEditor, int paramInt, JSONObject paramJSONObject)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ga localga = (ga)localIterator.next();
      if (localga.b() == 1) {
        localga.a(paramEditor, localga.a(paramJSONObject));
      }
    }
    if (paramJSONObject != null)
    {
      paramEditor.putString("flag_configuration", paramJSONObject.toString());
      return;
    }
    Tl.b("Flag Json is null.");
  }
  
  public final void a(ga paramga)
  {
    this.a.add(paramga);
  }
  
  public final List<String> b()
  {
    List localList = a();
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (ga)localIterator.next();
      localObject = (String)Kea.e().a((ga)localObject);
      if (localObject != null) {
        localList.add(localObject);
      }
    }
    return localList;
  }
  
  public final void b(ga<String> paramga)
  {
    this.b.add(paramga);
  }
  
  public final void c(ga<String> paramga)
  {
    this.c.add(paramga);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */