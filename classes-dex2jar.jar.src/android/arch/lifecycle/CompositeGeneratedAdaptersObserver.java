package android.arch.lifecycle;

public class CompositeGeneratedAdaptersObserver
  implements GenericLifecycleObserver
{
  private final c[] a;
  
  CompositeGeneratedAdaptersObserver(c[] paramArrayOfc)
  {
    this.a = paramArrayOfc;
  }
  
  public void a(f paramf, d.a parama)
  {
    l locall = new l();
    c[] arrayOfc = this.a;
    int i = arrayOfc.length;
    int j = 0;
    for (int k = 0; k < i; k++) {
      arrayOfc[k].a(paramf, parama, false, locall);
    }
    arrayOfc = this.a;
    i = arrayOfc.length;
    for (k = j; k < i; k++) {
      arrayOfc[k].a(paramf, parama, true, locall);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/CompositeGeneratedAdaptersObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */