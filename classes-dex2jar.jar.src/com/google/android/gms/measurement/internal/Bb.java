package com.google.android.gms.measurement.internal;

import android.os.Build.VERSION;
import javax.net.ssl.SSLSocketFactory;

public final class bb
  extends xa
{
  private final SSLSocketFactory c;
  
  bb(aa paramaa)
  {
    super(paramaa);
    if (Build.VERSION.SDK_INT < 19) {
      paramaa = new ic();
    } else {
      paramaa = null;
    }
    this.c = paramaa;
  }
  
  protected final boolean q()
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */