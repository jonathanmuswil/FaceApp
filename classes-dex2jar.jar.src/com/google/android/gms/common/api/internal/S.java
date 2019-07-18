package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import nP;
import oP;

public final class s
{
  private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
  private final Map<oP<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());
  
  private final void a(boolean paramBoolean, Status paramStatus)
  {
    synchronized (this.a)
    {
      Object localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>(this.a);
      synchronized (this.b)
      {
        ??? = new java/util/HashMap;
        ((HashMap)???).<init>(this.b);
        ??? = ((Map)localObject2).entrySet().iterator();
        while (((Iterator)???).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)???).next();
          if ((paramBoolean) || (((Boolean)((Map.Entry)localObject2).getValue()).booleanValue())) {
            ((BasePendingResult)((Map.Entry)localObject2).getKey()).b(paramStatus);
          }
        }
        ??? = ((Map)???).entrySet().iterator();
        while (((Iterator)???).hasNext())
        {
          ??? = (Map.Entry)((Iterator)???).next();
          if ((paramBoolean) || (((Boolean)((Map.Entry)???).getValue()).booleanValue())) {
            ((oP)((Map.Entry)???).getKey()).b(new b(paramStatus));
          }
        }
        return;
      }
    }
  }
  
  final void a(BasePendingResult<? extends l> paramBasePendingResult, boolean paramBoolean)
  {
    this.a.put(paramBasePendingResult, Boolean.valueOf(paramBoolean));
    paramBasePendingResult.a(new t(this, paramBasePendingResult));
  }
  
  final <TResult> void a(oP<TResult> paramoP, boolean paramBoolean)
  {
    this.b.put(paramoP, Boolean.valueOf(paramBoolean));
    paramoP.a().a(new u(this, paramoP));
  }
  
  final boolean a()
  {
    return (!this.a.isEmpty()) || (!this.b.isEmpty());
  }
  
  public final void b()
  {
    a(false, e.a);
  }
  
  public final void c()
  {
    a(true, ya.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */