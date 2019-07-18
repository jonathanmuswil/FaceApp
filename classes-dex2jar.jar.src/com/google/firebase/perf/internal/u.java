package com.google.firebase.perf.internal;

import java.util.Locale;
import java.util.Map.Entry;
import xv;

public abstract class u
{
  public static String a(String paramString, int paramInt)
  {
    if (paramString == null)
    {
      paramInt = v.a[(paramInt - 1)];
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          return "Metric name must not be null";
        }
      }
      else {
        return "Counter name must not be null";
      }
    }
    else
    {
      int i = paramString.length();
      int j = 0;
      if (i > 100)
      {
        paramInt = v.a[(paramInt - 1)];
        if (paramInt != 1)
        {
          if (paramInt == 2) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[] { Integer.valueOf(100) });
          }
        }
        else {
          return String.format(Locale.US, "Counter name must not exceed %d characters", new Object[] { Integer.valueOf(100) });
        }
      }
      else if (paramString.startsWith("_"))
      {
        xv[] arrayOfxv = xv.values();
        i = arrayOfxv.length;
        while (j < i)
        {
          if (arrayOfxv[j].toString().equals(paramString)) {
            return null;
          }
          j++;
        }
        paramInt = v.a[(paramInt - 1)];
        if (paramInt != 1)
        {
          if (paramInt == 2) {
            return "Metric name must not start with '_'";
          }
        }
        else {
          return "Counter name must not start with '_'";
        }
      }
    }
    return null;
  }
  
  public static String a(Map.Entry<String, String> paramEntry)
  {
    String str = (String)paramEntry.getKey();
    paramEntry = (String)paramEntry.getValue();
    if (str == null) {
      return "Attribute key must not be null";
    }
    if (paramEntry == null) {
      return "Attribute value must not be null";
    }
    if (str.length() > 40) {
      return String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[] { Integer.valueOf(40) });
    }
    if (paramEntry.length() > 100) {
      return String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[] { Integer.valueOf(100) });
    }
    if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
      return "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_";
    }
    return null;
  }
  
  public abstract boolean a();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */