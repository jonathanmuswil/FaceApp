package com.facebook.accountkit.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

final class ba
{
  private static AtomicBoolean a = new AtomicBoolean(false);
  private static List<Z> b = Arrays.asList(new Z[] { new b(null), new c(null), new a(null) });
  
  static Intent a(Context paramContext)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Z)localIterator.next();
      localObject = a(paramContext, ((Z)localObject).c().addCategory("android.intent.category.DEFAULT"), (Z)localObject);
      if (localObject != null) {
        return (Intent)localObject;
      }
    }
    return null;
  }
  
  private static Intent a(Context paramContext, Intent paramIntent, Z paramZ)
  {
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveService(paramIntent, 0);
    if (localResolveInfo == null) {
      return null;
    }
    if (!paramZ.a(paramContext, localResolveInfo.serviceInfo.packageName)) {
      return null;
    }
    return paramIntent;
  }
  
  static boolean a(int paramInt)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext()) {
      if (((Z)localIterator.next()).a().contains(Integer.valueOf(paramInt))) {
        return true;
      }
    }
    return false;
  }
  
  static void c()
  {
    if (!a.compareAndSet(false, true)) {
      return;
    }
    va.e().execute(new aa());
  }
  
  static boolean d()
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext()) {
      if (((Z)localIterator.next()).d()) {
        return true;
      }
    }
    return false;
  }
  
  private static class a
    extends Z
  {
    protected String b()
    {
      return "com.facebook.lite";
    }
    
    protected Intent c()
    {
      return new Intent("com.facebook.lite.platform.PLATFORM_SERVICE").setPackage(b());
    }
  }
  
  private static class b
    extends Z
  {
    protected String b()
    {
      return "com.facebook.katana";
    }
    
    protected Intent c()
    {
      return new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(b());
    }
  }
  
  private static class c
    extends Z
  {
    protected String b()
    {
      return "com.facebook.wakizashi";
    }
    
    protected Intent c()
    {
      return new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(b());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */