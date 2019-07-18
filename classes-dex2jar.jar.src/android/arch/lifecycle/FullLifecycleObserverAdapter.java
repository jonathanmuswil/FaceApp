package android.arch.lifecycle;

class FullLifecycleObserverAdapter
  implements GenericLifecycleObserver
{
  private final FullLifecycleObserver a;
  
  FullLifecycleObserverAdapter(FullLifecycleObserver paramFullLifecycleObserver)
  {
    this.a = paramFullLifecycleObserver;
  }
  
  public void a(f paramf, d.a parama)
  {
    switch (b.a[parama.ordinal()])
    {
    default: 
      break;
    case 7: 
      throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    case 6: 
      this.a.c(paramf);
      break;
    case 5: 
      this.a.f(paramf);
      break;
    case 4: 
      this.a.b(paramf);
      break;
    case 3: 
      this.a.e(paramf);
      break;
    case 2: 
      this.a.a(paramf);
      break;
    case 1: 
      this.a.d(paramf);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/FullLifecycleObserverAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */