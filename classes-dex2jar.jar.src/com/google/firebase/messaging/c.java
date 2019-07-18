package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fq;
import gd;
import hq;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ud;

public final class c
  extends fq
{
  public static final Parcelable.Creator<c> CREATOR = new g();
  Bundle a;
  private Map<String, String> b;
  
  public c(Bundle paramBundle)
  {
    this.a = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, false);
    hq.a(paramParcel, paramInt);
  }
  
  public final Map<String, String> y()
  {
    if (this.b == null)
    {
      Bundle localBundle = this.a;
      gd localgd = new gd();
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = localBundle.get(str);
        if ((localObject instanceof String))
        {
          localObject = (String)localObject;
          if ((!str.startsWith("google.")) && (!str.startsWith("gcm.")) && (!str.equals("from")) && (!str.equals("message_type")) && (!str.equals("collapse_key"))) {
            localgd.put(str, localObject);
          }
        }
      }
      this.b = localgd;
    }
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/messaging/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */