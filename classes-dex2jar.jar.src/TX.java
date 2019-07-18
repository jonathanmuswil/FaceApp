import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class tx
  extends Lw<Integer>
  implements yx, ny, RandomAccess
{
  private static final tx b;
  private int[] c;
  private int d;
  
  static
  {
    tx localtx = new tx(new int[0], 0);
    b = localtx;
    localtx.c();
  }
  
  tx()
  {
    this(new int[10], 0);
  }
  
  private tx(int[] paramArrayOfInt, int paramInt)
  {
    this.c = paramArrayOfInt;
    this.d = paramInt;
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    m();
    if (paramInt1 >= 0)
    {
      int i = this.d;
      if (paramInt1 <= i)
      {
        int[] arrayOfInt1 = this.c;
        if (i < arrayOfInt1.length)
        {
          System.arraycopy(arrayOfInt1, paramInt1, arrayOfInt1, paramInt1 + 1, i - paramInt1);
        }
        else
        {
          int[] arrayOfInt2 = new int[i * 3 / 2 + 1];
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, paramInt1);
          System.arraycopy(this.c, paramInt1, arrayOfInt2, paramInt1 + 1, this.d - paramInt1);
          this.c = arrayOfInt2;
        }
        this.c[paramInt1] = paramInt2;
        this.d += 1;
        this.modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(q(paramInt1));
  }
  
  public static tx n()
  {
    return b;
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
  
  public final boolean addAll(Collection<? extends Integer> paramCollection)
  {
    m();
    ux.a(paramCollection);
    if (!(paramCollection instanceof tx)) {
      return super.addAll(paramCollection);
    }
    tx localtx = (tx)paramCollection;
    int i = localtx.d;
    if (i == 0) {
      return false;
    }
    int j = this.d;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      paramCollection = this.c;
      if (i > paramCollection.length) {
        this.c = Arrays.copyOf(paramCollection, i);
      }
      System.arraycopy(localtx.c, 0, this.c, this.d, localtx.d);
      this.d = i;
      this.modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final void c(int paramInt)
  {
    a(this.d, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof tx)) {
      return super.equals(paramObject);
    }
    paramObject = (tx)paramObject;
    if (this.d != ((tx)paramObject).d) {
      return false;
    }
    paramObject = ((tx)paramObject).c;
    for (int i = 0; i < this.d; i++) {
      if (this.c[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final yx g(int paramInt)
  {
    if (paramInt >= this.d) {
      return new tx(Arrays.copyOf(this.c, paramInt), this.d);
    }
    throw new IllegalArgumentException();
  }
  
  public final int getInt(int paramInt)
  {
    p(paramInt);
    return this.c[paramInt];
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < this.d; j++) {
      i = i * 31 + this.c[j];
    }
    return i;
  }
  
  public final boolean remove(Object paramObject)
  {
    m();
    for (int i = 0; i < this.d; i++) {
      if (paramObject.equals(Integer.valueOf(this.c[i])))
      {
        paramObject = this.c;
        System.arraycopy(paramObject, i + 1, paramObject, i, this.d - i - 1);
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
      int[] arrayOfInt = this.c;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, this.d - paramInt2);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */