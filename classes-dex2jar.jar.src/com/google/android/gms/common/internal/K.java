package com.google.android.gms.common.internal;

public final class k
{
  private final String a;
  private final String b;
  
  public k(String paramString)
  {
    this(paramString, null);
  }
  
  public k(String paramString1, String paramString2)
  {
    t.a(paramString1, "log tag cannot be null");
    boolean bool;
    if (paramString1.length() <= 23) {
      bool = true;
    } else {
      bool = false;
    }
    t.a(bool, "tag \"%s\" is longer than the %d character maximum", new Object[] { paramString1, Integer.valueOf(23) });
    this.a = paramString1;
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      this.b = paramString2;
      return;
    }
    this.b = null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */