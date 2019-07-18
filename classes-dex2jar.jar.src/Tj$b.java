import android.util.Log;

final class Tj$b<T>
  implements qd<T>
{
  private final Tj.a<T> a;
  private final Tj.d<T> b;
  private final qd<T> c;
  
  Tj$b(qd<T> paramqd, Tj.a<T> parama, Tj.d<T> paramd)
  {
    this.c = paramqd;
    this.a = parama;
    this.b = paramd;
  }
  
  public T a()
  {
    Object localObject1 = this.c.a();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = this.a.a();
      localObject2 = localObject1;
      if (Log.isLoggable("FactoryPools", 2))
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Created new ");
        ((StringBuilder)localObject2).append(localObject1.getClass());
        Log.v("FactoryPools", ((StringBuilder)localObject2).toString());
        localObject2 = localObject1;
      }
    }
    if ((localObject2 instanceof Tj.c)) {
      ((Tj.c)localObject2).d().a(false);
    }
    return (T)localObject2;
  }
  
  public boolean a(T paramT)
  {
    if ((paramT instanceof Tj.c)) {
      ((Tj.c)paramT).d().a(true);
    }
    this.b.a(paramT);
    return this.c.a(paramT);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Tj$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */