import java.util.Arrays;

class qz<E>
  extends rz<E>
{
  Object[] a;
  int b;
  boolean c;
  
  qz(int paramInt)
  {
    nz.a(4, "initialCapacity");
    this.a = new Object[4];
    this.b = 0;
  }
  
  public qz<E> a(E paramE)
  {
    dx.a(paramE);
    int i = this.b + 1;
    Object[] arrayOfObject = this.a;
    if (arrayOfObject.length < i)
    {
      this.a = Arrays.copyOf(arrayOfObject, rz.a(arrayOfObject.length, i));
      this.c = false;
    }
    else if (this.c)
    {
      this.a = ((Object[])arrayOfObject.clone());
      this.c = false;
    }
    arrayOfObject = this.a;
    i = this.b;
    this.b = (i + 1);
    arrayOfObject[i] = paramE;
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */