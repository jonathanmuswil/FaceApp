package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a.h;

public class w<T extends IInterface>
  extends h<T>
{
  private final a.h<T> G;
  
  public a.h<T> B()
  {
    return this.G;
  }
  
  protected T a(IBinder paramIBinder)
  {
    return this.G.a(paramIBinder);
  }
  
  protected void a(int paramInt, T paramT)
  {
    this.G.a(paramInt, paramT);
  }
  
  public int g()
  {
    return super.g();
  }
  
  protected String w()
  {
    return this.G.l();
  }
  
  protected String x()
  {
    return this.G.m();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */