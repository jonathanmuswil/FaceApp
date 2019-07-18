import android.graphics.Rect;
import java.io.File;

public final class Cga$a
{
  private final File a;
  private final Rect b;
  
  public Cga$a(File paramFile, Rect paramRect)
  {
    this.a = paramFile;
    this.b = paramRect;
  }
  
  public final File a()
  {
    return this.a;
  }
  
  public final Rect b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
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
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((File)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((Rect)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Result(file=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", rect=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cga$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */