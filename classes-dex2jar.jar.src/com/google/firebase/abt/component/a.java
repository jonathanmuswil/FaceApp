package com.google.firebase.abt.component;

import android.content.Context;
import dQ;
import fQ;
import java.util.HashMap;
import java.util.Map;

public class a
{
  private final Map<String, dQ> a = new HashMap();
  private final Context b;
  private final fQ c;
  
  protected a(Context paramContext, fQ paramfQ)
  {
    this.b = paramContext;
    this.c = paramfQ;
  }
  
  public dQ a(String paramString)
  {
    try
    {
      if (!this.a.containsKey(paramString))
      {
        Map localMap = this.a;
        dQ localdQ = new dQ;
        localdQ.<init>(this.b, this.c, paramString);
        localMap.put(paramString, localdQ);
      }
      paramString = (dQ)this.a.get(paramString);
      return paramString;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/abt/component/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */