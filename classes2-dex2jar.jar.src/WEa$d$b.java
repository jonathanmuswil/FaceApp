import android.graphics.Matrix;

public final class WEa$d$b
  extends WEa.d
{
  private final int a;
  private final Matrix b;
  
  public WEa$d$b(int paramInt, Matrix paramMatrix)
  {
    super(null);
    this.a = paramInt;
    this.b = paramMatrix;
  }
  
  public final Matrix a()
  {
    return this.b;
  }
  
  public final int b()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        int i;
        if (this.a == ((b)paramObject).a) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.b, ((b)paramObject).b))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    int i = this.a;
    Matrix localMatrix = this.b;
    int j;
    if (localMatrix != null) {
      j = localMatrix.hashCode();
    } else {
      j = 0;
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MatrixChangedByUser(partIndex=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", matrix=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WEa$d$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */