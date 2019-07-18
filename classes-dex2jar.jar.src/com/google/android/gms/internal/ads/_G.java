package com.google.android.gms.internal.ads;

import Hq;
import Iq;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;

@yh
public final class _g
{
  private static final Object a = new Object();
  private static boolean b = false;
  private static boolean c = false;
  private BM d;
  
  private final void c(Context paramContext)
  {
    synchronized (a)
    {
      ga localga = ra.Yd;
      if (((Boolean)Kea.e().a(localga)).booleanValue())
      {
        boolean bool = c;
        if (!bool) {
          try
          {
            c = true;
            this.d = ((BM)Ul.a(paramContext, "com.google.android.gms.ads.omid.DynamiteOmid", ah.a));
          }
          catch (Wl paramContext)
          {
            Tl.d("#007 Could not call remote method.", paramContext);
          }
        }
      }
      return;
    }
  }
  
  public final Hq a(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4)
  {
    return a(paramString1, paramWebView, paramString2, paramString3, paramString4, "Google");
  }
  
  /* Error */
  public final Hq a(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: getstatic 19	com/google/android/gms/internal/ads/_g:a	Ljava/lang/Object;
    //   3: astore 7
    //   5: aload 7
    //   7: monitorenter
    //   8: getstatic 33	com/google/android/gms/internal/ads/ra:Yd	Lcom/google/android/gms/internal/ads/ga;
    //   11: astore 8
    //   13: invokestatic 39	com/google/android/gms/internal/ads/Kea:e	()Lcom/google/android/gms/internal/ads/oa;
    //   16: aload 8
    //   18: invokevirtual 44	com/google/android/gms/internal/ads/oa:a	(Lcom/google/android/gms/internal/ads/ga;)Ljava/lang/Object;
    //   21: checkcast 46	java/lang/Boolean
    //   24: invokevirtual 50	java/lang/Boolean:booleanValue	()Z
    //   27: ifeq +52 -> 79
    //   30: getstatic 21	com/google/android/gms/internal/ads/_g:b	Z
    //   33: ifne +6 -> 39
    //   36: goto +43 -> 79
    //   39: aload 7
    //   41: monitorexit
    //   42: aload_0
    //   43: getfield 66	com/google/android/gms/internal/ads/_g:d	Lcom/google/android/gms/internal/ads/BM;
    //   46: aload_1
    //   47: aload_2
    //   48: invokestatic 88	Iq:a	(Ljava/lang/Object;)LHq;
    //   51: aload_3
    //   52: aload 4
    //   54: aload 5
    //   56: aload 6
    //   58: invokeinterface 91 7 0
    //   63: astore_1
    //   64: aload_1
    //   65: areturn
    //   66: astore_1
    //   67: goto +4 -> 71
    //   70: astore_1
    //   71: ldc 68
    //   73: aload_1
    //   74: invokestatic 73	com/google/android/gms/internal/ads/Tl:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   77: aconst_null
    //   78: areturn
    //   79: aload 7
    //   81: monitorexit
    //   82: aconst_null
    //   83: areturn
    //   84: astore_1
    //   85: aload 7
    //   87: monitorexit
    //   88: aload_1
    //   89: athrow
    //   90: astore_1
    //   91: goto -6 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	_g
    //   0	94	1	paramString1	String
    //   0	94	2	paramWebView	WebView
    //   0	94	3	paramString2	String
    //   0	94	4	paramString3	String
    //   0	94	5	paramString4	String
    //   0	94	6	paramString5	String
    //   3	83	7	localObject	Object
    //   11	6	8	localga	ga
    // Exception table:
    //   from	to	target	type
    //   42	64	66	java/lang/NullPointerException
    //   42	64	70	android/os/RemoteException
    //   8	36	84	finally
    //   39	42	84	finally
    //   79	82	90	finally
    //   85	88	90	finally
  }
  
  public final String a(Context paramContext)
  {
    ga localga = ra.Yd;
    if (!((Boolean)Kea.e().a(localga)).booleanValue()) {
      return null;
    }
    try
    {
      c(paramContext);
      paramContext = String.valueOf(this.d.getVersion());
      if (paramContext.length() != 0) {
        return "a.".concat(paramContext);
      }
      paramContext = new String("a.");
      return paramContext;
    }
    catch (NullPointerException paramContext) {}catch (RemoteException paramContext) {}
    Tl.d("#007 Could not call remote method.", paramContext);
    return null;
  }
  
  public final void a(Hq paramHq)
  {
    synchronized (a)
    {
      ga localga = ra.Yd;
      if ((((Boolean)Kea.e().a(localga)).booleanValue()) && (b))
      {
        try
        {
          this.d.F(paramHq);
          return;
        }
        catch (NullPointerException paramHq) {}catch (RemoteException paramHq) {}
        Tl.d("#007 Could not call remote method.", paramHq);
        return;
      }
      return;
    }
  }
  
  public final void a(Hq paramHq, View paramView)
  {
    synchronized (a)
    {
      ga localga = ra.Yd;
      if ((((Boolean)Kea.e().a(localga)).booleanValue()) && (b))
      {
        try
        {
          this.d.a(paramHq, Iq.a(paramView));
          return;
        }
        catch (NullPointerException paramHq) {}catch (RemoteException paramHq) {}
        Tl.d("#007 Could not call remote method.", paramHq);
        return;
      }
      return;
    }
  }
  
  public final void b(Hq paramHq)
  {
    synchronized (a)
    {
      ga localga = ra.Yd;
      if ((((Boolean)Kea.e().a(localga)).booleanValue()) && (b))
      {
        try
        {
          this.d.I(paramHq);
          return;
        }
        catch (NullPointerException paramHq) {}catch (RemoteException paramHq) {}
        Tl.d("#007 Could not call remote method.", paramHq);
        return;
      }
      return;
    }
  }
  
  public final boolean b(Context paramContext)
  {
    synchronized (a)
    {
      ga localga = ra.Yd;
      if (!((Boolean)Kea.e().a(localga)).booleanValue()) {
        return false;
      }
      if (b) {
        return true;
      }
      try
      {
        c(paramContext);
        boolean bool = this.d.j(Iq.a(paramContext));
        b = bool;
        return bool;
      }
      catch (NullPointerException paramContext) {}catch (RemoteException paramContext) {}
      Tl.d("#007 Could not call remote method.", paramContext);
      return false;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */