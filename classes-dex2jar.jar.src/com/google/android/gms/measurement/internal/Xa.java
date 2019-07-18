package com.google.android.gms.measurement.internal;

abstract class xa
  extends wa
{
  private boolean b;
  
  xa(aa paramaa)
  {
    super(paramaa);
    this.a.a(this);
  }
  
  final boolean l()
  {
    return this.b;
  }
  
  protected final void m()
  {
    if (l()) {
      return;
    }
    throw new IllegalStateException("Not initialized");
  }
  
  public final void o()
  {
    if (!this.b)
    {
      if (!q())
      {
        this.a.u();
        this.b = true;
      }
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public final void p()
  {
    if (!this.b)
    {
      r();
      this.a.u();
      this.b = true;
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  protected abstract boolean q();
  
  protected void r() {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */