import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class ux
{
  static final Charset a = Charset.forName("UTF-8");
  private static final Charset b = Charset.forName("ISO-8859-1");
  public static final byte[] c;
  private static final ByteBuffer d;
  private static final _w e;
  
  static
  {
    byte[] arrayOfByte = new byte[0];
    c = arrayOfByte;
    d = ByteBuffer.wrap(arrayOfByte);
    arrayOfByte = c;
    e = _w.a(arrayOfByte, 0, arrayOfByte.length, false);
  }
  
  static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt1;
    for (paramInt1 = paramInt2; paramInt1 < paramInt2 + paramInt3; paramInt1++) {
      i = i * 31 + paramArrayOfByte[paramInt1];
    }
    return i;
  }
  
  public static int a(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static int a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  public static int a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = a(i, paramArrayOfByte, 0, i);
    i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
  
  static <T> T a(T paramT)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException();
  }
  
  static Object a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = ((by)paramObject1).b();
    ((cy)paramObject1).a((by)paramObject2);
    return ((cy)paramObject1).L();
  }
  
  static <T> T a(T paramT, String paramString)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(paramString);
  }
  
  static boolean a(by paramby)
  {
    return false;
  }
  
  public static boolean b(byte[] paramArrayOfByte)
  {
    return Sy.a(paramArrayOfByte);
  }
  
  public static String c(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */