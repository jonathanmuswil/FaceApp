import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class mv
  extends WeakReference<Throwable>
{
  private final int a;
  
  public mv(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue)
  {
    super(paramThrowable, paramReferenceQueue);
    if (paramThrowable != null)
    {
      this.a = System.identityHashCode(paramThrowable);
      return;
    }
    throw new NullPointerException("The referent cannot be null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == mv.class))
    {
      if (this == paramObject) {
        return true;
      }
      paramObject = (mv)paramObject;
      if ((this.a == ((mv)paramObject).a) && (get() == ((WeakReference)paramObject).get())) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */