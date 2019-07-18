package com.facebook.accountkit.internal;

import android.util.Log;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

final class p
  extends ThreadPoolExecutor.DiscardPolicy
{
  public void rejectedExecution(Runnable paramRunnable, ThreadPoolExecutor paramThreadPoolExecutor)
  {
    super.rejectedExecution(paramRunnable, paramThreadPoolExecutor);
    Log.e(u.a(), "App Event Dropped");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */