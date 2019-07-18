import android.content.Context;

public abstract class _aa<T>
  implements bba<T>
{
  private final bba<T> a;
  
  public _aa(bba<T> parambba)
  {
    this.a = parambba;
  }
  
  private void b(Context paramContext, T paramT)
  {
    if (paramT != null)
    {
      a(paramContext, paramT);
      return;
    }
    throw new NullPointerException();
  }
  
  protected abstract T a(Context paramContext);
  
  public final T a(Context paramContext, cba<T> paramcba)
    throws Exception
  {
    try
    {
      Object localObject1 = a(paramContext);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        if (this.a != null) {
          paramcba = this.a.a(paramContext, paramcba);
        } else {
          paramcba = paramcba.a(paramContext);
        }
        b(paramContext, paramcba);
        localObject2 = paramcba;
      }
      return (T)localObject2;
    }
    finally {}
  }
  
  protected abstract void a(Context paramContext, T paramT);
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */