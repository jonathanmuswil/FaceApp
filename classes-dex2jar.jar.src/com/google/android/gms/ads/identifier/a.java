package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class a
  extends Thread
{
  a(AdvertisingIdClient paramAdvertisingIdClient, Map paramMap) {}
  
  public final void run()
  {
    new c();
    Object localObject1 = this.a;
    localObject3 = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
    Object localObject4 = ((Map)localObject1).keySet().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      str1 = (String)((Iterator)localObject4).next();
      ((Uri.Builder)localObject3).appendQueryParameter(str1, (String)((Map)localObject1).get(str1));
    }
    str2 = ((Uri.Builder)localObject3).build().toString();
    try
    {
      try
      {
        localObject4 = new java/net/URL;
        ((URL)localObject4).<init>(str2);
        localObject4 = (HttpURLConnection)((URL)localObject4).openConnection();
        try
        {
          int i = ((HttpURLConnection)localObject4).getResponseCode();
          if ((i < 200) || (i >= 300))
          {
            int j = String.valueOf(str2).length();
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>(j + 65);
            ((StringBuilder)localObject1).append("Received non-success response code ");
            ((StringBuilder)localObject1).append(i);
            ((StringBuilder)localObject1).append(" from pinging URL: ");
            ((StringBuilder)localObject1).append(str2);
            Log.w("HttpUrlPinger", ((StringBuilder)localObject1).toString());
          }
          return;
        }
        finally
        {
          ((HttpURLConnection)localObject4).disconnect();
        }
        str1 = localIOException.getMessage();
      }
      catch (RuntimeException localRuntimeException) {}catch (IOException localIOException) {}
      localStringBuilder = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str1).length());
      localObject3 = "Error while pinging URL: ";
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      for (;;)
      {
        str1 = localIndexOutOfBoundsException.getMessage();
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str2).length() + 32 + String.valueOf(str1).length());
        localObject3 = "Error while parsing ping URL: ";
      }
    }
    localStringBuilder.append((String)localObject3);
    localStringBuilder.append(str2);
    localStringBuilder.append(". ");
    localStringBuilder.append(str1);
    Log.w("HttpUrlPinger", localStringBuilder.toString(), localIOException);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/identifier/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */