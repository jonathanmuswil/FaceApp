package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

@yh
public final class dg
{
  public static int a(AdRequest.ErrorCode paramErrorCode)
  {
    int i = eg.b[paramErrorCode.ordinal()];
    if (i != 2)
    {
      if (i != 3)
      {
        if (i != 4) {
          return 0;
        }
        return 3;
      }
      return 2;
    }
    return 1;
  }
  
  public static MediationAdRequest a(sea paramsea, boolean paramBoolean)
  {
    Object localObject = paramsea.e;
    HashSet localHashSet;
    if (localObject != null) {
      localHashSet = new HashSet((Collection)localObject);
    } else {
      localHashSet = null;
    }
    Date localDate = new Date(paramsea.b);
    int i = paramsea.d;
    if (i != 1) {
      if (i != 2) {
        localObject = AdRequest.Gender.UNKNOWN;
      }
    }
    for (;;)
    {
      break;
      localObject = AdRequest.Gender.FEMALE;
      continue;
      localObject = AdRequest.Gender.MALE;
    }
    return new MediationAdRequest(localDate, (AdRequest.Gender)localObject, localHashSet, paramBoolean, paramsea.k);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */