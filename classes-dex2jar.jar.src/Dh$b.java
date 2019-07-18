import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class Dh$b
{
  private final ByteBuffer a;
  
  Dh$b(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = ((ByteBuffer)ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.BIG_ENDIAN).limit(paramInt));
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (this.a.remaining() - paramInt1 >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  int a()
  {
    return this.a.remaining();
  }
  
  short a(int paramInt)
  {
    int i;
    if (a(paramInt, 2))
    {
      paramInt = this.a.getShort(paramInt);
      i = paramInt;
    }
    else
    {
      paramInt = -1;
      i = paramInt;
    }
    return i;
  }
  
  void a(ByteOrder paramByteOrder)
  {
    this.a.order(paramByteOrder);
  }
  
  int b(int paramInt)
  {
    if (a(paramInt, 4)) {
      paramInt = this.a.getInt(paramInt);
    } else {
      paramInt = -1;
    }
    return paramInt;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Dh$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */