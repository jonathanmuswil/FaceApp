package com.facebook.appevents;

import Yn;
import Yn.a;
import android.content.Context;
import android.os.Bundle;
import com.facebook.E;
import com.facebook.internal.S;
import com.facebook.internal.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class w
{
  private List<f> a = new ArrayList();
  private List<f> b = new ArrayList();
  private int c;
  private b d;
  private String e;
  private final int f = 1000;
  
  public w(b paramb, String paramString)
  {
    this.d = paramb;
    this.e = paramString;
  }
  
  private void a(E paramE, Context paramContext, int paramInt, JSONArray paramJSONArray, boolean paramBoolean)
  {
    try
    {
      localObject = Yn.a(Yn.a.b, this.d, this.e, paramBoolean, paramContext);
      paramContext = (Context)localObject;
      if (this.c > 0)
      {
        ((JSONObject)localObject).put("num_skipped_events", paramInt);
        paramContext = (Context)localObject;
      }
    }
    catch (JSONException paramContext)
    {
      paramContext = new JSONObject();
    }
    paramE.a(paramContext);
    Object localObject = paramE.i();
    paramContext = (Context)localObject;
    if (localObject == null) {
      paramContext = new Bundle();
    }
    paramJSONArray = paramJSONArray.toString();
    if (paramJSONArray != null)
    {
      paramContext.putString("custom_events", paramJSONArray);
      paramE.c(paramJSONArray);
    }
    paramE.a(paramContext);
  }
  
  public int a()
  {
    try
    {
      int i = this.a.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int a(E paramE, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      int i = this.c;
      this.b.addAll(this.a);
      this.a.clear();
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        if (localf.d())
        {
          if ((paramBoolean1) || (!localf.a())) {
            localJSONArray.put(localf.b());
          }
        }
        else {
          S.a("Event with invalid checksum: %s", localf.toString());
        }
      }
      if (localJSONArray.length() == 0) {
        return 0;
      }
      a(paramE, paramContext, i, localJSONArray, paramBoolean2);
      return localJSONArray.length();
    }
    finally {}
  }
  
  public void a(f paramf)
  {
    try
    {
      if (this.a.size() + this.b.size() >= 1000) {
        this.c += 1;
      } else {
        this.a.add(paramf);
      }
      return;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      this.a.addAll(this.b);
      this.b.clear();
      this.c = 0;
      return;
    }
    finally {}
  }
  
  public List<f> b()
  {
    try
    {
      List localList = this.a;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.a = localArrayList;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */