package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.lang.reflect.Constructor;

@yh
public class zg
{
  public static sg a(String paramString)
    throws RemoteException
  {
    try
    {
      paramString = new Ag((RtbAdapter)Class.forName(paramString, false, zg.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      return paramString;
    }
    catch (Throwable paramString)
    {
      throw new RemoteException();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */