package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.Ga;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.t;
import gd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ud;

public class c
  extends Exception
{
  private final gd<Ga<?>, b> a;
  
  public c(gd<Ga<?>, b> paramgd)
  {
    this.a = paramgd;
  }
  
  public b a(e<? extends a.d> parame)
  {
    parame = parame.g();
    boolean bool;
    if (this.a.get(parame) != null) {
      bool = true;
    } else {
      bool = false;
    }
    t.a(bool, "The given API was not part of the availability request.");
    return (b)this.a.get(parame);
  }
  
  public final gd<Ga<?>, b> a()
  {
    return this.a;
  }
  
  public String getMessage()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.a.keySet().iterator();
    int i = 1;
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (Ga)((Iterator)localObject1).next();
      Object localObject3 = (b)this.a.get(localObject2);
      if (((b)localObject3).C()) {
        i = 0;
      }
      localObject2 = ((Ga)localObject2).a();
      localObject3 = String.valueOf(localObject3);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject2).length() + 2 + String.valueOf(localObject3).length());
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(": ");
      localStringBuilder.append((String)localObject3);
      localArrayList.add(localStringBuilder.toString());
    }
    localObject1 = new StringBuilder();
    if (i != 0) {
      ((StringBuilder)localObject1).append("None of the queried APIs are available. ");
    } else {
      ((StringBuilder)localObject1).append("Some of the queried APIs are unavailable. ");
    }
    ((StringBuilder)localObject1).append(TextUtils.join("; ", localArrayList));
    return ((StringBuilder)localObject1).toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */