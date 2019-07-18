package com.google.firebase.components;

import oQ;

class v<T>
  implements oQ<T>
{
  private static final Object a = new Object();
  private volatile Object b = a;
  private volatile oQ<T> c;
  
  v(oQ<T> paramoQ)
  {
    this.c = paramoQ;
  }
  
  public T get()
  {
    Object localObject1 = this.b;
    Object localObject2 = localObject1;
    if (localObject1 == a) {
      try
      {
        localObject1 = this.b;
        localObject2 = localObject1;
        if (localObject1 == a)
        {
          localObject2 = this.c.get();
          this.b = localObject2;
          this.c = null;
        }
      }
      finally {}
    }
    return ?;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/components/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */