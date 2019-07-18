package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.k;
import fq;
import hq;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@yh
public final class dda
  extends fq
{
  public static final Parcelable.Creator<dda> CREATOR = new eda();
  public final String a;
  private final long b;
  private final String c;
  private final String d;
  private final String e;
  private final Bundle f;
  public final boolean g;
  public long h;
  
  dda(String paramString1, long paramLong1, String paramString2, String paramString3, String paramString4, Bundle paramBundle, boolean paramBoolean, long paramLong2)
  {
    this.a = paramString1;
    this.b = paramLong1;
    paramString1 = "";
    if (paramString2 == null) {
      paramString2 = "";
    }
    this.c = paramString2;
    if (paramString3 == null) {
      paramString3 = "";
    }
    this.d = paramString3;
    if (paramString4 != null) {
      paramString1 = paramString4;
    }
    this.e = paramString1;
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    this.f = paramBundle;
    this.g = paramBoolean;
    this.h = paramLong2;
  }
  
  public static dda a(Uri paramUri)
  {
    try
    {
      if (!"gcache".equals(paramUri.getScheme())) {
        return null;
      }
      Object localObject = paramUri.getPathSegments();
      if (((List)localObject).size() != 2)
      {
        int i = ((List)localObject).size();
        paramUri = new java/lang/StringBuilder;
        paramUri.<init>(62);
        paramUri.append("Expected 2 path parts for namespace and id, found :");
        paramUri.append(i);
        Tl.d(paramUri.toString());
        return null;
      }
      String str1 = (String)((List)localObject).get(0);
      localObject = (String)((List)localObject).get(1);
      String str2 = paramUri.getHost();
      String str3 = paramUri.getQueryParameter("url");
      boolean bool = "1".equals(paramUri.getQueryParameter("read_only"));
      String str4 = paramUri.getQueryParameter("expiration");
      long l;
      if (str4 == null) {
        l = 0L;
      } else {
        l = Long.parseLong(str4);
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      k.e();
      Iterator localIterator = paramUri.getQueryParameterNames().iterator();
      while (localIterator.hasNext())
      {
        str4 = (String)localIterator.next();
        if (str4.startsWith("tag.")) {
          localBundle.putString(str4.substring(4), paramUri.getQueryParameter(str4));
        }
      }
      paramUri = new dda(str3, l, str2, str1, (String)localObject, localBundle, bool, 0L);
      return paramUri;
    }
    catch (NumberFormatException paramUri) {}catch (NullPointerException paramUri) {}
    Tl.c("Unable to parse Uri into cache offering.", paramUri);
    return null;
  }
  
  public static dda b(String paramString)
  {
    return a(Uri.parse(paramString));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, 3, this.b);
    hq.a(paramParcel, 4, this.c, false);
    hq.a(paramParcel, 5, this.d, false);
    hq.a(paramParcel, 6, this.e, false);
    hq.a(paramParcel, 7, this.f, false);
    hq.a(paramParcel, 8, this.g);
    hq.a(paramParcel, 9, this.h);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */