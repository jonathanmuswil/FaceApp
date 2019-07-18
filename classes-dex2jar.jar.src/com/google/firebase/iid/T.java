package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import gd;
import java.util.Map;
import java.util.concurrent.Executor;
import nP;

final class t
{
  private final Executor a;
  private final Map<Pair<String, String>, nP<a>> b = new gd();
  
  t(Executor paramExecutor)
  {
    this.a = paramExecutor;
  }
  
  final nP<a> a(String paramString1, String paramString2, v paramv)
  {
    try
    {
      Pair localPair = new android/util/Pair;
      localPair.<init>(paramString1, paramString2);
      paramString1 = (nP)this.b.get(localPair);
      int i;
      if (paramString1 != null)
      {
        if (Log.isLoggable("FirebaseInstanceId", 3))
        {
          paramv = String.valueOf(localPair);
          i = String.valueOf(paramv).length();
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>(i + 29);
          paramString2.append("Joining ongoing request for: ");
          paramString2.append(paramv);
          Log.d("FirebaseInstanceId", paramString2.toString());
        }
        return paramString1;
      }
      if (Log.isLoggable("FirebaseInstanceId", 3))
      {
        paramString1 = String.valueOf(localPair);
        i = String.valueOf(paramString1).length();
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>(i + 24);
        paramString2.append("Making new request for: ");
        paramString2.append(paramString1);
        Log.d("FirebaseInstanceId", paramString2.toString());
      }
      paramString1 = paramv.a();
      paramv = this.a;
      paramString2 = new com/google/firebase/iid/u;
      paramString2.<init>(this, localPair);
      paramString1 = paramString1.b(paramv, paramString2);
      this.b.put(localPair, paramString1);
      return paramString1;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */