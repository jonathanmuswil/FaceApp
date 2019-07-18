import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class mR$b
  implements ParameterizedType, Serializable
{
  private final Type a;
  private final Type b;
  private final Type[] c;
  
  public mR$b(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    boolean bool1 = paramType2 instanceof Class;
    int i = 0;
    if (bool1)
    {
      Class localClass = (Class)paramType2;
      bool1 = Modifier.isStatic(localClass.getModifiers());
      boolean bool2 = true;
      if ((!bool1) && (localClass.getEnclosingClass() != null)) {
        j = 0;
      } else {
        j = 1;
      }
      bool1 = bool2;
      if (paramType1 == null) {
        if (j != 0) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      lR.a(bool1);
    }
    if (paramType1 == null) {
      paramType1 = null;
    } else {
      paramType1 = mR.b(paramType1);
    }
    this.a = paramType1;
    this.b = mR.b(paramType2);
    this.c = ((Type[])paramVarArgs.clone());
    int k = this.c.length;
    for (int j = i; j < k; j++)
    {
      lR.a(this.c[j]);
      mR.c(this.c[j]);
      paramType1 = this.c;
      paramType1[j] = mR.b(paramType1[j]);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof ParameterizedType)) && (mR.a(this, (ParameterizedType)paramObject))) {
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
    return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ mR.a(this.a);
  }
  
  public String toString()
  {
    int i = this.c.length;
    if (i == 0) {
      return mR.h(this.b);
    }
    StringBuilder localStringBuilder = new StringBuilder((i + 1) * 30);
    localStringBuilder.append(mR.h(this.b));
    localStringBuilder.append("<");
    localStringBuilder.append(mR.h(this.c[0]));
    for (int j = 1; j < i; j++)
    {
      localStringBuilder.append(", ");
      localStringBuilder.append(mR.h(this.c[j]));
    }
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mR$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */