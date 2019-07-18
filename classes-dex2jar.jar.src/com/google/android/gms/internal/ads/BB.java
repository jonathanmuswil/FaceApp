package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rp.a;
import rp.b;

@yh
public final class bb
  extends rp.a
{
  private final Ya a;
  private final List<rp.b> b = new ArrayList();
  private String c;
  
  public bb(Ya paramYa)
  {
    this.a = paramYa;
    try
    {
      this.c = this.a.getText();
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
      this.c = "";
    }
    try
    {
      Iterator localIterator = paramYa.va().iterator();
      while (localIterator.hasNext())
      {
        paramYa = localIterator.next();
        Object localObject;
        if ((paramYa instanceof IBinder))
        {
          localObject = (IBinder)paramYa;
          if (localObject != null)
          {
            paramYa = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if ((paramYa instanceof gb))
            {
              paramYa = (gb)paramYa;
              break label131;
            }
            paramYa = new ib((IBinder)localObject);
            break label131;
          }
        }
        paramYa = null;
        label131:
        if (paramYa != null)
        {
          localObject = this.b;
          jb localjb = new com/google/android/gms/internal/ads/jb;
          localjb.<init>(paramYa);
          ((List)localObject).add(localjb);
        }
      }
      return;
    }
    catch (RemoteException paramYa)
    {
      Tl.b("", paramYa);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */