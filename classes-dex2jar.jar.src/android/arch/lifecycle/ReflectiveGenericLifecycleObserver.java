package android.arch.lifecycle;

class ReflectiveGenericLifecycleObserver
  implements GenericLifecycleObserver
{
  private final Object a;
  private final a.a b;
  
  ReflectiveGenericLifecycleObserver(Object paramObject)
  {
    this.a = paramObject;
    this.b = a.a.a(this.a.getClass());
  }
  
  public void a(f paramf, d.a parama)
  {
    this.b.a(paramf, parama, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/ReflectiveGenericLifecycleObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */