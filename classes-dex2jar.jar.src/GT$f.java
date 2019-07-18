import java.io.IOException;

class GT$f
  extends GT.e
{
  protected final byte[] d;
  
  GT$f(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  final void a(ET paramET)
    throws IOException
  {
    paramET.a(this.d, p(), size());
  }
  
  final boolean a(GT paramGT, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramGT.size())
    {
      int i = paramInt1 + paramInt2;
      if (i <= paramGT.size())
      {
        if ((paramGT instanceof f))
        {
          paramGT = (f)paramGT;
          byte[] arrayOfByte = this.d;
          localObject = paramGT.d;
          int j = p();
          i = p();
          int k = paramGT.p() + paramInt1;
          paramInt1 = i;
          for (i = k; paramInt1 < j + paramInt2; i++)
          {
            if (arrayOfByte[paramInt1] != localObject[i]) {
              return false;
            }
            paramInt1++;
          }
          return true;
        }
        return paramGT.b(paramInt1, i).equals(b(0, paramInt2));
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Ran off end of other: ");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramInt2);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramGT.size());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    paramGT = new StringBuilder();
    paramGT.append("Length too large: ");
    paramGT.append(paramInt2);
    paramGT.append(size());
    throw new IllegalArgumentException(paramGT.toString());
  }
  
  protected final int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return QT.a(paramInt1, this.d, p() + paramInt2, paramInt3);
  }
  
  public final GT b(int paramInt1, int paramInt2)
  {
    paramInt2 = GT.a(paramInt1, paramInt2, size());
    if (paramInt2 == 0) {
      return GT.a;
    }
    return new GT.b(this.d, p() + paramInt1, paramInt2);
  }
  
  protected void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.d, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof GT)) {
      return false;
    }
    if (size() != ((GT)paramObject).size()) {
      return false;
    }
    if (size() == 0) {
      return true;
    }
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      int i = n();
      int j = ((GT)paramObject).n();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return a((GT)paramObject, 0, size());
    }
    return paramObject.equals(this);
  }
  
  public final HT m()
  {
    return HT.a(this.d, p(), size(), true);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/GT$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */