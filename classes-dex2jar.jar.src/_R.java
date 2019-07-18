import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;

public abstract class _r
  implements Serializable, Iterable<Byte>
{
  public static final _r a = new gs(Gs.c);
  private static final ds b;
  private int c = 0;
  
  static
  {
    Object localObject;
    if (Ur.a()) {
      localObject = new hs(null);
    } else {
      localObject = new bs(null);
    }
    b = (ds)localObject;
  }
  
  public static _r a(String paramString)
  {
    return new gs(paramString.getBytes(Gs.a));
  }
  
  public static _r a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new gs(b.a(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1)
        {
          localStringBuilder = new StringBuilder(66);
          localStringBuilder.append("Beginning index larger than ending index: ");
          localStringBuilder.append(paramInt1);
          localStringBuilder.append(", ");
          localStringBuilder.append(paramInt2);
          throw new IndexOutOfBoundsException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder(37);
        localStringBuilder.append("End index: ");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(" >= ");
        localStringBuilder.append(paramInt3);
        throw new IndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append("Beginning index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    return i;
  }
  
  static es q(int paramInt)
  {
    return new es(paramInt, null);
  }
  
  protected abstract int a(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract _r a(int paramInt1, int paramInt2);
  
  protected abstract String a(Charset paramCharset);
  
  abstract void a(Zr paramZr)
    throws IOException;
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = this.c;
    int j = i;
    if (i == 0)
    {
      j = size();
      i = a(j, 0, j);
      j = i;
      if (i == 0) {
        j = 1;
      }
      this.c = j;
    }
    return j;
  }
  
  public abstract boolean m();
  
  protected final int n()
  {
    return this.c;
  }
  
  public final String o()
  {
    Charset localCharset = Gs.a;
    if (size() == 0) {
      return "";
    }
    return a(localCharset);
  }
  
  public abstract byte p(int paramInt);
  
  public abstract int size();
  
  public final String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */