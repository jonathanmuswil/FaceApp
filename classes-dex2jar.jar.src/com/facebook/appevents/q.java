package com.facebook.appevents;

import com.facebook.internal.C;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class q
  implements Runnable
{
  public void run()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = n.e().iterator();
    while (localIterator.hasNext()) {
      localHashSet.add(((b)localIterator.next()).b());
    }
    localIterator = localHashSet.iterator();
    while (localIterator.hasNext()) {
      C.a((String)localIterator.next(), true);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */