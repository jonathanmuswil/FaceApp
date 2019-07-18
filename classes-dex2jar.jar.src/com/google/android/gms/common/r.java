package com.google.android.gms.common;

import Hq;
import Iq;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.O;
import com.google.android.gms.common.internal.P;
import com.google.android.gms.common.internal.t;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class r
  extends P
{
  private int a;
  
  protected r(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (paramArrayOfByte.length == 25) {
      bool = true;
    } else {
      bool = false;
    }
    t.a(bool);
    this.a = Arrays.hashCode(paramArrayOfByte);
  }
  
  protected static byte[] e(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("ISO-8859-1");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  abstract byte[] a();
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof O))) {
      try
      {
        paramObject = (O)paramObject;
        if (((O)paramObject).m() != hashCode()) {
          return false;
        }
        paramObject = ((O)paramObject).ha();
        if (paramObject == null) {
          return false;
        }
        paramObject = (byte[])Iq.J((Hq)paramObject);
        boolean bool = Arrays.equals(a(), (byte[])paramObject);
        return bool;
      }
      catch (RemoteException paramObject)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)paramObject);
      }
    }
    return false;
  }
  
  public final Hq ha()
  {
    return Iq.a(a());
  }
  
  public int hashCode()
  {
    return this.a;
  }
  
  public final int m()
  {
    return hashCode();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */