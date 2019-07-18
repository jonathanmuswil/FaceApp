package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

final class i
  implements Iterator<String>
{
  private Iterator<String> a = h.a(this.b).keySet().iterator();
  
  i(h paramh) {}
  
  public final boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Remove not supported");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */