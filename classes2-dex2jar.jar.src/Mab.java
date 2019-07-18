import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class mab
  implements Serializable, Comparable<mab>
{
  static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  public static final mab b = a(new byte[0]);
  final byte[] c;
  transient int d;
  transient String e;
  
  mab(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
  }
  
  private static int a(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return paramChar - '0';
    }
    char c1 = 'a';
    if ((paramChar >= 'a') && (paramChar <= 'f')) {}
    do
    {
      return paramChar - c1 + 10;
      c1 = 'A';
    } while ((paramChar >= 'A') && (paramChar <= 'F'));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected hex digit: ");
    localStringBuilder.append(paramChar);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  static int a(String paramString, int paramInt)
  {
    int i = paramString.length();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      if (k == paramInt) {
        return j;
      }
      int m = paramString.codePointAt(j);
      if (((Character.isISOControl(m)) && (m != 10) && (m != 13)) || (m == 65533)) {
        return -1;
      }
      k++;
      j += Character.charCount(m);
    }
    return paramString.length();
  }
  
  public static mab a(InputStream paramInputStream, int paramInt)
    throws IOException
  {
    if (paramInputStream != null)
    {
      if (paramInt >= 0)
      {
        byte[] arrayOfByte = new byte[paramInt];
        int i = 0;
        while (i < paramInt)
        {
          int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
          if (j != -1) {
            i += j;
          } else {
            throw new EOFException();
          }
        }
        return new mab(arrayOfByte);
      }
      paramInputStream = new StringBuilder();
      paramInputStream.append("byteCount < 0: ");
      paramInputStream.append(paramInt);
      throw new IllegalArgumentException(paramInputStream.toString());
    }
    throw new IllegalArgumentException("in == null");
  }
  
  public static mab a(String paramString)
  {
    if (paramString != null)
    {
      if (paramString.length() % 2 == 0)
      {
        localObject = new byte[paramString.length() / 2];
        for (int i = 0; i < localObject.length; i++)
        {
          int j = i * 2;
          localObject[i] = ((byte)(byte)((a(paramString.charAt(j)) << 4) + a(paramString.charAt(j + 1))));
        }
        return a((byte[])localObject);
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Unexpected hex string: ");
      ((StringBuilder)localObject).append(paramString);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    throw new IllegalArgumentException("hex == null");
  }
  
  public static mab a(byte... paramVarArgs)
  {
    if (paramVarArgs != null) {
      return new mab((byte[])paramVarArgs.clone());
    }
    throw new IllegalArgumentException("data == null");
  }
  
  public static mab b(String paramString)
  {
    if (paramString != null)
    {
      mab localmab = new mab(paramString.getBytes(Hab.a));
      localmab.e = paramString;
      return localmab;
    }
    throw new IllegalArgumentException("s == null");
  }
  
  private mab c(String paramString)
  {
    try
    {
      paramString = a(MessageDigest.getInstance(paramString).digest(this.c));
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
    throws IOException
  {
    paramObjectInputStream = a(paramObjectInputStream, paramObjectInputStream.readInt());
    try
    {
      Field localField = mab.class.getDeclaredField("c");
      localField.setAccessible(true);
      localField.set(this, paramObjectInputStream.c);
      return;
    }
    catch (IllegalAccessException paramObjectInputStream)
    {
      throw new AssertionError();
    }
    catch (NoSuchFieldException paramObjectInputStream)
    {
      throw new AssertionError();
    }
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
    throws IOException
  {
    paramObjectOutputStream.writeInt(this.c.length);
    paramObjectOutputStream.write(this.c);
  }
  
  public byte a(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public int a(mab parammab)
  {
    int i = e();
    int j = parammab.e();
    int k = Math.min(i, j);
    int n;
    int i1;
    int i2;
    for (int m = 0;; m++)
    {
      n = -1;
      if (m >= k) {
        break label83;
      }
      i1 = a(m) & 0xFF;
      i2 = parammab.a(m) & 0xFF;
      if (i1 != i2) {
        break;
      }
    }
    if (i1 >= i2) {
      n = 1;
    }
    return n;
    label83:
    if (i == j) {
      return 0;
    }
    if (i >= j) {
      n = 1;
    }
    return n;
  }
  
  public String a()
  {
    return gab.a(this.c);
  }
  
  public mab a(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      Object localObject = this.c;
      if (paramInt2 <= localObject.length)
      {
        int i = paramInt2 - paramInt1;
        if (i >= 0)
        {
          if ((paramInt1 == 0) && (paramInt2 == localObject.length)) {
            return this;
          }
          localObject = new byte[i];
          System.arraycopy(this.c, paramInt1, localObject, 0, i);
          return new mab((byte[])localObject);
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("endIndex > length(");
      ((StringBuilder)localObject).append(this.c.length);
      ((StringBuilder)localObject).append(")");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    throw new IllegalArgumentException("beginIndex < 0");
  }
  
  void a(jab paramjab)
  {
    byte[] arrayOfByte = this.c;
    paramjab.write(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public boolean a(int paramInt1, mab parammab, int paramInt2, int paramInt3)
  {
    return parammab.a(paramInt2, this.c, paramInt1, paramInt3);
  }
  
  public boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= 0)
    {
      byte[] arrayOfByte = this.c;
      if ((paramInt1 <= arrayOfByte.length - paramInt3) && (paramInt2 >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt3) && (Hab.a(arrayOfByte, paramInt1, paramArrayOfByte, paramInt2, paramInt3)))
      {
        bool = true;
        break label55;
      }
    }
    boolean bool = false;
    label55:
    return bool;
  }
  
  public String b()
  {
    byte[] arrayOfByte = this.c;
    char[] arrayOfChar1 = new char[arrayOfByte.length * 2];
    int i = arrayOfByte.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int m = arrayOfByte[j];
      int n = k + 1;
      char[] arrayOfChar2 = a;
      arrayOfChar1[k] = ((char)arrayOfChar2[(m >> 4 & 0xF)]);
      k = n + 1;
      arrayOfChar1[n] = ((char)arrayOfChar2[(m & 0xF)]);
      j++;
    }
    return new String(arrayOfChar1);
  }
  
  public final boolean b(mab parammab)
  {
    return a(0, parammab, 0, parammab.e());
  }
  
  public mab c()
  {
    return c("SHA-1");
  }
  
  public mab d()
  {
    return c("SHA-256");
  }
  
  public int e()
  {
    return this.c.length;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof mab))
    {
      paramObject = (mab)paramObject;
      int i = ((mab)paramObject).e();
      byte[] arrayOfByte = this.c;
      if ((i == arrayOfByte.length) && (((mab)paramObject).a(0, arrayOfByte, 0, arrayOfByte.length))) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public mab f()
  {
    for (int i = 0;; i++)
    {
      byte[] arrayOfByte = this.c;
      if (i >= arrayOfByte.length) {
        break;
      }
      int j = arrayOfByte[i];
      if ((j >= 65) && (j <= 90))
      {
        arrayOfByte = (byte[])arrayOfByte.clone();
        int k = i + 1;
        arrayOfByte[i] = ((byte)(byte)(j + 32));
        for (i = k; i < arrayOfByte.length; i++)
        {
          k = arrayOfByte[i];
          if ((k >= 65) && (k <= 90)) {
            arrayOfByte[i] = ((byte)(byte)(k + 32));
          }
        }
        return new mab(arrayOfByte);
      }
    }
    return this;
  }
  
  public byte[] g()
  {
    return (byte[])this.c.clone();
  }
  
  public String h()
  {
    String str = this.e;
    if (str == null)
    {
      str = new String(this.c, Hab.a);
      this.e = str;
    }
    return str;
  }
  
  public int hashCode()
  {
    int i = this.d;
    if (i == 0)
    {
      i = Arrays.hashCode(this.c);
      this.d = i;
    }
    return i;
  }
  
  public String toString()
  {
    if (this.c.length == 0) {
      return "[size=0]";
    }
    Object localObject1 = h();
    int i = a((String)localObject1, 64);
    if (i == -1)
    {
      if (this.c.length <= 64)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("[hex=");
        ((StringBuilder)localObject2).append(b());
        ((StringBuilder)localObject2).append("]");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      else
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("[size=");
        ((StringBuilder)localObject2).append(this.c.length);
        ((StringBuilder)localObject2).append(" hex=");
        ((StringBuilder)localObject2).append(a(0, 64).b());
        ((StringBuilder)localObject2).append("…]");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      return (String)localObject2;
    }
    Object localObject2 = ((String)localObject1).substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
    if (i < ((String)localObject1).length())
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("[size=");
      ((StringBuilder)localObject1).append(this.c.length);
      ((StringBuilder)localObject1).append(" text=");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append("…]");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    else
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("[text=");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append("]");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    return (String)localObject2;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */