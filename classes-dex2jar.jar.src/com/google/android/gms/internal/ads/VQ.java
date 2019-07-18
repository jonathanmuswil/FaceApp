package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.k;
import java.util.concurrent.Executor;

@yh
public class vq
  extends rq
  implements yq
{
  private final tq a;
  private boolean b;
  private boolean c;
  
  public vq(Context paramContext, tq paramtq)
  {
    super(paramContext);
    k.g().f();
    this.a = paramtq;
    super.setWebViewClient(paramtq);
  }
  
  private final void M()
  {
    try
    {
      if (!this.c)
      {
        this.c = true;
        k.g().g();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(uq paramuq)
  {
    try
    {
      mk.f("Blank page loaded, 1...");
      y();
      return;
    }
    finally
    {
      paramuq = finally;
      throw paramuq;
    }
  }
  
  /* Error */
  public void destroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	com/google/android/gms/internal/ads/vq:b	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 65	com/google/android/gms/internal/ads/vq:b	Z
    //   19: aload_0
    //   20: getfield 31	com/google/android/gms/internal/ads/vq:a	Lcom/google/android/gms/internal/ads/tq;
    //   23: aload_0
    //   24: invokevirtual 70	com/google/android/gms/internal/ads/tq:a	(Lcom/google/android/gms/internal/ads/yq;)V
    //   27: aload_0
    //   28: iconst_0
    //   29: invokevirtual 73	com/google/android/gms/internal/ads/vq:g	(Z)V
    //   32: ldc 75
    //   34: invokestatic 51	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   37: ldc 77
    //   39: invokestatic 51	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: ldc 79
    //   45: invokespecial 82	com/google/android/gms/internal/ads/rq:loadUrl	(Ljava/lang/String;)V
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: astore_2
    //   52: invokestatic 23	com/google/android/gms/ads/internal/k:g	()Lcom/google/android/gms/internal/ads/Zj;
    //   55: aload_2
    //   56: ldc 84
    //   58: invokevirtual 87	com/google/android/gms/internal/ads/Zj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   61: ldc 89
    //   63: aload_2
    //   64: invokestatic 95	com/google/android/gms/internal/ads/Tl:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: astore_2
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	vq
    //   6	2	1	bool	boolean
    //   51	13	2	localUnsatisfiedLinkError	UnsatisfiedLinkError
    //   70	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   42	48	51	java/lang/UnsatisfiedLinkError
    //   2	7	70	finally
    //   14	42	70	finally
    //   42	48	70	finally
    //   52	67	70	finally
  }
  
  @TargetApi(19)
  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    try
    {
      if (isDestroyed())
      {
        Tl.d("#004 The webview is destroyed. Ignoring action.");
        if (paramValueCallback != null) {
          paramValueCallback.onReceiveValue(null);
        }
        return;
      }
      super.evaluateJavascript(paramString, paramValueCallback);
      return;
    }
    finally {}
  }
  
  /* Error */
  protected void finalize()
    throws Throwable
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 104	com/google/android/gms/internal/ads/vq:isDestroyed	()Z
    //   6: ifne +8 -> 14
    //   9: aload_0
    //   10: iconst_1
    //   11: invokevirtual 73	com/google/android/gms/internal/ads/vq:g	(Z)V
    //   14: aload_0
    //   15: invokespecial 124	com/google/android/gms/internal/ads/vq:M	()V
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_0
    //   21: invokespecial 128	java/lang/Object:finalize	()V
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    //   30: astore_1
    //   31: aload_0
    //   32: invokespecial 128	java/lang/Object:finalize	()V
    //   35: aload_1
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	vq
    //   25	4	1	localObject1	Object
    //   30	6	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	25	finally
    //   14	20	25	finally
    //   26	28	25	finally
    //   0	2	30	finally
    //   28	30	30	finally
  }
  
  protected void g(boolean paramBoolean) {}
  
  public final boolean isDestroyed()
  {
    try
    {
      boolean bool = this.b;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      if (!isDestroyed())
      {
        super.loadData(paramString1, paramString2, paramString3);
        return;
      }
      Tl.d("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      if (!isDestroyed())
      {
        super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
        return;
      }
      Tl.d("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  public void loadUrl(String paramString)
  {
    try
    {
      if (!isDestroyed())
      {
        super.loadUrl(paramString);
        return;
      }
      Tl.d("#004 The webview is destroyed. Ignoring action.");
      return;
    }
    finally {}
  }
  
  @TargetApi(21)
  protected void onDraw(Canvas paramCanvas)
  {
    if (isDestroyed()) {
      return;
    }
    super.onDraw(paramCanvas);
  }
  
  public void onPause()
  {
    if (isDestroyed()) {
      return;
    }
    super.onPause();
  }
  
  public void onResume()
  {
    if (isDestroyed()) {
      return;
    }
    super.onResume();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return (!isDestroyed()) && (super.onTouchEvent(paramMotionEvent));
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient) {}
  
  public void stopLoading()
  {
    if (isDestroyed()) {
      return;
    }
    super.stopLoading();
  }
  
  protected void y()
  {
    try
    {
      mk.f("Destroying WebView!");
      M();
      Executor localExecutor = Cm.a;
      wq localwq = new com/google/android/gms/internal/ads/wq;
      localwq.<init>(this);
      localExecutor.execute(localwq);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */