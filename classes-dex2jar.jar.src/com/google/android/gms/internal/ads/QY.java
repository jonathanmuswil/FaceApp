package com.google.android.gms.internal.ads;

import Iq;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import java.util.List;

@yh
public final class qy
  extends db
{
  private final xy a;
  
  public qy(xy paramxy)
  {
    this.a = paramxy;
  }
  
  private final float Gb()
  {
    try
    {
      float f = this.a.m().ja();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("Remote exception getting video controller aspect ratio.", localRemoteException);
    }
    return 0.0F;
  }
  
  private final float Hb()
  {
    Object localObject = (Ua)this.a.h().get(0);
    if ((((Ua)localObject).getWidth() != -1) && (((Ua)localObject).getHeight() != -1)) {
      return ((Ua)localObject).getWidth() / ((Ua)localObject).getHeight();
    }
    try
    {
      localObject = (Drawable)Iq.J(((Ua)localObject)._a());
      if ((localObject != null) && (((Drawable)localObject).getIntrinsicWidth() != -1) && (((Drawable)localObject).getIntrinsicHeight() != -1))
      {
        float f = ((Drawable)localObject).getIntrinsicWidth();
        int i = ((Drawable)localObject).getIntrinsicHeight();
        return f / i;
      }
      return 0.0F;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("RemoteException getting Drawable for aspect ratio calculation.", localRemoteException);
    }
    return 0.0F;
  }
  
  public final float ja()
  {
    ga localga = ra.Ze;
    if (!((Boolean)Kea.e().a(localga)).booleanValue()) {
      return 0.0F;
    }
    if (this.a.A() != 0.0F) {
      return this.a.A();
    }
    if (this.a.m() != null) {
      return Gb();
    }
    return Hb();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */