package com.google.android.gms.common.api;

public class b
  extends Exception
{
  protected final Status a;
  
  public b(Status paramStatus)
  {
    super(localStringBuilder.toString());
    this.a = paramStatus;
  }
  
  public int a()
  {
    return this.a.y();
  }
  
  @Deprecated
  public String b()
  {
    return this.a.z();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */