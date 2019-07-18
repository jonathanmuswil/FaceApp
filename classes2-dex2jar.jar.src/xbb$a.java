import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class xbb$a
  implements GenericArrayType
{
  private final Type a;
  
  xbb$a(Type paramType)
  {
    this.a = paramType;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof GenericArrayType)) && (xbb.a(this, (GenericArrayType)paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Type getGenericComponentType()
  {
    return this.a;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(xbb.e(this.a));
    localStringBuilder.append("[]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xbb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */