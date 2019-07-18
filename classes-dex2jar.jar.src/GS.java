import java.io.IOException;
import java.nio.charset.Charset;

class gs
  extends fs
{
  protected final byte[] d;
  
  gs(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Gs.a(paramInt1, this.d, p(), paramInt3);
  }
  
  public final _r a(int paramInt1, int paramInt2)
  {
    paramInt1 = _r.b(0, paramInt2, size());
    if (paramInt1 == 0) {
      return _r.a;
    }
    return new cs(this.d, p(), paramInt1);
  }
  
  protected final String a(Charset paramCharset)
  {
    return new String(this.d, p(), size(), paramCharset);
  }
  
  final void a(Zr paramZr)
    throws IOException
  {
    paramZr.a(this.d, p(), size());
  }
  
  final boolean a(_r param_r, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= param_r.size())
    {
      if (paramInt2 <= param_r.size())
      {
        if ((param_r instanceof gs))
        {
          param_r = (gs)param_r;
          byte[] arrayOfByte1 = this.d;
          byte[] arrayOfByte2 = param_r.d;
          int i = p();
          paramInt1 = p();
          for (int j = param_r.p(); paramInt1 < i + paramInt2; j++)
          {
            if (arrayOfByte1[paramInt1] != arrayOfByte2[j]) {
              return false;
            }
            paramInt1++;
          }
          return true;
        }
        return param_r.a(0, paramInt2).equals(a(0, paramInt2));
      }
      paramInt1 = param_r.size();
      param_r = new StringBuilder(59);
      param_r.append("Ran off end of other: 0, ");
      param_r.append(paramInt2);
      param_r.append(", ");
      param_r.append(paramInt1);
      throw new IllegalArgumentException(param_r.toString());
    }
    paramInt1 = size();
    param_r = new StringBuilder(40);
    param_r.append("Length too large: ");
    param_r.append(paramInt2);
    param_r.append(paramInt1);
    throw new IllegalArgumentException(param_r.toString());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof _r)) {
      return false;
    }
    if (size() != ((_r)paramObject).size()) {
      return false;
    }
    if (size() == 0) {
      return true;
    }
    if ((paramObject instanceof gs))
    {
      paramObject = (gs)paramObject;
      int i = n();
      int j = ((_r)paramObject).n();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return a((_r)paramObject, 0, size());
    }
    return paramObject.equals(this);
  }
  
  public final boolean m()
  {
    int i = p();
    return _t.a(this.d, i, size() + i);
  }
  
  public byte p(int paramInt)
  {
    return this.d[paramInt];
  }
  
  protected int p()
  {
    return 0;
  }
  
  public int size()
  {
    return this.d.length;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */