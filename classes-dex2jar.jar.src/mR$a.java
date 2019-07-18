import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class mR$a
  implements GenericArrayType, Serializable
{
  private final Type a;
  
  public mR$a(Type paramType)
  {
    this.a = mR.b(paramType);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof GenericArrayType)) && (mR.a(this, (GenericArrayType)paramObject))) {
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
    localStringBuilder.append(mR.h(this.a));
    localStringBuilder.append("[]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mR$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */