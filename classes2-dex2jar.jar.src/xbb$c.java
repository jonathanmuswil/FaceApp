import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class xbb$c
  implements WildcardType
{
  private final Type a;
  private final Type b;
  
  xbb$c(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    if (paramArrayOfType2.length <= 1)
    {
      if (paramArrayOfType1.length == 1)
      {
        if (paramArrayOfType2.length == 1)
        {
          if (paramArrayOfType2[0] != null)
          {
            xbb.a(paramArrayOfType2[0]);
            if (paramArrayOfType1[0] == Object.class)
            {
              this.b = paramArrayOfType2[0];
              this.a = Object.class;
            }
            else
            {
              throw new IllegalArgumentException();
            }
          }
          else
          {
            throw new NullPointerException();
          }
        }
        else
        {
          if (paramArrayOfType1[0] == null) {
            break label99;
          }
          xbb.a(paramArrayOfType1[0]);
          this.b = null;
          this.a = paramArrayOfType1[0];
        }
        return;
        label99:
        throw new NullPointerException();
      }
      throw new IllegalArgumentException();
    }
    throw new IllegalArgumentException();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof WildcardType)) && (xbb.a(this, (WildcardType)paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Type[] getLowerBounds()
  {
    Type localType = this.b;
    Type[] arrayOfType;
    if (localType != null)
    {
      arrayOfType = new Type[1];
      arrayOfType[0] = localType;
    }
    else
    {
      arrayOfType = xbb.a;
    }
    return arrayOfType;
  }
  
  public Type[] getUpperBounds()
  {
    return new Type[] { this.a };
  }
  
  public int hashCode()
  {
    Type localType = this.b;
    int i;
    if (localType != null) {
      i = localType.hashCode() + 31;
    } else {
      i = 1;
    }
    return i ^ this.a.hashCode() + 31;
  }
  
  public String toString()
  {
    if (this.b != null)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("? super ");
      localStringBuilder.append(xbb.e(this.b));
      return localStringBuilder.toString();
    }
    if (this.a == Object.class) {
      return "?";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("? extends ");
    localStringBuilder.append(xbb.e(this.a));
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xbb$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */