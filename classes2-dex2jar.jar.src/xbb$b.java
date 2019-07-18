import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class xbb$b
  implements ParameterizedType
{
  private final Type a;
  private final Type b;
  private final Type[] c;
  
  xbb$b(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    boolean bool = paramType2 instanceof Class;
    int i = 0;
    if (bool)
    {
      j = 1;
      if (paramType1 == null) {
        k = 1;
      } else {
        k = 0;
      }
      if (((Class)paramType2).getEnclosingClass() != null) {
        j = 0;
      }
      if (k != j) {
        throw new IllegalArgumentException();
      }
    }
    int j = paramVarArgs.length;
    for (int k = i; k < j; k++)
    {
      Type localType = paramVarArgs[k];
      xbb.a(localType, "typeArgument == null");
      xbb.a(localType);
    }
    this.a = paramType1;
    this.b = paramType2;
    this.c = ((Type[])paramVarArgs.clone());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof ParameterizedType)) && (xbb.a(this, (ParameterizedType)paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Type[] getActualTypeArguments()
  {
    return (Type[])this.c.clone();
  }
  
  public Type getOwnerType()
  {
    return this.a;
  }
  
  public Type getRawType()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    int i = Arrays.hashCode(this.c);
    int j = this.b.hashCode();
    Type localType = this.a;
    int k;
    if (localType != null) {
      k = localType.hashCode();
    } else {
      k = 0;
    }
    return i ^ j ^ k;
  }
  
  public String toString()
  {
    Object localObject = this.c;
    if (localObject.length == 0) {
      return xbb.e(this.b);
    }
    int i = localObject.length;
    int j = 1;
    localObject = new StringBuilder((i + 1) * 30);
    ((StringBuilder)localObject).append(xbb.e(this.b));
    ((StringBuilder)localObject).append("<");
    ((StringBuilder)localObject).append(xbb.e(this.c[0]));
    while (j < this.c.length)
    {
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(xbb.e(this.c[j]));
      j++;
    }
    ((StringBuilder)localObject).append(">");
    return ((StringBuilder)localObject).toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xbb$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */