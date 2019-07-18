import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class I_a$a
  implements Eab
{
  private final lab a;
  int b;
  byte c;
  int d;
  int e;
  short f;
  
  I_a$a(lab paramlab)
  {
    this.a = paramlab;
  }
  
  private void a()
    throws IOException
  {
    int i = this.d;
    int j = I_a.a(this.a);
    this.e = j;
    this.b = j;
    byte b1 = (byte)(this.a.readByte() & 0xFF);
    this.c = ((byte)(byte)(this.a.readByte() & 0xFF));
    if (I_a.a.isLoggable(Level.FINE)) {
      I_a.a.fine(v_a.a(true, this.d, this.b, b1, this.c));
    }
    this.d = (this.a.readInt() & 0x7FFFFFFF);
    if (b1 == 9)
    {
      if (this.d == i) {
        return;
      }
      v_a.b("TYPE_CONTINUATION streamId changed", new Object[0]);
      throw null;
    }
    v_a.b("%s != TYPE_CONTINUATION", new Object[] { Byte.valueOf(b1) });
    throw null;
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    int i;
    for (;;)
    {
      i = this.e;
      if (i != 0) {
        break;
      }
      this.a.skip(this.f);
      this.f = ((short)0);
      if ((this.c & 0x4) != 0) {
        return -1L;
      }
      a();
    }
    paramLong = this.a.b(paramjab, Math.min(paramLong, i));
    if (paramLong == -1L) {
      return -1L;
    }
    this.e = ((int)(this.e - paramLong));
    return paramLong;
  }
  
  public void close()
    throws IOException
  {}
  
  public Gab n()
  {
    return this.a.n();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/I_a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */