package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class j
{
  private final Set<i<?>> a = Collections.newSetFromMap(new WeakHashMap());
  
  public final void a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).a();
    }
    this.a.clear();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */