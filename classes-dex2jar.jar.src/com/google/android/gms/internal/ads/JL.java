package com.google.android.gms.internal.ads;

final class jl
  implements Tea
{
  jl(hl paramhl, String paramString, nl paramnl) {}
  
  public final void a(xb paramxb)
  {
    String str1 = this.a;
    String str2 = paramxb.toString();
    paramxb = new StringBuilder(String.valueOf(str1).length() + 21 + String.valueOf(str2).length());
    paramxb.append("Failed to load URL: ");
    paramxb.append(str1);
    paramxb.append("\n");
    paramxb.append(str2);
    Tl.d(paramxb.toString());
    this.b.a(null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */