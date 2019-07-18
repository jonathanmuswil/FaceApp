package com.google.firebase.components;

import java.util.Set;
import oQ;

abstract class a
  implements f
{
  public <T> T a(Class<T> paramClass)
  {
    paramClass = b(paramClass);
    if (paramClass == null) {
      return null;
    }
    return (T)paramClass.get();
  }
  
  public <T> Set<T> d(Class<T> paramClass)
  {
    return (Set)c(paramClass).get();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */