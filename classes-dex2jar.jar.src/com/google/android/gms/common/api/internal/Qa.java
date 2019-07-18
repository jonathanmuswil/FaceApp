package com.google.android.gms.common.api.internal;

import Cq;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class qa
{
  private static final ExecutorService a = new ThreadPoolExecutor(0, 4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Cq("GAC_Transform"));
  
  public static ExecutorService a()
  {
    return a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */