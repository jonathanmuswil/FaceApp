import android.graphics.Matrix;

public final class fya$b$d
  extends fya.b
{
  private final Matrix a;
  
  public fya$b$d(Matrix paramMatrix)
  {
    super(null);
    this.a = paramMatrix;
  }
  
  public final Matrix a()
  {
    return this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if (oXa.a(this.a, ((d)paramObject).a)) {}
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
    Matrix localMatrix = this.a;
    int i;
    if (localMatrix != null) {
      i = localMatrix.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MatrixChangedByUser(matrix=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fya$b$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */