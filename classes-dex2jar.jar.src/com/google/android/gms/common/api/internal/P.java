package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import oP;

public class p
{
  public static <TResult> void a(Status paramStatus, TResult paramTResult, oP<TResult> paramoP)
  {
    if (paramStatus.B())
    {
      paramoP.a(paramTResult);
      return;
    }
    paramoP.a(new b(paramStatus));
  }
  
  public static void a(Status paramStatus, oP<Void> paramoP)
  {
    a(paramStatus, null, paramoP);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */