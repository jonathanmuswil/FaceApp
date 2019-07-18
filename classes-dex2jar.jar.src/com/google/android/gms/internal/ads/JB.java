package com.google.android.gms.internal.ads;

import Iq;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import rp.b;

@yh
public final class jb
  extends rp.b
{
  private final gb a;
  private final Drawable b;
  private final Uri c;
  private final double d;
  private final int e;
  private final int f;
  
  public jb(gb paramgb)
  {
    this.a = paramgb;
    Object localObject = null;
    try
    {
      paramgb = this.a._a();
      if (paramgb != null) {
        paramgb = (Drawable)Iq.J(paramgb);
      }
    }
    catch (RemoteException paramgb)
    {
      Tl.b("", paramgb);
      paramgb = null;
    }
    this.b = paramgb;
    try
    {
      paramgb = this.a.getUri();
    }
    catch (RemoteException paramgb)
    {
      Tl.b("", paramgb);
      paramgb = (gb)localObject;
    }
    this.c = paramgb;
    double d1 = 1.0D;
    try
    {
      double d2 = this.a.Ua();
      d1 = d2;
    }
    catch (RemoteException paramgb)
    {
      Tl.b("", paramgb);
    }
    this.d = d1;
    int i = -1;
    int j;
    try
    {
      j = this.a.getWidth();
    }
    catch (RemoteException paramgb)
    {
      Tl.b("", paramgb);
      j = -1;
    }
    this.e = j;
    try
    {
      j = this.a.getHeight();
    }
    catch (RemoteException paramgb)
    {
      Tl.b("", paramgb);
      j = i;
    }
    this.f = j;
  }
  
  public final Drawable a()
  {
    return this.b;
  }
  
  public final int b()
  {
    return this.f;
  }
  
  public final double c()
  {
    return this.d;
  }
  
  public final Uri d()
  {
    return this.c;
  }
  
  public final int e()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */