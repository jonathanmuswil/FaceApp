package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.d;
import oP;

public abstract class o<A extends a.b, ResultT>
{
  private final d[] a = null;
  private final boolean b = false;
  
  protected abstract void a(A paramA, oP<ResultT> paramoP)
    throws RemoteException;
  
  public boolean a()
  {
    return this.b;
  }
  
  public final d[] b()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */