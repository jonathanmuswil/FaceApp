package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.lang.ref.WeakReference;

@yh
public final class li
  extends ContextWrapper
{
  private Context a;
  private WeakReference<Activity> b = new WeakReference(null);
  
  private li(Context paramContext)
  {
    super(paramContext);
  }
  
  private final Intent a(Intent paramIntent)
  {
    try
    {
      if ((this.a != null) && (paramIntent.getComponent() != null) && (paramIntent.getComponent().getPackageName().equals(this.a.getPackageName())))
      {
        Intent localIntent = (Intent)paramIntent.clone();
        localIntent.setClassName(super.getPackageName(), paramIntent.getComponent().getClassName());
        return localIntent;
      }
      return paramIntent;
    }
    finally {}
  }
  
  public static li a(Context paramContext)
  {
    return new li(c(paramContext));
  }
  
  public static Context b(Context paramContext)
  {
    if ((paramContext instanceof li)) {
      return ((li)paramContext).getBaseContext();
    }
    return c(paramContext);
  }
  
  /* Error */
  private final void b(Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 21	com/google/android/gms/internal/ads/li:b	Ljava/lang/ref/WeakReference;
    //   6: invokevirtual 74	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   9: checkcast 76	android/app/Activity
    //   12: astore_2
    //   13: aload_2
    //   14: ifnonnull +18 -> 32
    //   17: aload_1
    //   18: ldc 77
    //   20: invokevirtual 81	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   23: pop
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial 84	android/content/ContextWrapper:startActivity	(Landroid/content/Intent;)V
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: aload_1
    //   33: invokevirtual 50	android/content/Intent:clone	()Ljava/lang/Object;
    //   36: checkcast 27	android/content/Intent
    //   39: astore_3
    //   40: aload_3
    //   41: aload_1
    //   42: invokevirtual 88	android/content/Intent:getFlags	()I
    //   45: ldc 89
    //   47: iand
    //   48: invokevirtual 92	android/content/Intent:setFlags	(I)Landroid/content/Intent;
    //   51: pop
    //   52: aload_2
    //   53: aload_3
    //   54: invokevirtual 93	android/app/Activity:startActivity	(Landroid/content/Intent;)V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: astore_2
    //   61: invokestatic 99	com/google/android/gms/ads/internal/k:g	()Lcom/google/android/gms/internal/ads/Zj;
    //   64: aload_2
    //   65: ldc 101
    //   67: invokevirtual 106	com/google/android/gms/internal/ads/Zj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   70: aload_1
    //   71: ldc 77
    //   73: invokevirtual 81	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   76: pop
    //   77: aload_0
    //   78: aload_1
    //   79: invokespecial 84	android/content/ContextWrapper:startActivity	(Landroid/content/Intent;)V
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: astore_1
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_1
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	li
    //   0	90	1	paramIntent	Intent
    //   12	41	2	localActivity	Activity
    //   60	5	2	localThrowable	Throwable
    //   39	15	3	localIntent	Intent
    // Exception table:
    //   from	to	target	type
    //   32	57	60	java/lang/Throwable
    //   2	13	85	finally
    //   17	29	85	finally
    //   32	57	85	finally
    //   61	82	85	finally
  }
  
  private static Context c(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext == null) {
      return paramContext;
    }
    return localContext;
  }
  
  public final void a(String paramString)
    throws PackageManager.NameNotFoundException
  {
    try
    {
      this.a = super.createPackageContext(paramString, 0);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final Context getApplicationContext()
  {
    return this;
  }
  
  public final ApplicationInfo getApplicationInfo()
  {
    try
    {
      if (this.a != null)
      {
        localApplicationInfo = this.a.getApplicationInfo();
        return localApplicationInfo;
      }
      ApplicationInfo localApplicationInfo = super.getApplicationInfo();
      return localApplicationInfo;
    }
    finally {}
  }
  
  public final String getPackageName()
  {
    try
    {
      if (this.a != null)
      {
        str = this.a.getPackageName();
        return str;
      }
      String str = super.getPackageName();
      return str;
    }
    finally {}
  }
  
  public final String getPackageResourcePath()
  {
    try
    {
      if (this.a != null)
      {
        str = this.a.getPackageResourcePath();
        return str;
      }
      String str = super.getPackageResourcePath();
      return str;
    }
    finally {}
  }
  
  public final void startActivity(Intent paramIntent)
  {
    try
    {
      b(a(paramIntent));
      return;
    }
    finally
    {
      paramIntent = finally;
      throw paramIntent;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/li.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */