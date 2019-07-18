package com.google.android.gms.internal.ads;

public final class vba
{
  private boolean a;
  
  public final void a()
    throws InterruptedException
  {
    try
    {
      while (!this.a) {
        wait();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.a;
      if (bool) {
        return false;
      }
      this.a = true;
      notifyAll();
      return true;
    }
    finally {}
  }
  
  public final boolean c()
  {
    try
    {
      boolean bool = this.a;
      this.a = false;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */