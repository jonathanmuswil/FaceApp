import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class os
  extends Tr<Double>
  implements Js<Double>, RandomAccess
{
  private static final os b;
  private double[] c;
  private int d;
  
  static
  {
    os localos = new os();
    b = localos;
    localos.ma();
  }
  
  os()
  {
    this(new double[10], 0);
  }
  
  private os(double[] paramArrayOfDouble, int paramInt)
  {
    this.c = paramArrayOfDouble;
    this.d = paramInt;
  }
  
  private final void a(int paramInt, double paramDouble)
  {
    m();
    if (paramInt >= 0)
    {
      int i = this.d;
      if (paramInt <= i)
      {
        double[] arrayOfDouble1 = this.c;
        if (i < arrayOfDouble1.length)
        {
          System.arraycopy(arrayOfDouble1, paramInt, arrayOfDouble1, paramInt + 1, i - paramInt);
        }
        else
        {
          double[] arrayOfDouble2 = new double[i * 3 / 2 + 1];
          System.arraycopy(arrayOfDouble1, 0, arrayOfDouble2, 0, paramInt);
          System.arraycopy(this.c, paramInt, arrayOfDouble2, paramInt + 1, this.d - paramInt);
          this.c = arrayOfDouble2;
        }
        this.c[paramInt] = paramDouble;
        this.d += 1;
        this.modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(q(paramInt));
  }
  
  private final void p(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.d)) {
      return;
    }
    throw new IndexOutOfBoundsException(q(paramInt));
  }
  
  private final String q(int paramInt)
  {
    int i = this.d;
    StringBuilder localStringBuilder = new StringBuilder(35);
    localStringBuilder.append("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public final void a(double paramDouble)
  {
    a(this.d, paramDouble);
  }
  
  public final boolean addAll(Collection<? extends Double> paramCollection)
  {
    m();
    Gs.a(paramCollection);
    if (!(paramCollection instanceof os)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (os)paramCollection;
    int i = paramCollection.d;
    if (i == 0) {
      return false;
    }
    int j = this.d;
    if (Integer.MAX_VALUE - j >= i)
    {
      j += i;
      double[] arrayOfDouble = this.c;
      if (j > arrayOfDouble.length) {
        this.c = Arrays.copyOf(arrayOfDouble, j);
      }
      System.arraycopy(paramCollection.c, 0, this.c, this.d, paramCollection.d);
      this.d = j;
      this.modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof os)) {
      return super.equals(paramObject);
    }
    paramObject = (os)paramObject;
    if (this.d != ((os)paramObject).d) {
      return false;
    }
    paramObject = ((os)paramObject).c;
    for (int i = 0; i < this.d; i++) {
      if (this.c[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < this.d; j++) {
      i = i * 31 + Gs.a(Double.doubleToLongBits(this.c[j]));
    }
    return i;
  }
  
  public final boolean remove(Object paramObject)
  {
    m();
    for (int i = 0; i < this.d; i++) {
      if (paramObject.equals(Double.valueOf(this.c[i])))
      {
        paramObject = this.c;
        System.arraycopy(paramObject, i + 1, paramObject, i, this.d - i);
        this.d -= 1;
        this.modCount += 1;
        return true;
      }
    }
    return false;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2)
  {
    m();
    if (paramInt2 >= paramInt1)
    {
      double[] arrayOfDouble = this.c;
      System.arraycopy(arrayOfDouble, paramInt2, arrayOfDouble, paramInt1, this.d - paramInt2);
      this.d -= paramInt2 - paramInt1;
      this.modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size()
  {
    return this.d;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */