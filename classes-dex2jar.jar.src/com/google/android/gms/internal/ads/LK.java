package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class lk
  extends Iaa<String>
{
  private final Object p = new Object();
  private b<String> q;
  
  public lk(int paramInt, String paramString, b<String> paramb, Tea paramTea)
  {
    super(paramInt, paramString, paramTea);
    this.q = paramb;
  }
  
  protected final vea<String> a(HZ paramHZ)
  {
    String str2;
    try
    {
      String str1 = new java/lang/String;
      byte[] arrayOfByte = paramHZ.b;
      Object localObject1 = paramHZ.c;
      String str3 = "ISO-8859-1";
      Object localObject2 = (String)((Map)localObject1).get("Content-Type");
      localObject1 = str3;
      if (localObject2 != null)
      {
        localObject2 = ((String)localObject2).split(";", 0);
        for (int i = 1;; i++)
        {
          localObject1 = str3;
          if (i >= localObject2.length) {
            break;
          }
          localObject1 = localObject2[i].trim().split("=", 0);
          if ((localObject1.length == 2) && (localObject1[0].equals("charset")))
          {
            localObject1 = localObject1[1];
            break;
          }
        }
      }
      str1.<init>(arrayOfByte, (String)localObject1);
      localObject1 = str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      str2 = new String(paramHZ.b);
    }
    return vea.a(str2, Vg.a(paramHZ));
  }
  
  protected void c(String paramString)
  {
    synchronized (this.p)
    {
      b localb = this.q;
      if (localb != null) {
        localb.a(paramString);
      }
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */