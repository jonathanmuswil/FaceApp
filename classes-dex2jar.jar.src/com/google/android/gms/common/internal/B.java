package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;

public class b
{
  public static com.google.android.gms.common.api.b a(Status paramStatus)
  {
    if (paramStatus.A()) {
      return new j(paramStatus);
    }
    return new com.google.android.gms.common.api.b(paramStatus);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */