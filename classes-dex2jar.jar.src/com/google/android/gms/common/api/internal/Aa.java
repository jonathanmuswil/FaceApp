package com.google.android.gms.common.api.internal;

import Cq;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class aa
{
  private static final ExecutorService a = Executors.newFixedThreadPool(2, new Cq("GAC_Executor"));
  
  public static ExecutorService a()
  {
    return a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */