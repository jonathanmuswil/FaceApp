package com.google.android.gms.common.api;

public class d
{
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 9: 
    case 11: 
    case 12: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append("unknown status code: ");
      localStringBuilder.append(paramInt);
      return localStringBuilder.toString();
    case 18: 
      return "DEAD_CLIENT";
    case 17: 
      return "API_NOT_CONNECTED";
    case 16: 
      return "CANCELED";
    case 15: 
      return "TIMEOUT";
    case 14: 
      return "INTERRUPTED";
    case 13: 
      return "ERROR";
    case 10: 
      return "DEVELOPER_ERROR";
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
    case 0: 
      return "SUCCESS";
    }
    return "SUCCESS_CACHE";
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */