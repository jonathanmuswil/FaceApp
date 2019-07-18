package com.google.android.gms.vision;

import android.util.SparseArray;

public abstract class a<T>
{
  private final Object a = new Object();
  private b<T> b;
  
  public abstract SparseArray<T> a(b paramb);
  
  public void a(b<T> paramb)
  {
    synchronized (this.a)
    {
      if (this.b != null) {
        this.b.a();
      }
      this.b = paramb;
      return;
    }
  }
  
  public abstract boolean a();
  
  public void b()
  {
    synchronized (this.a)
    {
      if (this.b != null)
      {
        this.b.a();
        this.b = null;
      }
      return;
    }
  }
  
  public void b(b arg1)
  {
    Object localObject1 = new b.b(???.c());
    ((b.b)localObject1).f();
    localObject1 = new a(a(???), (b.b)localObject1, a());
    synchronized (this.a)
    {
      if (this.b != null)
      {
        this.b.a((a)localObject1);
        return;
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Detector processor must first be set with setProcessor in order to receive detection results.");
      throw ((Throwable)localObject1);
    }
  }
  
  public static class a<T>
  {
    private final SparseArray<T> a;
    private final b.b b;
    private final boolean c;
    
    public a(SparseArray<T> paramSparseArray, b.b paramb, boolean paramBoolean)
    {
      this.a = paramSparseArray;
      this.b = paramb;
      this.c = paramBoolean;
    }
    
    public SparseArray<T> a()
    {
      return this.a;
    }
  }
  
  public static abstract interface b<T>
  {
    public abstract void a();
    
    public abstract void a(a.a<T> parama);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/vision/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */