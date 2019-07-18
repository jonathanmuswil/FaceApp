import java.util.Set;

public abstract class yz<E>
  extends pz<E>
  implements Set<E>
{
  private transient sz<E> b;
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    return fv.a(this, paramObject);
  }
  
  public int hashCode()
  {
    return fv.a(this);
  }
  
  public sz<E> q()
  {
    sz localsz1 = this.b;
    sz localsz2 = localsz1;
    if (localsz1 == null)
    {
      localsz2 = r();
      this.b = localsz2;
    }
    return localsz2;
  }
  
  sz<E> r()
  {
    return sz.a(toArray());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */