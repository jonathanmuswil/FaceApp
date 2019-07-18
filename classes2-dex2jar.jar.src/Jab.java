import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.AbstractList;

public final class jab
  implements lab, kab, Cloneable, ByteChannel
{
  private static final byte[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  Aab b;
  long c;
  
  public int a(wab paramwab)
  {
    int i = a(paramwab, false);
    if (i == -1) {
      return -1;
    }
    long l = paramwab.a[i].e();
    try
    {
      skip(l);
      return i;
    }
    catch (EOFException paramwab)
    {
      throw new AssertionError();
    }
  }
  
  int a(wab paramwab, boolean paramBoolean)
  {
    Aab localAab = this.b;
    if (localAab == null)
    {
      if (paramBoolean) {
        return -2;
      }
      return paramwab.indexOf(mab.b);
    }
    byte[] arrayOfByte = localAab.a;
    int i = localAab.b;
    int j = localAab.c;
    int[] arrayOfInt = paramwab.b;
    int k = -1;
    paramwab = localAab;
    int m = 0;
    int n = m + 1;
    int i1 = arrayOfInt[m];
    int i2 = n + 1;
    m = arrayOfInt[n];
    if (m != -1) {
      k = m;
    }
    wab localwab;
    if (paramwab != null)
    {
      if (i1 < 0)
      {
        m = i2;
        n = j;
        localwab = paramwab;
      }
    }
    else {
      for (;;)
      {
        int i3 = i + 1;
        j = arrayOfByte[i];
        int i4 = m + 1;
        if ((j & 0xFF) != arrayOfInt[m]) {
          return k;
        }
        if (i4 == i2 + i1 * -1) {
          i = 1;
        } else {
          i = 0;
        }
        j = i3;
        paramwab = localwab;
        m = n;
        if (i3 == n)
        {
          paramwab = localwab.f;
          j = paramwab.b;
          arrayOfByte = paramwab.a;
          m = paramwab.c;
          if (paramwab == localAab)
          {
            if (i == 0)
            {
              if (paramBoolean) {
                return -2;
              }
              return k;
            }
            paramwab = null;
          }
        }
        if (i != 0)
        {
          i2 = arrayOfInt[i4];
          i = j;
          j = m;
          break;
        }
        i = j;
        j = i4;
        localwab = paramwab;
        n = m;
        m = j;
      }
    }
    m = i + 1;
    n = arrayOfByte[i];
    for (i = i2;; i++)
    {
      if (i == i2 + i1) {
        return k;
      }
      if ((n & 0xFF) == arrayOfInt[i])
      {
        i2 = arrayOfInt[(i + i1)];
        if (m == j)
        {
          paramwab = paramwab.f;
          i = paramwab.b;
          arrayOfByte = paramwab.a;
          j = paramwab.c;
          if (paramwab == localAab) {
            paramwab = null;
          }
        }
        else
        {
          i = m;
        }
        if (i2 >= 0) {
          return i2;
        }
        m = -i2;
        break;
      }
    }
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Hab.a(paramArrayOfByte.length, paramInt1, paramInt2);
    Aab localAab = this.b;
    if (localAab == null) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, localAab.c - localAab.b);
    System.arraycopy(localAab.a, localAab.b, paramArrayOfByte, paramInt1, paramInt2);
    localAab.b += paramInt2;
    this.c -= paramInt2;
    if (localAab.b == localAab.c)
    {
      this.b = localAab.b();
      Bab.a(localAab);
    }
    return paramInt2;
  }
  
  public long a(byte paramByte)
  {
    return a(paramByte, 0L, Long.MAX_VALUE);
  }
  
  public long a(byte paramByte, long paramLong1, long paramLong2)
  {
    long l1 = 0L;
    if ((paramLong1 >= 0L) && (paramLong2 >= paramLong1))
    {
      long l2 = this.c;
      if (paramLong2 <= l2) {
        l2 = paramLong2;
      }
      if (paramLong1 == l2) {
        return -1L;
      }
      Object localObject1 = this.b;
      if (localObject1 == null) {
        return -1L;
      }
      long l3 = this.c;
      paramLong2 = l1;
      Object localObject2 = localObject1;
      if (l3 - paramLong1 < paramLong1)
      {
        l1 = l3;
        localObject2 = localObject1;
        for (;;)
        {
          localObject1 = localObject2;
          paramLong2 = l1;
          if (l1 <= paramLong1) {
            break;
          }
          localObject2 = ((Aab)localObject2).g;
          l1 -= ((Aab)localObject2).c - ((Aab)localObject2).b;
        }
      }
      for (;;)
      {
        l1 = ((Aab)localObject2).c - ((Aab)localObject2).b + paramLong2;
        localObject1 = localObject2;
        if (l1 >= paramLong1) {
          break;
        }
        localObject2 = ((Aab)localObject2).f;
        paramLong2 = l1;
      }
      while (paramLong2 < l2)
      {
        localObject2 = ((Aab)localObject1).a;
        int i = (int)Math.min(((Aab)localObject1).c, ((Aab)localObject1).b + l2 - paramLong2);
        for (int j = (int)(((Aab)localObject1).b + paramLong1 - paramLong2); j < i; j++) {
          if (localObject2[j] == paramByte) {
            return j - ((Aab)localObject1).b + paramLong2;
          }
        }
        paramLong1 = ((Aab)localObject1).c - ((Aab)localObject1).b + paramLong2;
        localObject1 = ((Aab)localObject1).f;
        paramLong2 = paramLong1;
      }
      return -1L;
    }
    throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[] { Long.valueOf(this.c), Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
  }
  
  public long a(Dab paramDab)
    throws IOException
  {
    long l = this.c;
    if (l > 0L) {
      paramDab.a(this, l);
    }
    return l;
  }
  
  public long a(Eab paramEab)
    throws IOException
  {
    if (paramEab != null)
    {
      long l2;
      for (long l1 = 0L;; l1 += l2)
      {
        l2 = paramEab.b(this, 8192L);
        if (l2 == -1L) {
          break;
        }
      }
      return l1;
    }
    throw new IllegalArgumentException("source == null");
  }
  
  public final jab a(jab paramjab, long paramLong1, long paramLong2)
  {
    if (paramjab != null)
    {
      Hab.a(this.c, paramLong1, paramLong2);
      if (paramLong2 == 0L) {
        return this;
      }
      paramjab.c += paramLong2;
      Aab localAab2;
      long l1;
      long l2;
      for (Aab localAab1 = this.b;; localAab1 = localAab1.f)
      {
        int i = localAab1.c;
        int j = localAab1.b;
        localAab2 = localAab1;
        l1 = paramLong1;
        l2 = paramLong2;
        if (paramLong1 < i - j) {
          break;
        }
        paramLong1 -= i - j;
      }
      while (l2 > 0L)
      {
        localAab1 = localAab2.c();
        localAab1.b = ((int)(localAab1.b + l1));
        localAab1.c = Math.min(localAab1.b + (int)l2, localAab1.c);
        Aab localAab3 = paramjab.b;
        if (localAab3 == null)
        {
          localAab1.g = localAab1;
          localAab1.f = localAab1;
          paramjab.b = localAab1;
        }
        else
        {
          localAab3.g.a(localAab1);
        }
        l2 -= localAab1.c - localAab1.b;
        localAab2 = localAab2.f;
        l1 = 0L;
      }
      return this;
    }
    throw new IllegalArgumentException("out == null");
  }
  
  public jab a(String paramString)
  {
    a(paramString, 0, paramString.length());
    return this;
  }
  
  public jab a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 >= paramInt1)
        {
          if (paramInt2 <= paramString.length())
          {
            while (paramInt1 < paramInt2)
            {
              int i = paramString.charAt(paramInt1);
              int j;
              int m;
              if (i < 128)
              {
                Aab localAab = b(1);
                localObject = localAab.a;
                j = localAab.c - paramInt1;
                int k = Math.min(paramInt2, 8192 - j);
                m = paramInt1 + 1;
                localObject[(paramInt1 + j)] = ((byte)(byte)i);
                for (paramInt1 = m; paramInt1 < k; paramInt1++)
                {
                  m = paramString.charAt(paramInt1);
                  if (m >= 128) {
                    break;
                  }
                  localObject[(paramInt1 + j)] = ((byte)(byte)m);
                }
                m = localAab.c;
                j = j + paramInt1 - m;
                localAab.c = (m + j);
                this.c += j;
              }
              else
              {
                if (i < 2048)
                {
                  writeByte(i >> 6 | 0xC0);
                  writeByte(i & 0x3F | 0x80);
                }
                for (;;)
                {
                  paramInt1++;
                  break;
                  if ((i >= 55296) && (i <= 57343))
                  {
                    j = paramInt1 + 1;
                    if (j < paramInt2) {
                      m = paramString.charAt(j);
                    } else {
                      m = 0;
                    }
                    if ((i <= 56319) && (m >= 56320) && (m <= 57343))
                    {
                      m = ((i & 0xFFFF27FF) << 10 | 0xFFFF23FF & m) + 65536;
                      writeByte(m >> 18 | 0xF0);
                      writeByte(m >> 12 & 0x3F | 0x80);
                      writeByte(m >> 6 & 0x3F | 0x80);
                      writeByte(m & 0x3F | 0x80);
                      paramInt1 += 2;
                      break;
                    }
                    writeByte(63);
                    paramInt1 = j;
                    break;
                  }
                  writeByte(i >> 12 | 0xE0);
                  writeByte(i >> 6 & 0x3F | 0x80);
                  writeByte(i & 0x3F | 0x80);
                }
              }
            }
            return this;
          }
          Object localObject = new StringBuilder();
          ((StringBuilder)localObject).append("endIndex > string.length: ");
          ((StringBuilder)localObject).append(paramInt2);
          ((StringBuilder)localObject).append(" > ");
          ((StringBuilder)localObject).append(paramString.length());
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
        paramString = new StringBuilder();
        paramString.append("endIndex < beginIndex: ");
        paramString.append(paramInt2);
        paramString.append(" < ");
        paramString.append(paramInt1);
        throw new IllegalArgumentException(paramString.toString());
      }
      paramString = new StringBuilder();
      paramString.append("beginIndex < 0: ");
      paramString.append(paramInt1);
      throw new IllegalArgumentException(paramString.toString());
    }
    throw new IllegalArgumentException("string == null");
  }
  
  public jab a(String paramString, int paramInt1, int paramInt2, Charset paramCharset)
  {
    if (paramString != null)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 >= paramInt1)
        {
          if (paramInt2 <= paramString.length())
          {
            if (paramCharset != null)
            {
              if (paramCharset.equals(Hab.a))
              {
                a(paramString, paramInt1, paramInt2);
                return this;
              }
              paramString = paramString.substring(paramInt1, paramInt2).getBytes(paramCharset);
              write(paramString, 0, paramString.length);
              return this;
            }
            throw new IllegalArgumentException("charset == null");
          }
          paramCharset = new StringBuilder();
          paramCharset.append("endIndex > string.length: ");
          paramCharset.append(paramInt2);
          paramCharset.append(" > ");
          paramCharset.append(paramString.length());
          throw new IllegalArgumentException(paramCharset.toString());
        }
        paramString = new StringBuilder();
        paramString.append("endIndex < beginIndex: ");
        paramString.append(paramInt2);
        paramString.append(" < ");
        paramString.append(paramInt1);
        throw new IllegalArgumentException(paramString.toString());
      }
      paramString = new StringBuilder();
      paramString.append("beginIndex < 0: ");
      paramString.append(paramInt1);
      throw new IllegalAccessError(paramString.toString());
    }
    throw new IllegalArgumentException("string == null");
  }
  
  public jab a(String paramString, Charset paramCharset)
  {
    a(paramString, 0, paramString.length(), paramCharset);
    return this;
  }
  
  public jab a(mab parammab)
  {
    if (parammab != null)
    {
      parammab.a(this);
      return this;
    }
    throw new IllegalArgumentException("byteString == null");
  }
  
  public String a(long paramLong, Charset paramCharset)
    throws EOFException
  {
    Hab.a(this.c, 0L, paramLong);
    if (paramCharset != null)
    {
      if (paramLong <= 2147483647L)
      {
        if (paramLong == 0L) {
          return "";
        }
        Aab localAab = this.b;
        int i = localAab.b;
        if (i + paramLong > localAab.c) {
          return new String(e(paramLong), paramCharset);
        }
        paramCharset = new String(localAab.a, i, (int)paramLong, paramCharset);
        localAab.b = ((int)(localAab.b + paramLong));
        this.c -= paramLong;
        if (localAab.b == localAab.c)
        {
          this.b = localAab.b();
          Bab.a(localAab);
        }
        return paramCharset;
      }
      paramCharset = new StringBuilder();
      paramCharset.append("byteCount > Integer.MAX_VALUE: ");
      paramCharset.append(paramLong);
      throw new IllegalArgumentException(paramCharset.toString());
    }
    throw new IllegalArgumentException("charset == null");
  }
  
  public String a(Charset paramCharset)
  {
    try
    {
      paramCharset = a(this.c, paramCharset);
      return paramCharset;
    }
    catch (EOFException paramCharset)
    {
      throw new AssertionError(paramCharset);
    }
  }
  
  public final mab a(int paramInt)
  {
    if (paramInt == 0) {
      return mab.b;
    }
    return new Cab(this, paramInt);
  }
  
  public final void a()
  {
    try
    {
      skip(this.c);
      return;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public void a(jab paramjab, long paramLong)
  {
    if (paramjab != null)
    {
      if (paramjab != this)
      {
        Hab.a(paramjab.c, 0L, paramLong);
        while (paramLong > 0L)
        {
          Aab localAab1 = paramjab.b;
          if (paramLong < localAab1.c - localAab1.b)
          {
            localAab1 = this.b;
            if (localAab1 != null) {
              localAab1 = localAab1.g;
            } else {
              localAab1 = null;
            }
            if ((localAab1 != null) && (localAab1.e))
            {
              l = localAab1.c;
              int i;
              if (localAab1.d) {
                i = 0;
              } else {
                i = localAab1.b;
              }
              if (l + paramLong - i <= 8192L)
              {
                paramjab.b.a(localAab1, (int)paramLong);
                paramjab.c -= paramLong;
                this.c += paramLong;
                return;
              }
            }
            paramjab.b = paramjab.b.a((int)paramLong);
          }
          Aab localAab2 = paramjab.b;
          long l = localAab2.c - localAab2.b;
          paramjab.b = localAab2.b();
          localAab1 = this.b;
          if (localAab1 == null)
          {
            this.b = localAab2;
            localAab1 = this.b;
            localAab1.g = localAab1;
            localAab1.f = localAab1;
          }
          else
          {
            localAab1.g.a(localAab2);
            localAab2.a();
          }
          paramjab.c -= l;
          this.c += l;
          paramLong -= l;
        }
        return;
      }
      throw new IllegalArgumentException("source == this");
    }
    throw new IllegalArgumentException("source == null");
  }
  
  public boolean a(long paramLong)
  {
    boolean bool;
    if (this.c >= paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final long b()
  {
    long l1 = this.c;
    if (l1 == 0L) {
      return 0L;
    }
    Aab localAab = this.b.g;
    int i = localAab.c;
    long l2 = l1;
    if (i < 8192)
    {
      l2 = l1;
      if (localAab.e) {
        l2 = l1 - (i - localAab.b);
      }
    }
    return l2;
  }
  
  public long b(jab paramjab, long paramLong)
  {
    if (paramjab != null)
    {
      if (paramLong >= 0L)
      {
        long l1 = this.c;
        if (l1 == 0L) {
          return -1L;
        }
        long l2 = paramLong;
        if (paramLong > l1) {
          l2 = l1;
        }
        paramjab.a(this, l2);
        return l2;
      }
      paramjab = new StringBuilder();
      paramjab.append("byteCount < 0: ");
      paramjab.append(paramLong);
      throw new IllegalArgumentException(paramjab.toString());
    }
    throw new IllegalArgumentException("sink == null");
  }
  
  Aab b(int paramInt)
  {
    if ((paramInt >= 1) && (paramInt <= 8192))
    {
      Object localObject = this.b;
      if (localObject == null)
      {
        this.b = Bab.a();
        localObject = this.b;
        ((Aab)localObject).g = ((Aab)localObject);
        ((Aab)localObject).f = ((Aab)localObject);
        return (Aab)localObject;
      }
      Aab localAab = ((Aab)localObject).g;
      if ((localAab.c + paramInt <= 8192) && (localAab.e))
      {
        localObject = localAab;
      }
      else
      {
        localObject = Bab.a();
        localAab.a((Aab)localObject);
      }
      return (Aab)localObject;
    }
    throw new IllegalArgumentException();
  }
  
  public mab b(long paramLong)
    throws EOFException
  {
    return new mab(e(paramLong));
  }
  
  public jab c(int paramInt)
  {
    if (paramInt < 128)
    {
      writeByte(paramInt);
    }
    else if (paramInt < 2048)
    {
      writeByte(paramInt >> 6 | 0xC0);
      writeByte(paramInt & 0x3F | 0x80);
    }
    else if (paramInt < 65536)
    {
      if ((paramInt >= 55296) && (paramInt <= 57343))
      {
        writeByte(63);
      }
      else
      {
        writeByte(paramInt >> 12 | 0xE0);
        writeByte(paramInt >> 6 & 0x3F | 0x80);
        writeByte(paramInt & 0x3F | 0x80);
      }
    }
    else
    {
      if (paramInt > 1114111) {
        break label192;
      }
      writeByte(paramInt >> 18 | 0xF0);
      writeByte(paramInt >> 12 & 0x3F | 0x80);
      writeByte(paramInt >> 6 & 0x3F | 0x80);
      writeByte(paramInt & 0x3F | 0x80);
    }
    return this;
    label192:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected code point: ");
    localStringBuilder.append(Integer.toHexString(paramInt));
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public OutputStream c()
  {
    return new hab(this);
  }
  
  public String c(long paramLong)
    throws EOFException
  {
    if (paramLong >= 0L)
    {
      long l1 = Long.MAX_VALUE;
      if (paramLong != Long.MAX_VALUE) {
        l1 = paramLong + 1L;
      }
      long l2 = a((byte)10, 0L, l1);
      if (l2 != -1L) {
        return j(l2);
      }
      if ((l1 < size()) && (h(l1 - 1L) == 13) && (h(l1) == 10)) {
        return j(l1);
      }
      jab localjab = new jab();
      a(localjab, 0L, Math.min(32L, size()));
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("\\n not found: limit=");
      localStringBuilder.append(Math.min(size(), paramLong));
      localStringBuilder.append(" content=");
      localStringBuilder.append(localjab.d().b());
      localStringBuilder.append('…');
      throw new EOFException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("limit < 0: ");
    localStringBuilder.append(paramLong);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public jab clone()
  {
    jab localjab = new jab();
    if (this.c == 0L) {
      return localjab;
    }
    localjab.b = this.b.c();
    Aab localAab = localjab.b;
    localAab.g = localAab;
    localAab.f = localAab;
    localAab = this.b;
    for (;;)
    {
      localAab = localAab.f;
      if (localAab == this.b) {
        break;
      }
      localjab.b.g.a(localAab.c());
    }
    localjab.c = this.c;
    return localjab;
  }
  
  public void close() {}
  
  public jab d(long paramLong)
  {
    if (paramLong == 0L)
    {
      writeByte(48);
      return this;
    }
    int i = Long.numberOfTrailingZeros(Long.highestOneBit(paramLong)) / 4 + 1;
    Aab localAab = b(i);
    byte[] arrayOfByte = localAab.a;
    int j = localAab.c;
    for (int k = j + i - 1; k >= j; k--)
    {
      arrayOfByte[k] = ((byte)a[((int)(0xF & paramLong))]);
      paramLong >>>= 4;
    }
    localAab.c += i;
    this.c += i;
    return this;
  }
  
  public mab d()
  {
    return new mab(o());
  }
  
  public String e()
  {
    try
    {
      String str = a(this.c, Hab.a);
      return str;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public byte[] e(long paramLong)
    throws EOFException
  {
    Hab.a(this.c, 0L, paramLong);
    if (paramLong <= 2147483647L)
    {
      localObject = new byte[(int)paramLong];
      readFully((byte[])localObject);
      return (byte[])localObject;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("byteCount > Integer.MAX_VALUE: ");
    ((StringBuilder)localObject).append(paramLong);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof jab)) {
      return false;
    }
    paramObject = (jab)paramObject;
    long l1 = this.c;
    if (l1 != ((jab)paramObject).c) {
      return false;
    }
    long l2 = 0L;
    if (l1 == 0L) {
      return true;
    }
    Aab localAab = this.b;
    paramObject = ((jab)paramObject).b;
    int i = localAab.b;
    int j = ((Aab)paramObject).b;
    while (l2 < this.c)
    {
      l1 = Math.min(localAab.c - i, ((Aab)paramObject).c - j);
      int k = 0;
      while (k < l1)
      {
        if (localAab.a[i] != paramObject.a[j]) {
          return false;
        }
        k++;
        i++;
        j++;
      }
      if (i == localAab.c)
      {
        localAab = localAab.f;
        i = localAab.b;
      }
      if (j == ((Aab)paramObject).c)
      {
        paramObject = ((Aab)paramObject).f;
        j = ((Aab)paramObject).b;
      }
      l2 += l1;
    }
    return true;
  }
  
  public int f()
    throws EOFException
  {
    if (this.c != 0L)
    {
      int i = h(0L);
      int j = 1;
      int k;
      int m;
      int n;
      if ((i & 0x80) == 0)
      {
        k = i & 0x7F;
        m = 1;
        n = 0;
      }
      else if ((i & 0xE0) == 192)
      {
        k = i & 0x1F;
        m = 2;
        n = 128;
      }
      else if ((i & 0xF0) == 224)
      {
        k = i & 0xF;
        m = 3;
        n = 2048;
      }
      else
      {
        if ((i & 0xF8) != 240) {
          break label320;
        }
        k = i & 0x7;
        m = 4;
        n = 65536;
      }
      long l1 = this.c;
      long l2 = m;
      if (l1 >= l2)
      {
        while (j < m)
        {
          l1 = j;
          i = h(l1);
          if ((i & 0xC0) == 128)
          {
            k = k << 6 | i & 0x3F;
            j++;
          }
          else
          {
            skip(l1);
            return 65533;
          }
        }
        skip(l2);
        if (k > 1114111) {
          return 65533;
        }
        if ((k >= 55296) && (k <= 57343)) {
          return 65533;
        }
        if (k < n) {
          return 65533;
        }
        return k;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("size < ");
      localStringBuilder.append(m);
      localStringBuilder.append(": ");
      localStringBuilder.append(this.c);
      localStringBuilder.append(" (to read code point prefixed 0x");
      localStringBuilder.append(Integer.toHexString(i));
      localStringBuilder.append(")");
      throw new EOFException(localStringBuilder.toString());
      label320:
      skip(1L);
      return 65533;
    }
    throw new EOFException();
  }
  
  public void f(long paramLong)
    throws EOFException
  {
    if (this.c >= paramLong) {
      return;
    }
    throw new EOFException();
  }
  
  public void flush() {}
  
  public jab g(long paramLong)
  {
    boolean bool = paramLong < 0L;
    if (!bool)
    {
      writeByte(48);
      return this;
    }
    int j = 0;
    int k = 1;
    long l = paramLong;
    if (bool)
    {
      l = -paramLong;
      if (l < 0L)
      {
        a("-9223372036854775808");
        return this;
      }
      j = 1;
    }
    if (l < 100000000L)
    {
      if (l < 10000L)
      {
        if (l < 100L)
        {
          if (l >= 10L) {
            k = 2;
          }
        }
        else if (l < 1000L) {
          k = 3;
        } else {
          k = 4;
        }
      }
      else if (l < 1000000L)
      {
        if (l < 100000L) {
          k = 5;
        } else {
          k = 6;
        }
      }
      else if (l < 10000000L) {
        k = 7;
      } else {
        k = 8;
      }
    }
    else if (l < 1000000000000L)
    {
      if (l < 10000000000L)
      {
        if (l < 1000000000L) {
          k = 9;
        } else {
          k = 10;
        }
      }
      else if (l < 100000000000L) {
        k = 11;
      } else {
        k = 12;
      }
    }
    else if (l < 1000000000000000L)
    {
      if (l < 10000000000000L) {
        k = 13;
      } else if (l < 100000000000000L) {
        k = 14;
      } else {
        k = 15;
      }
    }
    else if (l < 100000000000000000L)
    {
      if (l < 10000000000000000L) {
        k = 16;
      } else {
        k = 17;
      }
    }
    else if (l < 1000000000000000000L) {
      k = 18;
    } else {
      k = 19;
    }
    bool = k;
    int i;
    if (j != 0) {
      i = k + 1;
    }
    Aab localAab = b(i);
    byte[] arrayOfByte = localAab.a;
    k = localAab.c + i;
    while (l != 0L)
    {
      int m = (int)(l % 10L);
      k--;
      arrayOfByte[k] = ((byte)a[m]);
      l /= 10L;
    }
    if (j != 0) {
      arrayOfByte[(k - 1)] = ((byte)45);
    }
    localAab.c += i;
    this.c += i;
    return this;
  }
  
  public final mab g()
  {
    long l = this.c;
    if (l <= 2147483647L) {
      return a((int)l);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("size > Integer.MAX_VALUE: ");
    localStringBuilder.append(this.c);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public jab getBuffer()
  {
    return this;
  }
  
  public final byte h(long paramLong)
  {
    Hab.a(this.c, paramLong, 1L);
    long l = this.c;
    int i;
    int j;
    if (l - paramLong > paramLong) {
      for (localObject = this.b;; localObject = ((Aab)localObject).f)
      {
        i = ((Aab)localObject).c;
        j = ((Aab)localObject).b;
        l = i - j;
        if (paramLong < l) {
          return localObject.a[(j + (int)paramLong)];
        }
        paramLong -= l;
      }
    }
    paramLong -= l;
    Object localObject = this.b;
    Aab localAab;
    do
    {
      localAab = ((Aab)localObject).g;
      i = localAab.c;
      j = localAab.b;
      l = paramLong + (i - j);
      localObject = localAab;
      paramLong = l;
    } while (l < 0L);
    return localAab.a[(j + (int)l)];
  }
  
  public int hashCode()
  {
    Object localObject = this.b;
    if (localObject == null) {
      return 0;
    }
    int i = 1;
    int m;
    Aab localAab;
    do
    {
      int j = ((Aab)localObject).b;
      int k = ((Aab)localObject).c;
      m = i;
      while (j < k)
      {
        m = m * 31 + localObject.a[j];
        j++;
      }
      localAab = ((Aab)localObject).f;
      localObject = localAab;
      i = m;
    } while (localAab != this.b);
    return m;
  }
  
  public String i(long paramLong)
    throws EOFException
  {
    return a(paramLong, Hab.a);
  }
  
  public boolean isOpen()
  {
    return true;
  }
  
  String j(long paramLong)
    throws EOFException
  {
    if (paramLong > 0L)
    {
      long l = paramLong - 1L;
      if (h(l) == 13)
      {
        str = i(l);
        skip(2L);
        return str;
      }
    }
    String str = i(paramLong);
    skip(1L);
    return str;
  }
  
  public jab m()
  {
    return this;
  }
  
  public Gab n()
  {
    return Gab.a;
  }
  
  public byte[] o()
  {
    try
    {
      byte[] arrayOfByte = e(this.c);
      return arrayOfByte;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public boolean p()
  {
    boolean bool;
    if (this.c == 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public jab q()
  {
    return this;
  }
  
  public String r()
    throws EOFException
  {
    return c(Long.MAX_VALUE);
  }
  
  public int read(ByteBuffer paramByteBuffer)
    throws IOException
  {
    Aab localAab = this.b;
    if (localAab == null) {
      return -1;
    }
    int i = Math.min(paramByteBuffer.remaining(), localAab.c - localAab.b);
    paramByteBuffer.put(localAab.a, localAab.b, i);
    localAab.b += i;
    this.c -= i;
    if (localAab.b == localAab.c)
    {
      this.b = localAab.b();
      Bab.a(localAab);
    }
    return i;
  }
  
  public byte readByte()
  {
    long l = this.c;
    if (l != 0L)
    {
      Aab localAab = this.b;
      int i = localAab.b;
      int j = localAab.c;
      byte[] arrayOfByte = localAab.a;
      int k = i + 1;
      byte b1 = arrayOfByte[i];
      this.c = (l - 1L);
      if (k == j)
      {
        this.b = localAab.b();
        Bab.a(localAab);
      }
      else
      {
        localAab.b = k;
      }
      return b1;
    }
    throw new IllegalStateException("size == 0");
  }
  
  public void readFully(byte[] paramArrayOfByte)
    throws EOFException
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = a(paramArrayOfByte, i, paramArrayOfByte.length - i);
      if (j != -1) {
        i += j;
      } else {
        throw new EOFException();
      }
    }
  }
  
  public int readInt()
  {
    long l = this.c;
    if (l >= 4L)
    {
      localObject = this.b;
      int i = ((Aab)localObject).b;
      int j = ((Aab)localObject).c;
      if (j - i < 4) {
        return (readByte() & 0xFF) << 24 | (readByte() & 0xFF) << 16 | (readByte() & 0xFF) << 8 | readByte() & 0xFF;
      }
      byte[] arrayOfByte = ((Aab)localObject).a;
      int k = i + 1;
      i = arrayOfByte[i];
      int m = k + 1;
      k = arrayOfByte[k];
      int n = m + 1;
      m = arrayOfByte[m];
      int i1 = n + 1;
      n = arrayOfByte[n];
      this.c = (l - 4L);
      if (i1 == j)
      {
        this.b = ((Aab)localObject).b();
        Bab.a((Aab)localObject);
      }
      else
      {
        ((Aab)localObject).b = i1;
      }
      return (i & 0xFF) << 24 | (k & 0xFF) << 16 | (m & 0xFF) << 8 | n & 0xFF;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("size < 4: ");
    ((StringBuilder)localObject).append(this.c);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public short readShort()
  {
    long l = this.c;
    if (l >= 2L)
    {
      Aab localAab = this.b;
      int i = localAab.b;
      int j = localAab.c;
      if (j - i < 2) {
        return (short)((readByte() & 0xFF) << 8 | readByte() & 0xFF);
      }
      localObject = localAab.a;
      int k = i + 1;
      i = localObject[i];
      int m = k + 1;
      k = localObject[k];
      this.c = (l - 2L);
      if (m == j)
      {
        this.b = localAab.b();
        Bab.a(localAab);
      }
      else
      {
        localAab.b = m;
      }
      return (short)((i & 0xFF) << 8 | k & 0xFF);
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("size < 2: ");
    ((StringBuilder)localObject).append(this.c);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public int s()
  {
    return Hab.a(readInt());
  }
  
  public final long size()
  {
    return this.c;
  }
  
  public void skip(long paramLong)
    throws EOFException
  {
    while (paramLong > 0L)
    {
      Aab localAab = this.b;
      if (localAab != null)
      {
        int i = (int)Math.min(paramLong, localAab.c - localAab.b);
        long l1 = this.c;
        long l2 = i;
        this.c = (l1 - l2);
        l2 = paramLong - l2;
        localAab = this.b;
        localAab.b += i;
        paramLong = l2;
        if (localAab.b == localAab.c)
        {
          this.b = localAab.b();
          Bab.a(localAab);
          paramLong = l2;
        }
      }
      else
      {
        throw new EOFException();
      }
    }
  }
  
  public short t()
  {
    return Hab.a(readShort());
  }
  
  public String toString()
  {
    return g().toString();
  }
  
  public long u()
  {
    if (this.c != 0L)
    {
      int i = 0;
      long l1 = 0L;
      int j = 0;
      long l2;
      int n;
      label239:
      label292:
      do
      {
        Object localObject1 = this.b;
        Object localObject2 = ((Aab)localObject1).a;
        int k = ((Aab)localObject1).b;
        int m = ((Aab)localObject1).c;
        l2 = l1;
        int i1;
        for (n = j;; n++)
        {
          j = i;
          if (k >= m) {
            break label292;
          }
          i1 = localObject2[k];
          if ((i1 >= 48) && (i1 <= 57))
          {
            j = i1 - 48;
          }
          else
          {
            if ((i1 >= 97) && (i1 <= 102)) {}
            for (j = i1 - 97;; j = i1 - 65)
            {
              j += 10;
              break;
              if ((i1 < 65) || (i1 > 70)) {
                break label239;
              }
            }
          }
          if ((0xF000000000000000 & l2) != 0L) {
            break;
          }
          l2 = l2 << 4 | j;
          k++;
        }
        localObject2 = new jab();
        ((jab)localObject2).d(l2);
        ((jab)localObject2).writeByte(i1);
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Number too large: ");
        ((StringBuilder)localObject1).append(((jab)localObject2).e());
        throw new NumberFormatException(((StringBuilder)localObject1).toString());
        if (n != 0)
        {
          j = 1;
        }
        else
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Expected leading [0-9a-fA-F] character but was 0x");
          ((StringBuilder)localObject1).append(Integer.toHexString(i1));
          throw new NumberFormatException(((StringBuilder)localObject1).toString());
        }
        if (k == m)
        {
          this.b = ((Aab)localObject1).b();
          Bab.a((Aab)localObject1);
        }
        else
        {
          ((Aab)localObject1).b = k;
        }
        if (j != 0) {
          break;
        }
        i = j;
        j = n;
        l1 = l2;
      } while (this.b != null);
      this.c -= n;
      return l2;
    }
    throw new IllegalStateException("size == 0");
  }
  
  public InputStream v()
  {
    return new iab(this);
  }
  
  public int write(ByteBuffer paramByteBuffer)
    throws IOException
  {
    if (paramByteBuffer != null)
    {
      int i = paramByteBuffer.remaining();
      int j = i;
      while (j > 0)
      {
        Aab localAab = b(1);
        int k = Math.min(j, 8192 - localAab.c);
        paramByteBuffer.get(localAab.a, localAab.c, k);
        j -= k;
        localAab.c += k;
      }
      this.c += i;
      return i;
    }
    throw new IllegalArgumentException("source == null");
  }
  
  public jab write(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      write(paramArrayOfByte, 0, paramArrayOfByte.length);
      return this;
    }
    throw new IllegalArgumentException("source == null");
  }
  
  public jab write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null)
    {
      long l1 = paramArrayOfByte.length;
      long l2 = paramInt1;
      long l3 = paramInt2;
      Hab.a(l1, l2, l3);
      paramInt2 += paramInt1;
      while (paramInt1 < paramInt2)
      {
        Aab localAab = b(1);
        int i = Math.min(paramInt2 - paramInt1, 8192 - localAab.c);
        System.arraycopy(paramArrayOfByte, paramInt1, localAab.a, localAab.c, i);
        paramInt1 += i;
        localAab.c += i;
      }
      this.c += l3;
      return this;
    }
    throw new IllegalArgumentException("source == null");
  }
  
  public jab writeByte(int paramInt)
  {
    Aab localAab = b(1);
    byte[] arrayOfByte = localAab.a;
    int i = localAab.c;
    localAab.c = (i + 1);
    arrayOfByte[i] = ((byte)(byte)paramInt);
    this.c += 1L;
    return this;
  }
  
  public jab writeInt(int paramInt)
  {
    Aab localAab = b(4);
    byte[] arrayOfByte = localAab.a;
    int i = localAab.c;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt >>> 24 & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(paramInt >>> 16 & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt >>> 8 & 0xFF));
    arrayOfByte[j] = ((byte)(byte)(paramInt & 0xFF));
    localAab.c = (j + 1);
    this.c += 4L;
    return this;
  }
  
  public jab writeShort(int paramInt)
  {
    Aab localAab = b(2);
    byte[] arrayOfByte = localAab.a;
    int i = localAab.c;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt >>> 8 & 0xFF));
    arrayOfByte[j] = ((byte)(byte)(paramInt & 0xFF));
    localAab.c = (j + 1);
    this.c += 2L;
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */