package com.facebook.internal;

import android.content.Intent;
import com.facebook.FacebookSdk;
import com.facebook.j;
import java.util.HashMap;
import java.util.Map;

public final class l
  implements j
{
  private static Map<Integer, a> a = new HashMap();
  private Map<Integer, a> b = new HashMap();
  
  private static a a(Integer paramInteger)
  {
    try
    {
      paramInteger = (a)a.get(paramInteger);
      return paramInteger;
    }
    finally
    {
      paramInteger = finally;
      throw paramInteger;
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    a locala = a(Integer.valueOf(paramInt1));
    if (locala != null) {
      return locala.a(paramInt2, paramIntent);
    }
    return false;
  }
  
  public static void b(int paramInt, a parama)
  {
    try
    {
      T.a(parama, "callback");
      boolean bool = a.containsKey(Integer.valueOf(paramInt));
      if (bool) {
        return;
      }
      a.put(Integer.valueOf(paramInt), parama);
      return;
    }
    finally {}
  }
  
  public void a(int paramInt, a parama)
  {
    T.a(parama, "callback");
    this.b.put(Integer.valueOf(paramInt), parama);
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    a locala = (a)this.b.get(Integer.valueOf(paramInt1));
    if (locala != null) {
      return locala.a(paramInt2, paramIntent);
    }
    return a(paramInt1, paramInt2, paramIntent);
  }
  
  public static abstract interface a
  {
    public abstract boolean a(int paramInt, Intent paramIntent);
  }
  
  public static enum b
  {
    private final int k;
    
    private b(int paramInt)
    {
      this.k = paramInt;
    }
    
    public int a()
    {
      return FacebookSdk.g() + this.k;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */