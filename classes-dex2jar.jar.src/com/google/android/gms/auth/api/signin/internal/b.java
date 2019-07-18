package com.google.android.gms.auth.api.signin.internal;

public class b
{
  private static int a = 31;
  private int b = 1;
  
  public int a()
  {
    return this.b;
  }
  
  public b a(Object paramObject)
  {
    int i = a;
    int j = this.b;
    int k;
    if (paramObject == null) {
      k = 0;
    } else {
      k = paramObject.hashCode();
    }
    this.b = (i * j + k);
    return this;
  }
  
  public final b a(boolean paramBoolean)
  {
    this.b = (a * this.b + paramBoolean);
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */