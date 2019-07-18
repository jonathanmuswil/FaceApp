package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.r.a;
import fq;
import hq;

public final class b
  extends fq
{
  public static final Parcelable.Creator<b> CREATOR = new n();
  public static final b a = new b(0);
  private final int b;
  private final int c;
  private final PendingIntent d;
  private final String e;
  
  public b(int paramInt)
  {
    this(paramInt, null, null);
  }
  
  b(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramPendingIntent;
    this.e = paramString;
  }
  
  public b(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }
  
  public b(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, paramString);
  }
  
  static String p(int paramInt)
  {
    if (paramInt != 99)
    {
      if (paramInt != 1500)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            StringBuilder localStringBuilder = new StringBuilder(31);
            localStringBuilder.append("UNKNOWN_ERROR_CODE(");
            localStringBuilder.append(paramInt);
            localStringBuilder.append(")");
            return localStringBuilder.toString();
          case 21: 
            return "API_VERSION_UPDATE_REQUIRED";
          case 20: 
            return "RESTRICTED_PROFILE";
          case 19: 
            return "SERVICE_MISSING_PERMISSION";
          case 18: 
            return "SERVICE_UPDATING";
          case 17: 
            return "SIGN_IN_FAILED";
          case 16: 
            return "API_UNAVAILABLE";
          case 15: 
            return "INTERRUPTED";
          case 14: 
            return "TIMEOUT";
          }
          return "CANCELED";
        case 11: 
          return "LICENSE_CHECK_FAILED";
        case 10: 
          return "DEVELOPER_ERROR";
        case 9: 
          return "SERVICE_INVALID";
        case 8: 
          return "INTERNAL_ERROR";
        case 7: 
          return "NETWORK_ERROR";
        case 6: 
          return "RESOLUTION_REQUIRED";
        case 5: 
          return "INVALID_ACCOUNT";
        case 4: 
          return "SIGN_IN_REQUIRED";
        case 3: 
          return "SERVICE_DISABLED";
        case 2: 
          return "SERVICE_VERSION_UPDATE_REQUIRED";
        case 1: 
          return "SERVICE_MISSING";
        case 0: 
          return "SUCCESS";
        }
        return "UNKNOWN";
      }
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    }
    return "UNFINISHED";
  }
  
  public final PendingIntent A()
  {
    return this.d;
  }
  
  public final boolean B()
  {
    return (this.c != 0) && (this.d != null);
  }
  
  public final boolean C()
  {
    return this.c == 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return (this.c == ((b)paramObject).c) && (r.a(this.d, ((b)paramObject).d)) && (r.a(this.e, ((b)paramObject).e));
  }
  
  public final int hashCode()
  {
    return r.a(new Object[] { Integer.valueOf(this.c), this.d, this.e });
  }
  
  public final String toString()
  {
    r.a locala = r.a(this);
    locala.a("statusCode", p(this.c));
    locala.a("resolution", this.d);
    locala.a("message", this.e);
    return locala.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.b);
    hq.a(paramParcel, 2, y());
    hq.a(paramParcel, 3, A(), paramInt, false);
    hq.a(paramParcel, 4, z(), false);
    hq.a(paramParcel, i);
  }
  
  public final int y()
  {
    return this.c;
  }
  
  public final String z()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */